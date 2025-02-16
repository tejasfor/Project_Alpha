package dynamic_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebElement testDropDown = driver.findElement(By.id(""));
        Select dropdown = new Select(testdropdown);
        dropdown.selectByVisibleText("");
        
        Actions action = new Action(driver);
        WebElement element = driver.findElement(By.id(""));
        action.doubleClick().perform();
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0,2500)");
        
        JavascriptExecutor js = (javascriptExecutor)driver;
        js.executeScript("ScrollBy(0,2500)");
        
        JavascriptExecutor js =(JavascripExecutor)driver;
        js.executeScript("ScrollBy(0,2500)");
        
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("ScrollBy(0,2500)");
        

        driver.navigate().refresh();
        
        driver.navigate().back();
        
        driver.navigate().forword();
        
        driver.navigate().refresh();
        
        driver.navigate().refresh();
        
        driver.navigate().refresh();
        
		

	}

}
