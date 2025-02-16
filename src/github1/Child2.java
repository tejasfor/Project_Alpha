package github1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Child2 extends Child1 {
	  @BeforeTest
	  public void beforeTest() {
	  }
	
	
	  @Test (priority=4)
	  public void specialjunkcharacters() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("!@#$%");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("!@#$%");
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	  String actual_message=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText();
	  String expect_message="Epic sadface: Username and password do not match any user in this service";
	  Assert.assertEquals(actual_message, expect_message);
	  Thread.sleep(5000);
		 driver.navigate().refresh();
		 Thread.sleep(5000);

	  }
	  
	  @Test (priority=5)
	  public void validbothvalue() throws InterruptedException {
	  driver.navigate().refresh();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	  Thread.sleep(5000);
		 driver.navigate().refresh();
		 Thread.sleep(5000);

	  }

  @AfterTest
  public void afterTest() {
  }

}
