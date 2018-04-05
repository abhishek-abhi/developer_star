package io.github.abhishekabhi.developer_star.backend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class smtpEmailService extends AbstractEmailService{

	@Autowired
	private MailSender mailsender;
	private static final Logger LOG=LoggerFactory.getLogger(smtpEmailService.class);

	public void sendGenericEmailMessage(SimpleMailMessage message) {
		// TODO Auto-generated method stub
		LOG.debug("Simulating an email for: {}",message);
		mailsender.send(message);
		LOG.debug("Email sent.");
	}
	
}
