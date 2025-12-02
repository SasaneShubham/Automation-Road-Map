package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_xpathByIndex {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@class=\"form-control\"])[1]")).sendKeys("Rahul");
		
		driver.findElement(By.xpath("(//input[@class=\"form-control\"])[2]")).sendKeys("Sabale");
		
		driver.findElement(By.xpath("(//input[@class=\"form-control\"])[7]")).sendKeys("07/28/2025");
		
		driver.quit();
		
		
	}
}
