package github1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Case7 {
	public WebDriver driver;
	  @BeforeTest
	  public void beforeTest() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(" https://demoqa.com/text-box");
		  
		 // JavascriptExecutor js = (JavascriptExecutor) driver;
		//  js.executeAsyncScript("windows.scrollby(0,250)");
		  
		  Thread.sleep(3000);
	  }

	
  @Test (priority=1)
  public void EnterDetails() throws InterruptedException
  {
	  driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("momin");
	  driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("megamen@gamil.com");
	  driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("melonoton");
	  driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("D/1, melament road, near planfalt, ketonaa, subhashdke, Ahmedabad");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[5]/div/button")).click();
	  Thread.sleep(3000);
  }
  
  @Test (priority=2)0
  public void VerifieText() throws InterruptedException
  {
	  String Actual_MG = driver.findElement(By.xpath("//*[@id=\"name\"]")).getText();
	  String Expected_MG ="Name:momin";
	  Assert.assertEquals(Actual_MG, Expected_MG);
	
	  String Actual_MG1 = driver.findElement(By.xpath("//*[@id=\"email\"]")).getText();
	  String Expected_MG1 ="Email:megamen@gamil.com";
	  Assert.assertEquals(Actual_MG1, Expected_MG1);

	  String Actual_MG2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[6]/div/p[3]")).getText();
	  String Expected_MG2 ="Current Address :melonoton";
	  Assert.assertEquals(Actual_MG2, Expected_MG2);

	  String Actual_MG3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[6]/div/p[4]")).getText();
	  String Expected_MG3 ="Permananet Address :D/1, melament road, near planfalt, ketonaa, subhashdke, Ahmedabad";
	  Assert.assertEquals(Actual_MG3, Expected_MG3);

	  
  }

  @AfterTest
  public void afterTest() {
  }

}
