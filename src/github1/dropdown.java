package github1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class dropdown {
	
	public WebDriver driver;
	
  @BeforeTest
  public void beforeTest() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.saucedemo.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	  Thread.sleep(5000);
	 
  }
	
  @Test (priority=0)  
  public void OptionOne() throws InterruptedException 
  {
	  driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).click();
	  Thread.sleep(2000);
	  String Actual_MG = driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
	  String Expected_MG ="Test.allTheThings() T-Shirt (Red)";
	  Assert.assertEquals(Actual_MG, Expected_MG);
	  
	  
  }
  
  @Test (priority=1)
  public void Optiontwo() throws InterruptedException
  {
	  
	  driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
	  Thread.sleep(5000);
	  String Actual_MG = driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).getText();
	  String Expected_MG ="Sauce Labs Onesie";
	  Assert.assertEquals(Actual_MG, Expected_MG);
  }
  
  @Test (priority=2)
  public void Optionthree() throws InterruptedException
  {
	  driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).click();
	  Thread.sleep(2000);
	  String Actual_MG = driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).getText();
	  String Expected_MG ="Sauce Labs Fleece Jacket";
	  Assert.assertEquals(Actual_MG, Expected_MG);
  }
  
  @Test (priority=3)
  public void Optionfour() throws InterruptedException 
  {
	  driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]")).click();
	  Thread.sleep(2000);
	  String Actual_MG = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
	  String Expected_MG ="Sauce Labs Backpack";
	  Assert.assertEquals(Actual_MG, Expected_MG);
  
  }
  
  @Test (priority=4)
  public void goBack() throws InterruptedException
  {
	  driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
	  
  }
  
  

  @AfterTest
  public void afterTest() {
  }

}
