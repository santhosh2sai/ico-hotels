package com.ico.hotel.controller;

import javax.mail.MessagingException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ico.hotel.mail.MailSender;
@RestController
public class MailController {

	
	private MailSender mailsender;

	public MailController(MailSender smtpMailSender) {
		this.mailsender = smtpMailSender;
	}

	
	
			@RequestMapping("/mail")
		public String mail() throws MessagingException {
				
				mailsender.send("santhosh042@live.com", "My text mail", "Body of the text mail");
			return "Mail sent";
		}

}
