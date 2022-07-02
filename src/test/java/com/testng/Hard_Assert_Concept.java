package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_Concept {
	
	@Test
	public void demo() {
		
		String exp = "Dhoni";
		
		String act = "Dhoni";
		
		Assert.assertEquals(act, exp); // Hard Assert will terminate at the line itself in which error occurs next line of code will not executed.	
        
		System.out.println("Validation");
		
	}

}
