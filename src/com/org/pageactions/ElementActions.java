package com.org.pageactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementActions {
	WebDriver driver=null;
	WebDriverWait wait;
	public ElementActions(WebDriver driver) {
		this.driver=driver;
		wait=new WebDriverWait(driver, 20);
	}
	
	public void clickButton(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		

	}
	public void enterDataintoTextbox(WebElement element,String text) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(text);

	}
	public void selectTextInDropdown(WebElement element,String text) {
		
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}

}
