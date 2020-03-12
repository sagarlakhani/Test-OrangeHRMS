package com.orange.testcases;

import org.testng.annotations.BeforeTest;
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
	
	@BeforeTest
	public void setup() {
		initialization();
		login = new login();
	    login.loginbutton(prop.getProperty("username"), prop.getProperty("pass"));
	}
	
	@Test
	public void Testpagetitleverification() {
	 String name=	dashboardpage.pagetitleverification();
	 System.out.println(name);
	}
	
	@Test 
	public void Testlogoverification() {
		dashboardpage.titleimagetest();
	}
	
	@Test
	public void Testmenuverificationtest() {
		String menu[] = new String[8];
	    menu =	dashboardpage.menu_windowverification();
	    for (String menuname : menu)
	    {
	    	System.out.println(menuname);
	    }
	    	
	}
	
	/*
	@BeforeTest
	public void teardown() {
		driver.quit();
	}*/

}
