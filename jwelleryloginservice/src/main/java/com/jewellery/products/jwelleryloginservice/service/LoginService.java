package com.jewellery.products.jwelleryloginservice.service;

import org.springframework.stereotype.Service;

import com.jewellery.products.jwelleryloginservice.dto.LoginDetails;


public interface LoginService {

	String loginOperation(LoginDetails loginDetails);
	
	

}
