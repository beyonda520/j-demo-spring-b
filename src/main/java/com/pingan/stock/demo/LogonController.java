package com.pingan.stock.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pingan.stock.demo.service.UserService;

@Controller
public class LogonController {
	
	@Autowired
	UserService userService;

	@RequestMapping("/logon")
	public String logon(@RequestParam("userName") String userName, Model model) {
		if ("admin".equals(userName)) {
			return "error";
		}
		
		List<String> onlineUserList = userService.save(userName);
		
		//Mock
		onlineUserList.add("admin");
		
		model.addAttribute("userName", userName);
		model.addAttribute("onlineUserCount", onlineUserList.size());
		model.addAttribute("onlineUserList", onlineUserList);
		
		return "home";
	}
}
