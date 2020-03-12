package com.orange.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.base.Testbase;

public class dashboardpage extends Testbase {
	
	@FindBy(xpath = "//*[@id=\"branding\"]/a[1]/img")
	WebElement titleimage;
	
	@FindBy(xpath = "//*[@id=\"welcome\"]")
	WebElement welcomeuser;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/ul/li[1]/a/b")
	WebElement adminmenu;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/ul/li[2]/a/b")
	WebElement pimmenu;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/ul/li[3]/a/b")
	WebElement leavemenu;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/ul/li[4]/a/b")
	WebElement viewtimemenu;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/ul/li[5]/a/b")
	WebElement recruitermenu;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/ul/li[6]/a/b")
	WebElement performancemenu;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/ul/li[7]/a/b")
	WebElement dashboardmenu;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/ul/li[8]/a/b")
	WebElement viewdirectorymenu;
	
	
		public dashboardpage() {
			PageFactory.initElements(driver, this);
			
		}
		
		public String pagetitleverification()
		{
			return driver.getTitle();
		}
		
		public void titleimagetest() {
		//	Boolean logoimage = titleimage.isDisplayed();
			
			Boolean logoimage = driver.findElement(By.xpath("//*[@id=\\\"branding\\\"]/a[1]/img")).isDisplayed();
			assertTrue(logoimage);
			System.out.println("logo image available");
		}
		
		public String[]  menu_windowverification() {
			
			String menu[] = new String[8];
			 menu[0] = adminmenu.getText();
			 menu[1] = pimmenu.getText();
			 menu[2] = leavemenu.getText();
			 menu[3] = viewtimemenu.getText();
			 menu[4] = recruitermenu.getText();
			 menu[5] = performancemenu.getText();
			 menu[6] = dashboardmenu.getText();
			 menu[7] = viewdirectorymenu.getText();
			
			return menu;
			
		}
		

}
