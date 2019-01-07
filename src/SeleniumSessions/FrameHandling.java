package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\tulas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,  TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html");
		
		System.out.println("Before login title is =="+driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys("naveenk");  //naveenk
		driver.findElement(By.name("password")).sendKeys("test@123"); //test@123
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		System.out.println("After login title is =="+driver.getTitle());
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		

		//driver.switchTo().frame("leftpanel");
		Thread.sleep(2000);
		//driver.findElement(By.name("Logout")).click();
		//driver.findElement(By.linkText("Logout")).click();
		//<a href="https://www.freecrm.com/index.cfm?logout=1" class="topnavlink"><i class="fa fa-sign-out icon-2x"></i> &nbsp; Logout &nbsp; </a>
		
		
		//*[@id="navmenu"]/ul/li[4]/a
		
		//*[@id="navmenu"]/ul/li[4]/a
	}

}
