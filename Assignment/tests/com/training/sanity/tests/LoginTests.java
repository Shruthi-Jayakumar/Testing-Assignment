package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		loginPOM.sessionCreation();
		loginPOM.sendCategoryName("testing");
		loginPOM.addCategoryAndTrainingSession();
		loginPOM.sessionName("selenium training session");
		loginPOM.toAddTrainingSession();
		//loginPOM.addCoachName("admin"); 
		  Actions act= new Actions(driver);
//		  //act.sendKeys(Keys.TAB).build().perform();
//		  
//		  act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		 // loginPOM.sendCoachName("admin"); 
//		  act.sendKeys(Keys.ENTER).build().perform();
		 Thread.sleep(50000);
		 WebElement CoachNameTextBox = driver.findElement(By.xpath("//*[@class='select2-search__field']"));
		 act.moveToElement(CoachNameTextBox).click().build().perform();
		  
		 
		
		screenShot.captureScreenShot("First");
	}
//	@Test
//	public void createSession() throws InterruptedException{
//		driver.navigate().to("http://elearning.upskills.in/index.php");
//		driver.findElement(By.name("login")).sendKeys("admin");
//		driver.findElement(By.name("password")).sendKeys("admin@123");
//		Thread.sleep(1000);
//		driver.findElement(By.name("submitAuth")).click();
//		Thread.sleep(3000);
//		Actions act= new Actions(driver);
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		Thread.sleep(3000);
//		 driver.findElement(By.xpath("//*[@id='tabs-4']/div/div[2]/div[2]/ul/li[3]/a")).click();
//		 Thread.sleep(1000);
//		 driver.findElement(By.xpath("//*[@id='cm-content']/div/div[2]/div/div[1]/a[1]/img")).click();
//		 Thread.sleep(2000);
//		 driver.findElement(By.name("name")).sendKeys("testing");
//		Thread.sleep(1000);
//		 driver.findElement(By.xpath("//*[@id='cm-content']/div/div[2]/div/form/div[4]/div[1]/button")).click();
//		 Thread.sleep(1000);
//		 driver.findElement(By.xpath("//*[@id='cm-content']/div/ul/li[1]/a")).click();
//		 Thread.sleep(1000);
//		 driver.findElement(By.xpath("//*[@id='cm-content']/div/div[2]/a[1]")).click();
//		 driver.findElement(By.name("name")).sendKeys("selenium training session");
//		 Thread.sleep(1000);
//		 driver.findElement(By.xpath("//*[@id='advanced_params']")).click();	
//		 
//		 
//		 WebElement dd= driver.findElement(By.name("session_category")); 
//			Select sc = new Select(dd);
//		 List<WebElement> values = sc.getOptions();
//			System.out.println(values.size());
//			for(int i=0 ; i<values.size();i++ )
//			{
//				// To get all the values.
//				//System.out.println(values.get(i).getText()); //or
//				String value = values.get(i).getText();
//				System.out.println(value);
//				
//			}
//			sc.selectByVisibleText("Testing");
//			driver.findElement(By.xpath("//*[@id='add_session_submit']")).click();
//			
//		
//		
//		
//	}
//	
	
}
