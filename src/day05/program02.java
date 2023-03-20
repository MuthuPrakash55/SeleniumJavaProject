package day05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class program02 {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new EdgeDriver();
		driver.get("https://chercher.tech/practice/table");
		sitedetails("facebook.com");
	}
	public static int rownumber(String websitename) {
		List<WebElement> no=driver.findElements(By.xpath("//table[@id=\"webtable\"]//td[1]"));
	int count=1;
	for(WebElement site:no) {
		if(websitename.equals(site.getText().trim())) {
			return ++count;
		}
		count++;
	}
	return 0;
	}
	public static void sitedetails(String websitename) {
		int row=rownumber(websitename);
		List<WebElement> sitename=driver.findElements(By.xpath("//table[@id=\"webtable\"]//tr["+row+"]//td"));
	for(WebElement name:sitename) {
		System.out.println(name.getText());
	}
	}
}
