package com.myapp;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyFifthTestNgClass {
	
	@Test(priority = 6, groups = {"smoke"})
	public void HomeLoanLogin() {
		System.out.println("Home loan login");
	}
	
	@Test
	public void CarLoanLogin() {
		System.out.println("Car loan login");
	}
	
	@Test
	public void GoldLoanLogin() {
		System.out.println("Gold loan login");
	}
	
	@Test
	public void HomeLoanLogout() {
		System.out.println("Home loan logout");
	}
}
