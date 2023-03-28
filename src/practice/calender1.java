package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class calender1 {

	public static void main(String[] args) {
		WebDriver driver;
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		driver.get("https://leafground.com/calendar.xhtml");
		driver.manage().window().maximize();
		
		String year="2026";
		String month="February";
		
		while(true) {
			String yearmonth=driver.findElement(By.xpath("//*[@id=\"j_idt87:schedule\"]/div[1]/div[2]/h2")).getText();
			String arr[]=yearmonth.split(" ");
			String yr = arr[1];
			String mon = arr[0];
			if(yr.equalsIgnoreCase(year)&&mon.equals(month))
				break;
			else
				driver.findElement(By.xpath("//button[text()='Next']")).click();
				
		}
		driver.findElement(By.xpath("//*[@id=\"j_idt87:schedule\"]/div[2]/div/table/tbody/tr/td/div/div/div/table/tbody/tr[1]/td[6]")).click();
	}

}
