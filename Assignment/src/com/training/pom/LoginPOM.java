package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath = "//*[@id='navbar']/ul[1]/li[7]/a")
	private WebElement Administration;
	
	@FindBy(xpath ="//*[@id='tabs-4']/div/div[2]/div[2]/ul/li[3]/a")
	private WebElement sessions_categories_list;
	
	@FindBy(xpath = "//*[@id=\"cm-content\"]/div/div[2]/div/div[1]/a[1]/img")
	private WebElement addCatrgory;
	
	@FindBy(xpath="//*[@id='cm-content']/div/div[2]/div/form/div[1]/div[1]/input")
	private WebElement categoryName;
	
	@FindBy(xpath="//*[@id='cm-content']/div/div[2]/div/form/div[4]/div[1]/button")
	private WebElement addCategory;
	
	@FindBy(xpath = "//*[@id='cm-content']/div/ul/li[1]/a")
	private WebElement sessionLink;
	
	@FindBy(xpath = "//*[@id='cm-content']/div/div[2]/a[1]")
	private WebElement addTraningSession;
	
	
	@FindBy(id = "add_session_name")
	private WebElement sessionName;
	
	@FindBy(xpath= "//*[@id='select2-coach_username-container']")
	private WebElement coachName; 
	
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	private WebElement searchCoachName;
	
	@FindBy(xpath= "//*[@id='advanced_params_options']/div[2]/div[1]/div/button/div/div/div']")
	private WebElement sessionCategorytextbox;		
	
	@FindBy(xpath= "//*[@id='select2-coach_username-results']/li")
	private WebElement siteOwner;
	
	@FindBy(xpath = "//*[@class='select2-coach_username-container']")
	private WebElement CoachNameTextBox;
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) throws InterruptedException {
		this.password.clear(); 
		this.password.sendKeys(password); 
		Thread.sleep(2000);
	}
	
	public void sendCategoryName(String categoryName)
	{
		this.categoryName.clear();
		this.categoryName.sendKeys(categoryName);
	}
	
	public void sessionName(String sessionName)
	
	{
		this.sessionName.clear();
		this.sessionName.sendKeys(sessionName);
	}
	
	public void addCoachName(String coachName)
	{
		this.coachName.clear();
		this.coachName.sendKeys(coachName);
		//this.searchCoachName.sendKeys(this.searchCoachName);
		
	}
	
	public void sendCoachName(String searchCoachName)
	{
		this.searchCoachName.clear();
		this.searchCoachName.sendKeys(searchCoachName);
		this.searchCoachName.click();
	}

	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	public void sessionCreation()
	{
		this.Administration.click();
		this.sessions_categories_list.click();
		this.addCatrgory.click();
	}
	public void addCategoryAndTrainingSession()
	{
		this.addCategory.click();
		this.sessionLink.click();
		this.addTraningSession.click();
		
	}
	
	public void  toAddTrainingSession()
	{
		this.coachName.click();
		this.coachName.sendKeys("admin");
		
		
		
//		//this.siteOwner.click();
//		
//		
//		  this.searchCoachName.clear(); 
//		  Select sc = new Select(this.searchCoachName); 
//		 // List<WebElement> values = sc.getOptions(); //System.out.println(values.size()); 
//		//  for(int i=0 ;i<values.size();i++ ) { // To get all the values.
//		  //System.out.println(values.get(i).getText()); //or String value =
//		  values.get(i).getText(); 
//		  System.out.println(values);
//		  
//		  } sc.selectByVisibleText("Site Owner"); 		 		 
//		
	}
	/*
	 * public void clickSessionCategory() {
	 * 
	 * }
	 */
//	public void coachName()
//	{
//		Actions act = new Actions(driver);
//		act.moveToElement(CoachNameTextBox).sendKeys("admin").build().perform();
//	}
	
	
}
