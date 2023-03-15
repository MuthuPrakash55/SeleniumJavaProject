package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice3 {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://letcode.in/dropdowns");
//1.select fruits by visibletext		
		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"fruits\"]"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("Orange");
//2.select country by values and print
		WebElement country=	driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select mycountry=new Select(country);
		mycountry.selectByValue("India");
		WebElement select1=mycountry.getFirstSelectedOption();
		System.out.println(select1.getText());
	}

}
