package Examples;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download_image {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");


		WebElement download=driver.findElement(By.linkText("Download Excel"));
		download.click();
		File f=new File("C:\\Users\\vijayakumar\\Downloads");
		File[] total_file=f.listFiles();
		for (File file : total_file) {
			file.getName().equals("testleaf.xls");
			System.out.println("The file is downloaded");
			break;
		}
	}
}

