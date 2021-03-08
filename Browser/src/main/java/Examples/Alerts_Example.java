package Examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Example {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		//Alert Box
		WebElement alert_box=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		alert_box.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		
		//Cancel Button
		WebElement dissmis_button=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
        dissmis_button.click();
        Alert alert1=driver.switchTo().alert();
        alert1.dismiss();
        Thread.sleep(3000);
        
        //Prompt Button
        WebElement prompt_button=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
        prompt_button.click();
        Alert alert2=driver.switchTo().alert();
        alert2.sendKeys("All The Best");
        alert2.accept();
        Thread.sleep(3000);
        
        
	}

}
