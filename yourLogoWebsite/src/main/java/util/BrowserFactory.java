package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
static WebDriver driver;

public static WebDriver startBrowser() {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://automationpractice.com/index.php");
	
	return driver;
}

	

}
