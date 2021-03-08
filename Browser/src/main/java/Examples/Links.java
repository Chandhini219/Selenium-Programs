package Examples;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");

		// Go to home page.
		/*WebElement home_page=driver.findElement(By.linkText("Go to Home Page"));
		Thread.sleep(3000);
		home_page.click(); */

		//Find where I am supposed to
		WebElement find_page=driver.findElement(By.partialLinkText("Find where am"));
		String value=find_page.getAttribute("href");
		System.out.println(value);

		//Verify I am Broken
		WebElement verify_image=driver.findElement(By.linkText("Verify am I broken?"));
		verify_image.click();
		String title=driver.getTitle();
		if(title.contains("404"))
		{
			System.out.println("It is broken");
		}
		driver.navigate().back();

		//StaleReferenceException
		WebElement homepage=driver.findElement(By.linkText("Go to Home Page"));
		Thread.sleep(3000);
		homepage.click();
		driver.navigate().back();
		
		//How many Links
		List <WebElement> find_link=driver.findElements(By.tagName("a"));
		int link_size=find_link.size();
		System.out.println("The number of links is: " +link_size);
		
		
	}

}
