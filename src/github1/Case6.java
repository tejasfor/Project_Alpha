package github1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Case6 {
	public WebDriver driver;

	  @BeforeTest
	  public void beforeTest()  throws InterruptedException
	  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://demo.guru99.com/test/");
         Thread.sleep(5000);
	  }

	
  @Test (priority=1)
  public void EnterDate() throws InterruptedException
  {
	  driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("21");
	  driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("12");
	  driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("2024");
	  
	  WebElement element = driver.findElement(By.xpath("/html/body/form/input[1]"));
	  element.sendKeys(Keys.TAB);
	  
	  driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("02");
	  driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("33");
	  
	//  WebElement element1 = driver.findElement(By.xpath("/html/body/form/input[1]"));
	//  element1.sendKeys(Keys.TAB);
	  
	  driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("AM");
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("/html/body/form/input[2]")).click();
	  Thread.sleep(3000);
	  
  }

  @Test (priority=2)
  public void Verifiemessage() throws InterruptedException
  {
	  String Actual_MG = driver.findElement(By.xpath("/html/body/div[2]")).getText();
	  String Expected_MG ="Your Birth Date is 2024-12-21\n"
	  		+ "Your Birth Time is 02:33";
	  Assert.assertEquals(Actual_MG, Expected_MG);
  }
  
  @AfterTest
  public void afterTest() {
  }

}
