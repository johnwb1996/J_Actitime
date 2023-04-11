package com.actitime.pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.FileLib;

public class TaskPage {
	
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newcstmrbtn;
	
	@FindBy(xpath="//div[@class='customerNameDiv']//input[@placeholder='Enter Customer Name']")
	private WebElement custnamefld;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement descriptiontxtfld;
	
	@FindBy(xpath="(//div[contains(text(),'Select Customer')])[1]")
	private WebElement selectcust;
	
	
@FindBy(xpath="//div[text()='Our company']")
private WebElement ourcompny;

@FindBy (xpath="(//div[@class='titleEditButtonContainer']/div)[1]")
private WebElement currenttitle;

@FindBy(xpath="//div[contains(text(),'Create Customer')]")
private WebElement creacustbtn;

@FindBy(xpath="//div[text()='+ New Project']")
private WebElement newprojectbtn;

@FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
private WebElement projname;

@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
private WebElement custname;

@FindBy(xpath="(//div[text()='Our company'])[10]")
private WebElement ourcmpnyinprjct;


@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
private WebElement desriptioncname;

@FindBy(xpath="//div[text()='Create Project']")
private WebElement createprojectbtn;


	public WebElement getNewprojectbtn() {
	return newprojectbtn;
}




public WebElement getProjname() {
	return projname;
}




public WebElement getCustname() {
	return custname;
}




public WebElement getOurcmpnyinprjct() {
	return ourcmpnyinprjct;
}




public WebElement getDesriptioncname() {
	return desriptioncname;
}




public WebElement getCreateprojectbtn() {
	return createprojectbtn;
}




	public WebElement getCurrenttitle() {
	return currenttitle;
}




	public WebElement getOurcompny() {
	return ourcompny;
}


	
	
	
	
	
	
	
	public TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}




	public WebElement getAddnewbtn() {
		return addnewbtn;
	}




	public WebElement getNewcstmrbtn() {
		return newcstmrbtn;
	}




	public WebElement getCustnamefld() {
		return custnamefld;
	}




	public WebElement getDescriptiontxtfld() {
		return descriptiontxtfld;
	}

	public WebElement getSelectcust() {
		return selectcust;
	}


	public WebElement getCreacustbtn() {
		return creacustbtn;
	}
	
	


	
	
}
