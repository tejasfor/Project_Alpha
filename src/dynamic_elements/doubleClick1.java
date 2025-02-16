package dynamic_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     WebDriver driver;
	     
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	     
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	     
	    /* Actions  action = new Actions(driver);
	     WebElement element = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	     action.doubleClick(element).perform();
	     */
	     
	     Actions act = new Actions(driver);
	     act.doubleClick(driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"))).build().perform();
	     
         

	}

}
