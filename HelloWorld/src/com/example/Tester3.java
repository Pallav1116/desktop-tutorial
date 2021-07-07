package com.example;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tester3 {
	WebDriver driver;
	String url="https://www.saucedemo.com/";

	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\palla\\Downloads\\appium jars\\libs\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	}
	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
}
	
	@Test
	public void f() throws Exception {
		
		System.out.println(driver.getTitle());
		List<WebElement> l1=driver.findElements(By.id("login_credentials"));
		for(WebElement s1:l1) {
			if(s1.getText().contains("standard_user")) {
				driver.findElement(By.id("user-name")).sendKeys(s1.getText().substring(24,37));
				Thread.sleep(2000);
			}
		}
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		
	}
	
}