package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program01 {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//input[@dir='auto']")).sendKeys("java books");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
	    driver.findElement(By.xpath(("//input[@dir='auto']"))).clear();
	}

}
