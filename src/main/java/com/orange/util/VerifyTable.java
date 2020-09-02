package com.orange.util;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.orange.base.Testbase;

public class VerifyTable extends Testbase {

	public static ArrayList<String> GetalltableData(String tablename) {

		List<WebElement> Row = driver.findElements(By.xpath("//table[@id='" + tablename + "']//tbody/tr"));

		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='" + tablename + "']//thead///th"));
		ArrayList<String> uname = new ArrayList<String>();

		for (int i = 0; i < Row.size(); i++) {
			for (int j = 0; j < columns.size(); j++) {
				System.out.println(driver
						.findElement(
								By.xpath("//table[@id='resultTable']//tbody/tr[" + (i + 1) + "]/td[" + (j + 1) + "]"))
						.getText());
			}
		}

		return uname;

	}

	public static ArrayList<String> VerifyUser(String tablename,String columnname) {

		List<WebElement> Row = driver.findElements(By.xpath("//table[@id='"+tablename+"']//tbody/tr"));

		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='"+tablename+"']//thead//th"));
		ArrayList<String> uname = new ArrayList<String>();
		int j =0;
		
		for (WebElement colnumber : columns)
		{
			j++;
			if(colnumber.getText().equalsIgnoreCase(columnname))
			{
				System.out.println(colnumber.getText());
				
				break;
			}
		}

		for (int i = 0; i <Row.size(); i++) {

			System.out.println(driver
					.findElement(By.xpath("//table[@id='resultTable']//tbody/tr[" + (i + 1) + "]/td[" + (j) + "]"))
					.getText());

			uname.add(driver
					.findElement(By.xpath("//table[@id='resultTable']//tbody/tr[" + (i + 1) + "]/td[" + (j) + "]"))
					.getText());

		}

		return uname;

	}

}
