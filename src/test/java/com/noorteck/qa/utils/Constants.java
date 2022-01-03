package com.noorteck.qa.utils;


	import org.openqa.selenium.WebDriver;

import com.noorteck.qa.pages.AddressPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.SignInPage;
import com.noorteck.qa.pages.SignUpPage;

/**
 * In this class we declare our objects that will be shared among different classes
 * @author NoorTeck
 *
 */
public class Constants {
	
	
	public WebDriver driver;
	
	//declare class objects and common objects
	
	
	public SignUpPage signupObj;
	public SignInPage signinObj;
	public HomePage homeObj;
	public AddressPage addressObj;

}



