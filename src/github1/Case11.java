package github1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Case11 {
	public WebDriver driver;
	  @BeforeTest
	  public void beforeTest() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demoqa.com/webtables");
	      
	  }

	
  @Test (priority=1)
  public void f() throws InterruptedException
  {
	  driver.findElement(By.xpath("//*[text()='Add']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Gustavo");
	  driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("mentonot");
	  driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("hoaeo@4don.com");
	  driver.findElement(By.xpath("//*[@id='age']")).sendKeys("28");
	  driver.findElement(By.xpath("//*[@id='salary']")).sendKeys("250000");
	  driver.findElement(By.xpath("//*[@id='department']")).sendKeys("QA");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[text()='Submit']")).click();
	  Thread.sleep(3000);
  }
  
  @Test (priority=2)
  public void delete() throws InterruptedException
  {
	  driver.findElement(By.xpath("//*[@id='edit-record-4']")).click();
	  driver.findElement(By.xpath("//*[@id='firstName']")).clear();
	  driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("HEoakdsfoa");
	  
	  driver.findElement(By.xpath("//*[@id='lastName']")).clear();
	  driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Heloaond");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[text()='Submit']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='delete-record-4']")).click();
	  

	  
  }

  @AfterTest
  public void afterTest() {
  }

}
