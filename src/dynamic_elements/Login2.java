++847
/package dynamic_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://artoftesting.com/sampleSiteForSelenium");
		
		driver.findElement(By.id("fname")).sendKeys("OfficePolitics");
		Thread.sleep(3000);
		
		driver.findElement(By.id("fname")).clear();
		
		driver.findElement(By.id("idOfButton")).click(); 

		driver.findElement(By.id("male")).click();
		
		driver.findElement(By.className("Automation")).click();
		driver.findElement(By.className("Performance")).click();
	}

}
