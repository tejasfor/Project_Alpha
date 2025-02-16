package dynamic_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

public class MousHoover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.amazon.in/");
	    
	    Actions action = new Actions(driver);
	    WebElement element = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	    action.moveToElement(element).perform();
	    Thread.sleep(2000);
	    
	    Actions action1 = new Actions(driver);
	    WebElement element1 = driver.findElement(By.xpath("//*[@id=\"nav-cart\"]"));
	    action1.doubleClick(element1);
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("scrollBy(0,2500)");
	    
	    
	    
	    
	    
	    

	}

}
