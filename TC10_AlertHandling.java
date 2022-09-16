package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basicPackage.DriverSetup;

public class TC10_AlertHandling extends DriverSetup {

public static String baseUrl = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert";

	@Test
	public static void alertHandlingCheck() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		Thread.sleep(5000);
		
		WebElement b=driver.findElement(By.name("iframeResult"));
		driver.switchTo().frame(b);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		
		
		Thread.sleep(5000);
	}
}
