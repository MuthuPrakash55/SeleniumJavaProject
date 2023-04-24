package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program02 {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
        driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("vijay");
        driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("chennai");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("12342@gmail.com");
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.xpath("//input[@value='Cricket']")).click();
        driver.findElement(By.xpath("//input[@ng-model='FirstName']")).clear();
        //driver.findElement(By.xpath("//button[@id='Button1']")).click();
	    //driver.findElement(By.xpath("//select[@id='Skills']")).click();
        WebElement lang= driver.findElement(By.xpath("//div[@id=\"msdd\"]"));
        lang.click();
        driver.findElement(By.xpath("//a[text()='German']")).click();
        
	}

}
