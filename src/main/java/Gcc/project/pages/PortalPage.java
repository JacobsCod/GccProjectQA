package Gcc.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Gc.project.tests.BaseTest;
import Gcc.project.action.Action;

public class PortalPage extends BaseTest {

	By inicioGCCportal = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnAceptar']");
	Action action = new Action(driver);
	
	public PortalPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void acceptMessage() throws InterruptedException {
		Thread.sleep(3000);
		action.click(inicioGCCportal);
	}
		
	


}
