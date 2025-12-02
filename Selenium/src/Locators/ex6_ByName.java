package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex6_ByName {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/login.php");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.name("email")).sendKeys("rahulsabale95@gamil.com");  //id
		driver.findElement(By.name("pass")).sendKeys("rahul@11232");    //pass
		
		driver.findElement(By.name("login")).click();
		
		//driver.quit();
		
	}	
}
