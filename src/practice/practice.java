package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class practice {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://letcode.in/edit");
		driver.findElement(By.xpath("//input[@id=\"fullName\"]")).sendKeys("vijay");
		driver.findElement(By.xpath("//input[@id=\"join\"]")).sendKeys(" person",Keys.TAB);;
		String value=  driver.findElement(By.xpath("//*[@id=\"getMe\"]")).getAttribute("value");
		System.out.println(value);
		driver.findElement(By.xpath("//*[@id=\"clearMe\"]")).clear();	
		boolean enable=	driver.findElement(By.xpath("//input[@id=\"noEdit\"]")).isEnabled();
		System.out.println(enable);
		String isreadonly=	driver.findElement(By.xpath("//input[@value=\"This text is readonly\"]")).getAttribute("readonly");
		System.out.println(isreadonly);
		driver.quit();
	}
    
}
