package com.feign.example.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.feign.example.request.UserRequest;
import com.feign.example.service.UserService;


@RestController
public class UserController {

@Autowired
	UserService userService;

	@PostMapping("/getRequest")
	public ResponseEntity<UserRequest> sendRequest(@Valid @RequestBody UserRequest request) {
		UserRequest request2 = userService.sendRequest(request);
		return ResponseEntity.status(HttpStatus.OK).body(request2);
	}

}
