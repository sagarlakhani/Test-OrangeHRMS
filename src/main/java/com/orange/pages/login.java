package com.orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.base.Testbase;

public class login extends Testbase {

	// object repository
	@FindBy(id = "txtUsername")
	WebElement txtUsername;

	@FindBy(id = "txtPassword")
	WebElement txtPassword;

	@FindBy(id = "btnLogin")
	WebElement btnLogin;

	// Initialization of page object
	public login() {
		PageFactory.initElements(driver, this);
	}

	/*
	 * public login(String uname, String pwd) { txtUsername.sendKeys(uname);
	 * txtPassword.sendKeys(pwd); btnLogin.click(); }
	 */

	public String pagetitleverification() {
		return driver.getTitle();
	}

	public void loginbutton(String uname, String pwd) {
		txtUsername.sendKeys(uname);
		txtPassword.sendKeys(pwd);
		btnLogin.click();
		
	}
}
