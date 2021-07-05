package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tester3 {
	WebDriver driver;
	String url="https://www.google.co.in/";

	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\palla\\Downloads\\appium jars\\libs\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}
	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
}
	
	@Test
	public void f() {
		System.out.println(driver.getTitle());
	}
	
}