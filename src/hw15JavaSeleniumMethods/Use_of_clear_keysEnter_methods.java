package hw15JavaSeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_clear_keysEnter_methods {
	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\sanwa\\eclipse-workspace2\\SeleniumHomeWork\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.buybuybaby.com/store/account/Login");
		Thread.sleep(4000);

	}

	@Test(enabled = true, priority = 1)

	public void logInInfoTest() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='signin-email']")).sendKeys("lima624@yahoo.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='signin-password']")).sendKeys("IloveBangladesh", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='signin-email']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='signin-password']")).clear();
		Thread.sleep(3000);

	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
