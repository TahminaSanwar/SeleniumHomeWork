package hw14JavaSeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_getCurrentUrl_Method {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanwa\\eclipse-workspace2\\SeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(
				"https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_467/oauth2/v2.0/authorize?ClientName=USBC&ui_locales=en-US&scope=openid&response_type=id_token&redirect_uri=https%3A%2F%2Fwww.costco.com%2FOAuthLogonCmd&state=toYear%3D2022%26fromYear%3D2021%26toMonth%3D0%26fromMonth%3D7%26URL%3D%5BSSO%5DOrderStatusCmd%3F%5BSSO%5D&nonce=C69enkRXGQ1pQuTK&client_id=4900eb1f-0c10-4bd9-99c3-c59e6c1ecebf&TC=0&response_mode=form_post");
		Thread.sleep(4000);
	}

	@Test(enabled = true, priority = 1)
	public void currentURLTest() throws InterruptedException {
		driver.findElement(By.id("newToCostco")).click();
		Thread.sleep(5000);
		System.out.println("The Current URL is: " + driver.getCurrentUrl());
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
