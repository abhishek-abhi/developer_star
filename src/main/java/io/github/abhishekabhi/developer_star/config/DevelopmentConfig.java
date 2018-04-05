package io.github.abhishekabhi.developer_star.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import io.github.abhishekabhi.developer_star.backend.service.EmailService;
import io.github.abhishekabhi.developer_star.backend.service.MockEmailService;

@Configuration
@Profile("dev")
@PropertySource("file:///${user.home}/.developer_star/application-dev.properties")
public class DevelopmentConfig {

	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}
}
