package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		
		//Click on Image.
		WebElement image1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
		image1.click();
		driver.navigate().back();
		
		
		//Broken Image
		WebElement image2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
        if(image2.getAttribute("naturalWidth").equals("0"))
        {
        	System.out.println("It is a broken Image");
        }
        	else
        	{
        		System.out.println("It is not a broken Image");
        	}
        }
}
		
		
		
		
	
