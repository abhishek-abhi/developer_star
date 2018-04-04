package io.github.abhishekabhi.developer_star.web.controllers;

import org.apache.commons.logging.Log;
import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.github.abhishekabhi.developer_star.web.domain.frontend.FeedbackPojo;

@Controller
public class ContactController {
	
	private static final Logger LOG=LoggerFactory.getLogger(ContactController.class);
	private static final String FEEDBACK_MODEL_KEY="feedback"; 
	
	private static final String CONTACT_US_VIEW_NAME="contact/contact";
	
	@RequestMapping(value="/contact", method=RequestMethod.GET)
	public String contactGet(ModelMap model) {
		FeedbackPojo feedBackPojo=new FeedbackPojo();
		model.addAttribute(ContactController.FEEDBACK_MODEL_KEY,feedBackPojo);
		return ContactController.CONTACT_US_VIEW_NAME;
	}
	
	@RequestMapping(value="/contact", method=RequestMethod.POST)
	public String contactPost(ModelAttribute(FEEDBACK_MODEL_KEY)FeedbackPojo feedback) {
		LOG.debug("Feedback POJO content: {}",feedback);
		return ContactController.CONTACT_US_VIEW_NAME;
	}

}
