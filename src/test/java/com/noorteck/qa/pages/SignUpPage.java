package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignUpPage extends CommonUI {

	@FindBy(xpath = "//input[@name = 'user_email']")
	WebElement emailField;

	@FindBy(xpath = "//input[@name = 'user_password']")
	WebElement passwordField;

	@FindBy(css = ".btn.btn-primary")
	WebElement signUpButton;

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
	
	
}