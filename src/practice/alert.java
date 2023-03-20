package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]/span[2]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt100\"]/span[2]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt101\"]/div[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]")).click();
		//Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("have a nice day....!");
		driver.switchTo().alert().accept();
		
	}

}
