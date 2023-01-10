package Gc.project.components;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.testng.annotations.BeforeTest;


import io.github.bonigarcia.wdm.WebDriverManager;

     

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop;
	    
	   @BeforeTest
       public static  WebDriver launchApp() throws IOException {
		   
	    Properties prop = new Properties();
	    FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"./Configuration/config.properties");
	    prop.load(fis);
	    	
	    	
    	WebDriverManager.chromedriver().setup();
    	String browserName = prop.getProperty("browser");
    	if(browserName.contains("Chrome")) {
    		driver = new ChromeDriver();
    	}else if(browserName.contains("FireFox")) {
    		driver = new FirefoxDriver();
    	}else if(browserName.contains("IE")) {
    		driver = new InternetExplorerDriver();
    	}
    	
    	driver.get(prop.getProperty("url"));
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    	return driver;
    }
	   
	   
	   public BaseTest (WebDriver driver) {
	        this.driver = driver;
		
      }
	    
	
	
	 
	    	
	    	
}
