package practice;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice4 {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		driver=new EdgeDriver();
		driver.navigate().to("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		screenshot("dropdown page");
		Select fruits =new Select(driver.findElement(By.xpath("//*[@id=\"fruits\"]")));
		fruits.selectByIndex(3);
		screenshot("Fruit");
		driver.close();
	}
	public static void screenshot(String filename) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("./screenshot/"+filename+".png");
		FileUtils.copyFile(src, des);
	}
}
