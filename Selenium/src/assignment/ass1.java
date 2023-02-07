package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/che.html");
	  
	        WebElement ele = driver.findElement(By.id("a1"));
	        Thread.sleep(2000);
	         ele.sendKeys(Keys.CONTROL+"ax");
	         Thread.sleep(2000);
	         WebElement ele1 = driver.findElement(By.id("a3"));
	         Thread.sleep(2000);
	         ele1.sendKeys(Keys.CONTROL+"v");
	         Thread.sleep(2000);
	         WebElement ele3 = driver.findElement(By.id("a2"));
	         Thread.sleep(2000);
	         ele3.sendKeys(Keys.CONTROL+"ax");
	         Thread.sleep(2000);
	         ele.sendKeys(Keys.CONTROL+"v");
	         Thread.sleep(2000);
	         ele1.sendKeys(Keys.CONTROL+"ax");
	         Thread.sleep(2000);
	         ele3.sendKeys(Keys.CONTROL+"v");

	}

}
