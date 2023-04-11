package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutbtn;
	
	@FindBy(xpath="//div[@class='label' and text()='Tasks']")
	private WebElement taskbtn;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

	public WebElement getTaskbtn() {
		return taskbtn;
	}
	
	
	



	
		
	}
	

