package com.macro.mall.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

@EnableFeignClients
@EnableDiscoveryClient
@EnableApolloConfig
@SpringBootApplication(scanBasePackages = "com.macro.mall")
public class MallAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallAuthApplication.class, args);
    }

}
