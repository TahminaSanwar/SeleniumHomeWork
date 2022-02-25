package hw15JavaSeleniumMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Use_of_maximize_fullScreen_deleteAllCookies_setSize_getSize_methods {

	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\sanwa\\eclipse-workspace2\\SeleniumPractice\\driver\\geckodriver.exe");
	driver=new FirefoxDriver();
	
	}
	
		
    @Test(enabled=true,priority=2)
	
    public void maximizeWindowTest() throws InterruptedException {
    driver.get("https://www.buybuybaby.com/");	
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
    }
    
	
    @Test(enabled=true,priority=1)
	
    public void fullScreenTest() throws InterruptedException {
    driver.get("https://www.buybuybaby.com/");	
	driver.manage().window().fullscreen();
	Thread.sleep(4000);
    }
    
    @Test(enabled=true,priority=3)
	
    public void deleteAllCookies() throws InterruptedException {
	//driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
    driver.get("https://www.buybuybaby.com/");
	Thread.sleep(4000);
    }


    @Test(enabled=true,priority=4)

     public void setSpecificsizeOfWindow() throws InterruptedException {
	 Dimension dimension = new Dimension(400, 500);
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     driver.get("https://www.buybuybaby.com/");
     Thread.sleep(4000);
     //driver.manage().window().maximize();
     //Thread.sleep(4000);
     driver.manage().window().setSize(dimension);
     Thread.sleep(4000);

}
    
    @Test(enabled=true,priority=5)

    public void getWindowSize() throws InterruptedException {
    driver.get("https://www.buybuybaby.com/");
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    System.out.println("The size of the Window is:"+driver.manage().window().getSize());
    Thread.sleep(4000);
    
    }
    
@AfterTest
    
    public void tearUp() {
	driver.quit();
	

    }



}

    
    
    
