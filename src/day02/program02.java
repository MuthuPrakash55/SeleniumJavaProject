package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class program02 {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");

		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		
		//driver.navigate().back();
		//driver.navigate().forward();
		driver.navigate().refresh();
		
		//driver.navigate().to("https://demo.automationtesting.in/Register.html");
		
		driver.close();
		
		driver.quit();
		
	}

}
