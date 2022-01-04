package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class AddressBookTest extends ObjInitialize {

	public static void main(String[] args) {

		String url = "http://a.testaddressbook.com/sign_up";

        CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
        initializeClassObj();
		signUpTestOne();
		
        //testTwo();

		CommonUI.quitBrowser();
	}

	public static void signUpTestOne() {

		signupObj.enterEmailAddress("hopewoks@gmail.com");
		signupObj.enterPassWord("headhurt1101");
		signupObj.clickSignUp();
	    System.out.println(addressObj.displayMessage());

	}

	public static void testTwo() {

		
        signupObj.clickSignIn();
		signinObj.enterEmail("hopewoks@gmail.com");
		signinObj.enterPassword("headhurt1101");
		signinObj.clickSignIn();
		addressObj.clickAddresses();
		addressObj.clickNewAddress();
		addressObj.enterFirstNameField("John");
		addressObj.enterLastNameField("Cena");
		addressObj.enterAddressField("7888 Cena Lane");
		addressObj.enterCityField("Anywhere");
		addressObj.selectState("value","VA");
		addressObj.zipCodeField("22011");
		addressObj.enterageField("22");
		addressObj.enterTelephone("123-2334-3434");
		addressObj.clickCommonInterest();
		addressObj.enterNote("Automation is Fun");
		addressObj.clickcreateAddress();
		addressObj.clickList();
		System.out.println(addressObj.displayFirstName());
		System.out.println(addressObj.displayLastName());
		System.out.println(addressObj.displayCity());
		System.out.println(addressObj.displayState());
	}

}

/**
 * -------------------------------------- INSTRUCTIONS
 * --------------------------------------------
 * 
 * ---> Create JAVA CLASS for each page of the application ---> Inspect the
 * elements and store the values ---> Create the class constructor ---> Create
 * the methods
 * 
 * ---> DONT FORGET ***** EACH PAGE CLASS SHOULD INHERIT CommonUI Class
 * ******************* ---> DONT FORGET ***** DECLARE PAGE CLASS OBJECT in
 * CONSTANTS CLASS ******************* ---> DONT FOGET ***** INITIALIZE PAGE
 * CLASS OBJECTS IN ObjInitialize JAVA ClASS ******************* ---> DONT FOGET
 * ***** CHANGE JAVA VERSION TO 1.8 *******************
 * 
 * 
 * 
 * ---> For each test case create a method then call those methods from main
 * method. ---> DONT FORGET ***** Refer to the INSTRUCTION PDF file for the test
 * cases to automate **************
 * 
 * ---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
 * ---> Once pushed add US to the project then send picture in MENTORS GROUP
 * CHAT Crystal: --> Koritzerc23@gmail.com Helen: --> Hnbehining@gmail.com
 * Ahmad: --> a.stanikzai77@gmail.com Fahim: --> NTKBatch5
 * 
 * 
 */
