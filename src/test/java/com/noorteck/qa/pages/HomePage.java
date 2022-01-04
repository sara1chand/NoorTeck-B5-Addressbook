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
	
	@FindBy(xpath = "//a[@id='sign-in']")
	WebElement signInButton;

	@FindBy(xpath = "//a[@data-test='sign-out']")
	WebElement signOutButton;
	
	@FindBy(xpath = "//a[text()='Sign up']")
	WebElement SignUpButton;

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
	
	public void clickSignUp() {
		click(SignUpButton);
	}
	
	public void clicksignOut() {
		click(signOutButton);
	}
     
	public void clicksignIn() {
		click(signInButton);
	}


	
}
