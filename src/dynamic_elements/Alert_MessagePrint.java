package dynamic_elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_MessagePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://demo.guru99.com/test/delete_customer.php");
	    
	    driver.findElement(By.name("cusid")).sendKeys("53920");
	    
	    driver.findElement(By.name("submit")).click();
	    
	    Alert confirmation = driver.switchTo().alert();
	    String alerttext = confirmation.getText();
	    System.out.println(alerttext);
	    
	    
	}

}
