package com.trading.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trading.base.BaseClass;
import com.trading.util.CommonMethods;

public class SearchPage extends BaseClass {
	
	Actions act = new Actions(driver);
	public static CommonMethods cm;
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='Asia']")
	public WebElement asiaTab;

	@FindBy(css = "button[class*='button--full']")
	public WebElement searchField;

	@FindBy(css = "input[name='query']")
	public WebElement symbolsText;

	@FindBy(css = "div[class='listContainer-vWG52QBW']")
	public WebElement listContainer;

	@FindBy(css = "button[value='symbols']")
	public WebElement seeoverView;

	public void searchGBPJPY() throws Exception {
		cm=new CommonMethods();
		cm.explicitWait(asiaTab);
		asiaTab.click();
		cm.explicitWait(searchField);
		searchField.click();
		cm.explicitWait(symbolsText);
		symbolsText.sendKeys("FX: GBPJPY");
		act.moveToElement(listContainer).perform();
		act.moveToElement(seeoverView).click().perform();
	}
}
