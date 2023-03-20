package day04;
            // Double click 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class program02 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act=new Actions(driver);
		
		driver.manage().window().maximize();
		WebElement btn=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(btn).build().perform();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
	}

}
