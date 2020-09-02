package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.beust.jcommander.JCommander.Builder;

public class testmenu {

	public static void main(String[] arguments) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "browser//firefox//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/menu/");

		driver.switchTo().frame(0);

		WebElement name1 = driver.findElement(By.xpath("//div[@id='ui-id-9']"));

		Actions act = new Actions(driver);

		act.moveToElement(name1).click().build().perform();
		System.out.println(name1.getText());
		Thread.sleep(2000);
		WebElement name2 = driver.findElement(By.xpath("//ul[@role='menu' and @aria-expanded='true' ]//div[@id='ui-id-10']"));
		act.moveToElement(name2).perform();
		System.out.println(name2.getText());
		Thread.sleep(2000);
		WebElement name3 = driver.findElement(By.xpath("//ul[@role='menu' and @aria-expanded='true' ]//div[@id='ui-id-12']"));
		act.moveToElement(name3).perform();
		System.out.println(name3.getText());

		/*
		 * WebElement txt1 = driver.findElement(By.id("ui-id-9"));
		 * act.moveToElement(txt1).click().build().perform();
		 * System.out.println(txt1.getText());
		 * 
		 * WebElement txt2 = driver.findElement(By.id("ui-id-10"));
		 * System.out.println(txt2.getText());
		 */
		 
	}

}
