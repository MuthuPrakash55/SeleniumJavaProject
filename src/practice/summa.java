package practice;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class summa {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("python"+Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='PYTHON: PROGRAMMING: A BEGINNER’S GUIDE TO LEARN PYTHON IN 7 DAYS']")).click();
		
		
		
		
		
		
		
		
//		driver.get("https://accounts.google.com/");
		// TODO Auto-generated method stub
//		WebElement name= driver.findElement(By.id("identifierId"));
//		Actions act=new Actions(driver);
//		act.keyDown(name, Keys.SHIFT);
//		act.sendKeys(name, "prakashmuthu55@gmail.com");
//		act.keyUp(name, Keys.SHIFT);
//		act.perform(); 
	}

}
