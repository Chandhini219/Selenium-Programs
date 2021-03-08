package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		//Check the boxes
		WebElement java=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input"));
		java.click();
		WebElement sql=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[3]/input"));
		sql.click();

		//Verify checkbox is selected
		WebElement cb_1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
		boolean value=cb_1.isSelected();
		System.out.println(value);
		
		//Selecting and De-selecting
		WebElement cb_2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
		WebElement cb_3=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
		if(cb_2.isSelected())
		{
			cb_2.click();
		}
		if(cb_3.isSelected())
		{
			cb_3.click();
		}
		
	}

}
