package Gcc.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Gc.project.tests.BaseTest;
import Gcc.project.action.Action;

public class HomePage extends BaseTest {
	
	
	
	By bottonDropdown = By.cssSelector("div.FavIcon");
	
	By detailsBtn = By.cssSelector("div.gcc-base:nth-child(1) div.sideBarMenu:nth-child(1) div.Menu div.menu-div div.menu-father:nth-child(1) div.menu-child.SubOrder:nth-child(3) > a:nth-child(1)");
	
	 
	 Action action = new Action(driver);

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public void goToDetails() {
		
		action.click(bottonDropdown);
		///click(detailsBtn);
				
	}
	

}
