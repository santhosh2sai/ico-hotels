package com.ico.hotel.service;

import org.springframework.stereotype.Service;

import com.ico.hotel.commands.UserCommands;
import com.ico.hotel.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {

		this.userRepository = userRepository;
	}



	@Override
	public void signup(UserCommands userCommand) {
		
		userRepository.save(userCommand.toUser());
	}
}