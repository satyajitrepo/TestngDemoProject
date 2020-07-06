package com.myapp;

import org.testng.annotations.Test;

public class MySecondTestNgClass {
	@Test(priority = 3, groups = {"smoke"})
	public void method3() {
		System.out.println("I am inside method3.");
	}
	
	@Test(priority = 4)
	public void method4() {
		System.out.println("I am inside method4.");
	}
}
