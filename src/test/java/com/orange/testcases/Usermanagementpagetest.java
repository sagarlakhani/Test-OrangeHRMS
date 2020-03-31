package com.orange.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orange.base.Testbase;
import com.orange.pages.Usermanagementpage;
import com.orange.pages.dashboardpage;
import com.orange.pages.login;

public class Usermanagementpagetest extends Testbase {

	login login;
	Usermanagementpage um = new Usermanagementpage();
	dashboardpage dashboardpage;

	public Usermanagementpagetest() {
		super();
	}

	@BeforeClass
	public void setup() {
		initialization();
		login = new login();
		um = login.loginbutton(prop.getProperty("username"), prop.getProperty("pass"));
	}

	@Test(priority = 1)
	public void validatenavigatetousermanagement() {
		um.Verifyusermanagementpage();
	}

	@Test(priority = 2)
	public void validateadduserfunctionality() {
		um.verifyadduser();
	}

	@AfterClass
	public void teardown() {
		System.out.println("usermanagement after test");
		driver.close();
		driver.quit();
	}
}
