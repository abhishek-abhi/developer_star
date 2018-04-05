package io.github.abhishekabhi.developer_star.backend.service;

import org.springframework.mail.SimpleMailMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MockEmailService extends AbstractEmailService{

	private static final Logger LOG= LoggerFactory.getLogger(MockEmailService.class);

	public void sendGenericEmailMessage(SimpleMailMessage message) {
		// TODO Auto-generated method stub
		LOG.debug("Simulating an email service.....");
		LOG.info(message.toString());
		LOG.debug("Email sent."); 
	}
	
	
}
