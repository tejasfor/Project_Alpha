package dynamic_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/webtables");
		JavascriptExecutor js = (JavascriptExecutor) driver;       //For scroll down while addvotisment seen
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(3000);
		
		
		
		driver.findElement(By.xpath("//*[@id=\"addNewRecordButton\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("firstName")).sendKeys("Antony");
		driver.findElement(By.id("lastName")).sendKeys("Stark");
	    driver.findElement(By.id("userEmail")).sendKeys("Antony.stark@gmail.com");
	    driver.findElement(By.id("age")).sendKeys("27");
	    driver.findElement(By.id("salary")).sendKeys("50000");
	    driver.findElement(By.id("department")).sendKeys("QA");
	    driver.findElement(By.id("submit")).click();
		
	    driver.findElement(By.id("edit-record-4")).click();
	    
	    driver.findElement(By.id("firstName")).clear();
	    driver.findElement(By.id("firstName")).sendKeys("lowrence");
	    
	    driver.findElement(By.id("lastName")).clear();
	    driver.findElement(By.id("lastName")).sendKeys("bishnoi");
	    
		driver.findElement(By.id("userEmail")).clear();
		driver.findElement(By.id("userEmail")).sendKeys("Lowrance.bishnoi785@gmail.com");
		
		driver.findElement(By.id("age")).clear();
		driver.findElement(By.id("age")).sendKeys("30");
		
		driver.findElement(By.id("salary")).clear();
		driver.findElement(By.id("salary")).sendKeys("1000000");
		
        driver.findElement(By.id("department")).clear();
        driver.findElement(By.id("department")).sendKeys("QA Manager");
        Thread.sleep(2000);
        
	    	
        driver.findElement(By.id("submit")).click();
        Thread.sleep(1000);
        
        driver.close();
		

	}

}
