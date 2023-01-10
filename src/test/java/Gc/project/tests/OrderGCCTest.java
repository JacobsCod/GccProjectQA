package Gc.project.tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Gc.project.components.BaseTest;
import Gcc.project.pages.HomePage;
import Gcc.project.pages.PortalPage;
import io.github.bonigarcia.wdm.WebDriverManager;





public class OrderGCCTest  extends BaseTest{

	
    public OrderGCCTest(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	PortalPage pp; 
	
	@BeforeMethod
	public void setup() {
		
    }
	
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
    
	
	@Test
	public void OrdenVisible() throws Throwable{
		pp = new PortalPage(driver);
	    pp.acceptMessage();
	}
}

  
 

