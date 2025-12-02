package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex7_partialLinkText {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Home")).click();//partial link text
	}
}
