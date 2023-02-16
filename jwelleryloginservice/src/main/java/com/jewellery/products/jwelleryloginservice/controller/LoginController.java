package com.jewellery.products.jwelleryloginservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jewellery.products.jwelleryloginservice.dto.LoginDetails;
import com.jewellery.products.jwelleryloginservice.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	
	@GetMapping("/fetchlogin")
	public String login(@RequestBody LoginDetails loginDetails) {
		
		return loginService.loginOperation(loginDetails);
	}
	
	
}
