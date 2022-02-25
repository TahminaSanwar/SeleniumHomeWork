package hw13JavaSeleniumMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UseOfMethods {

	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanwa\\eclipse-workspace2\\SeleniumPractice\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.bankofamerica.com/");
	Thread.sleep(4000);
	
	}

	@Test
	public void enrollNowBottonTest() throws InterruptedException {

		driver.findElement(By.xpath("//a[@id='enroll']")).click();
		Thread.sleep(6000);

	}

	@AfterTest
	public void tearUp() {
		driver.quit();

	}

}
