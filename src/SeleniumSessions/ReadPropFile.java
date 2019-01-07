package SeleniumSessions;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("D:\\eclipse-workspace\\SeleniumProjects\\src\\SeleniumSessions\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("age"));
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		
		System.out.println(browserName);
		
		
		if(browserName.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tulas\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver(); //launch chrome
		
		} else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\tulas\\Downloads\\geckodriver-v0.22.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			
		} else if(browserName.equals("IE")){
			System.setProperty("webdriver.ie.driver","C:\\Users\\tulas\\Downloads\\chromedriver_win32\\internetexplorer.exe");
			driver = new InternetExplorerDriver();
			
			
		} 
		
		driver.get(url);
		
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstName"));
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastName"));
		driver.findElement(By.xpath(prop.getProperty("city_xpath"))).sendKeys(prop.getProperty("city"));
		driver.findElement(By.xpath(prop.getProperty("adr1_xpath"))).sendKeys(prop.getProperty("address1"));
		driver.findElement(By.xpath(prop.getProperty("adr2_xpath"))).sendKeys(prop.getProperty("address2"));
		driver.findElement(By.xpath(prop.getProperty("state_xpath"))).sendKeys(prop.getProperty("state50"));
		
        //String stateName50= prop.getProperty("state50");
		//System.out.println(stateName50);
		System.out.println(prop.getProperty("state50"));
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("state_xpath"))).sendKeys(prop.getProperty("state1"));
		System.out.println(prop.getProperty("state1"));
		

		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("state_xpath"))).sendKeys(prop.getProperty("state3"));
		System.out.println(prop.getProperty("state3"));
		
		driver.findElement(By.xpath(prop.getProperty("zip_xpath"))).sendKeys(prop.getProperty("zip"));
		
		driver.findElement(By.xpath(prop.getProperty("ph1_xpath"))).sendKeys(prop.getProperty("ph1"));
		driver.findElement(By.xpath(prop.getProperty("ph2_xpath"))).sendKeys(prop.getProperty("ph2"));
		driver.findElement(By.xpath(prop.getProperty("ph3_xpath"))).sendKeys(prop.getProperty("ph3"));
		driver.findElement(By.xpath(prop.getProperty("extn_xpath"))).sendKeys(prop.getProperty("extn"));
		driver.findElement(By.xpath(prop.getProperty("email1_xpath"))).sendKeys(prop.getProperty("email1"));
		driver.findElement(By.xpath(prop.getProperty("re_email_xpath"))).sendKeys(prop.getProperty("re_email"));
		
		
		//driver.quit();  // Quit the  browser
	}

}
