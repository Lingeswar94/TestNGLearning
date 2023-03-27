package TestNGLearning;

import org.testng.annotations.Test;

public class Dependencies {

	@Test(enabled = true)
	public void Highschool() {
		System.out.println("High School");
	}

	@Test(dependsOnMethods = "Highschool")
	public void Highersecondary() {
		System.out.println("Higher Secondary");
	}

	@Test(dependsOnMethods = "Highersecondary")
	public void UG() {
		System.out.println("Colleage");
	}
}
