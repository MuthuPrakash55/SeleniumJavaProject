package practice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSelect {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		driver=new EdgeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		WebElement heros=driver.findElement(By.xpath("//select[@id=\"superheros\"]"));
		Select myheros=new Select(heros);
		boolean a=myheros.isMultiple();
		System.out.println("is multiple -" +a);
		myheros.selectByIndex(1);		
		myheros.selectByVisibleText("Batman");
		myheros.selectByValue("bw");
		screenshot("my heros");
		WebElement lang=driver.findElement(By.xpath("//select[@id=\"lang\"]"));
		Select lang1=new Select(lang);
		lang1.selectByIndex(3);		
		driver.close();
	}
public static void screenshot(String filename) throws IOException {
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File des=new File("./screenshot/"+filename+".png");
	FileUtils.copyFile(src, des);
}
}
