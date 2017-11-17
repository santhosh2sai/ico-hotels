package com.ico.hotel.controller;

import javax.mail.MessagingException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ico.hotel.domain.User;
import com.ico.hotel.service.UserService;
import com.ico.hotel.utils.MyUtils;

@Controller
@RequestMapping("/users")
public class UserController {
	
	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/{verificationCode}/verify")
	public String verify(@PathVariable String verificationCode,
			RedirectAttributes redirectAttributes) {
		
		userService.verify(verificationCode);
		MyUtils.flash(redirectAttributes, "success", "verificationSuccessful");
		return "redirect:/";
	}
	
	@GetMapping("/{userId}/resend-verification-mail")
	public String resendVerificationMail(@PathVariable("userId") User user,
			RedirectAttributes redirectAttributes) throws MessagingException {
		
		userService.resendVerificationMail(user);
		MyUtils.flash(redirectAttributes, "success", "verificationMailResent");
		return "redirect:/";
	}
	
	@GetMapping("/{userId}")
	public String getById(@PathVariable Long userId, Model model) {
		
		model.addAttribute(userService.fetchById(userId));
		return "user";
	}
}