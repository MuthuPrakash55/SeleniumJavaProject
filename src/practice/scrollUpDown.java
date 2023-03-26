package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class scrollUpDown {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver;
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		JavascriptExecutor exe=(JavascriptExecutor)driver;
		//scroll up and down
		/*exe.executeScript("window.scroll(0,750)", "");
		Thread.sleep(3000);
		exe.executeScript("window.scroll(0,-750)", "");*/
	
		//Scroll top and bottom
		/*exe.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		exe.executeScript("window.scroll(0,0)");*/
	
		//go to specific position
		WebElement con=driver.findElement(By.xpath("//*[@id=\"rt-mainbody\"]/div/article/h3[2]"));
		exe.executeScript("arguments[0].scrollIntoView(true);", con);
	
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
	}

}
