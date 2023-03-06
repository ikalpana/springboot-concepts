package com.feign.example.service;

import org.springframework.stereotype.Service;

import com.feign.example.request.UserRequest;

@Service
public class UserService {
	
	public UserRequest sendRequest(UserRequest request) {
		return request;
	}

}
