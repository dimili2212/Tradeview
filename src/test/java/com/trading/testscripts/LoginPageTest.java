package com.trading.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.trading.base.BaseClass;
import com.trading.pages.LoginPage;

public class LoginPageTest extends BaseClass {

	public static LoginPage loginPage;
	
	@BeforeMethod
	public void launchBrowser() {
		setUp();
		loginPage=new LoginPage();
	}

	@Test
	public void loginValidation() throws Exception {
		loginPage.logIn();
	}

	@AfterMethod
	public void tearDown() {
		driverClose();
	}

}
