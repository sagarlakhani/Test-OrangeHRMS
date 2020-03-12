package com.orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.orange.base.Testbase;

public class pimpage extends Testbase {
	
	@FindBy(id = "firstName")
	WebElement firstnametxt;
	
	@FindBy(id = "middleName")
	WebElement middlenametxt;
	
	@FindBy(id = "lastName")
	WebElement lastnametxt;
	
	@FindBy(id = "chkLogin")
	WebElement logincheckbox;
	
	@FindBy(id ="user_name")
	WebElement usernametxt;
	
	@FindBy(id = "user_password")
	WebElement passwordtxt;
	
	@FindBy (id = "re_password" )
	WebElement repasswordtxt;

	@FindBy(id = "status")
	WebElement statusdd;
	
	@FindBy(id = "btnSave")
	WebElement savebutton;
	
	
	public void addemp( String fname, String mname, String lname,String uname, String pass, String repass, String dstatus, String check) {
		firstnametxt.sendKeys(fname);
		middlenametxt.sendKeys(mname);
		lastnametxt.sendKeys(lname);
		usernametxt.sendKeys(uname);
		passwordtxt.sendKeys(pass);
		repasswordtxt.sendKeys(repass);
		statusdd.sendKeys(dstatus);
		logincheckbox.sendKeys(check);
		
	}
}

