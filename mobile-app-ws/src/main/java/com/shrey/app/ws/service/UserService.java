package com.shrey.app.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.shrey.app.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService {

	UserDto createUser(UserDto user);
	
}
