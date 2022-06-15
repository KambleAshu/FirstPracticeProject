package XML;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestONE {
	public static WebDriver driver; 
	@BeforeSuite
	public void browserlaunch() {
	   WebDriverManager.chromedriver().setup();
	    driver  = 	new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	    driver.manage().window().maximize();
}
	
	@Test
	public void VeifyTitlraofLoginPage() {
		String Title=driver.getTitle();
    AssertJUnit.assertEquals(Title, "ORM","TITLEVERIFY");
    System.out.println("It Is Correct ONE");
		
	}
	
	@Test
	public void VerifyURLOfLoginPage() {
		String URL= driver.getCurrentUrl();
		SoftAssert ok = new SoftAssert();
		AssertJUnit.assertEquals(URL, "https://opensource-demo.orangehrmlive.com/index.php/auth/login","it is URL");
		System.out.println("Its Correct TWO");
		
		ok.assertAll();
	}
		
		@Test 
		public void VerifyingPageAfrerLogin() {
	String	DashBoard	= driver.findElement(By.xpath("//div[@class='box']//div//h1")).getText();
	SoftAssert soft = 	new SoftAssert();
	soft.assertEquals(soft,"DBRD","DashboardVERIFY");
	System.out.println("Its Correct THREE");
	soft.assertAll();
		}
		
       
		
		
		

	@AfterSuite
	public void terminate() {
		driver.quit();
	}
		
	
		
		
		
		

}
