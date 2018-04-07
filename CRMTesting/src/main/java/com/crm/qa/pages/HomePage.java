package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(xpath="//ul[@classname = 'mlddm']//li//a[contain(text(),'Contacts')]");
	WebElement contactlink;

}
