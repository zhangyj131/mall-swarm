package com.macro.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

@EnableDiscoveryClient
@EnableApolloConfig
@SpringBootApplication
public class MallGatewayApplication {

    public static void main(String[] args) {
    	//引入了spring-webflux但是没引入spring-webmvc，因此启动的web类型是REACTIVE
        SpringApplication.run(MallGatewayApplication.class, args);
    }

}
