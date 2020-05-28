package Practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTabledemo {

	public static void main(String[] args) throws InterruptedException {

		String name = "Cedric Kelly";
		System.setProperty("webdriver.gecko.driver", "browser//chrome//chromedriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		driver.manage().window().maximize();

		List<WebElement> Header = driver.findElements(By.xpath("//tr[@role='row']//child::th"));

		List<WebElement> Row = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));

		List<WebElement> Columns = driver.findElements(By.xpath("//table[@id='example']/thead/tr/th"));

		List<WebElement> namelist = driver.findElements(By.xpath("//table[@id='example']/tbody//td[2]"));

		// WebElement checkboxdemo =
		// driver.findElement(By.xpath("//table[@id='example']/tbody/tr/td[1]"));

		/*
		 * for (WebElement headertext : Header) {
		 * System.out.println(headertext.getText()); }
		 * 
		 * for (WebElement rowcount : Row) { System.out.println(rowcount.getText()); }
		 * 
		 * System.out.println(Row.size()); System.out.println(Columns.size()); 
		 */

		for (int i = 0; i < namelist.size(); i++) {
			if (!name.equals(namelist.get(i).getText())) {
				System.out.println(namelist.get(i).getText());
				Thread.sleep(1000);
				driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+ (i+1) + "]/td[1]")).click();
				//break;
			}
		}

	}
}
