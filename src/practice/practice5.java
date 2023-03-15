package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice5 {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://letcode.in/dropable");
		Actions action=new Actions(driver);
		
	WebElement src=driver.findElement(By.xpath("//*[@id=\"text\"]"));
	WebElement target=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	action.dragAndDrop(src, target).build().perform();
	}

}
