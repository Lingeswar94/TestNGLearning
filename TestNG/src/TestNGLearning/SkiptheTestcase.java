package TestNGLearning;

import org.testng.annotations.Test;

public class SkiptheTestcase {

	
	@Test(priority = 0)
	public void Startthecar() {
		System.out.println("Car is Started");
	}
	@Test(priority = 1)
	public void Putfirstgear() {
		System.out.println("Car is running in First gear");
	}
	@Test(priority =2 ,enabled = false)
	public void music() {
		System.out.println("Music is on");
	}
	@Test(priority = 3)
	public void Putsecondgear() {
		System.out.println("Car is running in Second gear");
	}
	@Test(priority = 4)
	public void Putthirdgear() {
		System.out.println("Car is running in Third gear");
	}
}
