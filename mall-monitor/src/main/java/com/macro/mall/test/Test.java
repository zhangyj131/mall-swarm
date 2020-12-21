package com.macro.mall.test;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class Test implements ApplicationContextAware/* , CommandLineRunner */ {
	private final String adminContextPath;
	
	public Test(TestZyj zyj) {
		adminContextPath = zyj.getPath();
	}

	private ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

//	@Override
//	public void run(String... args) throws Exception {
//		TestZyj bean = applicationContext.getBean(TestZyj.class);
//		System.err.println(bean.getPath());
//		
//	}
	public ApplicationContext getContext() {
		return this.applicationContext;
	}
	

}
