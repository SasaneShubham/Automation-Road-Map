package Selenium_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex10_newWindow_Tab {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		Thread.sleep(2000);
		
        driver.get("https://www.flipkart.com/");
        
        driver.quit();
	}
}
