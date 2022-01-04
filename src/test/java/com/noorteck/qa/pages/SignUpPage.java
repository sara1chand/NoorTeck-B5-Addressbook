package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignUpPage extends CommonUI {

	@FindBy(css = "#user_email")
	WebElement emailField;

	@FindBy(css = "#user_password")
	WebElement passwordField;

	@FindBy(xpath = "//input[@value='Sign up']")
	WebElement signUpButton;
	
	@FindBy(xpath = "//a[@id='sign-in']")
	WebElement signInButton;

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterEmailAddress(String emailID) {
		enter(emailField, emailID);
	}

	public void enterPassWord(String passWord) {
		enter(passwordField, passWord);
	}
	public void clickSignUp() {
		click(signUpButton);
	}
	
	public void clickSignIn() {
		click(signInButton);
	}
	
	
}