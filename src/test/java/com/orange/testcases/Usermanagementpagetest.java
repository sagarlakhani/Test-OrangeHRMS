package com.orange.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
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

	@BeforeTest
	public void setup() {
		initialization();
		login = new login();
		um = login.loginbutton(prop.getProperty("username"), prop.getProperty("pass"));
	}

	@Test(priority = 0)
	public void validatenavigatetousermanagement() {

		um.Verifyusermanagementpage();

	}

	@Test(priority = 1)
	public void validateadduserfunctionality() {
		um.verifyadduser();
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
