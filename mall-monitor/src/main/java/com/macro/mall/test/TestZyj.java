package com.macro.mall.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import de.codecentric.boot.admin.server.config.AdminServerProperties;
import de.codecentric.boot.admin.server.config.AdminServerProperties.InstanceProxyProperties;
import de.codecentric.boot.admin.server.config.AdminServerProperties.MonitorProperties;

@lombok.Data
@ConfigurationProperties("zyj.zzz")
@Component
public class TestZyj implements ApplicationRunner{
	private String path;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(path);
		
	}
	
}
