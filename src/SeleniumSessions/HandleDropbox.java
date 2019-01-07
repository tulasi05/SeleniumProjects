package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tulas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details"); //enter url
		
		
		// Handle Dropbox
		
		Select select = new Select(driver.findElement(By.id("country")));
		select.selectByVisibleText("Austria");
		//select.deselectByVisibleText("Austria");
		select.selectByVisibleText("Canada");
		//select.deselectByVisibleText("Canada");
		select.selectByVisibleText("Italy");
		
		

	}

}
