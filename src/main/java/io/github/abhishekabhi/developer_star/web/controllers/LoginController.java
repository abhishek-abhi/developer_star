package io.github.abhishekabhi.developer_star.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	public static final String Login_View_Name="user/login";
	
	@RequestMapping("/login")
	public String login() {
		return Login_View_Name;
	}
}
