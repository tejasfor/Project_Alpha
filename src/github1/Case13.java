package github1;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Case13 {
	public WebDriver driver;
	  @BeforeTest
	  public void beforeTest() throws InterruptedException
	  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	  }
	
	
  @Test
  public void Login() throws InterruptedException, IOException
  {
	  driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
	  driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
	  driver.findElement(By.xpath("//*[@id='login-button']")).click();
	  
	  File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
      Files.copy(screenshot, new File("C:\\Users\\Tejas parmar\\Downloads\\Phone Link.jpg"));  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
