package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\tulas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.get("https://www.crunchbase.com/register"); //enter url
		
		//1. xpath: Priority 2
		//absolute xpath should not be used .. html/body/div[1]/div[5]/div[2]/a
		// only relative xpath should be used ...  //*[@id=\"mat-input-4\"] 
		
	//	driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("Harshith@gmail.com");
	//	driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("Harshith");
	//	driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys("Potnuru");
	//	driver.findElement(By.xpath("//*[@id=\"mat-input-7\"]")).sendKeys("Boy");
	//	driver.findElement(By.xpath("//*[@id=\"mat-input-8\"]")).sendKeys("Boys");
		
		
		
		//2. id:  Priority 1
		
		driver.findElement(By.id("mat-input-4")).sendKeys("krish@gmail.com");
		driver.findElement(By.id("mat-input-5")).sendKeys("Krish");
		driver.findElement(By.id("mat-input-6")).sendKeys("Potnuru");
		
		//3. name: priority 3
		
	//	driver.findElement(By.name("email")).sendKeys("kanna@gmail.com");
	//	driver.findElement(By.name("firstName")).sendKeys("Kanna");
	//	driver.findElement(By.name("lastName")).sendKeys("Potnuru");
		
		// 4. LinkText - This is recomended 		priority 1
		
		//driver.findElement(By.linkText("Terms of Use")).click();
		//driver.findElement(By.linkText("Privacy Policy")).click();
		
		
		// 5. partial linktest  Not recomeneded
		//driver.findElement(By.partialLinkText("Oath ")).click();
		
		// 6. CSSSelector: Priority 2
		 // if id is there ---- # [id]
		//if class is there --.[class]
			//	driver.findElement(By.cssSelector("#mat-input-5")).sendKeys("Kanna");
				
		// 7. Class: not recommended Priority 4
		
		     // driver.findElement(By.className("mat-input-element mat"")).sendKeys("Kanna");
		
		//<input autocomplete="email" class="mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-pristine ng-invalid ng-touched" matinput="" name="email" required="" type="email" id="mat-input-4" placeholder="E-mail Address" aria-invalid="false" aria-required="true">
		
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
		driver.quit();  // Quit the  browser
		
	}

}
