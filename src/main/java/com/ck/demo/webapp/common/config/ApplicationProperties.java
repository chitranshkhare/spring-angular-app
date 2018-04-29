package com.ck.demo.webapp.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "application-properties")
public class ApplicationProperties {

	private InternalSystem internalSystem;

	public InternalSystem getInternalSystem() {
		return internalSystem;
	}

	public void setInternalSystem(InternalSystem internalSystem) {
		this.internalSystem = internalSystem;
	}

	public static class InternalSystem {
		private String environmentType;

		public String getEnvironmentType() {
			return environmentType;
		}

		public void setEnvironmentType(String environmentType) {
			this.environmentType = environmentType;
		}

	}

}
