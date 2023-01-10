package Gcc.project.action;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





public class Action extends BasePage {
	

	

	public void waitforAppear(By FindBy) {
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(FindBy));
    	
    }
    
    
    
    
    
   
    public WebElement findElement (By locator) {
    	return driver.findElement(locator);
    	}
    
    @SuppressWarnings("unchecked")
	public List<WebElement> findElements ( By locator){
    	return (List<WebElement>) driver.findElement(locator);
    }
    
    public String getText (WebElement element) {
    	return element.getText();
    }
    
    public void sendkeys(String inputText, By locator) {
    	driver.findElement(locator).sendKeys(inputText);
    	
    }
    
    public void click(By locator) {
    	driver.findElement(locator).click();
    }
    
    public void visit(String url) {
    	driver.get(url);
    }
    
    
 
    
}

