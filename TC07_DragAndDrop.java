package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basicPackage.DriverSetup;

public class TC07_DragAndDrop extends DriverSetup{
	public static String baseUrl = "https://jqueryui.com/droppable";

	@Test
	public static void dragAndDropCheck() throws InterruptedException {

		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		Thread.sleep(3000);
		// Drag and Drop
		driver.switchTo().frame(0);
		
		WebElement e1 = driver.findElement(By.id("draggable"));
		WebElement e2 = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(e1, e2).build().perform();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
	}
}
