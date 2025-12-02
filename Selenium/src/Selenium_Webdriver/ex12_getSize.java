package Selenium_Webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex12_getSize {

	public static void main(String[] args) {
		
	
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php");
		
		 Dimension d = driver.manage().window().getSize();
		
		 System.out.println(d);
	}
	
}
