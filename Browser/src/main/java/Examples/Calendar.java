package Examples;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		
		//Sending keys
		WebElement send_date=driver.findElement(By.id("datepicker"));
		//send_date.sendKeys("01/03/2021"+Keys.ENTER);*/
		
		//Selecting the date
		send_date.click();
		WebElement c1=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]"));
		c1.click();
		WebElement c2=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[2]/a"));
		c2.click();
		
		
		
		
	}

	}

