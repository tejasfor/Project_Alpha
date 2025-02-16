package dynamic_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragTodrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://jqueryui.com/droppable/");
	    Thread.sleep(2000);
	    
	    // Mention below both methods are works
	    
	 /*   
        driver.switchTo().frame(0);
        
        WebElement from = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
        WebElement to = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        
        Actions act = new Actions(driver);
        act.dragAndDropBy(from, 160, 10).perform();
     */
	    
       
	    driver.switchTo().frame(0);
	    
	    WebElement from = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	    WebElement to = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	    
	    Actions act = new Actions(driver);
	    act.dragAndDrop(from, to).build().perform();
	        
	    
	  }
	}


