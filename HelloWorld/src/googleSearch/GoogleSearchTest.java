package googleSearch;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	
  public static void main(String[] args) throws Exception {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\palla\\Downloads\\appium jars\\libs\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.findElement(By.name("q")).sendKeys("Java");
		
		Thread.sleep(10000);
		
		List<WebElement> list1=driver.findElements(By.xpath("//ul[@role='listbox']/li/descendant::div[@class='wM6W7d']"));
		System.out.println(list1.size());
		for(WebElement w1:list1) {
			System.out.println(w1.getText());
		}
		
		driver.quit();
  }
}
