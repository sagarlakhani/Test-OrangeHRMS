package com.orange.pages;

import static org.testng.Assert.assertTrue;

import java.util.Arrays;
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

	public dashboardpage() {
		PageFactory.initElements(driver, this);

	}

	public String pagetitleverification() {
		return driver.getTitle();
	}

	public void titleimagetest() {
		// Boolean logoimage = titleimage.isDisplayed();

		Boolean logoimage = driver.findElement(By.xpath("//div[@id='branding']//a//img")).isDisplayed();
		assertTrue(logoimage);
		System.out.println("logo image available");
	}

	public void menu_windowverification() {

		List<WebElement> menutext = driver.findElements(By.className("firstLevelMenu"));
		for (WebElement webelement : menutext) {
			String name = webelement.getText();
			System.out.println(name);
		}

	}

}
