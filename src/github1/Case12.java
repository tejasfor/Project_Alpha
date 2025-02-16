package github1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Case12 {
	public WebDriver driver;
	  @BeforeTest
	  public void beforeTest() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://artoftesting.com/sampleSiteForSelenium");
	      
	    /* JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeAsyncScript("window.scrollBy(0,700)", "");
	     Thread.sleep(3000);
	     */
	  }

  @Test (priority=1)
  public void cript() throws InterruptedException
  {
	  
	  driver.findElement(By.xpath("//*[text()='This is a link']")).click();
	  
  }
 @Test (priority=2)
 public void TextBox() throws InterruptedException
 {
	driver.findElement(By.xpath("//*[@id='fname']")).sendKeys("bobolio"); 
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='idOfButton']")).click();
    
   
    Actions act = new Actions(driver);
    act.doubleClick(driver.findElement(By.xpath("//*[text()='Double-click to generate alert box']"))).build().perform();
  
    
    driver.navigate().refresh();
    
    driver.findElement(By.xpath("//*[@id='male']")).click();
    
    driver.findElement(By.xpath("//*[@class='Automation']")).click();
    
  
    
    
 }
 
  @AfterTest
  public void afterTest() {
  }

}
