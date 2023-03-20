package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class webtable3 {
static WebDriver driver;
	public static void main(String[] args) {
		driver=new EdgeDriver();
		driver.get("https://letcode.in/advancedtable");
		headervalidate();
		name();
	}
public static void headervalidate() {
	List<WebElement> header=driver.findElements(By.xpath("//table[@name=\"table\"]//th"));
	List<String> name=new ArrayList<>();
	if(header.size()==4) {
	for(WebElement headername:header) {
		name.add(headername.getText());
	}
	System.out.println(name);
	}
	else {
		System.out.println("does not match");
	}
}
public static void name() {
	List<WebElement> name1=driver.findElements(By.xpath("//table[@name=\"table\"]//td[2]"));
	List<String> name2=new ArrayList<>();
	for(WebElement name3:name1) {
		name2.add(name3.getText());
	}
	System.out.println(name2);
}
}
