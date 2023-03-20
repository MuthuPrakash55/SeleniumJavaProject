package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class select {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://leafground.com/select.xhtml");
		
		WebElement drop1=driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		Select down1=new Select(drop1);
		down1.selectByIndex(3);
		
		WebElement drop2=driver.findElement(By.xpath("//*[@id=\"j_idt87:lang\"]"));
		Select down2=new Select(drop2);
		down2.selectByIndex(3);
		
	}

}
