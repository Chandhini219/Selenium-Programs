package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tool_tip {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");

		WebElement text=driver.findElement(By.id("age"));
		String value=text.getAttribute("title");
		System.out.println(value);
				
	}

}
