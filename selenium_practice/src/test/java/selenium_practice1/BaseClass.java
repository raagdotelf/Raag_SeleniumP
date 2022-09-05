package selenium_practice1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class BaseClass {
	WebDriver driver;
  @Test
  public void login() throws IOException {
		driver.get("http://timesheet.aqmtechnologies.com/");
		String t = driver.getTitle();
		System.out.println(driver.getTitle());
  }
  
  
 // @Parameters("browser")
  @BeforeTest
  
  public void beforeTestChrome() throws Exception {
  System.setProperty("webdriver.chrome.driver","D:\\Users\\Temp\\eclipse-workspace\\selenium_practice\\src\\test\\resources\\WebDriver\\chromedriver.exe");
	driver = new ChromeDriver();
	
	Thread.sleep(5000);
  }
  /*
  @BeforeTest 
  public void beforeTestGecko() {
	  System.setProperty("webdriver.gecko.driver","D:\\Users\\Temp\\eclipse-workspace\\selenium_practice\\src\\test\\resources\\WebDriver\\geckodriver.exe" );
      driver = new FirefoxDriver();
	  }
	  */

 /* public void beforeTest(String browser)
  {
     if (browser.equalsIgnoreCase("Chrome")) {
    	 System.setProperty("webdriver.chrome.drive","" );
        driver = new ChromeDriver();
        
     }
     else if (browser.equalsIgnoreCase("Firefox")) {
        System.setProperty("webdriver.gecko.driver","D:\\Users\\Temp\\eclipse-workspace\\selenium_practice\\src\\test\\resources\\WebDriver\\geckodriver.exe" );
        driver = new FirefoxDriver();
     }
     else {
        throw new IllegalArgumentException("Invalid browser value!!");
     }
  }*/

	  
		  
/*System.setProperty("webdriver.gecko.driver","D:\\Users\\Temp\\eclipse-workspace\\selenium_practice\\src\\test\\resources\\WebDriver\\geckodriver.exe");
	driver = new FirefoxDriver();*/
	
  /* System.setProperty("webdriver.chrome.driver","D:\\Users\\Temp\\eclipse-workspace\\selenium_practice\\src\\test\\resources\\WebDriver\\chromedriver.exe");
	driver = new ChromeDriver();*/
  
  @AfterTest
  public void afterTest() throws Exception {
		Thread.sleep(3000);
		driver.quit();
  }

}
