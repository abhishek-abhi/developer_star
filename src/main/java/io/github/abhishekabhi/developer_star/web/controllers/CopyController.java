package io.github.abhishekabhi.developer_star.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CopyController {

	@RequestMapping("/about")
	public String about() {
		return "copy/about";
	}
}
