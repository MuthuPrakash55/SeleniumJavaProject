package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class webtable {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new EdgeDriver();
		driver.get("https://letcode.in/advancedtable");
		headervalidate();
		 university();
	}
public static void headervalidate() {
	List<WebElement> header=driver.findElements(By.xpath("//table[@name=\"table\"]//th"));
	List<String> header1=new ArrayList<>();
	if(header.size()==4) {
		for(WebElement name:header) {
			header1.add(name.getText());
		}
		System.out.println(header1);
	}
	else {
		System.out.println("does not match");
	}
}
public static void university() {
	List<WebElement> name=driver.findElements(By.xpath("//table[@name=\"table\"]//tbody//td[2]"));
	List<String> univname=new ArrayList<>();
	for(WebElement uname:name) {
		univname.add(uname.getText());
	}
System.out.println(univname);
}
}
