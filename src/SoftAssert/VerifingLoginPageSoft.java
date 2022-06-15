 package SoftAssert;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class VerifingLoginPageSoft {
	public static WebDriver driver; 
	@BeforeSuite
	public void browserlaunch() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Selinium\\chromedriver.exe");
	    driver  = 	new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	    driver.manage().window().maximize();
}
	
	@Test
	public void VeifyTitlraofLoginPage() {
		String Title=driver.getTitle();
    Assert.assertEquals(Title, "OrangeHRM","TITLEVERIFY");
    System.out.println("It Is Correct");
		
	}
	
	@Test
	public void VerifyURLOfLoginPage() {
		String URL= driver.getCurrentUrl();
		SoftAssert ok = new SoftAssert();
		ok.assertEquals(URL, "https://opensource-demo.orangehrmlive.com/index.php/auth/login","it is URL");
		System.out.println("Its Correct");
		ok.assertAll();
		
       
		
		
		
}
	@AfterSuite
	public void terminate() {
		driver.quit();
	}
		
	
		
		
		
		
		
	}


