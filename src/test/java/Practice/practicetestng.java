package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class practicetestng {

	@BeforeSuite
	public void beforesuittest() {
		System.out.println("before suit function");
	}

	@BeforeTest
	public void beforetestmethod() {
		System.out.println("Before test function");
	}

	@BeforeClass
	public void beforeclassmethod() {
		System.out.println("Before class function");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method function");
	}

	@Parameters({"username"})
	@Test
	public void testmethod(String uname) {
		System.out.println("test 1 function");
		System.out.println(uname);
	}
	
	@Test(dataProvider = "datatest")
	public void test2method(String uname, String pass) {
		System.out.println("test 2 function");
		System.out.println(uname);
		System.out.println(pass);
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("After method function");
	}

	@AfterClass
	public void afterclassmethod() {
		System.out.println("After class function");
	}

	@AfterTest
	public void aftertestmethod() {
		System.out.println("After test function");
	}

	@AfterSuite
	public void aftersuittest() {
		System.out.println("After suit function");
	}
	
	@DataProvider
	public Object[][] datatest()
	{
		Object data[][] = new Object[2][2];
		
		data[0][0]="first name";
		data[0][1] ="first password";
		
		data[1][0]="second name";
		data[1][1]="second password";
		
		return data;
				
				
	}
}
