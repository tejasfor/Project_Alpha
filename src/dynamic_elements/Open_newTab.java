package dynamic_elements;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_newTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          WebDriver driver;
          
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
          
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.get("https://www.google.com/");
         Thread.sleep(2000);
         
         driver.switchTo().newWindow(WindowType.TAB);
         Thread.sleep(2000);
         
         driver.get("https://www.facebook.com/");
         Thread.sleep(2000);
         
         ArrayList<String> tabs  new ArrayList<>(driver.getWindowHandles());
         driver.switchTo().window(tabs.get(0));
         Thread.sleep(2000);
         
         driver.findElement(By.className("gLFyf")).sendKeys("Art of Testing");
         Thread.sleep(2000);
         
         driver.findElement(By.className("eIPGRd")).click();
         
         
         
	}

}
