package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cal {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/bus");
		driver.findElement(By.xpath("//input[@placeholder=\"Pick a date\"]")).click();
		String month="June 2024";
		
		while(true) {
			String yearmonth= driver.findElement(By.xpath("//p[@class=\"dcalendarstyles__MonthNamePara-sc-r2jz2t-3 gryMsr\"]")).getText();
//			System.out.println(yearmonth);
//			String arr[]=yearmonth.split(yearmonth);
//			System.out.println(arr);
//			String mon=arr[0];
//			String yr=arr[1];
			if(yearmonth.equalsIgnoreCase(month)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//div[@class=\"dcalendarstyles__MonthChangeRightArrowDiv-sc-r2jz2t-16 iJqGSS\"]//div[@class=\"dcalendarstyles__SliderArrow-sc-r2jz2t-14 ilBEvY\"]")).click();
			}
			
		}
		driver.findElement(By.xpath("//span[text()='3']")).click();
	}
}
