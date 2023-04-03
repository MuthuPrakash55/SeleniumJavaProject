package day02;
			//DROPDOWN SELECT
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class program01 {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Select dropdownskill=new Select(driver.findElement(By.xpath("//select[@id=\"Skills\"]")));
		dropdownskill.selectByIndex(0);
		
		Select dropdownyear=new Select(driver.findElement(By.xpath("//*[@id=\"yearbox\"]")));
		dropdownyear.selectByValue("1922");
		
		Select dropdownmonth=new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
		dropdownmonth.selectByVisibleText("February");
		
		
	}

}
