package hw15JavaSeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_navigate_to_back_forward_refresh_methods {

	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\sanwa\\eclipse-workspace2\\SeleniumPractice\\driver\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.buybuybaby.com/");
	Thread.sleep(4000);
	
	}
	


@Test(enabled=true,priority=1)

public void userNameFieldTest() throws InterruptedException {
	driver.navigate().to("https://www.ebay.com/");
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
}



    @AfterTest
    
    public void tearUp() {
	driver.quit();
	
}

}



