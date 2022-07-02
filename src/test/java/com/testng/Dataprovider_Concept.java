package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Concept {
	
	@Test(dataProvider = "input")
	public void credentials(String username, String password) {
		
		System.out.println("Username is :" + username);
		
		System.out.println("Password is :" + password);

	}
	
    @DataProvider
	public Object[][] input() {
		
    	return new Object[][] {
    		{"Syed", "123"},
    		{"Ali", "456" }
    	};

	}
	
}
