package com.example;

import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class RegistrationAuto {
	WebDriver driver;
	String url="http://automationpractice.com/index.php";

	@BeforeClass
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\palla\\Downloads\\appium jars\\libs\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
	}
	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
	}
	@Test
	public void test() throws Exception {
		driver.findElement(By.className("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email_create")).sendKeys("doctorstranger9@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(3000);
		if(!driver.findElement(By.xpath("//*[@id=\'create_account_error\']")).isDisplayed()) {
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Doctor");
		driver.findElement(By.id("customer_lastname")).sendKeys("Strange");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("hello123");
		WebElement w1=driver.findElement(By.id("days"));
		Select s1=new Select(w1);
		s1.selectByValue("16");
		
		WebElement w2=driver.findElement(By.id("months"));
		Select s2=new Select(w2);
		s2.selectByValue("1");
		
		WebElement w3=driver.findElement(By.id("years"));
		Select s3=new Select(w3);
		s3.selectByValue("1990");
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Doctor");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Strange");
		driver.findElement(By.id("company")).sendKeys("Google");
		driver.findElement(By.id("address1")).sendKeys("69/69, California Drive");
		driver.findElement(By.id("address2")).sendKeys("Galaxy Apartments");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Los Angeles");
		
		WebElement w4=driver.findElement(By.id("id_state"));
		Select s4=new Select(w4);
		s4.selectByValue("5");
		
		driver.findElement(By.id("postcode")).sendKeys("61432");
		driver.findElement(By.id("phone_mobile")).sendKeys("6896549999");
		driver.findElement(By.id("alias")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("alias")).sendKeys("34/34,USA");
		driver.findElement(By.id("submitAccount")).click();
		Thread.sleep(4000);
		
		String actual1=driver.findElement(By.className("info-account")).getText();
		Assert.assertEquals(actual1,"Welcome to your account. Here you can manage all of your personal information and orders.");
		Thread.sleep(3000);
		System.out.println(actual1);
		
		driver.findElement(By.className("logout")).click();
		Thread.sleep(2000);
		}
		else {
			System.out.println((driver.findElement(By.id("create_account_error")).getText()));
		}
	}

	@Test
	public void Test2() throws Exception{
		driver.findElement(By.className("login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("doctor@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("hellyeah");
		Thread.sleep(3000);
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(2000);
		String wrongcred=driver.findElement(By.xpath("//*[@id=\'center_column\']/div[1]")).getText();
		System.out.println(wrongcred);
		Assert.assertEquals(wrongcred, "There is 1 error\n"
				+ "Authentication failed.");
	}
	
	
	@Test
	public void Test3() throws Exception{
		driver.findElement(By.className("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email_create")).sendKeys("doctorstranger5@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("id_gender1")).click();
		
		driver.findElement(By.id("submitAccount")).click();
		Thread.sleep(3000);
		
		String error1=driver.findElement(By.xpath("//*[@id=\'center_column\']/div")).getText();
		System.out.println(error1);
		
		Assert.assertEquals(error1,"There are 8 errors\n"
				+ "You must register at least one phone number.\n"
				+ "lastname is required.\n"
				+ "firstname is required.\n"
				+ "passwd is required.\n"
				+ "address1 is required.\n"
				+ "city is required.\n"
				+ "The Zip/Postal code you've entered is invalid. It must follow this format: 00000\n"
				+ "This country requires you to choose a State.");
			System.out.println("Test complete!");
		
		}
	}

	
	
	
	
	

