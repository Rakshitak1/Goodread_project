package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Generic {

	public WebDriver driver;
	@BeforeMethod
	public void Setup()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.goodreads.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Sign In']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Sign in with email']")).click();
		
	}
	
	@AfterMethod
	public void Close()
	{
		driver.close();
	}

}
