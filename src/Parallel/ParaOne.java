package Parallel;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParaOne {
	
	
	public static WebDriver driver; 
	@BeforeSuite (groups={"sanity","regression","unique"})
	public void browserlaunch() {
	   WebDriverManager.chromedriver().setup();
	    driver  = 	new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	    driver.manage().window().maximize();
}
	
	@Test(priority = 1 , groups="sanity" )
	public void VeifyTitlraofLoginPage() {
		String Title=driver.getTitle();
    Assert.assertEquals(Title, "OrangeHRM","TITLEVERIFY");
    System.out.println("It Is Correct");
		
	}
	
	@Test(priority = 0 , groups="sanity"  )
	public void VerifyURLOfLoginPage() {
		String URL= driver.getCurrentUrl();
		SoftAssert ok = new SoftAssert();
		ok.assertEquals(URL, "https://opensource-demo.orangehrmlive.com/index.php/auth/login","it is URL");
		System.out.println("Its Correct");
		ok.assertAll();
		
	}
		@Test(priority = 3 , groups="regression")
		public void afrte() {
			System.out.println("after");
		
		}
		
		@Test(priority = 9 , groups="unique")
		public void afrter() {
			System.out.println("I LOVE MOM DAD");
		
		}


	@AfterSuite (groups={"sanity","regression","unique"}) 
	public void terminate() {
		driver.quit();
	}
		
	

}
