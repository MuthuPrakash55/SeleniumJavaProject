package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class webtable2 {
static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("==remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		visitedcountry("Chile");
		driver.close();
	}
	public static int rownumber(String countryname) {
		List<WebElement> country=driver.findElements(By.xpath("//table[@id=\"countries\"]//td[2]"));
		int count=0;
		for(WebElement name:country) {
			if(countryname.equals(name.getText().trim())) {
				return ++count;
			}
			count++;
		}
	return 0;
	}
	public static void visitedcountry(String countryname) {
		int row=rownumber(countryname);
		List<WebElement> country1=driver.findElements(By.xpath("//table[@id=\"countries\"]//tr["+row+"]//td"));
		for(WebElement name1:country1) {
			System.out.println(name1.getText());
		}
	}
}