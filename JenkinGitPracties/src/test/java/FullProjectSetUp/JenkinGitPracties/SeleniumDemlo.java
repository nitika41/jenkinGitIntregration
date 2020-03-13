package FullProjectSetUp.JenkinGitPracties;



import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class SeleniumDemlo {

	static WebDriver driver;

	@Test
	public static void browserLaunching() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Piyush\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement SerchTextBox = driver.findElement(By.xpath("//input[@type='text']"));

		SerchTextBox.sendKeys("testing practices");
		Thread.sleep(1000);
		int i = 1;

		while (i <= 5) {
			SerchTextBox.sendKeys(Keys.DOWN);
			i++;
		}

		SerchTextBox.sendKeys(Keys.ENTER);
		driver.close();
		
	}

}
