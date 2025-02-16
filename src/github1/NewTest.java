package github1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	  
	public WebDriver driver;
	
		
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.saucedemo.com/");
		  Thread.sleep(5000);
		  
		  
	  }

	
      @Test (priority=0)
      public void bothvalueblank() throws InterruptedException {
	      
    	  driver.navigate().refresh();
    	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    	  Thread.sleep(5000);
    	  String Actual_MG = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
    	  String Expected_MG ="Epic sadface: Username is required";
    	  Assert.assertEquals(Actual_MG, Expected_MG);
    	  
	  
     }
      
      @Test (priority=1)
      public void passwordblank() throws InterruptedException
      {
    	  driver.navigate().refresh();
    	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
    	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    	  Thread.sleep(5000);
    	  String Actual_MG = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
    	  String Expected_MG ="Epic sadface: Password is required";
    	  Assert.assertEquals(Actual_MG, Expected_MG);

      }
      
      @Test (priority=2)
      public void usernameblank() throws InterruptedException
      {
    	  driver.navigate().refresh();
    	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
    	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    	  Thread.sleep(5000);
    	  String Actual_MG = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
    	  String Expected_MG ="Epic sadface: Username is required";
    	  Assert.assertEquals(Actual_MG, Expected_MG);

    	  
      }
      
      @Test (priority=3)
      public void wrongusername() throws InterruptedException
      {
    	  driver.navigate().refresh();
    	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("wrongUserName");
    	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
    	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    	  Thread.sleep(5000);
    	  String Actual_MG = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
    	  String Expected_MG ="Epic sadface: Username and password do not match any user in this service";
    	  Assert.assertEquals(Actual_MG, Expected_MG);

    	  
    	  
      }
      
      @Test (priority=4)
      public void wrongpassword() throws InterruptedException
      {   
    	  driver.navigate().refresh();
    	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
    	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Lelobegan");
    	  driver.findElement(By.xpath("//*[@id=\\\"login-button\\\"]")).click();
    	  Thread.sleep(5000);
    	  String Actual_MG = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
    	  String Expected_MG ="Epic sadface: Username and password do not match any user in this service";
    	  Assert.assertEquals(Actual_MG, Expected_MG);

    	  
      }
      
      @Test (priority=5)
      public void bothwrong() throws InterruptedException
      {
    	  driver.navigate().refresh();
    	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("wrongUsername");
    	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Bokoharam");
    	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    	  Thread.sleep(5000);
    	  String Actual_MG = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
    	  String Expected_MG = "Epic sadface: Username and password do not match any user in this service";
    	  Assert.assertEquals(Actual_MG, Expected_MG);

    	  
      }
      
      @Test (priority=6)
      public void spacevaleue() throws InterruptedException
      {
    	driver.navigate().refresh();  
      }
      
  @AfterTest
  public void afterTest() {
  }

}
