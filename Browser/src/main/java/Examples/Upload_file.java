package Examples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_file {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		
		WebElement count1=driver.findElement(By.name("filename"));
		count1.click();
		
		
		String file="//C:\\Users\\vijayakumar\\Downloads\\testleaf.xls";
		StringSelection value=new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(value, null);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
