package com.macro.mall.config;

import de.codecentric.boot.admin.server.config.AdminServerProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

/**
 * Created by macro on 2019/9/30.
 */
@Configuration
public class SecuritySecureConfig extends WebSecurityConfigurerAdapter {
    private final String adminContextPath;

    /*
     * 因为AdminServerAutoConfiguration有@EnableConfigurationProperties(AdminServerProperties.class)
     * 会把AdminServerProperties注册为bean，单纯的@ConfigurationProperties("spring.boot.admin")是不会注册为bean的。
     * 上面效果实际等同
     * @ConfigurationProperties("spring.boot.admin")
     * @Component
     * AdminServerProperties
     * 
     * 这个构造器没有显示的@autowire但是也会注入的原因是SecuritySecureConfig要被注册为bean，但是只有这么一个钩子器，因此会使用这个构造器进行
     * 构建bean，因此会注入已经有的bean
     */
    public SecuritySecureConfig(AdminServerProperties adminServerProperties) {//TODO 为什么AdminServerProperties是个bean，但是自定义的TestZyj不是个bean
        this.adminContextPath = adminServerProperties.getContextPath();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        SavedRequestAwareAuthenticationSuccessHandler successHandler = new SavedRequestAwareAuthenticationSuccessHandler();
        successHandler.setTargetUrlParameter("redirectTo");
        successHandler.setDefaultTargetUrl(adminContextPath + "/");

        http.authorizeRequests()
                //1.配置所有静态资源和登录页可以公开访问
                .antMatchers(adminContextPath + "/assets/**").permitAll()
                .antMatchers(adminContextPath + "/login").permitAll()
                .anyRequest().authenticated()
                .and()
                //2.配置登录和登出路径
                .formLogin().loginPage(adminContextPath + "/login").successHandler(successHandler).and()
                .logout().logoutUrl(adminContextPath + "/logout").and()
                //3.开启http basic支持，admin-client注册时需要使用
                .httpBasic().and()
                .csrf()
                //4.开启基于cookie的csrf保护
                .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                //5.忽略这些路径的csrf保护以便admin-client注册
                .ignoringAntMatchers(
                        adminContextPath + "/instances",
                        adminContextPath + "/actuator/**"
                );
    }
}
