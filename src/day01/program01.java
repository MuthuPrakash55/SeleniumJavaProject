package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class program01 {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
			//driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")).sendKeys("tshirt"+Keys.ENTER);
	       // driver.findElement(By.xpath("//input[@type='submit']")).click();
		   Actions act=new Actions(driver);
			//WebElement x=driver.findElement(By.xpath("//label[text()=\"Girls\"]"));
		//  x.click();
		// WebElement y= driver.findElement(By.xpath("//div[@class=\"atsa-atsaFiltersOptionCtn atsa-atsaShowContainer\"]//div[@class=\"common-checkboxIndicator\"][1]"));
		//act.click(y).build().perform();
		WebElement pro=driver.findElement(By.xpath("//span[text()=\"Profile\"]"));
		act.moveToElement(pro).build().perform();
		driver.findElement(By.xpath("//a[text()=\"login / Signup\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"form-control mobileNumberInput\"]")).sendKeys("123456789"+Keys.ENTER);
		String error=driver.findElement(By.xpath("//div[@class=\"errorContainer\"]")).getText();
		System.out.println(error);
		if(error.contains(" enter a valid mobile number ")) {
			System.out.println("test is passed");
		}
		else
			System.out.println("test is failed");
	}

}
