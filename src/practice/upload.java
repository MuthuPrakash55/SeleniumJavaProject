package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class upload {

	public static void main(String[] args) throws AWTException {
		WebDriver driver;
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		driver.get("https://pasteboard.co/");
		driver.manage().window().maximize();
	
		WebElement img=driver.findElement(By.xpath("//label[@class=\"file-upload-label button confirm\"]"));
		img.click();
		
		//WINDOWS CONTROL BEGINS
		String file="C:\\Users\\praka\\Documents\\img.JPG";
		StringSelection select=new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
	
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
