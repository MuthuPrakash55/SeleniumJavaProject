package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://leafground.com/grid.xhtml");
		Names("Black Watch");
		Names("Bracelet");
		
		Names1("Brown Purse");
	}
	public static int rownumber(String Name) {
		List<WebElement>names=driver.findElements(By.xpath("//*[@id=\"form:dt-products\"]/div[2]/table//td[3]"));
		int count=0;
		for(WebElement name1:names) {
		if(Name.equals(name1.getText().trim())) {
			return ++count;
		}
		 count++;
		}
		return 0;
	}
	public static void Names(String Name) {
		int row=rownumber(Name);
		List<WebElement> names2=driver.findElements(By.xpath("//*[@id=\"form:dt-products\"]/div[2]/table//tr["+row+"]//td[1]"));
		for(WebElement names3:names2) {
			names3.click();
		}
		driver.findElement(By.xpath("//a[text()='2']")).click();
	}
	 
		public static void Names1(String Name) {
			
			int row1=rownumber(Name);
		List<WebElement> names4=driver.findElements(By.xpath("//*[@id=\"form:dt-products_data\"]/tr["+row1+"]/td[1]"));
		for(WebElement names5:names4) {
			names5.click();
		}
		System.out.println(row1);
		}
	}

