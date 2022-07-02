package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {

	@Test
	public void chicken() {

		System.out.println("Chicken");

	}

	@Ignore
	@Test
	public void mutton() {

		System.out.println("Mutton");

	}

	@Test
	public void fish() {

		System.out.println("Fish");

	}

	@Test(enabled = false)
	public void panneer() {

		System.out.println("Panner");

	}

	@Test
	public void mushroom() { // if we ignore one method in java, if we suppose to include that method in XML
								// then test will not run(ie not even pass or fail)

		System.out.println("Mushroom");

	}

}
