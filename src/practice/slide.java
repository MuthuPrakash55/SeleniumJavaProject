package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slide {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://letcode.in/slider");
		Actions act=new Actions(driver);
		
		WebElement slide=driver.findElement(By.xpath("//*[@id=\"generate\"]"));
		System.out.println(slide.getSize());
		System.out.println(slide.getLocation());
		
		act.dragAndDropBy(slide, 10, 0);
		act.build().perform();
		driver.findElement(By.xpath("/html/body/app-root/app-word-generator/section[1]/div/div/div[1]/div/div/div[1]/div[1]/button")).click();
	
		String name=driver.findElement(By.xpath("/html/body/app-root/app-word-generator/section[1]/div/div/div[1]/div/div/div[1]/div[2]/div/p")).getText();
		System.out.println(name);
	}

}
