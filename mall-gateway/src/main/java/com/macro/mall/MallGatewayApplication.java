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
        SpringApplication.run(MallGatewayApplication.class, args);
    }

}
