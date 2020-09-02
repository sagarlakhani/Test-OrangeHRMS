package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "browser/firefox/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("https://www.qafox.com/selenium/selenium-practice/");

		WebElement Firstlink = driver.findElement(By.xpath("//a[@href='http://tutorialsninja.com/demo/']"));
		WebElement second = driver.findElement(By.xpath("//a[@href='https://omayo.blogspot.in']"));
		WebElement thired = driver.findElement(By.xpath("//a[@href='http://tutorialsninja.com/demo/']"));
		WebElement four = driver.findElement(By.xpath("//a[@href='http://newtours.demoaut.com']"));
		WebElement fiv = driver
				.findElement(By.xpath("//a[@href='https://only-testing-blog.blogspot.in/2014/01/textbox.html']"));
		WebElement six = driver.findElement(By.xpath("//a[@href='https://jqueryui.com']"));
		WebElement seven = driver.findElement(By.xpath("//a[@href='http://book.theautomatedtester.co.uk']"));

		Firstlink.click();
		Thread.sleep(2000);
		second.click();
		Thread.sleep(2000);
		thired.click();
		Thread.sleep(2000);
		four.click();
		Thread.sleep(2000);
		fiv.click();
		Thread.sleep(2000);
		six.click();
		Thread.sleep(2000);
		seven.click();

		Set<String> allwindow = driver.getWindowHandles();

		/*
		 * for (String handle : allwindow) { driver.switchTo().window(handle);
		 * Thread.sleep(2000); }
		 */
		
		Iterator<String> it = allwindow.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
		}

	}

}
