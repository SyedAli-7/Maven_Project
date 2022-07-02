package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Concept {
	
	@Test
	public void demo() {
		
		String exp = "Dhoni";
		
		String act = "dhoni";
		
		SoftAssert s = new SoftAssert(); 
		
		s.assertEquals(act, exp); // Soft Assert will not terminate the line where error occurs, it will continue to execute the next line without terminate.
		
		System.out.println("Verification");

	}

}
