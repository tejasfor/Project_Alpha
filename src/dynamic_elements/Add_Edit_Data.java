package dynamic_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_Edit_Data {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://demoqa.com/webtables");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@id=\"addNewRecordButton\"]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("firstName")).sendKeys("Devid");
	    driver.findElement(By.id("lastName")).sendKeys("lark");
	    driver.findElement(By.id("userEmail")).sendKeys("Dev.id@kel.com");
	    driver.findElement(By.id("age")).sendKeys("29");
	    driver.findElement(By.id("salary")).sendKeys("1200000");
	    driver.findElement(By.id("department")).sendKeys("QA");
	    driver.findElement(By.id("submit")).click();
	    Thread.sleep(5000);
	    
	    driver.findElement(By.className("mr-2")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("firstName")).clear();
	    driver.findElement(By.id("firstName")).sendKeys("Rajat");
	    
	    driver.findElement(By.id("lastName")).clear();
	    driver.findElement(By.id("lastName")).sendKeys("Dalal");
	    
	    driver.findElement(By.id("userEmail")).clear();
	    driver.findElement(By.id("userEmail")).sendKeys("Rajat.Dandu@4cpl.com");
	    
	    driver.findElement(By.id("age")).clear();
	    driver.findElement(By.id("age")).clear();
	    
	    driver.findElement(By.id("salary")).clear();
	    driver.findElement(By.id("salary")).sendKeys("100000");
	    
	    driver.findElement(By.id("department")).clear();
	    driver.findElement(By.id("department")).sendKeys("Senior QA");
	    driver.findElement(By.id("submit")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("delete-record-1")).click();

	    
	    
	    
	    
	    
	    
		

	}

}
