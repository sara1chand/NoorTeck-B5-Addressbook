package com.noorteck.qa.utils;

import com.noorteck.qa.pages.AddressPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.SignInPage;
import com.noorteck.qa.pages.SignUpPage;

public class ObjInitialize extends Constants {
		
		 
		
		public void initializeClassObj() {
			//initialize each page class objects here..
			
			signupObj = new SignUpPage();
			signinObj =  new  SignInPage();
		    homeObj = new HomePage();
		    addressObj = new AddressPage();
			
			
		}

	}

	
	


