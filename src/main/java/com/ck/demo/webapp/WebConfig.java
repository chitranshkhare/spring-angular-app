package com.ck.demo.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ck.demo.webapp.common.config.ApplicationProperties;
import com.ck.demo.webapp.common.utils.CommonUtils;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
	
	@Autowired
	private ApplicationProperties applicationProperties;
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		System.out.println("=====>>>>   " + applicationProperties.getInternalSystem().getEnvironmentType().trim());
		if(CommonUtils.SYSTEM_ENVIRONMENT_DEV.equals(applicationProperties.getInternalSystem().getEnvironmentType().trim())) {
			registry.addMapping("/**");
		}
		
	}

}
