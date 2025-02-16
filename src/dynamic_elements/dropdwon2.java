package dynamic_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdwon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("http://output.jsbin.com/osebed/2");
	    
	    WebElement testDropDown = driver.findElement(By.id("fruits"));
	    Select dropdown = new Select(testDropDown);
	    
	    dropdown.selectByIndex(0);
	    dropdown.selectByIndex(1);
	    dropdown.selectByIndex(2);
	   // dropdown.selectByIndex(3);
	    dropdown.selectByIndex(4);

	}

}
