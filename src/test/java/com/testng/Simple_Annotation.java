package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {
	@BeforeSuite
	public void setProperty() {
		
		System.out.println("Property setting");

	}
	
	@BeforeTest
	public void browserLaunch() {
		
		System.out.println("Browser Launch");

	}
	
	@BeforeClass
	public void urlLaunch() {
		
		System.out.println("Url Launch");

	}
	
	@BeforeMethod
	public void signIn() {
		
		System.out.println("signin");

	}
	
	@Test(priority = -1)
	public void women() {
		
		System.out.println("women");

	}
	
	@Test(priority = 0)
	public void men() {
		
		System.out.println("men");

	}
	
	@Test(priority = 1, invocationCount = 2)
	public void kids() {
		
		System.out.println("kids");

	}
	
	@AfterMethod
	public void signOut() {
		
		System.out.println("signout");

	}
	
	@AfterClass
	public void homePage() {
		
		System.out.println("Home Page");

	}
	
	@AfterTest
	public void closeBrowser() {
		
		System.out.println("Close Browser");

	}
	
	@AfterSuite
	public void quitBrowser() {
		
		System.out.println("Quit Browser");

	}

}
