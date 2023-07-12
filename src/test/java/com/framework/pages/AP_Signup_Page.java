package com.framework.pages;

import com.framework.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AP_Signup_Page extends AP_HomePage {
    public AP_Signup_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@value='Mr']")
    public WebElement radioBtnTitleMr;

    @FindBy(xpath = "//input[@value='Mrs']")
    public WebElement radioBtnTitleMrs;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement dayDropdown;

    @FindBy(xpath = "//select[@id='months']")
    public WebElement monthDropdown;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement yearDropdown;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement newsletterCheckbox;

    @FindBy(xpath = "//input[@id='optin']")
    public WebElement receiveSpecialOffersCheckbox;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@id='company']")
    public WebElement companyName;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement addressInput;

    @FindBy(xpath = "//input[@id='address2']")
    public WebElement address2Input;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement countryDropdown;

    @FindBy(xpath = "//input[@id='state']")
    public WebElement stateInput;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement cityInput;

    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement zipcodeInput;

    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement mobileNumberInput;

    @FindBy(xpath = "//button[.='Create Account']")
    public WebElement createAccountButton;

    @FindBy(linkText = "Continue")
    public WebElement continueButton;

    @FindBy(xpath = "//h2[@data-qa='account-created']")
    public WebElement accountCreatedMessage;



}
