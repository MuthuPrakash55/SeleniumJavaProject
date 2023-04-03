package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		WebDriver driver;		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("----remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));
		
		WebElement slider=driver.findElement(By.id("slider"));
		System.out.println(slider.getLocation());
		
		WebElement slide=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		Actions act=new Actions(driver);
		System.out.println(slide.getLocation());		
		System.out.println(slide.getSize());
		act.dragAndDropBy(slide,150, 0).perform();
		System.out.println(slide.getLocation()); 
		System.out.println(slide.getSize());
	}

}
