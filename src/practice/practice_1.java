package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class practice_1 {

	public static void main(String[] args) {
				
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@role='button']")).click();
		WebElement e= driver.findElement(By.xpath("//a[@title='Sign in']"));
		Actions act =new Actions(driver);
		act.moveToElement(e).build().perform();
		driver.findElement(By.xpath("//a[@title='My Profile']")).click();
//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("lenovo",Keys.ENTER);
//		driver.findElement(By.xpath("//div[text()='Lenovo K10 Note (Black, 64 GB)']")).click();
//		WebElement e=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[5]"));
//		Actions act=new Actions(driver);
//		act.moveToElement(e).build().perform();
		
		
	}

}
