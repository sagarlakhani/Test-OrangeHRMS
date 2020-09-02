package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenelement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "browser\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Identifying the element using ID attribute and Entering the value in the text
		// box
		js.executeScript("document.getElementById('displayed-text').value='text123'");
		
		

	}

}
