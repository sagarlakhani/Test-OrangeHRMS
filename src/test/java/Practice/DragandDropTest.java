package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "browser/firefox/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);

		WebElement sourc = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement trag = driver.findElement(By.xpath("//div[@id='droppable']"));

		Actions act = new Actions(driver);
		act.dragAndDrop(sourc, trag).perform();
		
		
		driver.navigate().to("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		

	}

}
