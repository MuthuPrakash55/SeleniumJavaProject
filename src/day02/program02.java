package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import practice.select;

public class program02 {

	public static void main(String[] args) {
		ChromeDriver driver;
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		driver.get("https://demo.automationtesting.in/Register.html");

		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
//		driver.manage().window().fullscreen();
		
		//driver.navigate().back();
		//driver.navigate().forward();
//		driver.navigate().refresh();
		
		//driver.navigate().to("https://demo.automationtesting.in/Register.html");
		
		//driver.close();
		
		//driver.quit();
		WebElement country= driver.findElement(By.xpath("//select[@id=\"country\"]"));
		Select select=new Select(country);
		select.selectByVisibleText("Australia");
		
	}

}
