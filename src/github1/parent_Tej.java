package github1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class parent_Tej {
	public WebDriver driver;
	 @BeforeClass
	  public void beforeClass() {
		 

     System.setProperty("webdriver.chrome.driver","C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
     driver =new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.saucedemo.com/");

	  }
	 	
	 @Test(priority=0)
	 public void bothvalueblank() throws InterruptedException {
	 driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	 Thread.sleep(5000);
	 String actual_message=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
	 String expected_message="Epic sadface: Username is required";
	 Assert.assertEquals(actual_message,expected_message); 
	 driver.navigate().refresh();
	 Thread.sleep(5000);
	 
	 }
	  
	 @Test(priority=1)
	 public void passwordblank() throws InterruptedException{
	 driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	 driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	 Thread.sleep(5000);
	 String actual_message=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
	 String expected_message="Epic sadface: Password is required";
	 Assert.assertEquals(actual_message,expected_message);
	 Thread.sleep(5000);

	 driver.navigate().refresh();
	 Thread.sleep(5000);
	 }
	 
	 
  @AfterClass
  public void afterClass() {
  }

}
