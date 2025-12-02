package Selenium_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_maximize {

	
public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
