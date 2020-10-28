package com.training.sessioncreationPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sessionCreationPom {
	private WebDriver driver; 
	
	public sessionCreationPom(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='navbar']/ul[1]/li[7]/a")
	private WebElement Administration;
	
	@FindBy(xpath ="//*[@id='tabs-4']/div/div[2]/div[2]/ul/li[3]/a")
	private WebElement sessions_categories_list;
	
	@FindBy(xpath = "//*[@id=\"cm-content\"]/div/div[2]/div/div[1]/a[1]/img")
	private WebElement addCatrgory;

	public void passWebPage()
	{
		this.Administration.click();
		this.sessions_categories_list.click();
		this.addCatrgory.click();
	}
}
