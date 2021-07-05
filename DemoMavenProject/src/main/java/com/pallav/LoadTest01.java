package com.pallav;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LoadTest01 {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.google.co.in");
	  System.out.println(driver.getTitle());
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\palla\\Downloads\\appium jars\\chromedriver.exe");
	  driver=new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
