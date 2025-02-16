package github1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Case2 {
	public WebDriver driver;
	
  @BeforeTest
  public void beforeTest() throws InterruptedException
  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(3000);
	
    driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
    driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    Thread.sleep(5000);
	  
	  
  }

	
  @Test (priority=0)
  public void VerifyfirstProductname() throws InterruptedException
  {
	 String Actual_MG = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
	 String Expected_MG ="Sauce Labs Backpack";
	 Assert.assertEquals(Actual_MG, Expected_MG);
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click(); 
	 Thread.sleep(3000);
  }
  
  @Test (priority=1)
  public void VerifyYourCartText() throws InterruptedException
  {
	 driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click(); 
	 Thread.sleep(3000);
	 String Actual_MG = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
	 String Expected_MG ="Your Cart";
	 Assert.assertEquals(Actual_MG, Expected_MG);
	 
  }
  
  @Test (priority=2)
  public void verifyProductName() throws InterruptedException 
  {
	  String Actual_MG = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
	  String Expected_MG ="Sauce Labs Backpack";
	  Assert.assertEquals(Actual_MG, Expected_MG);
  }

  @Test (priority=3)
  public void verifyCheckout() throws InterruptedException
  {
	 driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click(); 
	 Thread.sleep(5000);
	 String Actual_MG = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
	 String Expected_MG ="Checkout: Your Information";
	 Assert.assertEquals(Actual_MG, Expected_MG);
	 Thread.sleep(5000);
	  
  }
  
  @Test (priority=4)
  public void enterInformation() throws InterruptedException
  {
	  driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("patric");
	  driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("TheFourth");
	  driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("789456");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	  Thread.sleep(5000);
	  
  }
  
  @Test (priority=5)
  public void verifyCheckoutOverview() throws InterruptedException
  {
	  String Actual_MG = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
	  String Expected_MG ="Checkout: Overview";
	  Assert.assertEquals(Actual_MG, Expected_MG);
	  Thread.sleep(2000);
	  String Actual_MG1 = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
	  String Expected_MG1 ="Sauce Labs Backpack";
	  Assert.assertEquals(Actual_MG1, Expected_MG1);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
  }
  
  @Test (priority=6)
  public void verifyCheckoutComplete() throws InterruptedException
  {
	  String Action_MG = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
	  String Expected_MG ="Checkout: Complete!";
	  Assert.assertEquals(Action_MG, Expected_MG);
	  Thread.sleep(5000);
	  String Action_MG1 = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText();
	  String Expected_MG1="Thank you for your order!";
	  Assert.assertEquals(Action_MG1, Expected_MG1);
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
	  Thread.sleep(5000);
  }
  
  @Test (priority=7)
  public void verifyProductsText() throws InterruptedException 
  {
	 String Action_MG = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText(); 
	 String Expected_MG ="Products";
	 Assert.assertEquals(Action_MG, Expected_MG);
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
	 
	 
	 
  }
  
  
  @AfterTest
  public void afterTest() {
  }

}
