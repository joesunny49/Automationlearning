package com.org.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.org.base.InitiateDriver;
import com.org.pageactions.CaptureScreenshot;
import com.org.pages.LoginPage;


public class LoginPagetestcases extends InitiateDriver{


	
	@Test()
	public void TC002() throws IOException {
		
		login=new LoginPage(driver);
		login.loginTab();
		login.enterUserId("Joesunny");
		
		login.enterPassword("Mariyan@23876");
		login.clickloginButton();
		CaptureScreenshot.takeScreenshot(driver, "nothing");
		
	}

	
}
