package io.github.abhishekabhi.developer_star.web.controllers;

import io.github.abhishekabhi.developer_star.backend.service.EmailService;
import io.github.abhishekabhi.developer_star.web.domain.frontend.FeedbackPojo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {
	
	private static final Logger LOG=LoggerFactory.getLogger(ContactController.class);
	public static final String FEEDBACK_MODEL_KEY="feedback"; 
	
	private static final String CONTACT_US_VIEW_NAME="contact/contact";
	
	@Autowired
	private EmailService emailService;
	
	@RequestMapping(value="/contact", method=RequestMethod.GET)
	public String contactGet(ModelMap model) {
		FeedbackPojo feedBackPojo=new FeedbackPojo();
		model.addAttribute(ContactController.FEEDBACK_MODEL_KEY,feedBackPojo);
		return ContactController.CONTACT_US_VIEW_NAME;
	}
	
	@RequestMapping(value="/contact", method=RequestMethod.POST)
	public String contactPost(@ModelAttribute(FEEDBACK_MODEL_KEY)FeedbackPojo feedback) {
		LOG.debug("Feedback POJO content: {}",feedback);
		emailService.sendFeedbackEmail(feedback);
		return ContactController.CONTACT_US_VIEW_NAME;
	}

}
