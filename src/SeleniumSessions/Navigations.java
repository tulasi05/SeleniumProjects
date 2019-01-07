package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
      
		//get() vs. navigate().to()

		System.setProperty("webdriver.chrome.driver","C:\\Users\\tulas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
			
		
		
		

		driver.manage().window().maximize();  // maximize window
		driver.manage().deleteAllCookies();  // delete all cookies
		
		// Dynamic wait
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  // once page fully loaded wait for 30 seconds it will wait for go button 30 seconds

		driver.get("http://www.google.com"); //enter url
		driver.navigate().to("http://www.amazon.com");
		
		
		//back and forward button simulation:
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		
		
		
	}

}
