package dynamic_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoBack1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
        Thread.sleep(1000);
        
        driver.navigate().forward();
        
        driver.get("https://google.com");
        Thread.sleep(1000);
        
        driver.navigate().back();
        Thread.sleep(1000);
        
        driver.navigate().refresh();
        Thread.sleep(2000);
        
        driver.findElement(By.id("email")).sendKeys("Mr Tester Tej");
        driver.findElement(By.id("pass")).sendKeys("Sk@12345");
        driver.findElement(By.className("_9lsa")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.name("login")).click();
        
       
        
		
	}

}
