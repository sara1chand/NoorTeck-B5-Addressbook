package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class AddressPage extends CommonUI {

	@FindBy(xpath = "//a[@data-test = 'addresses']")
	WebElement addressesClick;

	@FindBy(css = ".row.justify-content-center")
	WebElement newAddress;

	@FindBy(css = "#address_first_name")
	WebElement firstNameField;

	@FindBy(css = "#address_last_name")
	WebElement lastNameField;

	@FindBy(css = "#address_street_address")
	WebElement addressField;

	@FindBy(css = "#address_city")
	WebElement cityField;
	
	@FindBy(css = "#address_state")
	WebElement stateField;
	
	@FindBy(xpath = "//*[@value = 'us']")
	WebElement countryRadio;
	
	@FindBy(css = "#address_age")
	WebElement ageField;
	
	@FindBy(css = "#address_website")
	WebElement websiteField;
	
	@FindBy(css = "#address_picture")
	WebElement choosePicture;
	
	@FindBy(xpath = "//input[@type='tel']")
	WebElement telePhone;
	
	@FindBy(xpath = "//input[@id='address_interest_dance']")
	WebElement commonInterest;
	
	@FindBy(css = "#address_note")
	WebElement noteField;
	
	@FindBy(xpath = "//input[@value='Create Address']")
	WebElement createAddress;
	
	@FindBy(xpath = "//a[@data-test='list']")
	WebElement listClick;
	
	
	

	public AddressPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickAddresses() {
		click(addressesClick);
	}

	public void clickNewAddress() {
		click(newAddress);
	}

	public void enterFirstNameField(String firstName) {
		enter(firstNameField, firstName);
	}

	public void enterLastNameField(String lastName) {
		enter(lastNameField, lastName);
	}

	public void enterAddressField(String streetAddress) {
		enter(addressField, streetAddress);
	}
	
	public void enterCityField(String cityName) {
		enter(cityField, cityName);
	}
	
	public void selectState() {
		click(stateField);
	}
	public void clickCountry() {
		click(countryRadio);
	}
	
	public void enterageField(String age) {
		enter(ageField, age);
    }

	public void enterwebsiteField(String website) {
		enter(websiteField, website);
	}

	public void clickChoosePicture() {
	       click(choosePicture);
	}
	public void enterTelephone(String telephone) {
		enter(telePhone, telephone);
	}
	public void clickCommonInterest() {
		   click(commonInterest);
	}
	public void enterNote(String note) {
		enter(noteField, note);
	}
	
	public void clickcreateAddress() {
		click(createAddress);
	}
	
	public void clickList() {
		click(listClick);
	}
}
	
	

