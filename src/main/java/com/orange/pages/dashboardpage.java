package com.orange.pages;

import java.util.List;

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

	// WebDriver driver;

	public dashboardpage() {

		PageFactory.initElements(driver, this);

	}

	public String pagetitleverification() {
		return driver.getTitle();
	}

	public boolean titleimagetest() {

		boolean logoimage = driver.findElement(By.xpath("//div[@id='branding']//a//img")).isDisplayed();
		return logoimage;

	}

	public void menu_windowverification() {

		List<WebElement> menutext = driver.findElements(By.className("firstLevelMenu"));
		for (WebElement webelement : menutext) {
			String name = webelement.getText();
			System.out.println(name);
		}

	}

}
