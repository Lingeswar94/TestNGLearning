package TestNGLearning;

import org.testng.annotations.Test;

public class GroupTest {
	@Test(groups = {"Apple"})
	public void apple1() {
		System.out.println("Group is Apple");
	}
	@Test(groups = {"Apple"})
	public void apple2() {
		System.out.println("Group is Apple1");
	}
	@Test(groups = {"Moto"})
	public void Moto1() {
		System.out.println("Group is Moto1");
	}
	@Test(groups = {"Moto"})
	public void Moto2() {
		System.out.println("Group is Moto2");
	}
	@Test(groups = {"Vivo"})
	public void Vivo1() {
		System.out.println("Group is Vivo1");
	}
	@Test(groups = {"Vivo"})
	public void Vivo2() {
		System.out.println("Group is Vivo2");
	}
}
