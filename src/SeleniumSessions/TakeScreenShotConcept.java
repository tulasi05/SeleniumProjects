package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotConcept {

	
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tulas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
			
		driver.manage().window().maximize();  // maximize window
		driver.manage().deleteAllCookies();  // delete all cookies
				// Dynamic wait
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  // once page fully loaded wait for 30 seconds it will wait for go button 30 seconds

		driver.get("http://www.google.com"); //enter url
		
		
		// Take screenshot and store as a file format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//now copy the screenshot to desired location using copyfile //method
		FileUtils.copyFile(src, new File("D:\\eclipse-workspace\\SeleniumProjects\\src\\SeleniumSessions\\google.png"));
		
		

	}

	

}
