package com.org.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.org.base.InitiateDriver;
import com.org.pageactions.CaptureScreenshot;
import com.org.pages.Registerpage;

public class Registrationfunctionality extends InitiateDriver {

	
	@Test
	public void TC001() throws IOException {
		
		register=new Registerpage(driver);
		register.enterUserName("Joesunny");
			
		register.entermailId("john@stateauto.com");
		register.enterpassword("sirimaa");
		register.confirmPassword("sirimaa");
		register.enterDOB("21/11/1996");
		register.enterAddresstype("home");
		register.selectGender();
	
		
		
		
		
		

	}

}
