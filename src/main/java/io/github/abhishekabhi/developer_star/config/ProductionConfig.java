package io.github.abhishekabhi.developer_star.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import io.github.abhishekabhi.developer_star.backend.service.EmailService;
import io.github.abhishekabhi.developer_star.backend.service.smtpEmailService;

@Configuration
@Profile("prod")
@PropertySource("file:///${user.home}/.developer_star/application-prod.properties")
public class ProductionConfig {

	@Bean
	public EmailService emailService() {
		return new smtpEmailService();
	}
}
