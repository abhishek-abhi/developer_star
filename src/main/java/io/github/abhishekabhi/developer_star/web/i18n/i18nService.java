package io.github.abhishekabhi.developer_star.web.i18n;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

@Service
public class i18nService {

	private static final Logger LOG=LoggerFactory.getLogger(i18nService.class);
	@Autowired
	private MessageSource messageSource;
	
	public String getMessage(String messageId) {
		LOG.info("Returning i18n text for messageId {}",messageId);
		Locale locale=LocaleContextHolder.getLocale();
		return getMessage(messageId,locale);
	}
	
	public String getMessage(String messageId,Locale locale) {
		return messageSource.getMessage(messageId,null,locale);
	}
}
