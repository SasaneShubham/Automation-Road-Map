package Selenium_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex9_navigate {

public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.youtube.com/watch?v=jCVjudmnByk");
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
