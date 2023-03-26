package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class calender {
	
	public static void main(String[] args) {
		WebDriver driver;
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//label[@for='departure']")).click();
		WebElement date=driver.findElement(By.xpath("//input[@id=\"onward_cal\"]"));
		date.click();
		String month="July";
		String year="2025";
		while(true) {
			String yearmonth=driver.findElement(By.xpath("//td[@class=\"monthTitle\"]")).getText();
			String arr[]=yearmonth.split(" ");
			String mon=arr[0];	
			String yr=arr[1];
			if(mon.equalsIgnoreCase(month)&& yr.equals(year))
				break;
			
				else 
					driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
				
				}
		driver.findElement(By.xpath("//td[text()='25']")).click();
			
		}
	}


