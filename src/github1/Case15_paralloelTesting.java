package github1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Case15_paralloelTesting {
	public WebDriver driver;
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  
  
	  }

  @Test (priority=1)
  public void Chromedriver() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.saucedemo.com/");
      Thread.sleep(3000);
      
      //BothvalueBlank
      
      driver.findElement(By.xpath("//*[@id='login-button']")).click();
      Thread.sleep(2000);
      
     String Actual_MG =  driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
     String Expected_MG ="Epic sadface: Username is required";
     Assert.assertEquals(Actual_MG, Expected_MG);
     Thread.sleep(5000);
     
     //PasswordBlank
     
     driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
     driver.findElement(By.xpath("//*[@id='login-button']")).click();
     Thread.sleep(3000);
     String Actual_MG1 = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
     String Expected_MG1 ="Epic sadface: Password is required";
     Assert.assertEquals(Actual_MG1, Expected_MG1);
     Thread.sleep(3000);

  }
  
  @Test (priority=2)
  public void Firefoxdriver() throws InterruptedException
  {
	  WebDriver driver;
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\geckodriver-v0.35.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.saucedemo.com/");
	  
	    driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
	    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	    
	     driver.findElement(By.xpath("//*[@id='login-button']")).click();
	     Thread.sleep(3000);
	     String Actual_MG1 = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
	     String Expected_MG1 ="Epic sadface: Password is required";
	     Assert.assertEquals(Actual_MG1, Expected_MG1);
	     Thread.sleep(3000);
 
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
