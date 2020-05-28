package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertpopupdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "browser\\firefox\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "browser\\chrome\\chromedriver.exe");

		// WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();

		driver.get("http://selenium-examples.nichethyself.com/");

		driver.findElement(By.id("loginbutton")).click();
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		Thread.sleep(1000);
		myalert.accept();
		
		// driver.findElement(By.id("loginbutton")).click();

	}

}
