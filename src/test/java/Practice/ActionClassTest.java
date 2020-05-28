package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "browser/firefox/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.annauniv.edu/");
		WebElement menu = driver.findElement(By.linkText("Administration"));

		Actions act = new Actions(driver);

		act.moveToElement(menu).perform();
		System.out.println(menu.getText());
		Thread.sleep(3000);

		// act.moveToElement(tar, 0, 114).click().perform();
		act.moveByOffset(0, 114).click().perform();
		Thread.sleep(3000);
		driver.navigate().back();

		act.contextClick(menu).keyDown(Keys.DOWN);

	}

}
