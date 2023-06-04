package com.trading.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.trading.base.BaseClass;
import com.trading.pages.LoginPage;
import com.trading.pages.SearchPage;

public class SearchPageTest extends BaseClass {
	
	public static LoginPage loginPage;
	public static SearchPage searchPage;

	@BeforeMethod
	public void driverLaunch() {
		setUp();
//		loginPage = new LoginPage();
	}

	@Test
	public void searchValidation() throws Exception {
//		loginPage.logIn();
		searchPage = new SearchPage();
		searchPage.searchGBPJPY();
	}

	@AfterMethod
	public void tearDown() {
		driverClose();
	}

}
