package com.macro.mall.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.codecentric.boot.admin.server.config.AdminServerProperties;

@RestController
public class TestController {

	@Autowired
	private Test test;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String get() {
		ApplicationContext context = test.getContext();
		String args[] = test.getContext().getBeanNamesForType(TestZyj.class);
		String str1 = test.getContext().getBean(AdminServerProperties.class).getContextPath();
		
		String str = test.getContext().getBean(TestZyj.class).getPath();
		return str;
	}
}
