package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;


public class TC_003 
{
	@Test
    public void testcase1() {
		System.setProperty("webdriver.chrome.driver", "./libd/chromedriver.exe");
		//Open the browser
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Hello");
		driver.findElement(By.id("pass")).sendKeys("Hello");
		driver.quit();
    }
}
