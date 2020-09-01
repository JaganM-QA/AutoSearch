package findelementsexm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosearch

{

	public static void main (String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
		Thread.sleep(5000);
		 
		 List<WebElement> autosrch = driver.findElements(By.xpath("//li[@class='sbct']"));
		 int count = autosrch.size();
		 
		 System.out.println(count);
		 autosrch.get(2).click();
		 
	}
	
	
}
