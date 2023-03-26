package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class windowhandle2 {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("java"+Keys.ENTER);
		driver.findElement(By.xpath("//div[@data-component-type=\"s-search-result\"]"
				+ "//span[contains(text(),'Core Java: An Integrated Approach')][1]")).click();
		driver.findElement(By.xpath("//span[text()='Java: The Complete Reference']")).click();
		
		for(String id:driver.getWindowHandles()) {
			driver.switchTo().window(id);
			if(driver.getCurrentUrl().contains("Core-Java-Integrated-Approach-Versions")) {
				//driver.findElement(By.xpath("//*[@id=\"a-autoid-3-announce\"]")).click();		
				WebElement cart=driver.findElement(By.xpath("//*[@id=\"quantity\"]"));
				Select select=new Select(cart);
				select.selectByIndex(5);
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
			}
			else if(driver.getTitle().contains("The Complete Reference Book Online")) {
				WebElement wish=driver.findElement(By.xpath("//*[@id=\"quantity\"]"));
				Select select=new Select(wish);
				select.selectByIndex(4);
			}
		}
	}

}
