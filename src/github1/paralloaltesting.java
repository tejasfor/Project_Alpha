package github1;

import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class paralloaltesting {
	public WebDriver driver;
	  @BeforeTest
	  
      @Parameters("browser")
	  
	  public void beforeTest(@Optional("firefox")String browser) throws Exception
	  {
		  if(browser.equalsIgnoreCase("chrome"))
		  {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		  }
		  else if(browser.equalsIgnoreCase("firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\geckodriver-v0.35.0-win64\\geckodriver.exe");
			  driver = new FirefoxDriver();
			  driver.manage().window().maximize();
		  }
		  else
		  {
			  throw new Exception("Browser is not correct");
			  
		  } 
			  
	  }

  @Test (priority=1)
  public void bothvalueBlank() throws InterruptedException
  {
	  driver.get("https://www.saucedemo.com/");
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	  Thread.sleep(3000);
	  String Actual_MG = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3")).getText();
	  String Expected_MG="delto";
	  Assert.assertEquals(Actual_MG, Expected_MG);
  }

  @AfterTest
  public void afterTest() {
  }

}
