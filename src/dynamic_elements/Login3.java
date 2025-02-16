package dynamic_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.className("gLFyf")).sendKeys("ArtOfTesting");
		Thread.sleep(3000);
		
		driver.findElement(By.className("ClJ9Yb")).click();      //If user not opened by selecting class name then select Xpath
		

	}

}
