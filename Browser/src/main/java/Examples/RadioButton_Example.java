package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_Example {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		
		//Click on OK Button
		WebElement rb_1=driver.findElement(By.id("yes"));
		rb_1.click();
		Thread.sleep(3000);
		
		//Enable Or Dis-able
		WebElement rb_2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input"));
		boolean status1=rb_2.isSelected();
		
		WebElement rb_3=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
		boolean status2=rb_3.isSelected();
		
		System.out.println(status1);
		System.out.println(status2);
		Thread.sleep(3000);
		
		//Select radio button by passing values
		WebElement rb_4=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[3]"));
		rb_4.click();

	}
	
}
