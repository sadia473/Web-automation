package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basicPackage.DriverSetup;

public class TC06_DoubleClickRightClick extends DriverSetup{

	public static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";

	@Test
	public static void doubleClickRightClick() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		Actions a = new Actions(driver);
		
		WebElement doubleClickText = driver.findElement(By.xpath("//p[contains(text(),'The multiple attribute specifies that multiple opt')]"));
		a.doubleClick(doubleClickText).build().perform();
		Thread.sleep(3000);
	
		
		WebElement rightClick = driver.findElement(By.xpath("//body/form[1]/input[1]"));
		a.contextClick(rightClick).build().perform();
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		

		//click()
		//dragAndDrop( )
		//clickAndHold( )
		//keyDown( )
		//keyUp( )
		//release( )
		
		//build( )
		//perform();
		
	}
}
