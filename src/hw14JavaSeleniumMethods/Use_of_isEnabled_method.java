package hw14JavaSeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_isEnabled_method {

	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanwa\\eclipse-workspace2\\SeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(
				"https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_467/oauth2/v2.0/authorize?ClientName=USBC&ui_locales=en-US&scope=openid&response_type=id_token&redirect_uri=https%3A%2F%2Fwww.costco.com%2FOAuthLogonCmd&state=URL%3D%5BSSO%5D%2F%5BSSO%5D&nonce=L3IER1oZbjoSQrgU&client_id=4900eb1f-0c10-4bd9-99c3-c59e6c1ecebf&TC=0&response_mode=form_post");
		Thread.sleep(4000);
	}

	@Test(enabled = true, priority = 1)
	public void creatAccountTest() throws InterruptedException {
		boolean buttonEnabled = driver.findElement(By.xpath("//a[@id='createAccount']")).isEnabled();
		System.out.println("Is the Button Enable? Ans: " + buttonEnabled);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
