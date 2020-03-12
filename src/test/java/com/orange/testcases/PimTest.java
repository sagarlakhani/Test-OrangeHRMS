package com.orange.testcases;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.orange.base.Testbase;
import com.orange.pages.dashboardpage;
import com.orange.pages.login;

public class PimTest extends Testbase{

	login login;
	dashboardpage dashboardpage = new dashboardpage();
	
	public PimTest() {
		super();
	}
	
	@BeforeTest
	public void setup() {
		initialization();
		login = new login();
	    login.loginbutton(prop.getProperty("username"), prop.getProperty("pass"));
	}

	@Test
	public void addemp() {
		
	}
}

