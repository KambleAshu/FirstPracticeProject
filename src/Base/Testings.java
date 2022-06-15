package Base;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testings {
	

	@Test 
	public void testCaseA() {
		System.out.println(" Q A");
		Assert.assertEquals(false,true );
	
	}
	
	@Test(dependsOnMethods="testCaseA",alwaysRun=true)
	public void testCaseB() {
		System.out.println("  DEV ");
		Assert.assertEquals(false,true );
	}
	


}



