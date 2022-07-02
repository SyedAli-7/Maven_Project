package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Grouping_Concept {
	
	@Test(groups = "Non Veg")
	public void chicken() {
		
		System.out.println("Chicken");

	}
	
	@Test(groups = "Non Veg")
	public void mutton() {
		
		System.out.println("Mutton");

	}
	
	@Test(groups = "Non Veg")
	public void fish() {
		
		System.out.println("Fish");

	}
	
	@Test(groups = "Veg")
	public void panneer() {
		
		System.out.println("Panner");

	}
	
	@Test(groups = "Veg")
	public void mushroom() {
		
		System.out.println("Mushroom");

	}
	
	@Test(groups = "Vehicle")
	public void cycle() {
		
		System.out.println("Cycle");

	}
	
	@Test(groups = "Vehicle")
	public void scooter() {
		
		System.out.println("Scooter");

	}

}
