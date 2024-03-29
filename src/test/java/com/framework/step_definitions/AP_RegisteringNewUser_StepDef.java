package com.framework.step_definitions;

import com.framework.pages.AP_AccountDeletingPage;
import com.framework.pages.AP_SignupLogin_Page;
import com.framework.pages.AP_Signup_Page;
import com.framework.utilities.BrowserUtils;
import com.framework.utilities.ConfigReader;
import com.framework.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AP_RegisteringNewUser_StepDef {

    AP_SignupLogin_Page signupLoginPage = new AP_SignupLogin_Page();
    AP_Signup_Page signupPage = new AP_Signup_Page();
    AP_AccountDeletingPage deletingPage = new AP_AccountDeletingPage();

    @Given("user is on the web page and sees {string} title")
    public void user_is_on_the_web_page_and_sees_title(String expectedTitle) {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        BrowserUtils.verifyTitle(expectedTitle);
    }
    @When("user clicks SignupLogin button")
    public void user_clicks_button() {
        signupLoginPage.signupLoginButton.click();
    }
    @Then("user sees {string} signup message")
    public void user_sees_message(String expectedMessage) {
       signupLoginPage.verifyMessage(expectedMessage,signupLoginPage.newUserSignUpMessage);
    }
    @Then("user enters {string} name and {string} email")
    public void user_enters_name_and_email(String name, String email) {
       signupLoginPage.enter_name_and_email_to_signup(name, email);
    }

    @Then("user clicks Signup button")
    public void user_clicks_signup_button() {
       signupLoginPage.signupButton.click();
    }

    @Then("user sees {string} account message")
    public void user_sees_enter_account_info_message(String expectedMessage) {
        Assert.assertEquals(expectedMessage, signupPage.enterAccountInfoMessage.getText());
    }

    @Then("user clicks {string} Title")
    public void user_clicks_title(String genderRadioButton) {
       signupPage.select_gender_title(genderRadioButton);
    }
    @Then("user sees {string} in the name input")
    public void user_sees_in_the_name_input(String expectedName) {
        signupPage.verify_name_input(expectedName);
    }

    @Then("user sees {string} in the email input")
    public void user_sees_in_the_email_input(String expectedEmail) {
        signupPage.verify_email_input(expectedEmail);
    }


    @Then("user enters {string} password")
    public void user_enters_password(String password) {
        BrowserUtils.scrollToElement(signupPage.passwordInput);
       signupPage.passwordInput.sendKeys(password);
    }
    @Then("user selects date of birth {string}")
    public void user_enters_DOB(String DOB) {
        signupPage.select_DOB(DOB);
    }
    @Then("user selects {string} checkbox")
    public void user_selects_checkbox(String expectedCheckbox) {
       BrowserUtils.scrollToElement(signupPage.firstNameInput);
       signupPage.select_checkbox(expectedCheckbox);
    }
    @Then("user enters {string} first name")
    public void user_enters_first_name(String firstName) {
       signupPage.firstNameInput.sendKeys(firstName);

    }
    @Then("user enters {string} last name")
    public void user_enters_last_name(String lastName) {
       signupPage.lastNameInput.sendKeys(lastName);
    }
    @Then("user enters {string} company")
    public void user_enters_company(String companyName) {
       BrowserUtils.scrollToElement(signupPage.companyName);
       signupPage.companyName.sendKeys(companyName);
    }
    @Then("user enters {string} address")
    public void user_enters_address(String address) {
       signupPage.addressInput.sendKeys(address);
    }
    @Then("user enters {string} address2")
    public void user_enters_address2(String address2) {
        signupPage.address2Input.sendKeys(address2);
    }
    @Then("user selects {string} country")
    public void user_selects_country(String country) {
       BrowserUtils.scrollToElement(signupPage.countryDropdown);
        signupPage.select_country(country);
    }

    @Then("user enters {string} state")
    public void user_enters_state(String state) {
        signupPage.stateInput.sendKeys(state);
    }

    @Then("user enters {string} city")
    public void user_enters_city(String city) {
       signupPage.cityInput.sendKeys(city);

    }
    @Then("user enters {string} zipcode")
    public void user_enters_zipcode(String zip) {
       BrowserUtils.scrollToElement(signupPage.zipcodeInput);
       signupPage.zipcodeInput.sendKeys(zip);
    }
    @Then("user enters {string} Mobile Number")
    public void user_enters_mobile_number(String phoneNumber) {
        signupPage.mobileNumberInput.sendKeys(phoneNumber);
    }

    @Then("user clicks Create Account button")
    public void user_clicks_create_account_button() {
        signupPage.createAccountButton.click();
    }

    @Then("user sees {string} message")
    public void user_sees_account_created_message(String expectedMessage) {
        Assert.assertEquals(expectedMessage,signupPage.accountCreatedMessage.getText());
    }

    @Then("user clicks Continue button")
    public void user_clicks_continue_button() {

       signupPage.continueButton.click();
        signupPage.close_add();
    }

    @Then("user sees Logged in as {string} account information")
    public void user_sees_account_information_message(String expectedMessage) {
       Assert.assertEquals(expectedMessage, signupPage.loggedInAsName.getText());
    }

    @Then("user clicks Delete Account button")
    public void user_clicks_delete_account_button() {
        signupPage.deleteAccountButton.click();
    }

    @Then("user sees {string} confirmation message")
    public void user_sees_account_deleted_message(String expectedMessage) {
        Assert.assertEquals(expectedMessage,deletingPage.accountDeletedMessage.getText());
    }



    @Then("user clicks Continue")
    public void user_clicks_continue() {
       deletingPage.continueButton.click();
       // signupPage.close_add();

    }

    @And("user is back on the main page")
    public void user_is_back_on_main_page() {
        Assert.assertTrue(signupLoginPage.signupLoginButton.isDisplayed());
    }





   /*
    @Then("user selects Sign up for our newsletter! checkbox")
    public void user_selects_sign_up_for_our_newsletter_checkbox() {
        BrowserUtils.selectCheckBox(signupPage.newsletterCheckbox,true);

    }
    @Then("user also selects Receive special offers from our partners! checkbox")
    public void user_also_selects_receive_special_offers_from_our_partners_checkbox() {
        BrowserUtils.scrollToElement(signupPage.receiveSpecialOffersCheckbox);
        BrowserUtils.selectCheckBox(signupPage.receiveSpecialOffersCheckbox,true);

    }
    @Then("user fills out First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void user_fills_out_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {


        signupPage.firstNameInput.sendKeys(faker.name().firstName());

        signupPage.lastNameInput.sendKeys(faker.name().lastName());
        signupPage.companyName.sendKeys(faker.commerce().department());

        BrowserUtils.scrollToElement(signupPage.addressInput);
        signupPage.addressInput.sendKeys(faker.address().streetAddress());
        signupPage.address2Input.sendKeys(faker.address().streetAddress());

        Select select = new Select(signupPage.countryDropdown);
        select.selectByVisibleText("United States");


        BrowserUtils.scrollToElement(signupPage.stateInput);
        signupPage.stateInput.sendKeys(faker.address().state());
        signupPage.cityInput.sendKeys(faker.address().city());
        signupPage.zipcodeInput.sendKeys(faker.address().zipCode());
        BrowserUtils.scrollToElement(signupPage.mobileNumberInput);
        signupPage.mobileNumberInput.sendKeys(faker.number().digits(10));

    }

    */




}
