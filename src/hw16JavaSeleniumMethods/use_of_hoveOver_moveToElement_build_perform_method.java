package hw16JavaSeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class use_of_hoveOver_moveToElement_build_perform_method {

	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\sanwa\\eclipse-workspace2\\SeleniumPractice\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.bankofamerica.com/");
		Thread.sleep(4000);
	}

	@Test(enabled = true, priority = 1)

	public void hoveObverActionOnSignInTest() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement homeLoanElement = driver.findElement(
				By.xpath("//span[contains(text(),'Collapsed')and@class='ada-hidden ada-expand-collapse']"));
		actions.moveToElement(homeLoanElement).build().perform();
		Thread.sleep(4000);
	}

	@AfterTest

	public void tearUp() {
		driver.close();
	}
}