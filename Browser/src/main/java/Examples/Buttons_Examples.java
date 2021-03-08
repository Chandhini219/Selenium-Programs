package Examples;



import org.checkerframework.common.reflection.qual.GetMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons_Examples {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Button.html");
			driver.manage().window().maximize();
			
			/*//Click to Homepage
			WebElement home_button=driver.findElement(By.id("home"));
			home_button.click();
			Thread.sleep(10000);*/
			
			//Position
			WebElement position_button=driver.findElement(By.id("position"));
			Point point=position_button.getLocation();
			int x_cordinate=point.getX();
			int y_cordinate=point.getY();
			System.out.println(x_cordinate);
			System.out.println(y_cordinate);
			
			//Colour
			WebElement color_button=driver.findElement(By.id("color"));
			String value=color_button.getCssValue("background-color");
			System.out.println(value);
			
			//Height and width
			WebElement h_w=driver.findElement(By.id("size"));
			int height=h_w.getSize().getHeight();
			int width=h_w.getSize().getWidth();
			System.out.println("Height is: " +height+ " Width is: " +width);
			
			
			
			
			
	}

}
