package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class meesho {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.meesho.com/feminine-hygiene/pl/3tg");
		driver.findElement(By.xpath("//a[text()=\"Men Keychains\"]")).click(); 
	}

}
