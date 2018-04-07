package com.crm.qa.utils;

import com.crm.qa.testbase.Testbase;

public class Frames extends Testbase{
	
	public void Frameswitch(){
		driver.switchTo().frame("mainpanel");
	}

}
