package io.github.abhishekabhi.developer_star;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.github.abhishekabhi.developer_star.web.i18n.i18nService;
import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeveloperStarApplicationTests {

	@Autowired
	private i18nService i18nService;
	
	@Test
	public void testMessageByLocaleService() throws Exception{
		String expectedResult="This is developer_star";
		String messageId="index.main.callout";
		String actual=i18nService.getMessage(messageId);
		Assert.assertEquals("The actual and expected Strings don't match",expectedResult,actual);;
	}

}
