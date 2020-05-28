package Practice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dragdrop2test {

	WebDriver driver;

	@BeforeMethod

	public void start() {

		System.setProperty("webdriver.gecko.driver", "browser/firefox/geckodriver.exe");

		driver = new FirefoxDriver();

		driver.get("https://jqueryui.com/droppable/");
	}

	@Test
	public void test1() {
		driver.switchTo().frame(0);

		String expect = "Dropped!";

		WebElement sourc = driver.findElement(By.xpath("//div[@id ='draggable']"));

		WebElement targ = driver.findElement(By.xpath("//div[@id ='droppable']"));

		Actions act = new Actions(driver);

		act.dragAndDrop(sourc, targ).perform();

		String actu = driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();

		assertEquals(actu, expect);
		
		
		Select sel = new Select(driver.findElement(By.xpath("//div[@id ='draggable']")));
		

	}

	
	
}
