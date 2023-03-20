package day04;
        //Alerts with written text box
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class program05 {
          
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		

		driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
		driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]")).click();
		driver.switchTo().alert().sendKeys("Have a nice day.....!");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();//ok button will click
		//driver.switchTo().alert().dismiss();//cancel button will click
	

	}

}
