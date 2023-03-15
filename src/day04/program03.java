package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class program03 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://www.myntra.com/");
		Actions act=new Actions(driver);
		
		WebElement btn=driver.findElement(By.xpath("//a[@data-group=\"kids\"]"));
		WebElement btn1=driver.findElement(By.xpath("//a[@data-reactid=\"381\"]"));
		act.moveToElement(btn).build().perform();
		Thread.sleep(3000);
		act.click(btn1).build().perform();
	}

}
