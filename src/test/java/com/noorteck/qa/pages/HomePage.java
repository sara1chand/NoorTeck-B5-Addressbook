package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {

	@FindBy(xpath = "//h1[contains(text(),'Welcome to')]")
	WebElement welcomeText;

	@FindBy(xpath = "//a[@data-test='home']")
	WebElement homeButton;

	@FindBy(xpath = "//a[@data-test='addresses']")
	WebElement addressButton;

	@FindBy(xpath = "//a[@data-test='sign-out']")
	WebElement signOutButton;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void displayWelcome() {
		isDisplayed(welcomeText);
	}

	public void clickhomeButton() {
		click(homeButton);
	}

	public void clickaddressButton() {
		click(addressButton);
	}
	
	public void clicksignOut() {
		click(signOutButton);
	}

}
