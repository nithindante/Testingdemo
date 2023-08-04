package mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import methd.methoddds;

public class Testing {

	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
	}
	@BeforeMethod
	public void get()
	{
		driver.get("https://blazedemo.com/register");
		driver.manage().window().maximize();
	}
	@Test
	public void run()
	{
		methoddds obj = new methoddds(driver);
		obj.setvalues("nithin", "groupon","nrajkumar@gmail.com", "nith123", "nith123");
		obj.clickk();
	}
}
