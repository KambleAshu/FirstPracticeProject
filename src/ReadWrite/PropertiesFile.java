package ReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFile {
	static WebDriver driver ;
	public static void main (String[]args) throws IOException {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Selinium\\chromedriver.exe");
		    driver = new ChromeDriver();
		    
		  File path =  new File("C:\\Users\\vikram\\Desktop\\New folder (2)\\Eclipse\\TheAllNewASHU\\Sele+Apache+TestNG\\Conflig.propeties");
		    FileInputStream loginthefile =new FileInputStream(path);
		    Properties prop = new Properties();
		    prop.load(loginthefile);
		    
		    driver.get(prop.getProperty("its_URL"));
		    driver.manage().window().maximize();
	}

}
