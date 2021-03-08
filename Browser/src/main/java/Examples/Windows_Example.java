package Examples;




import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		//Giving Control to New Windows
		String parent=driver.getWindowHandle(); 
		WebElement text=driver.findElement(By.id("home"));
		text.click();
		Set<String> child=driver.getWindowHandles();
		for (String new_window : child) {
			driver.switchTo().window(new_window);
			
		}
		WebElement click_edit=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
		click_edit.click();
		driver.close();
		
		//Counting Windows
		driver.switchTo().window(parent);
		WebElement count=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
        count.click();
        int size=driver.getWindowHandles().size();
        System.out.println("The number of web pages are: " +size);
        
        //Closing the windows
        WebElement close_windows=driver.findElement(By.id("color"));
        close_windows.click();
        Set<String> a=driver.getWindowHandles();
        for (String value : a) {
        	if(!parent.equals(a))
        	{
        		driver.switchTo().window(value);
        		driver.close();
        	}
			
		}
        
	}

}
