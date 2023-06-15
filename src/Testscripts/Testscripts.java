package Testscripts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Generic;

public class Testscripts extends Generic
{

	@Test
	public void Script() throws InterruptedException
	{
		driver.findElement(By.name("email")).sendKeys("rakshitak4@gmail.com");
		driver.findElement(By.name("password")).sendKeys("36@d%axQbxpCxX");
		driver.findElement(By.id("signInSubmit")).click();
		/*TO HANDLE CAPTCHA*/
		
		/*driver.findElement(By.name("password")).sendKeys("36@d%axQbxpCxX");
		Thread.sleep(10000);
		To handle captcha code manually delay is provided
		
		driver.findElement(By.id("signInSubmit")).click();*/
		
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Atomic Habits: An Easy & Proven Way to Build Good Habits & Break Bad Ones");
		Thread.sleep(3000);
		ele.sendKeys(Keys.ARROW_DOWN);
		ele.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='Sticky']//button[@aria-label='Tap to shelve book as want to read']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='My Books']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//img[@title='Remove from my books']")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
	}
}
