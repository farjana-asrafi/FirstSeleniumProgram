package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Palak\\eclipse-workspace\\FirstSeleniumProgram\\driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();;
			driver.close();

		}

}
