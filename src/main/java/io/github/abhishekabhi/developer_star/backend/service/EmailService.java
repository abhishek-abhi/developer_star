package io.github.abhishekabhi.developer_star.backend.service;

import org.springframework.mail.SimpleMailMessage;

import io.github.abhishekabhi.developer_star.web.domain.frontend.FeedbackPojo;

public interface EmailService {

	public void sendFeedbackEmail(FeedbackPojo feedbackPojo);
	
	public void sendGenericEmailMessage(SimpleMailMessage message);
}
