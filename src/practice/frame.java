package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class frame {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://letcode.in/frame");
		driver.switchTo().frame("firstFr");
		driver.findElement(By.xpath("//input[@name=\"fname\"]")).sendKeys("vijay");
		driver.findElement(By.xpath("//input[@name=\"lname\"]")).sendKeys("prakash");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"innerFrame\"]")));
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("1234@mail.com");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@class=\"card-footer-item\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"https://www.instagram.com/ortonikc/\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"https://www.facebook.com/ortoni/\"]")).click();
		System.out.println(driver.getCurrentUrl());
		for(String id:driver.getWindowHandles()) 
		{
			driver.switchTo().window(id);
			if(driver.getCurrentUrl().contains("ortonikc")) 
			{
				driver.findElement(By.xpath("//button[@class=\"_acan _acap _acas _aj1-\"]")).click();
			}
			else if(driver.getTitle().contains("Facebook – log in or sign up")) 
			{
				driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
			}			
		}
	}
}
