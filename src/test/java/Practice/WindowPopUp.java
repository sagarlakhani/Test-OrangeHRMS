package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WindowPopUp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "browser//chrome//chromedriver.exe");
		
		DesiredCapabilities ch =  DesiredCapabilities.chrome();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		
		
		WebDriver driver = new ChromeDriver(ch);
		
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
