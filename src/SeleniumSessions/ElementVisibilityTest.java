package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\tulas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		//WebDriver driver = new HtmlUnitDriver();
		
		//driver.manage().window().maximize();   //maximize window
		driver.manage().deleteAllCookies();   // delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/register/");
		
		//1. isDisplayed() method: applicable for all the elements
		boolean b1 = driver.findElement(By.id("submitButton")).isDisplayed(); // for submit button
		System.out.println(b1);  //true
		
		//2. isEnabled() method: applicable for all the elements
		boolean b2 = driver.findElement(By.id("submitButton")).isEnabled(); // for submit button
		System.out.println(b2); //false
		
		//2.1. select I Agree checkbox:
		driver.findElement(By.name("agreeTerms")).click(); //--submit button is enabled now		
		boolean b4 = driver.findElement(By.id("submitButton")).isEnabled(); // for submit button
		System.out.println(b4); //true
				
		//3. isSelected() method: Only applicable for checkbox, dropdown, radio button
		boolean b3 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b3); //true
		
		//3.1. de-select "I Agree" checkbox:
		driver.findElement(By.name("agreeTerms")).click();
		boolean b5 = driver.findElement(By.id("submitButton")).isSelected(); // for submit button
		System.out.println(b5); //false
				
		
		/*driver.findElement(By.name("username")).sendKeys("tulasi80");  
		driver.findElement(By.name("password")).sendKeys("Murari#123"); 
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();  // Self Declared xpath
		
	
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));  // login button
		flash(loginBtn, driver);  //  highlight the element
	*/
	}

}
