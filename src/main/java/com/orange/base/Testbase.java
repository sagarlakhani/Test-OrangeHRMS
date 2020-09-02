package com.orange.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.orange.util.Testutil;

public class Testbase {

	public static WebDriver driver;
	public static Properties prop;

	public Testbase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(".\\src\\main\\java\\com\\orange\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void initialization() {
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "browser\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "browser\\firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testutil.pageloadtime, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutil.implicite, TimeUnit.SECONDS);

		driver.get(prop.getProperty("URL"));

	}
	
	public static void superadmin()
	{
	}
	

}
