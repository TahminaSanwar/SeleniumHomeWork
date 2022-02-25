package hw14JavaSeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_getText_method {
	

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

	@Test(enabled = true, priority = 1)
	public void getTextTest() {
		WebElement joinNow = driver.findElement(By.xpath("//a[text()='Join Now']"));
		System.out.println("The text of this web element is: "+ joinNow.getText());
	}

	
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
