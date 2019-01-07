package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. FireFox browser
		//geckodriver  
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\tulas\\Downloads\\geckodriver-v0.22.0-win64\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver","/Users/tulas/Downloads/geckodriver-v0.22.0-win64");
		//Webdriver driver = new FirefoxDriver(); //launch FF
		
		
		//2. Chrome browser
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tulas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.get("http://www.google.com"); //enter url
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		//validation point : Actual vs. expected
		if(title.equals("Google")){
			System.out.println("correct title");			
		}
		else {
			System.out.println("In - correct");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		driver.quit();  // Quit the  browser
		
		//How to launch Safari Browser
		
		
		
		
		
	}

}
