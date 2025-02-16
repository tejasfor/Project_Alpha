package github1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Case8 {
	public WebDriver driver;
	  @BeforeTest
	  public void beforeTest() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();.
	      driver.get("https://demoqa.com/buttons");
	      Thread.sleep(5000);
	  
	  }
	
  @Test (priority=1)
  public void Doubleclick() throws InterruptedException
  {
	  Actions act = new Actions(driver);
	  act.doubleClick(driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"))).build().perform();
	  Thread.sleep(3000);
	  String Actual_MG = driver.findElement(By.xpath("//*[@id=\"doubleClickMessage\"]")).getText();
	  String Expected_MG ="You have done a double click";
	  Assert.assertEquals(Actual_MG, Expected_MG);
	  
	  
  }
  
  @Test (priority=2)
  public void Rightclick() throws InterruptedException
  {
	  Actions act1 = new Actions(driver);
	  act1.contextClick(driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"))).build().perform();
	  Thread.sleep(5000);
	  String Actual_MG1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/p[2]")).getText();
	  String Expected_MG1 ="You have done a right click";
	  Assert.assertEquals(Actual_MG1, Expected_MG1);
	  Thread.sleep(3000);
  }
  
  @Test (priority=3)
  public void click() throws InterruptedException
  {
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[3]/button")).click();
	  Thread.sleep(3000);
	  String Actual_MG2 = driver.findElement(By.xpath("//*[@id=\"dynamicClickMessage\"]")).getText();
	  String Expected_MG2 ="You have done a dynamic click";
	  Assert.assertEquals(Actual_MG2, Expected_MG2);
  }

  @AfterTest
  public void afterTest() {
  }

}
