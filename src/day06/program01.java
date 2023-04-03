package day06;
			//WINDOW HANDLING
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class program01 {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		//System.out.println(driver.getWindowHandle());
		driver.findElement(By.id("twotabsearchtextbox"))
		.sendKeys("java"+Keys.ENTER);
		driver.findElement(By.xpath("//div[@class=\"rush-component\"]"
				+ "//span[contains(text(),'Core Java: An Integrated Approach')]")).click();
		driver.findElement(By.xpath("(//div[@class=\"s-card-container s-overflow-hidden aok-relative puis-include-content-margin puis s-latency-cf-section s-card-border\"]"
				+ "//span[contains(text(),'Head First Java: A Brain-Friendly Guide')][1])")).click();
		
		for(String id:driver.getWindowHandles()) {
			driver.switchTo().window(id);
			if(driver.getCurrentUrl().contains("Core-Java-Integrated-Approach")) {
				Select cart=new Select(driver.findElement(By.id("quantity")));
				cart.selectByValue("5");
				driver.findElement(By.id("add-to-cart-button")).click();
				driver.close();
			}
			else if(driver.getCurrentUrl().contains("Head-First-Java-Brain-Friendly-Grayscale")){
			Select cart1=new Select(driver.findElement(By.xpath("//select[@name=\"quantity\"]")));
			cart1.selectByValue("5");
			driver.findElement(By.id("add-to-cart-button")).click();
		}
	
	}
		

	}
}
