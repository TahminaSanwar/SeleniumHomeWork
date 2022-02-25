package hw14JavaSeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_isDisplayed_getTitle_methods {

	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanwa\\eclipse-workspace2\\SeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.costco.com/");
		Thread.sleep(4000);

	}

	@Test(enabled = true, priority = 2)
	public void logoTest() {
		boolean elementDisplayed = driver.findElement(By.xpath("//div[@id='accountMenu']")).isDisplayed();
		System.out.println("Is the logo displayed? Ans: " + elementDisplayed);
	}

	@Test(enabled = true, priority = 1)
	public void titleTest() {
		System.out.println("The Title of the page is: "+driver.getTitle());
	}
	
	
	
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
