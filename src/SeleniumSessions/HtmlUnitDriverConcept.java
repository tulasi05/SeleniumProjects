package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\tulas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver(); //launch chrome
		
		//html unitdriver is not available in Selenium 3.x version
		//htmlunitdriver  -- to use this concept, we have to download htmlunit driver JAR file
		
		
		//advantages:
		
		//1. testing is happening behind the scene -- no browser is launched
		//2. Very fast -- execution of test cases -- very fast -- performance of the script
		// 3. not suitable for Actions class -- user actions  --- mousemovement, doubleClick, drag and drop
		// 4. Ghost Driver -- Headless browser
		
		    //-- HtmlUnit Driver  -- Java
		   //---PhantomJS -- JavaScript
		
		
		
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize();   //maximize window
		driver.manage().deleteAllCookies();   // delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com");
        
		System.out.println("Before login title is =="+driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("tulasi80");  //naveenk
		driver.findElement(By.name("password")).sendKeys("Murari#123"); //test@123
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		System.out.println("After login title is =="+driver.getTitle());

		
	}

}
