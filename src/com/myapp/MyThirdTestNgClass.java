package com.myapp;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyThirdTestNgClass {
	@Test(priority = 5, groups = {"smoke"})
	public void method5() {
		System.out.println("I am inside method5.");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method is invoked.");
	}
	
	@Test(priority = 6)
	public void method6() {
		System.out.println("I am inside method6.");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method is invoked.");
	}
}
