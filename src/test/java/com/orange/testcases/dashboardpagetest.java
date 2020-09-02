package com.orange.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orange.base.Testbase;
import com.orange.pages.dashboardpage;
import com.orange.pages.login;

public class dashboardpagetest extends Testbase {

	login login1;
	dashboardpage dashboardpage;
	String uname = prop.getProperty("username");
	String pwd = prop.getProperty("pass");

	public dashboardpagetest() {
		super();
	}

	@BeforeClass(groups = { "dashboard1" })
	public void setup() {
		initialization();
		login1 = new login();
		login1.loginbutton(uname, pwd);
		dashboardpage = new dashboardpage();
	}

	@Test(priority = 2, groups = { "dashboard1" })
	public void Testpagetitleverification() {
		String name = dashboardpage.pagetitleverification();
		System.out.println(name);
	}

	@Test(priority = 1, groups = { "dashboard1" })
	public void Testlogoverification() {
		assertTrue(dashboardpage.titleimagetest());
	}

	@Test(priority = 3, groups = { "dashboard1" })
	public void Testmenuverificationtest() {
		dashboardpage.menu_windowverification();
	}

	@AfterClass(groups = { "dashboard1" })
	public void teardown() {
		System.out.println("dashboard after test");
		driver.quit();
	}

}
