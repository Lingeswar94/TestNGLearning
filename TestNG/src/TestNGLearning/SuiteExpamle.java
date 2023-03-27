package TestNGLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuiteExpamle {
	WebDriver driver =null;
	long Starttime;
	long endtime;

	@BeforeSuite
	public void launchBrowser() {
		Starttime = System.currentTimeMillis();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver(option);
	}

	@Test
	public void google() {
		driver.navigate().to("https://google.co.in/");

	}

	@Test
	public void bing() {
		driver.navigate().to("https://bing.com/");
	}
	@Test
	public void yahoo() {
		driver.navigate().to("https://yahoo.com/");

	}

	@Test
	public void closeBrowser() {
		//driver.quit();
		endtime = System.currentTimeMillis();
		long Totaltime = endtime - Starttime;
		System.out.println("Total Time is" + Totaltime);
	}
}
