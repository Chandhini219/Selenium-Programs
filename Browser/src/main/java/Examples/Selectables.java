package Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectables {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		
		List <WebElement> click_edit=driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
	
	Actions actions=new Actions(driver);
	actions.keyDown(Keys.CONTROL).click(click_edit.get(0)).click(click_edit.get(1))
	.click(click_edit.get(2)).build().perform();
	
	

	}

}
