package github1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Case10 {
	public WebDriver driver;
	
   @BeforeTest
   public void beforeTest() throws InterruptedException 
   {
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");   
	driver = new ChromeDriver();  
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/newtours/");
	Thread.sleep(5000);	
   }

  @Test
  public void RegisterPage() throws InterruptedException
  {
	  driver.findElement(By.xpath("//*[text()='REGISTER']")).click();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("Kelen");
	  driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Makhani");
	  driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("7894561236");
	  driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("oenoe@4dog.com");
	  driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("5, Karolbag, pentomana, adleodr");
	  driver.findElement(By.xpath("//*[@name='city']")).sendKeys("adhoenro");
	  driver.findElement(By.xpath("//*[@name='state']")).sendKeys("Gujradhose");
	  driver.findElement(By.xpath("//*[@name='postalCode']")).sendKeys("852454");
	  Thread.sleep(3000);
	  
	  WebElement Testdropdown = driver.findElement(By.xpath("//*[@name='country']"));
	  Select dropdown = new Select(Testdropdown);
	  dropdown.selectByVisibleText("SINGAPORE");
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Merotenton");
	  driver.findElement(By.xpath("//*[@name='password']")).sendKeys("ulomena@12345");
	  driver.findElement(By.xpath("//*[@name='confirmPassword']")).sendKeys("ulomena@12345");
	  driver.findElement(By.xpath("//*[@name='submit']")).click();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
