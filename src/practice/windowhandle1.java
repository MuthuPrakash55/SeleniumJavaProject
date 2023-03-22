package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class windowhandle1 {

	public static void main(String[] args)  {
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("tshirt"+Keys.ENTER);
		WebElement cancel=driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		act.click(cancel).build().perform();
		WebElement kids=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[4]/div/div[2]/div/div/a[1]"));
		act.click(kids).build().perform();
		/*WebElement kid=driver.findElement(By.xpath(""));
		act.moveToElement(kid).build().perform();
		WebElement tshirt=driver.findElement(By.xpath(""));
		act.click(tshirt).build().perform();*/
		
		
		
		WebElement button=driver.findElement(By.xpath("(//div[@id=\"grid-container\"]//div[@class=\"ProductDescription__header\"][1])"));
		act.click(button).build().perform();
		
		
		}
		
	}


