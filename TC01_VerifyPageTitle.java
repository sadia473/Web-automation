package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import basicPackage.DriverSetup;

public class TC01_VerifyPageTitle extends DriverSetup {

	public static String baseUrl="http://automationpractice.com/index.php";
	
	@Test
	public static void verifyTitle() throws InterruptedException 
	{
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String pageTitleActual=driver.getTitle();
		System.out.println("The page title is: "+ pageTitleActual);
		Thread.sleep(3000);
		
		String pageTitleExpected="My Store";
		//Assert.assertEquals(pageTitleExpected, pageTitleActual);  
		Assert.assertEquals(pageTitleActual, pageTitleExpected); //Assert.Method(actual, expected)

			
	}
	
	@Test
	public static void isWebsiteSecured() 
	{
		driver.get(baseUrl); //eva written
		String myUrl=driver.getCurrentUrl();
		
		if(myUrl.contains("https")) 
		{
			System.out.println("Site is secured");
		}else 
		{
			System.out.println("Site is not secured");
		}
	}
	
}
