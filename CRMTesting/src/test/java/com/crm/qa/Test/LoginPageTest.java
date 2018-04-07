package com.crm.qa.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.testbase.Testbase;

public class LoginPageTest extends Testbase{
	static LoginPage loginpage;
	static HomePage homepage;
	public LoginPageTest()
	{
		super();
	}
		
	@BeforeMethod
	public void setup(){
		intiallization();	
	}
	
	@Test
	public void TitleTest(){
		loginpage = new LoginPage();
		String Title = loginpage.VerifyTitle();
		Assert.assertEquals(Title, "Free CRM in the cloud software boosts sales");	
	}
	
	@Test
	public void LoginTest(){
		homepage = loginpage.Login();
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}

}
