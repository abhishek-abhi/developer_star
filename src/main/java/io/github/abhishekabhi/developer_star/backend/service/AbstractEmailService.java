package io.github.abhishekabhi.developer_star.backend.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

import io.github.abhishekabhi.developer_star.web.domain.frontend.FeedbackPojo;

public abstract class AbstractEmailService implements EmailService {

	@Value("${default.to.address}")
	private String defaultToaddress;
	
	protected SimpleMailMessage prepareSimpleMailMessagefromFeedbackPojo(FeedbackPojo feedback) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo(defaultToaddress);
		message.setFrom(feedback.getEmail());
		message.setSubject("[developer_star]: Feedback received from "+feedback.getFirstname()+" "+feedback.getLastname()+"!");
        message.setText(feedback.getFeedback());
		return message;
	}

	public void sendFeedbackEmail(FeedbackPojo feedbackPojo) {
		// TODO Auto-generated method stub
		sendGenericEmailMessage(prepareSimpleMailMessagefromFeedbackPojo(feedbackPojo));
	}
	
}
