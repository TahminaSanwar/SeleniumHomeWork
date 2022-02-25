package hw17JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Use_of_headless_browser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanwa\\eclipse-workspace2\\SeleniumPractice\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--headless");		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://dmv.vermont.gov/RegistrationNew");
		Thread.sleep(4000);	
		driver.findElement(By.id("block-block-27")).click();
		Thread.sleep(5000);
		System.out.println("The Current URL is: "+driver.getCurrentUrl());	
		driver.quit();
	}
}
