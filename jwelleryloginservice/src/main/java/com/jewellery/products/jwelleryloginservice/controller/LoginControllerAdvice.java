package com.jewellery.products.jwelleryloginservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jewellery.products.jwelleryloginservice.customexception.InvalidCredentials;

@RestControllerAdvice
public class LoginControllerAdvice {
	
	  @ResponseBody
	  @ExceptionHandler(InvalidCredentials.class)
	  @ResponseStatus(code = HttpStatus.NOT_FOUND)
	  String employeeNotFoundHandler(InvalidCredentials ex) {
	    return ex.getMessage();
	  }
	

}
