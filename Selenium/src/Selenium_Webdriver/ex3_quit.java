package Selenium_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_quit {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}
	
}
