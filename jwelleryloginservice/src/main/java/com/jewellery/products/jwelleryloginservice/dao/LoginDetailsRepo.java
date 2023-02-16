package com.jewellery.products.jwelleryloginservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jewellery.products.jwelleryloginservice.dto.LoginDetails;

public interface LoginDetailsRepo extends JpaRepository<LoginDetails, String> {
	
	public LoginDetails findByUserNameAndPassword(String userName, String password);

}
