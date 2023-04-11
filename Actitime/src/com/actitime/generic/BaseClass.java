package com.actitime.generic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
	}
	
	
	public  WebDriver driver;
	
	
@BeforeTest
@Parameters("browser")
public void openBrowser(String browser) throws InterruptedException
{
	if(browser.equals("chrome"))
	{
		Thread.sleep(3000);
		driver=new ChromeDriver();
	}
	else if(browser.equals("edge"))
	{
		Thread.sleep(3000);
		driver=new  EdgeDriver();
	}

}
@AfterTest
public void closeBrowser()
{
	driver.close();
}

@BeforeMethod
public void login() throws IOException
{
	driver.findElement(By.id("username")).sendKeys("admin");;
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	
}
@AfterMethod
public void logout()
{
	driver.findElement(By.linkText("Logout")).click();
}


}
