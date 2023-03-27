package TestNGLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTestNG {

	@Test
	public void openChrome() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.navigate().to("http://google.co.in/");
		driver.quit();
	}
	@Test
	public void openBing() {
		ChromeOptions option1 = new ChromeOptions();
		option1.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(option1);
			driver.navigate().to("http://bing.com/");
			driver.quit();
		}
	
}
