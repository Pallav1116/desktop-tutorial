package com.example;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestNGtest1{
	WebDriver driver;
	String url="https://rahulshettyacademy.com//AutomationPractice";
  @Test
  public void f() {
	  System.out.println(driver.getTitle());
	  
  }
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\palla\\Downloads\\appium jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
  }

  @AfterMethod
  public void afterMethod() throws Exception {
	  driver.quit(); 
  }

}
