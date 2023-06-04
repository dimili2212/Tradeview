package com.trading.util;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.trading.base.BaseClass;

public class CommonMethods extends BaseClass {
	
	public WebDriverWait wait;
	
	public void explicitWait(WebElement element) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
