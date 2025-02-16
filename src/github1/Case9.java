package github1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Case9 {
	public WebDriver driver;
	  @BeforeTest
	  public void beforeTest() throws InterruptedException 
	  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");  
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com/");
	  
	  }
	
  @Test  (priority=1)
  public void HowtowriteDownDynamicXpath() throws InterruptedException 
  {
	  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	 // normal Xpath:-driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
	  
	  
	 // DynamicXpath	
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	  driver.findElement(By.xpath("//input[@id='login-button']")).click();
	  Thread.sleep(3000);
		    
  }

  @Test (priority=2)
  public void verifiytext() throws InterruptedException
  {
	  driver.findElement(By.xpath("//*[text()='Products']")).getText();
	  	  
  }
  
  @AfterTest
  public void afterTest() {
  }

}
