package com.example;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	}
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	@Test
	public void test() throws Exception {
		
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("DevOps");
		driver.findElement(By.name("btnK")).click();
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("F:\\screenshotSelenium\\Shot1.png"));
		
		
	}

}
