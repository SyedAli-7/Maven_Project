package com.testng;

import org.testng.annotations.Test;

public class Expected_Exception_Concept {
	
	@Test(expectedExceptions = ArithmeticException.class) // should not give NullPointerException because method can only expect ArithmeticException & parent Exception because it includes all exception then method does not throw any exception.
	public void demo() {
		
		int a = 20;
		
		System.out.println(a/0);

	}

}
