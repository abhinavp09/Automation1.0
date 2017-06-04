package testlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {
	
	@BeforeClass
	public void setup ()
	{
		System.out.println("ëxecuting setup");
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\src\\main\\resources\\"+"chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		
		
		
	}
	
	@AfterClass
	public void tearDown  ()
	{
		System.out.println("ëxecuting teardown");
	}
	
	@BeforeMethod
	public void testSetup  ()
	{
		System.out.println("ëxecuting testsetup");
	}
	
	@AfterMethod
	public void testTearDown  ()
	{
		System.out.println("ëxecuting testteardown");
	}
	
	@Test
	public void test1  ()
	{
		System.out.println("ëxecuting test1");
	}
	@Test
	public void test2  ()
	{
		System.out.println("ëxecuting test2");
	}
}

