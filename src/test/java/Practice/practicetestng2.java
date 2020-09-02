package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practicetestng2 {

	@BeforeSuite
	public void beforesuittest1() {
		System.out.println("before1 suit function");
	}

	@BeforeTest
	public void beforetestmethod1() {
		System.out.println("Before1 test function");
	}

	@BeforeClass
	public void beforeclassmethod1() {
		System.out.println("Before1 class function");
	}

	@BeforeMethod
	public void beforemethod1() {
		System.out.println("before1 method function");
	}

	@Test(priority=2)
	public void testmethod1() {
		System.out.println("test 11 function");
	}
	
	@Test(priority=1)
	public void test2method1() {
		System.out.println("test 12 function");
	}

	@AfterMethod
	public void aftermethod1() {
		System.out.println("After1 method function");
	}

	@AfterClass
	public void afterclassmethod1() {
		System.out.println("After1 class function");
	}

	@AfterTest
	public void aftertestmethod1() {
		System.out.println("After1 test function");
	}

	@AfterSuite
	public void aftersuittest1() {
		System.out.println("After1 suit function");
	}
}
