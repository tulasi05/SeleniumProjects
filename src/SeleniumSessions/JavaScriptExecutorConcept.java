package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException, IOException {


       
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tulas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		//WebDriver driver = new HtmlUnitDriver();
		
		//driver.manage().window().maximize();   //maximize window
		driver.manage().deleteAllCookies();   // delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com");
		
		driver.findElement(By.name("username")).sendKeys("tulasi80");  
		driver.findElement(By.name("password")).sendKeys("Murari#123"); 
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();  // Self Declared xpath
		
	
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));  // login button
		flash(loginBtn, driver);  //  highlight the element
		
		drawBorder(loginBtn, driver); // draw a border
		// Take screenshot and store as a file format
		   File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 //now copy the screenshot to desired location using copyfile //method
		 FileUtils.copyFile(src, new File("D:\\eclipse-workspace\\SeleniumProjects\\src\\SeleniumSessions\\element.png"));
			
		 // generate Alerts
		 //generateAlert(driver,"There is an issue with Login button on Login page");
		 
		 
		 //click on any element by using JS executor
		 //clickElementByJS(loginBtn, driver);
		 
		 // Refresh the page by using Selenium
		 
		 driver.navigate().refresh();
		 
		 // Refresh the page using Java Script 
		 refreshBrowserByJS(driver);
		 
		 // Get titleof the page by JS
		 System.out.println(getTitleByJS(driver));
		 
		 // Get the page text;
		 System.out.println(getPageInnerText(driver));
		 
		 //scroll page down:
		// scrollPageDown(driver);
		 
		// Forgot password link 
		 WebElement forgotPwdLink = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));
		 scrollIntoView(forgotPwdLink, driver);
		 
		
	}
         // This method will highlight the login button default to green color
	     // If you want to highlight anything you can use the java script
	
	 	public static void flash(WebElement element, WebDriver driver) {
	 		JavascriptExecutor js = ((JavascriptExecutor) driver);
	 		String bgcolor = element.getCssValue("backgroundColor");
	 		for (int i = 0; i < 10; i++) {
	 			changeColor("rgb(0,200,0)", element,driver); //1
	 			changeColor(bgcolor, element,driver); //2
	 		}
	 	}
	 	
         // Change color by JS
	 	
	 	public static void changeColor(String color, WebElement element, WebDriver driver) {
	 		JavascriptExecutor js = ((JavascriptExecutor) driver);
	 		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
	 		
	 		try {
	 		
	 			Thread.sleep(20);
	 		} catch (InterruptedException e) {


	 	}
	 	}
	 	
	 	
	 	// highlight the login button with solid red color 
	 	
	 	public static void drawBorder(WebElement element, WebDriver driver) {
	 		JavascriptExecutor js = ((JavascriptExecutor) driver);
	 		js.executeScript("arguments[0].style.border = '3px solid red'", element);
	 	}
	     
	 	// Generate Alert by JS
	 	
	 	public static void generateAlert(WebDriver driver, String message) {
	 		JavascriptExecutor js = ((JavascriptExecutor)driver);
	 		js.executeScript("alert('"+message+"')");
	 	}
	 	// Clicking Element by JS
	 	public static void clickElementByJS(WebElement element, WebDriver driver) {
	 		JavascriptExecutor js = ((JavascriptExecutor) driver);
	 		js.executeScript("arguments[0].click();", element);
	 	}

	 	// Refresh Browser by JS
	 	public static void refreshBrowserByJS(WebDriver driver) {
	 		JavascriptExecutor js = ((JavascriptExecutor) driver);
	 		js.executeScript("history.go(0)"); // First history refresh

	 	}
	 	
	 	// Get Title of the browser	 by JS	
	 	public static String getTitleByJS(WebDriver driver) {
	 		JavascriptExecutor js = ((JavascriptExecutor) driver);
	 		String title = js.executeScript("return document.title;").toString(); // Get Title JS
	 		return title;

	 	}

        // Get Title in Test box
	 	
	 	public static String getPageInnerText(WebDriver driver) {
	 		JavascriptExecutor js = ((JavascriptExecutor) driver);
	 		String pageText = js.executeScript("return document.documentElement.innerText;").toString(); // Get Title JS
	 		return pageText;
	 	}
	 	
	 // Get Scroll page
	 	
	 	 	public static void scrollPageDown(WebDriver driver) {
	 	 		JavascriptExecutor js = ((JavascriptExecutor) driver);
	 	 		js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // Scroll window JS
	 	 		}
	 	// Get Scroll page
		 	
	 	 	public static void scrollIntoView(WebElement element, WebDriver driver) {
	 	 		JavascriptExecutor js = ((JavascriptExecutor) driver);
	 	 		js.executeScript("arguments[0].scrollIntoView(true);",element); // Scroll window and find the link JS
	 	 		
	 	 	}
}