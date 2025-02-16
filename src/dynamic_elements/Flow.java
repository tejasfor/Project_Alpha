package dynamic_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("shopping_cart_badge")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("first-name")).sendKeys("MR.Wolter");
		driver.findElement(By.id("last-name")).sendKeys("Grovalsi");
		driver.findElement(By.id("postal-code")).sendKeys("784565");
		driver.findElement(By.id("continue")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("finish")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(5000);
		
	    driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
	    	
	}

}
