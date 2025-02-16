package dynamic_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Flow2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejas parmar\\OneDrive\\Desktop\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.booking.com/");
		Thread.sleep(10000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.findElement(By.className("eb46370fe1")).sendKeys("Canada");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.className("b0eaf5262b")).click();
	    Thread.sleep(1000);
	    
	    
	   driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr[4]/td[4]/span")).click();
	   driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/table/tbody/tr[3]/td[4]/span")).click(); 
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div/div[3]/div/button")).click();
	   Thread.sleep(3000);
	   
       Actions action = new Actions(driver);
	   WebElement element = driver.findElement(By.xpath("//*[@id=\":ri:\"]/div/div[1]/div[2]/button[2]"));
	   action.doubleClick(element).perform();
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//*[@id=\":ri:\"]/div/div[2]/div[2]/button[2]")).click();
	   
	   WebElement testDropDown = driver.findElement(By.className("ebf4591c8e"));
	   Select dropdown = new Select(testDropDown);
	   dropdown.selectByIndex(6);
	   Thread.sleep(2000);
	   
	   driver.findElement(By.className("d777d2b248")).click();
	   Thread.sleep(2000);
	   
	   Actions action1 = new Actions(driver);
	   WebElement element1 = driver.findElement(By.xpath("//*[@id=\":ri:\"]/div/div[5]/div[2]/button[2]"));
	   action1.doubleClick(element1).perform();
	   Thread.sleep(2000);
	   
	   WebElement radio = driver.findElement(By.xpath("//*[@id=\":ri:\"]/div/div[6]/label/span[1]"));
	   radio.click(); 
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//*[@id=\":ri:\"]/button")).click();
	   

	}

}
