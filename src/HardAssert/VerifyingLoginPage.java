package HardAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class VerifyingLoginPage {
	public static WebDriver driver ;
	
	@BeforeSuite
	public void browserlaunch() {
		    System.setProperty("webdriver.chrome.driver", "C:\\Selinium\\chromedriver.exe");
		    driver  = 	new ChromeDriver();
		    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		    driver.manage().window().maximize();
	}
		    @Test
		    public void verifytitleofloginpage() {
		    	String title=driver.getTitle();
		    	
		    	Assert.assertEquals(title,"OHM","verifytitleofloginpage");
		    	Reporter.log("verifyingtitlepage",true);
		    	System.out.println("NextLogicInTitleCeckingTest");
		    	
		    }
		 @Test 
		 public void verifinghomepageafterlogin() {
			 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			 driver.findElement(By.id("btnLogin")).click();
			String texttoverify = driver.findElement(By.xpath("//*[@id='content']//h1[text()='Dashboard']")).getText();
			 Assert.assertEquals(texttoverify,"Dashboard","verifinghomepageafterlogin");
			 System.out.println("Next Logic After Login");
		 }
		 
		@AfterSuite
		public void teardown() {
			driver.close();
			
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
		 }
	
	
	}
	
	
	
	
	
	
	


