package com.macro.mall.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

@EnableDiscoveryClient
@EnableApolloConfig
@SpringBootApplication
public class MallSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallSearchApplication.class, args);
    }
}
