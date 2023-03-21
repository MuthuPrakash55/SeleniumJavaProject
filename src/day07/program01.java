package day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class program01 {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		//driver.switchTo().frame("singleframe");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]")));
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("test");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
	}

}
