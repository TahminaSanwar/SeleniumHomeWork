package hw16JavaSeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class use_of_close_selectByIndex_selectByValue_selectByVisibleText_methods {
	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\sanwa\\eclipse-workspace2\\SeleniumPractice\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		Thread.sleep(4000);
		// Thread.sleep
	}

	@Test(enabled = true, priority = 1)

	public void selectByIndexTest() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select select = new Select(dropdown);
		select.selectByIndex(10);
		Thread.sleep(5000);
	}

	@Test(enabled = true, priority = 2)

	public void selectByVisibleTextTest() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Books");
		Thread.sleep(5000);

	}

	@Test(enabled = true, priority = 3)

	public void selectByValueTest() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select select = new Select(dropdown);
		select.selectByValue("625");
		Thread.sleep(5000);

	}

	@AfterTest

	public void tearUp() {
		driver.close();

	}
	
}
