package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IframeTest {

	WebDriver driver;

	@BeforeClass
	public void starttest() {
		System.setProperty("webdriver.chrome.driver", "browser//chrome//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.cookbook.seleniumacademy.com/Frames.html");
	}

	@Test
	public void Leftframe() {
		driver.switchTo().frame("left");
		System.out.println(driver.findElement(By.xpath("//p")).getText());
		driver.switchTo().defaultContent();

	}

	@Test
	public void RightFrame() {
		driver.switchTo().frame("right");
		System.out.println(driver.findElement(By.xpath("//p")).getText());
		driver.switchTo().defaultContent();

	}

	@Test
	public void MiddleFrame() {
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("//p")).getText());
		driver.switchTo().defaultContent();

	}

	@AfterClass
	public void endtest() {

	}

}
