package com.framework.pages;

import com.framework.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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

    @FindBy(xpath = "//h2[.='Enter Account Information']")
    public WebElement enterAccountInfoMessage;

    @FindBy(xpath = "//iframe[@id='google_esf']")
    public WebElement iframe1;

    @FindBy(xpath = "//iframe[@id='aswift_2']")
    public WebElement iframe2;

    @FindBy(xpath = "//iframe[@id='ad_iframe']")
    public WebElement iframe3;

    @FindBy(xpath = "//span[.='Close']")
    public WebElement closeAddButton;

    public void close_add(){
        try{
            Driver.getDriver().switchTo().frame(iframe2).switchTo().frame(iframe3);
            closeAddButton.click();
            Driver.getDriver().switchTo().defaultContent();
        }catch (NoSuchElementException e){
            e.printStackTrace();
        }


    }

    public void select_checkbox(String checkbox){
        if (checkbox.equals(newsletterCheckbox.getText())){
            if(!newsletterCheckbox.isSelected()){
                newsletterCheckbox.click();
                Assert.assertTrue(newsletterCheckbox.isSelected());
            }
        } else if (checkbox.equals(receiveSpecialOffersCheckbox.getText())) {
            if(!receiveSpecialOffersCheckbox.isSelected()){
                receiveSpecialOffersCheckbox.click();
                Assert.assertTrue(receiveSpecialOffersCheckbox.isSelected());
            }
        }
    }

    public void google_save_address_dismiss(){
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.dismiss();
    }

    public void select_gender_title(String gender){
        if (gender.equalsIgnoreCase("mr")){
            radioBtnTitleMr.click();
        } else if (gender.equalsIgnoreCase("mrs")) {
            radioBtnTitleMrs.click();
        }
    }

    public void verify_name_input(String expectedName){
        Assert.assertEquals(expectedName, nameInput.getAttribute("value"));
    }

    public void verify_email_input(String expectedEmail){
        Assert.assertEquals(expectedEmail, emailInput.getAttribute("value"));

    }

    public void select_DOB(String ddmmyyyy){
        Select select = new Select(dayDropdown);
        int firstSlash = ddmmyyyy.indexOf("/");
        int secondSlash = ddmmyyyy.lastIndexOf("/");

        String month = ddmmyyyy.substring(0,firstSlash);
        String day = ddmmyyyy.substring(firstSlash+1, secondSlash);
        String year = ddmmyyyy.substring(secondSlash+1);

        select.selectByVisibleText(day);
        Assert.assertEquals("Day is not correct", day,select.getFirstSelectedOption().getText());

        select = new Select(monthDropdown);
        select.selectByValue(month);
        Assert.assertEquals("month is not correct",month,select.getFirstSelectedOption().getAttribute("value"));

        select = new Select(yearDropdown);
        select.selectByVisibleText(year);
        Assert.assertEquals("year is not correct",year,select.getFirstSelectedOption().getText());


    }

    public void select_country(String country){
        Select select = new Select(countryDropdown);
        select.selectByVisibleText(country);
    }







}
