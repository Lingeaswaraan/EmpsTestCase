package emps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	static WebDriver driver ;
	
	public static void initializeDriver() {
		System.setProperty("webdriver.chrome.driver", "/home/promantus/eclipse-workspace/Allurereports/exe/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS );
	}
	public static WebDriver getDriver() {
		return driver;
	}
	
}
