package Selenium_Webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex13_setSize {

	public static void main(String[] args) {



		WebDriver driver =new ChromeDriver();

		driver.get("https://www.facebook.com/login.php");

		driver.manage().window().maximize();

		Dimension d =new Dimension(700,700);
		driver.manage().window().setSize(d);


	}
}
