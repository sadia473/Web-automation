package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import basicPackage.DriverSetup;

public class TC04_Refresh extends DriverSetup{
	public static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";

	@Test
	public static void refreshPage() throws InterruptedException {
		
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.navigate().to("http://www.google.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		
		
		
		//navigate( ).to( )
		//navigate( ).back( )
		//navigate( ).forward( )
		//navigate( ).refresh( )
	}
}

