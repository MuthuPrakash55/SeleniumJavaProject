package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://www.meesho.com/");
		Actions act=new Actions(driver);
		
		WebElement health=driver.findElement(By.xpath("//span[text()='Beauty & Health']"));
		WebElement care=driver.findElement(By.xpath("//a[text()='Oral Care']"));
		act.moveToElement(health).click().build().perform();
		Thread.sleep(3000);
		act.click(care).build().perform();
		
		
	}

}
