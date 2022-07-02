package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Another_Class {
	
	@Test
	@Parameters({"username", "password"})
	public void login(String username, String password) {
		
		System.out.println("Username is :" + username);
		
		System.out.println("Password is :" + password);

	}

}
