package hw17JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_javaScriptExecutor_for_click_sendKeys {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/C:\\Users\\sanwa\\eclipse-workspace2\\SeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
		
	}
	
	@Test(enabled = true, priority =1 )
	public void searchButtonTest() throws InterruptedException {
		WebElement searchField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Refrigerator' ", searchField);
		Thread.sleep(4000);
		js.executeAsyncScript("arguments[0].click()", searchButton);
		Thread.sleep(4000);
	}

	
	
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}