package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class webtable1 {
static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		driver.get("https://qavbox.github.io/demo/webtable/");
		names("Herrod Chandler");
		names("Airi Satou");
	}
	public static int rownumber(String customername) {
		List<WebElement> name=driver.findElements(By.xpath("//table[@id=\"table02\"]//td[1]"));
		int count=0;
		for(WebElement row:name) {
			if(customername.equals(row.getText().trim())) {
				return ++count;
			}
			count++;
		}
		return 0;
	}
	public static void names(String customername) {
		int rows=rownumber(customername);
		List<WebElement> name1=driver.findElements(By.xpath("//table[@id=\"table02\"]//tr["+rows+"]//td"));
		List<String>name2=new ArrayList<>();
		for(WebElement rowname:name1) {
			name2.add(rowname.getText());
			
		}
		System.out.println(name2);
		System.out.println(rows);
	}
	}
