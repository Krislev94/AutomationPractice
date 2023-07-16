package com.framework.pages;

import com.framework.utilities.Driver;
import org.junit.Assert;
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

    @FindBy(css = "input#name")
    public WebElement nameInput;

    @FindBy(css = "input#email")
    public WebElement emailInput;

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

    public void select_gender_title(String gender){
        if (gender.equalsIgnoreCase("mr")){
            radioBtnTitleMr.click();
        } else if (gender.equalsIgnoreCase("mrs")) {
            radioBtnTitleMrs.click();
        }
    }

    public void verify_name_input(String expectedName){
        Assert.assertEquals(expectedName, nameInput.getText());
    }

    public void verify_email_input(String expectedEmail){
        Assert.assertEquals(expectedEmail, emailInput.getText());

    }





}
