package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "browser//chrome//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://selenium-examples.nichethyself.com/");
		driver.findElement(By.xpath("//button[text()='Contact us!']")).click();
		driver.switchTo().window("Contact");
		driver.findElement(By.xpath("//span[contains(@class,'glyphicon-search')]")).click();
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.sendKeys("surat");
		myalert.accept();
		
	}

}
