package com.orange.pages;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.orange.base.Testbase;

public class Usermanagementpage extends Testbase {

	String expectpoptitle = "Add User";

	@FindBy(how = How.XPATH, using = "//a[@id='menu_admin_viewAdminModule']")
	WebElement adminmenu;

	@FindBy(how = How.ID, using = "btnAdd")
	WebElement addbutton;

	@FindBy(how = How.ID, using = "//*[@id='systemUser-information']/div[1]/h1")
	WebElement searchtitle;

	@FindBy(id = "UserHeading")
	WebElement poptitle;

	public Usermanagementpage() {
		PageFactory.initElements(driver, this);
	}

	public void Verifyusermanagementpage() {
		adminmenu.click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		String expectsearchtitle = "System Users";
		assertEquals(searchtitle.getText(), expectsearchtitle);

	}

	public void verifyadduser() {
		addbutton.click();
		assertEquals(poptitle.getText(), expectpoptitle);

	}

}
