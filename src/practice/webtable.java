package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class webtable {
	static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		driver.get("https://letcode.in/advancedtable");
		headervalidate();
		 university();
		int  size= driver.findElements(By.xpath("//div[@class=\"dataTables_paginate paging_full_numbers\"]//a")).size();
	//System.out.println(size);
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
	List<WebElement> name=driver.findElements(By.xpath("//table[@name=\"table\"]//tbody//tr//td"));
	List<String> univname=new ArrayList<>();
	
	for(WebElement uname:name) {
		univname.add(uname.getText());
		}
			
		//int  size= driver.findElements(By.xpath("//div[@class=\"dataTables_paginate paging_full_numbers\"]//a")).size();
		
		String next=driver.findElement(By.xpath("//*[@id=\"advancedtable_next\"]")).getAttribute("class");	
		System.out.println(next);
		
		System.out.println("******************************************");
		
		while(!next.contains("disabled")) {
			WebElement nextbutton=driver.findElement(By.xpath("//*[@id=\"advancedtable_next\"]"));
			nextbutton.click();
			 name=driver.findElements(By.xpath("//table[@id=\"advancedtable\"]//tr//td"));
			 for(WebElement uname:name) {
				univname.add(uname.getText());
			 }
			 next=driver.findElement(By.xpath("//*[@id=\"advancedtable_next\"]")).getAttribute("class");
		}
		for(String names:univname) {
			System.out.println(names);
		}
	}	
	}
	
	



