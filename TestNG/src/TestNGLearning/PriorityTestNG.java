package TestNGLearning;

import org.testng.annotations.Test;

public class PriorityTestNG {

	@Test(priority = 0)
	public void Startthecar() {
		System.out.println("Car is Started");
	}
	@Test(priority = 1)
	public void Putfirstgear() {
		System.out.println("Car is running in First gear");
	}
	@Test(priority = 2)
	public void Putsecondgear() {
		System.out.println("Car is running in Second gear");
	}
	@Test(priority = 3)
	public void Putthirdgear() {
		System.out.println("Car is running in Third gear");
	}
		
}
