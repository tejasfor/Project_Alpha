package github1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Case4 {
	public WebDriver driver;
	
	  @BeforeTest
	  public void beforeTest() throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demo.guru99.com/test/newtours");
	      Thread.sleep(5000);
	  
	  }
	
  @Test
  public void PrintTitle() throws InterruptedException 
  {
	  String Actual_MG = driver.getTitle();
	  String Expected_MG ="Welcome: Mercury Tours";
	  Assert.assertEquals(Actual_MG, Expected_MG);
  }

  @AfterTest
  public void afterTest() {
  }

}
