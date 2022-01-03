package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignInPage extends CommonUI{
	
	
	@FindBy(xpath = "//input[@placeholder = 'Email']")
	WebElement emailField;
	
	@FindBy(xpath = "//input[@placeholder = 'Password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//input[@value = 'Sign in']")
	WebElement signInButton;
	
	
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterEmail(String emailID) {
       enter(emailField, emailID);
	}
	
	public void enterPassword(String passWord) {
		enter(passwordField, passWord);
	}

	public void clickSignIn() {
		click(signInButton);
}
	
	
	
}