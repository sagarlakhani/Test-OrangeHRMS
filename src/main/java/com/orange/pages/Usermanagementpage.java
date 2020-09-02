package com.orange.pages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orange.base.Testbase;
import com.orange.util.VerifyTable;

public class Usermanagementpage extends Testbase {

	String expectpoptitle = "Add User";

	@FindBy(how = How.XPATH, using = "//a[@id='menu_admin_viewAdminModule']")
	WebElement adminmenu;

	@FindBy(how = How.ID, using = "btnAdd")
	WebElement addbutton;

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'System Users')]")
	WebElement searchtitle;

	@FindBy(id = "UserHeading")
	WebElement poptitle;

	@FindBy(xpath = "//table[@id='resultTable']//tbody/tr")
	WebElement tablepath;

	@FindBy(xpath = "//input[@id='searchSystemUser_userName']")
	WebElement Username;

	@FindBy(xpath = "//input[@id='searchBtn']")
	WebElement SearchBtn;

	@FindBy(id = "searchSystemUser_userType")
	WebElement UserroleDD;

	@FindBy(name = "searchSystemUser[employeeName][empName]")
	WebElement EmpName;

	public Usermanagementpage() {
		PageFactory.initElements(driver, this);
	}

	public void gotousermanagementpage() {
		adminmenu.click();
	}

	public void Verifyusermanagementpage() {
		adminmenu.click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		String expectsearchtitle = "System Users";
		assertEquals(searchtitle.getText(), expectsearchtitle);
	}

	public void Verifyadduser() {
		adminmenu.click();
		addbutton.click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("UserHeading")));
		assertEquals(poptitle.getText(), expectpoptitle);

	}

	public boolean VerifySearchFunctionalityByUsername() {
		adminmenu.click();
		ArrayList<String> uname = new ArrayList<String>();
		Username.sendKeys(prop.getProperty("username"));
		SearchBtn.click();
		uname = VerifyTable.VerifyUser("resultTable", "User role");
		boolean actualname = false;
		for (String name : uname) {
			if (name.contains("Admin")) {
				actualname = true;
				break;
			} else {
				actualname = false;
			}
		}
		return actualname;
	}

	public boolean VerifySearchFunctionalityByUserRole() {
		adminmenu.click();
		Select role = new Select(UserroleDD);
		role.selectByVisibleText("ESS");

		ArrayList<String> Urole = new ArrayList<String>();
		SearchBtn.click();
		Urole = VerifyTable.VerifyUser("resultTable", "User Role");
		boolean actualrole = false;
		for (String name : Urole) {
			if (name.contains("ESS")) {
				actualrole = true;
				break;
			} else {
				actualrole = false;
			}
		}
		return actualrole;
	}

	public boolean VerifySearchFunctionalityEmployeename() {
		adminmenu.click();
		EmpName.sendKeys("Fiona Grace");
		SearchBtn.click();
		ArrayList<String> EmpName = new ArrayList<String>();
		EmpName = VerifyTable.VerifyUser("resultTable", "Employee Name");
		boolean actualname = false;
		for (String name : EmpName) {
			if (name.contains("Fiona Grace")) {
				actualname = true;
				break;
			} else {
				actualname = false;
			}
		}
		return actualname;
	}

}
