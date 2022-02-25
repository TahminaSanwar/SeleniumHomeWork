package hw16JavaSeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_testAlart_accept_dismiss_switchToAlart_methods {
	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanwa\\eclipse-workspace2\\SeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		Thread.sleep(4000);

	}

	@Test(enabled = true, priority = 1)
	public void alertTest() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(4000);
		alert.accept();

	}

	@Test(enabled = true, priority = 2)
	public void alartDismiss() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	@AfterTest

	public void tearUp() {
		driver.quit();

	}
}