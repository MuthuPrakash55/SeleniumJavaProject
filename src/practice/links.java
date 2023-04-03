package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class links {

	public static void main(String[] args) {
		WebDriver driver;
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		driver.get("https://leafground.com/link.xhtml");
	
		WebElement link=driver.findElement(By.partialLinkText("Find the URL"));
		String title=link.getAttribute("href");
		System.out.println(title);
		
		List<WebElement> linkcount=driver.findElements(By.xpath("/html/body/div[1]/div[5]/div[2]//a"));
		int count=linkcount.size();
		System.out.println(count);
		
		//image broken
		
		/*WebElement brokenimg=driver.findElement(By.xpath(""));
		if(brokenimg.getAttribute("naturalwidth").equals(0)) {
			System.out.println("image is broken");
		}
		else {
			System.out.println("image is not broken");
		}*/
	}

}
