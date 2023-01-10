package Gcc.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class DetallePage extends BaseTest{
	
	
	By inputOrder = By.id("input_order");
	By btn_search = By.id("btn_search");
	By checkBoxPage = By.xpath("//input[@id='asignarse_checkbox']");
	By btn_asignarse = By.id("btn_asignarse");

	public DetallePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	

}
