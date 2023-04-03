package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class windowHandle {
	static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		
		driver.get("https://www.amazon.in/");
		//System.out.println(driver.getWindowHandles());//1
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java"+Keys.ENTER);
		driver.findElement(By.xpath("(//div[@data-component-type='s-search-result']"
				+ "//span[contains(text(),'Core Java: An Integrated')])[1]")).click();
		//System.out.println(driver.getWindowHandles());//2
		driver.findElement(By.xpath("//span[contains(text(),'Beginning Programming with Java')]"))
		.click();
		//System.out.println(driver.getWindowHandles());//3
		driver.findElement(By.xpath("//span[text()='Java: The Complete Reference | 12th Edition']"))
		.click();
		
		
		for(String id:driver.getWindowHandles())
		{
			driver.switchTo().window(id);
			
			 if(driver.getTitle().contains("Beginning Programming with Java"))
			{
				driver.findElement(By.id("add-to-cart-button")).click();
			}
			else if(driver.getCurrentUrl().contains("Core-Java-Integrated-Approach"))
				{
					Select qty= new Select(driver.findElement(By.name("quantity")));
					qty.selectByValue("6");
					driver.findElement(By.id("add-to-cart-button")).click();
				}
			else if(driver.getCurrentUrl().contains("Java-Complete-Reference-Herbert-Schildt"))
			{
				Select qty= new Select(driver.findElement(By.name("quantity")));
				qty.selectByValue("6");
				driver.findElement(By.id("add-to-cart-button")).click();
			}
		}
		Set<String> windows=driver.getWindowHandles();
		List<String>handles=new ArrayList<>(windows);
		driver.switchTo().window(handles.get(1));
		System.out.println(driver.getCurrentUrl());
		
	//	Set<String> windows1=driver.getWindowHandles();
	//	java.util.List<String> handles1=new ArrayList<>(windows1);
	//	handles1.addAll(windows1);
		
		//driver.switchTo().window(handles.get(0));
		//driver.close();
		//driver.switchTo().window(handles.get(1));
		//System.out.println(driver.getCurrentUrl());
		//driver.switchTo().window(handles.get(3));
		//System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandles().size());
	}


	}


