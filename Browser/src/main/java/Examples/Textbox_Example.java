package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		
		//Entering email-id
		WebElement email_txt=driver.findElement(By.id("email"));
		email_txt.sendKeys("chandhinipp1999@gmail.com");
		
		//Append text
		WebElement append_txt=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		append_txt.sendKeys("Text");
		
		//Default Text
		WebElement default_txt=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
		String value=default_txt.getAttribute("value");
		System.out.println(value);

		//Clearing Text
		WebElement clear_txt=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clear_txt.clear();
		
		//Identify its enable or not
		WebElement value1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div"));
		boolean result=value1.isSelected();
		System.out.println(result);
		
		
	}

}
