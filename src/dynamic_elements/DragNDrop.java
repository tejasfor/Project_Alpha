package dynamic_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/draggable/");
        Thread.sleep(2000);
        
        /*
		driver.switchTo().frame(0);
        
        WebElement from = driver.findElement(By.id("draggable"));
        
        Actions act = new Actions(driver);
        act.dragAndDropBy(from, 100, 100).perform();
        
        */
        
       driver.switchTo().frame(0);
       
       WebElement ken = driver.findElement(By.xpath(""));
       
       Actions act = new Actions(driver);
       act.dragAndDropBy(ken, 100, 100).perform();
       
        
        
        
        
        

		
		
	}

}
