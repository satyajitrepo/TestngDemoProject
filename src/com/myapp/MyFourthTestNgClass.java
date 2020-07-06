package com.myapp;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyFourthTestNgClass {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class is invoked.");
	}
	
	@Test(priority = 7, groups = {"smoke"})
	public void method7() {
		System.out.println("I am inside method7.");
	}
	
	@Test(priority = 8)
	public void method8() {
		System.out.println("I am inside method8.");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class is invoked.");
	}
}
