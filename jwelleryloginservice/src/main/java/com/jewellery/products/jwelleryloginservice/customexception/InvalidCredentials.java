package com.jewellery.products.jwelleryloginservice.customexception;

public class InvalidCredentials extends RuntimeException{
	
	public InvalidCredentials(String exceptionMessage) {
		super(exceptionMessage);
	}

}
