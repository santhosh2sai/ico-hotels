package com.ico.hotel.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ico.hotel.commands.UserCommands;
import com.ico.hotel.service.UserService;

@Controller
@RequestMapping("/signup")
public class SignUpController {
	
	private static Log log = LogFactory.getLog(SignUpController.class);

	private UserService userService;
	
	public SignUpController(UserService userService) {

		this.userService = userService;
	}

	@GetMapping
	public String signup(Model model) {
		
		model.addAttribute(new UserCommands());
		return "signup";
	}	

	@PostMapping
	public String doSignup(@Validated UserCommands user,BindingResult result
			) {
		log.info("enter dosignup");
		if(result.hasErrors())
			return "signup";
		log.info("Email: " +user.getEmail() +"Name:" + user.getName() + "password"  + user.getPassword());
		userService.signup(user);
		return "redirect:/";
	}	
}
