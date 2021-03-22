package com.example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester2 {
	WebDriver driver;
	String url="https://www.google.co.in/";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\palla\\Downloads\\appium jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		System.out.println(driver.getTitle());
	}
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	@Test
	public void test() {
		
	}

}
