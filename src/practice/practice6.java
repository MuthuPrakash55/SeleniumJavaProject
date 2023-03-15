package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice6 {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		Actions act=new Actions(driver);
		driver.manage().window().maximize();
	
		WebElement src=	driver.findElement(By.xpath("//*[@id=\"form:drag_content\"]"));
		WebElement target=driver.findElement(By.xpath("//*[@id=\"form:drop_header\"]"));
		act.dragAndDrop(src, target).build().perform();
	
		driver.close();
	}

}
