package com.testng;

import org.testng.annotations.Test;

public class Timeout_Concept {

	@Test(timeOut = 6000)
	public void login() throws InterruptedException {

		Thread.sleep(2000);
		System.out.println("Browser Launch");

		Thread.sleep(1000);
		System.out.println("URL Launch");

		Thread.sleep(2000);
		System.out.println("Login");

	}

	// Each method should have different timeout, one methods timeout does not
		// include other methods functionality.

	@Test
	public void logout() throws InterruptedException {

		Thread.sleep(5000);
		System.out.println("Logout");

	}

}
