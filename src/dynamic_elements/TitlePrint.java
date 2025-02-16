package dynamic_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitlePrint {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/link.html");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/a[1]")).click();
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/a[2]")).click();
		
		String title1 =  driver.getTitle();
		System.out.println(title1);
		

		
		
		
		

	}

}
