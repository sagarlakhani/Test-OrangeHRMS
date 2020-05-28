package Practice;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Explicitewait2 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void start1()
	{
		System.setProperty("webdriver.gecko.driver", "browser/firefox/geckodriver.exe");

		driver = new FirefoxDriver();

		driver.get("https://login.yahoo.com/");
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ketanvj");
		driver.findElement(By.xpath("//input[@name='signin']")).click();
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='password']")));
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1235232");
		driver.findElement(By.xpath("//button[@name='verifyPassword']")).click();
		
		WebElement err = driver.findElement(By.xpath("//p[@class='error-msg']"));
		
		assertTrue(err.isDisplayed());
		
		
	}

}
