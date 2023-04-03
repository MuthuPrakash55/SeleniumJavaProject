package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class practice2 {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://letcode.in/buttons");
		WebElement locate=driver.findElement(By.xpath("//button[@id=\"position\"]"));
		Point xypoint=locate.getLocation();	
		int x=xypoint.getX();
		int y=xypoint.getY();
		System.out.println("x location is "+x+" y location is "+y);
		String color=	driver.findElement(By.xpath("//button[@id=\"color\"]")).getCssValue("background-color");
		System.out.println(color);
		WebElement size=driver.findElement(By.xpath("//*[@id=\"property\"]"));
		int height=size.getSize().getHeight();
		int width =size.getSize().getWidth();
		System.out.println("height "+height+" width "+width);
		boolean enable=driver.findElement(By.xpath("//*[@id=\"isDisabled\"]")).isEnabled();
	    System.out.println(enable);
	    driver.quit();
	}
		
}
