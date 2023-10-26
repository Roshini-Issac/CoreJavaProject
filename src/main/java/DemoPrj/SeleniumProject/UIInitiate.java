package DemoPrj.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UIInitiate extends Palindrome {

	public ChromeOptions chromeOptions() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		return options;
	}

	/**
	 * @category Demo Test
	 */
	@Test
	public void Test() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resource/Drivers/chromedriver.exe");
		ChromeOptions options = chromeOptions();
		WebDriver driver = null;

		WebDriverManager.chromedriver().version("87.0.4280.88").setup();
		driver = new ChromeDriver();

		driver.quit();
	}
}
