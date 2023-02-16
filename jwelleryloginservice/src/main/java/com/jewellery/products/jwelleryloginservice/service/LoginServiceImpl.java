package com.jewellery.products.jwelleryloginservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jewellery.products.jwelleryloginservice.customexception.InvalidCredentials;
import com.jewellery.products.jwelleryloginservice.dao.LoginDetailsRepo;
import com.jewellery.products.jwelleryloginservice.dto.LoginDetails;

@Service
public class LoginServiceImpl  implements LoginService{

	@Autowired
	public LoginDetailsRepo loginDetailsRepo;
	
	@Override
	public String loginOperation(LoginDetails loginDetails) {
		
		LoginDetails loginDetailsfromDB=loginDetailsRepo.findByUserNameAndPassword(loginDetails.getUserName(), loginDetails.getPassword());
		
		if(loginDetailsfromDB!=null) {
			return "login success";
		}
		else {
			throw new InvalidCredentials("Invalid Credentials!");
		}
		
	}
	
	

}
