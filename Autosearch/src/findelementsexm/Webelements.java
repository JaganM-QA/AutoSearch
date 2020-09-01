package findelementsexm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webelements

{
 
	public static void main (String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		driver.get("http://localhost/Elements/Webelements.html");
		Thread.sleep(2000);
		
		//---------------------Multiple Checkbox Selection-----------------------------------------------//
		List<WebElement> course = driver.findElementsByXPath("//input[@id='course']");
		Thread.sleep(2000);
		
		WebElement c1 = course.get(0);
		c1.click();
		
		WebElement c2 = course.get(3);
		c2.click();
		
		int count = course.size();
		System.out.println(count);
		 
		//---------------------Tag Name or  HREF Name display-----------------------------------------------//
		
		List<WebElement> href = driver.findElementsByTagName("a");
		Thread.sleep(2000);
		
		int count1 = href.size();
		System.out.println(count1);
		
		for(int i = 0; i<count1; i++)
		{
			
			WebElement href1 = href.get(i);
			String text = href1.getText();
			System.out.println(text);
		}
		
 //---------------------Drop down Values Printing-----------------------------------------------//
		
		WebElement dd6 = driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select mv5 = new Select (dd6);
		Thread.sleep(3000);
		
		 List<WebElement> options = mv5.getOptions();
		 Thread.sleep(2000);
		 int a = options.size();
		 for (int i = 0; i<a; i++)
		 {
			 
			 WebElement value = options.get(i);
			 String optionName = value.getText();
			 System.out.println(optionName);
		 }
		
		
//		//---------------------Auto Search in Google Search box-----------------------------------------------//
		
		 
		 driver.findElementByXPath("//a[contains(.,'Google')]").click();
		 Thread.sleep(2000);
		 
		 driver.findElementByXPath("//input[@name='q']").sendKeys("Selenium");
		 Thread.sleep(2000);
		 
		 List<WebElement> autosrch = driver.findElements(By.xpath("//li[@class='sbct']"));
		 int count3 = autosrch.size();
		 
		 System.out.println(count3);
		 autosrch.get(3).click();
		 
	}
}

