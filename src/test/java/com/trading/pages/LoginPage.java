package com.trading.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trading.base.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "button[type='button']:nth-child(1)")
	public WebElement humanIcon;

	@FindBy(css = "button[data-name='header-user-menu-sign-in']")
	public WebElement signButton;

	@FindBy(css = "span[class*='toggle']")
	public WebElement emailButton;

	@FindBy(css = "input[name='username']")
	public WebElement userName;

	@FindBy(css = "input[name='password']")
	public WebElement passWord;

	@FindBy(css = "button[type='submit']")
	public WebElement signinButton;

	public SearchPage logIn() throws Exception {
		humanIcon.click();
		Thread.sleep(5000);
		signButton.click();
		Thread.sleep(5000);
		emailButton.click();
		Thread.sleep(5000);
		userName.sendKeys("testuser02");
		passWord.sendKeys("Passw0rd");
		signinButton.click();
		return new SearchPage();
	}
}