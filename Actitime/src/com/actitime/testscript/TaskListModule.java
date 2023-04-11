package com.actitime.testscript;



import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class TaskListModule extends BaseClass {
	@Test
	public static void TestCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		Thread.sleep(3000);
		HomePage hp=new HomePage(driver);
		hp.getTaskbtn().click();
		TaskPage tp=new TaskPage(driver);
		tp.getAddnewbtn().click();
		tp.getNewcstmrbtn().click();
		Thread.sleep(2000);
		FileLib f=new FileLib();
		String cname = f.getExcelData("CustomerModule",1, 0);
		String dname = f.getExcelData("CustomerModule",1, 1);
		tp.getCustnamefld().sendKeys(cname);
		tp.getDescriptiontxtfld().sendKeys(dname);
		tp.getCreacustbtn().click();
		/*String displayedtitle = tp.getCurrenttitle().getText();
		Assert.assertEquals(cname,displayedtitle);*/
		
}
	@Test
	public static void TestCreateProject() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Thread.sleep(3000);
		HomePage hp=new HomePage(driver);
		hp.getTaskbtn().click();
		TaskPage tp=new TaskPage(driver);
		tp.getAddnewbtn().click();
		tp.getNewprojectbtn().click();
		FileLib f=new FileLib();
		String projname = f.getExcelData("CustomerModule",1, 2);
		String descname = f.getExcelData("CustomerModule",1, 3);
		tp.getProjname().sendKeys(projname);
		tp.getCustname().click();
		tp.getOurcmpnyinprjct().click();
		tp.getDesriptioncname().sendKeys(descname);
		tp.getCreateprojectbtn().click();
		
	}

}
