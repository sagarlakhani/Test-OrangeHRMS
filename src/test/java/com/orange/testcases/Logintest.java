package com.orange.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orange.base.Testbase;
import com.orange.pages.dashboardpage;
import com.orange.pages.login;

public class Logintest extends Testbase {

	login login;
	dashboardpage dashboardpage;
	
	public  Logintest() {
		// TODO Auto-generated constructor stub
	
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		login = new login();
	}
	
	@Test(priority = 1)
	public void loginpagetitletest() {
	  String title	= login.pagetitleverification();
	  Assert.assertEquals(title, "OrangeHRM");
	}
	
	@Test(priority = 2)
	public void loginfun() {
		login.loginbutton(prop.getProperty("username"),prop.getProperty("pass"));
	}

	@AfterMethod
    public void teardown() {
		driver.quit();
	}
}
