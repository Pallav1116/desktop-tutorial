package googleSearch;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver=new ChromeDriver();
  @Test
  public void f() {
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\palla\\Downloads\\appium jars\\libs\\chromedriver.exe");
	  driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
