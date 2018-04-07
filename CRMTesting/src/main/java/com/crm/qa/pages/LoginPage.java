package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.testbase.Testbase;

public class LoginPage extends Testbase{
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement Button;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyTitle(){
		String PageTitle = driver.getTitle();
		return PageTitle;
	}
	
	public HomePage Login(){
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		Button.click();
		return new HomePage();
	}
}
