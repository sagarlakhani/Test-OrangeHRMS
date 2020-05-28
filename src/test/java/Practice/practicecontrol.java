package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class practicecontrol {

	WebDriver driver;

	@BeforeClass
	public void opensite() {
		System.setProperty("webdriver.chrome.driver", "browser\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	}

	@Test
	public void radio() {

		driver.findElement(By.cssSelector("input[value='radio2']")).click();
	}

	@Test
	public void dropdown() {
		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByValue("option2");

	}

	@Test
	public void suggestiondd() throws InterruptedException {
		driver.findElement(By.cssSelector("input#autocomplete")).sendKeys("india");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#autocomplete")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("input#autocomplete")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("input#autocomplete")).sendKeys(Keys.ENTER);
	}

	@Test
	public void switchwindow() {
		driver.findElement(By.id("openwindow")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
	}

}
