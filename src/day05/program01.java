package day05;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class program01 {
	static WebDriver driver;
	public static void main(String[] args) {		
		driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		headervalidation();
		companyname();
	}
public static void companyname(){
		List<WebElement> companylist=driver.findElements(By.xpath("//table[@class='dataTable']//tbody//td[1]"));
		List<String> companynamelist=new ArrayList<>();
		for(WebElement name:companylist) {
			companynamelist.add(name.getText());
		}
		System.out.println(companynamelist);
}
public static void headervalidation() {
	List<WebElement> header=driver.findElements(By.xpath("//table[@class=\"dataTable\"]//th"));
	if(header.size()==5) {
		for(WebElement xpath:header) {
			System.out.println(xpath.getText());
		}
	}
	else {
		System.out.println("does not match");
	}
}
}
