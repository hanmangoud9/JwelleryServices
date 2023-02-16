package com.jewellery.products.jwelleryloginservice.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "login_details")
@Getter
@Setter
@NoArgsConstructor
public class LoginDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String userName;
	
	
	@Column(nullable = false, length = 64)
	private String password;
	
	private String isAdmin;
	
		
}
