package practice;

import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class sort {

	public static void main(String[] args) {
		WebDriver driver;
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		
		driver.get("https://leafground.com/list.xhtml");
				
		List<WebElement> From=driver.findElements(By.xpath("//ul[@aria-label=\"From\"]/li"));
		
		WebElement ele=From.get(5);
		WebElement ele1=From.get(0);
		Actions act=new Actions(driver);
		
		//from one table to another
		/*WebElement To=driver.findElement(By.xpath("//ul[@aria-label=\"To\"]"));		
		act.clickAndHold(ele);
		act.moveToElement(To);
		act.release(To);
		act.build().perform();
		act.clickAndHold(ele1);
		act.moveToElement(To);
		act.release(To);
		act.build().perform();*/
		
		//sortable in the same table
		act.clickAndHold(ele);
		act.moveToElement(ele1);
		act.release(ele1);
		act.build().perform();
	}

}
