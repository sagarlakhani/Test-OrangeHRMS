package com.orange.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orange.base.Testbase;
import com.orange.pages.Usermanagementpage;
import com.orange.pages.login;

public class Usermanagementpagetest extends Testbase {

	login login;
	Usermanagementpage um;

	public Usermanagementpagetest() {
		super();
	}

	@BeforeClass(groups = { "usermanagement1" })
	public void setup() {
		initialization();
		login = new login();
		login.loginbutton(prop.getProperty("username"), prop.getProperty("pass"));
		um = new Usermanagementpage();
	}

	@Test(priority = 1, groups = { "usermanagement1" })
	public void validatenavigatetousermanagement() {
		um.Verifyusermanagementpage();
	}

	@Test(priority = 2, groups = { "usermanagement1" })
	public void validateadduserfunctionality() {
		um.Verifyadduser();
	}

	@Test(priority = 3, groups = { "usermanagement1" })
	public void ValidatesearchfuncationalityByUsername() {
		boolean Uname = um.VerifySearchFunctionalityByUsername();
		assertTrue(Uname);
	}

	@Test(priority = 4, groups = { "usermanagement1" })
	public void ValidatesearchfuncationalityByRole() {
		boolean Role = um.VerifySearchFunctionalityByUserRole();
		assertTrue(Role);

	}

	@Test(priority = 5, groups = { "usermanagement1" })
	public void ValidatesearchfuncationalityByEmpName() {
		boolean Empname = um.VerifySearchFunctionalityEmployeename();
		assertTrue(Empname);

	}

	@AfterClass(groups = { "usermanagement1" })
	public void teardown() {
		System.out.println("usermanagement after test");
		driver.quit();
	}
}
