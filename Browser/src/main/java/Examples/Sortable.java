package Examples;





import java.util.List;

import org.checkerframework.common.reflection.qual.GetMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		
		List <WebElement> element=driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
        WebElement from=element.get(6);
        WebElement to=element.get(1);
        
        Actions actions=new Actions(driver);
        actions.dragAndDrop(from, to).build().perform();
        
        
	}

}
