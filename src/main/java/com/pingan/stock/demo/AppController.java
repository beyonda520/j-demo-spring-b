package com.pingan.stock.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

	@RequestMapping("/hello/{userName}")
	public String hello(
			@PathVariable String userName,
			@RequestParam(value = "message", required = false) String message,
			Model model) {

		model.addAttribute("toUserName", userName);
		model.addAttribute("message", message);

		return "chat";
	}
}
