package Practice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExpliciteTest {

	WebDriver driver;
	WebDriverWait wait;
	String expec ="Hello World!";

	@BeforeClass
	public void SetUp() {

		System.setProperty("webdriver.chrome.driver", "browser//chrome//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

	}

	@Test
	public void login() {
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		wait = new WebDriverWait(driver,20);
		WebElement actu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
		
		assertEquals(actu.getText(), expec);
	}

	@AfterClass
	public void Teardown() {

	}
}
