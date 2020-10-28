package com.training.casetwo;
	
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	public class CaseTwoPom {
		private WebDriver driver; 
		
		public CaseTwoPom(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="login")
		private WebElement userName; 
		
		@FindBy(id="password")
		private WebElement password;
		
		@FindBy(id="form-login_submitAuth")
		private WebElement loginBtn; 
		
		@FindBy(xpath = "//*[@id='navbar']/ul[1]/li[4]/a")
		private WebElement reportingtab;
		
		@FindBy(xpath = "//*[@id='main_content']/div[3]/div/div[1]/div/div/div[1]/a")
		private WebElement followedstudentsLink;
		
		@FindBy(xpath = "//*[@id='details_sathyashree']")//*[@id="main_content"]/div[3]/div/div[1]/div/div/div[1]/a
		private WebElement studentDetail;
		
		@FindBy(xpath = "//*[@id='cm-content']/div/div[7]/table/tbody/tr[1]/td[7]/a")
		private WebElement courseDetails;
		
		@FindBy(xpath = "//*[@id='cm-content']/div/div[8]/table/tbody/tr/td[5]/a")
		private WebElement latestAttempt;
		
		
		
		@FindBy(xpath = "//*[@id='form-email_submit']")
		private WebElement correctTestButton;
		
		
		@FindBy(xpath = "//*[@id='navbar']/ul[1]/li[2]/a")
		private WebElement courseNameLink;
		
		
		public void sendUserName(String userName) {
			this.userName.clear();
			this.userName.sendKeys(userName);
		}
		
		public void sendPassword(String password) throws InterruptedException {
			this.password.clear(); 
			this.password.sendKeys(password); 
			Thread.sleep(2000);
		}
		public void clickLoginBtn() throws InterruptedException {
			this.loginBtn.click(); 
			Thread.sleep(2000);
			this.reportingtab.click();
			 
		}
		public void clickstudentsDetails_Coursedetails() throws InterruptedException
		{
			this.followedstudentsLink.click();
			
			this.studentDetail.click();
			Thread.sleep(3000);
			this.courseDetails.click();
			Thread.sleep(5000);
			this.latestAttempt.click();
			Thread.sleep(2000);
													
			if ( !driver.findElement(By.name("send_notification")).isSelected() )
			{
			     driver.findElement(By.name("send_notification")).click();
			}
			
			Thread.sleep(2000);
			this.correctTestButton.click();
			Thread.sleep(2000);
			this.courseNameLink.click();
			
		}
		
		
		
}
