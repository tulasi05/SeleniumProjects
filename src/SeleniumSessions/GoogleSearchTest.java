package SeleniumSessions;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tulas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome

				driver.manage().window().maximize(); // maximize window
				driver.manage().deleteAllCookies(); // delete all the cookies

				// dynamic wait
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//				driver.get("https://www.yahoo.com/"); // enter URL
//				
//				driver.findElement(By.id("uh-search-box")).sendKeys("testing");
//				
//				
//
//				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
                driver.get("https://www.google.com/"); // enter URL
				
                driver.findElement(By.cssSelector(".gLFyf")).sendKeys("java");
				//System.out.println(x);
                
              List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class ='sbl1']")); // //ul[@role='listbox'] -- parent //li -- child
               
               System.out.println("total numebr of suggestions in search box :::===."+ list.size());
               
               for(int i=0; i<list.size(); i++) {
                System.out.println(list.get(i).getText());
                if(list.get(i).getText().contains("java tutorial")) {
                	list.get(i).click();
                	break;
                }
               }
               
	}

}
