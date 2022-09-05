package selenium_practice1;

import org.testng.annotations.Test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;



public class DataDrivenTesting extends BaseClass{
  @Test(dataProvider = "dp")
  public void f(String un, String pwd) {
	  driver.get("http://timesheet.aqmtechnologies.com/");
	  driver.findElement(By.id("txtUserName")).sendKeys(un);  
	  driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	  driver.findElement(By.id("btnLogin")).click();
	  if(driver.getCurrentUrl().contains("dashboard"))
		  System.out.println("login done");
	  else
		  System.out.println("login failed"); 
	  
	 
     TakesScreenshot tc=(TakesScreenshot) driver;
	  File src =tc.getScreenshotAs(OutputType.FILE);
try {
	
	  FileHandler.copy(src, new File("D:\\Users\\Temp\\eclipse-workspace\\selenium_practice\\src\\test\\resources\\ScreenShots\\error4.png"));
	  FileHandler.copy(src, new File("D:\\\\Users\\\\Temp\\\\eclipse-workspace\\\\selenium_practice\\\\src\\\\test\\\\resources\\\\ScreenShots\\\\error5.png"));
	  FileHandler.copy(src, new File("D:\\\\Users\\\\Temp\\\\eclipse-workspace\\\\selenium_practice\\\\src\\\\test\\\\resources\\\\ScreenShots\\\\error6.png"));
}
catch(Exception IO) {
	 
	  System.out.println("Exception while taking screenshot "+ IO.getMessage());
}
}   
	  
  
	
	
  @DataProvider
  public Object[][] dp() {
	     Object[][] data=new Object[3][2];
	      data[0][0]="admin";
	      data[0][1]="admin0101";
	      data[1][0]="user";
	      data[1][1]="user123";
	      data[2][0]="admin1";
	      data[2][1]="admin@12345";
	      return data;
	     }
	  }