package dynamic_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/");
		
	    driver.findElement(By.name("bdaytime")).click();
	    driver.findElement(By.name("bdaytime")).sendKeys("15");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("bdaytime")).sendKeys("11");
	    driver.findElement(By.name("bdaytime")).sendKeys("2024");
	    Thread.sleep(2000);
	    
	    Actions act = new Actions (driver);
	    act.sendKeys(Keys.TAB).build().perform();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("bdaytime")).sendKeys("02:30");
	    
	    
	    
	    driver.findElement(By.name("bdaytime")).sendKeys("PM");
	    
	    Actions act1 = new Actions (driver);
	    act1.sendKeys(Keys.DOWN).build().perform();
	    
	    Actions act2 = new Actions (driver);
	    act2.sendKeys(Keys.TAB).build().perform();
	    
	    Actions act3 = new Actions (driver);
	    act3.sendKeys(Keys.TAB).build().perform();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/form/input[2]")).click();
	    

	}

	private static Actions Actions(Actions act) {
		// TODO Auto-generated method stub
		return null;
	}

}
