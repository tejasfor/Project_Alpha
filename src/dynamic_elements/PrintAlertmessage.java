package dynamic_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAlertmessage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/upload/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Tejas parmar\\OneDrive\\Documents\\test.txt");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("submitbutton")).click();
		Thread.sleep(1000);
		
		String a = driver.findElement(By.xpath("//*[@id=\"res\"]/center")).getText();
		System.out.println(a);
		
		
      
		
	}

}
