package com.ico.hotel.service;

import javax.mail.MessagingException;

import org.springframework.boot.context.event.ApplicationReadyEvent;

import com.ico.hotel.commands.ForgotPasswordCommand;
import com.ico.hotel.commands.UserCommands;
import com.ico.hotel.domain.User;

public interface UserService {

	void signup(UserCommands userCommand);

	void afterApplicationReady(ApplicationReadyEvent event);

	void verify(String verificationCode);
	
	void resendVerificationMail(User user) throws MessagingException;
	
	void forgotPassword(ForgotPasswordCommand forgotPasswordCommand);

	void resetPassword(String resetPasswordCode, String password);

	User fetchById(Long userId);
}
