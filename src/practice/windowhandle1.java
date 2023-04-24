package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class windowhandle1 {

	public static void main(String[] args)  {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/html/Managerhomepage.php");
		driver.findElement(By.xpath("//a[text()='New Customer']")).click();
		driver.switchTo().frame("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0");
		driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("customername");
	
	}
		
	}


