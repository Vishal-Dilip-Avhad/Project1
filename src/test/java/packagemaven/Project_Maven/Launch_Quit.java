package packagemaven.Project_Maven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_Quit {
	WebDriver driver;

	@BeforeMethod
	public void launch() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
	}

	@AfterMethod
	public void quit() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
