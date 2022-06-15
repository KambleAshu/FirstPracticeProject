package Grouping;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Two {
	
	@Test(priority = 4 ,  groups="sanity"   )
	public void anothoerclassmTCno1(){
		System.out.println("ok ");

}

	
	@Test(priority = 5 , groups="regression "  )
	public void anothoerclassmTCno2(){
		System.out.println("fine ");

}

}
