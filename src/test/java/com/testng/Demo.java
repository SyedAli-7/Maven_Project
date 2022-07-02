package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void username() {
		
		String exp = "Syed";
		
		String act = "Syed";
		
		Assert.assertEquals(act, exp);

	}
	
	@Test
	public void password() {
		
		String exp = "123";
		
		String act = "456";
		
		Assert.assertEquals(act, exp);

	}

}
