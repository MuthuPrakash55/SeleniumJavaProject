package day02;
			//SCREENSHOT
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class program03 {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		driver=new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
        driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("vijay");
        screenshot("First name");
        
        File srcFN=driver.findElement(By.xpath("//input[@ng-model='FirstName']")).getScreenshotAs(OutputType.FILE);
        File desFN=new File("./screenshot/firstNameElement.png");
        FileUtils.copyFile(srcFN, desFN);
        
              
        driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("chennai");
        screenshot("Address");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("12342@gmail.com");
        screenshot("Email");
	
	}
	public static void screenshot(String filename) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("./screenshot/"+filename+".png");
		FileUtils.copyFile(src, des);
	}
	}