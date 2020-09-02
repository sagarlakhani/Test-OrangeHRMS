package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseclickDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "browser\\chrome\\chromedriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");

		WebElement rightclickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));

		WebElement doubleclickpopup = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

		Actions action = new Actions(driver);

		action.contextClick(rightclickbutton).perform();

		action.doubleClick(doubleclickpopup).perform();

		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();

	}

}
