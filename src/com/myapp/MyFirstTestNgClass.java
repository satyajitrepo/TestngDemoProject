package com.myapp;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstTestNgClass {
	
	@BeforeTest
	public void setup() {
		System.out.println("Before test is invoked.");
	}
	
	@Test(priority = 1, groups = {"smoke"})
	public void method1() {
		System.out.println("I am inside method1.");
	}
	
	@Test(priority = 2)
	public void method2() {
		System.out.println("I am inside method2.");
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("After test is invoked.");
	}
}
