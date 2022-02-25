package hw14JavaSeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_isSelected_method {
	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanwa\\eclipse-workspace2\\SeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.bankofamerica.com/");
		Thread.sleep(4000);
	}

	@Test (enabled=true, priority = 1)
	public void loginButtonTest(){
		boolean checkBox =	driver.findElement(By.id("passcodeContainer")).isSelected();
		System.out.println("Is the check Box Selected? Ans: "+checkBox);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
