package github1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class Case14_FailedCaseScreenShot {
	public WebDriver driver;
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdrier.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.saucedemo.com/");
	      
	  }

	
  @Test (priority=1)
  public void bothvalueBlank() throws InterruptedException
  {
	  driver.findElement(By.xpath("//*[@id='login-button']")).click();
	  Thread.sleep(5000);
	  String ActualMG = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
	  String ExpectedMG ="Epic sadface: Username is required";
	  Assert.assertEquals(ActualMG, ExpectedMG);
	  Thread.sleep(5000);
  }
  
  @Test (priority=2)
  public void usernameBlank() throws InterruptedException
  {
	  driver.navigate().refresh();
	  driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
	  driver.findElement(By.xpath("//*[@id='login-button']")).click();
	  String ActualMG1 = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
	  String ExpectedMG1 ="Epic sadface: Username is required";
	  Assert.assertEquals(ActualMG1, ExpectedMG1);
	  Thread.sleep(5000);
  }
  
  @Test (priority=3)
  public void passwordBlank() throws InterruptedException
  {
	  driver.navigate().refresh();
	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	  String ActualMG2 = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
	  String ExpectedMG2 ="Epic sadface:=dsij Password is required";
	  Assert.assertEquals(ActualMG2, ExpectedMG2);
	  Thread.sleep(5000);
  }
  
  @Test (priority=4)
  public void bothvalueWrong() throws InterruptedException
  {
	  driver.navigate().refresh();
	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("bonta");
	  driver.findElement(By.xpath("//*[@id='password']")).sendKeys("konta");
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	  String ActualMG3 = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
	  String ExpectedMG3 ="Epic sadface: Username and password do not match any user in this service";
	  Assert.assertEquals(ActualMG3, ExpectedMG3);
	  Thread.sleep(5000);
  }
  
  @Test (priority=5)
  public void bothvalid() throws InterruptedException
  {
	  driver.navigate().refresh();
	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	  Thread.sleep(5000);

 }
  
  @AfterMethod
  public void Screenshot (ITestResult result) throws IOException
  {
	  if(ITestResult.FAILURE==result.getStatus())
	  {
		  TakesScreenshot screenshot = (TakesScreenshot)driver;
		  
		  File src = screenshot.getScreenshotAs(OutputType.FILE);
		  
		  FileUtils.copyFile(src, new File("C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\screenshot\\" +result.getName()+ ".png"));
		  
	  }
  }
  
  @AfterTest
  public void afterTest() {
  }

}
