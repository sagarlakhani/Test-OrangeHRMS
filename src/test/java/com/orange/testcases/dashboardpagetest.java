package com.orange.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orange.base.Testbase;
import com.orange.pages.dashboardpage;
import com.orange.pages.login;

public class dashboardpagetest extends Testbase {

	login login;
	dashboardpage dashboardpage = new dashboardpage();

	public dashboardpagetest() {
		super();
	}

	@BeforeClass
	public void setup() {
		initialization();
		login = new login();
		login.loginbutton(prop.getProperty("username"), prop.getProperty("pass"));
	}

	@Test(priority = 2)
	public void Testpagetitleverification() {
		String name = dashboardpage.pagetitleverification();
		System.out.println(name);
	}

	@Test(priority = 1)
	public void Testlogoverification() {
		dashboardpage.titleimagetest();
	}

	@Test(priority = 3)
	public void Testmenuverificationtest() {
		dashboardpage.menu_windowverification();
	}

	@AfterClass
	public void teardown() {
		System.out.println("dashboard after test");
		driver.close();
		driver.quit();
	}

}
