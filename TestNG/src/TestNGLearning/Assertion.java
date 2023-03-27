package TestNGLearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
String name ="Agni";
	@Test
	public void checkequal() {
		
		/*
		 * if(name.equalsIgnoreCase("Agni")) {
		 * System.out.println("The String is equal"); }else {
		 * System.out.println("Not Equal"); }
		 */
			
		Assert.assertEquals(name, "Agni");
	}
	
}
