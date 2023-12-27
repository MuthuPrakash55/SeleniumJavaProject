package practice;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class amazon {

	public static void main(String[] args) {
		WebDriver driver;
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		driver.findElement(By.xpath("//span[text()=\"Fire-Boltt\"]")).click();
		
		driver.findElement(By.xpath("//i[@class=\"a-icon a-icon-star-medium a-star-medium-4\"]")).click();
			
		Actions act =new Actions(driver);
		//WebElement sigin=driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		//act.moveToElement(sigin).build().perform();
	
		//driver.findElement(By.xpath("//span[text()='Your Orders']")).click();
	
		driver.findElement(By.xpath("//span[contains(text(),'Fire-Boltt Ninja Call Pro Plus 1.83\" Smart Watch with Bluetooth Calling, AI Voice Assistance')][1]")).click();
	
		driver.findElement(By.xpath("//span[contains(text(),'Fire-Boltt Phoenix Smart Watch with Bluetooth Calling 1.3\",120+ Sports Modes')][1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[25]/div/div/div/div/div[2]/div[1]/h2/a/span")).click();
			
		for(String id:driver.getWindowHandles()) {
			driver.switchTo().window(id);
			if(driver.getCurrentUrl().contains("Fire-Boltt-Bluetooth-Calling-Assistance-Resolution/")) 
			{
				WebElement quantity=driver.findElement(By.id("quantity"));
				Select select =new Select(quantity);
				select.selectByIndex(4);
			}
			else if(driver.getCurrentUrl().contains("Fire-Boltt-Phoenix-Bluetooth-Calling-Monitoring")) 
			{
				driver.findElement(By.id("gift-wrap")).click();
				driver.findElement(By.id("buy-now-button")).click();
			}
			else if (driver.getCurrentUrl().contains("Fire-Boltt-Outdoor-Bluetooth-Calling-Interactions"))
			{
				driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
			}
		}
		Set<String>window=driver.getWindowHandles();
		List<String> list=new ArrayList<>(window);
		//driver.switchTo().window(list.get(1));
		//System.out.println(driver.getCurrentUrl());
	
		//driver.switchTo().window(list.get(2));
		//System.out.println(driver.getCurrentUrl());
	
//		driver.switchTo().window(list.get(1));
//		System.out.println(driver.getCurrentUrl());
//		driver.quit();
		
	}
}
