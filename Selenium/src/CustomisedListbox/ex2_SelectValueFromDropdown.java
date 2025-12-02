package CustomisedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex2_SelectValueFromDropdown {

	

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/r.php");

		driver.manage().window().maximize();

        WebElement cars = driver.findElement(By.xpath("//select[@title='Month']"));
        
        Actions act=new Actions(driver);
        
        act.moveToElement(cars).click().perform();
        
        
        
//        act.sendKeys(Keys.ARROW_UP).perform();
//        act.sendKeys(Keys.ARROW_UP).perform();
        
        act.sendKeys(Keys.ARROW_DOWN).perform();
        act.sendKeys(Keys.ARROW_DOWN).perform();
        act.sendKeys(Keys.ARROW_DOWN).perform();
        
        
       
        act.sendKeys(Keys.ENTER).perform();
   
        
        
        
	}
}
