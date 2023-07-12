package com.framework.step_definitions;

import com.framework.pages.AP_SignupLogin_Page;
import com.framework.pages.AP_Signup_Page;
import com.framework.utilities.BrowserUtils;
import com.framework.utilities.ConfigReader;
import com.framework.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class AP_RegisteringNewUser_StepDef {

    AP_SignupLogin_Page signupLoginPage = new AP_SignupLogin_Page();
    AP_Signup_Page signupPage = new AP_Signup_Page();
    Faker faker = new Faker();

    @Given("user goes to the web page and sees Automation Exercise title")
    public void user_goes_to_the_web_page_and_sees_homepage_of_the_application() {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        BrowserUtils.verifyTitle("Automation Exercise");
    }
    @When("user clicks SignupLogin button user sees New User Signup! text")
    public void user_clicks_signup_login_button_user_sees_new_user_signup_text() {
    signupLoginPage.signupLoginButton.click();
    }
    String name;
    @When("user enters name and email")
    public void user_enters_name_and_email() {
    signupLoginPage.nameSignupInput.sendKeys(faker.name().fullName());
    name = signupLoginPage.nameSignupInput.getText();
    signupLoginPage.emailSignupInput.sendKeys(faker.internet().emailAddress());
    }
    @Then("user clicks Signup button and user sees ENTER ACCOUNT INFORMATION text")
    public void user_clicks_signup_button_and_user_sees_enter_account_information_text() {
    signupLoginPage.signupButton.click();
    }

    @Then("user fills out Title, Name, Email, Password, Date of birth")
    public void user_fills_out_title_name_email_password_date_of_birth() {


        if (signupLoginPage.nameSignupInput.getText().startsWith("[a-k]") || signupLoginPage.nameSignupInput.getText().startsWith("[A-K]")){
            signupPage.radioBtnTitleMrs.click();
        }else{
            signupPage.radioBtnTitleMr.click();
        }

        BrowserUtils.scrollToElement(signupPage.passwordInput);
        signupPage.passwordInput.sendKeys(faker.internet().password());
        Select select = new Select(signupPage.dayDropdown);
        select.selectByVisibleText("24");

        select = new Select(signupPage.monthDropdown);
        select.selectByVisibleText("September");

        select = new Select(signupPage.yearDropdown);
        select.selectByVisibleText("1992");

    }
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
    @Then("user clicks Create Account button and sees ACCOUNT CREATED! text")
    public void user_clicks_create_account_button_and_sees_account_created_text() {
        signupPage.createAccountButton.click();
        Assert.assertTrue(signupPage.accountCreatedMessage.isDisplayed());
    }
    @Then("user clicks Continue button and sees Logged in as username is visible")
    public void user_clicks_continue_button_and_sees_logged_in_as_username_is_visible() {

        signupPage.continueButton.click();
        Assert.assertEquals(name,signupLoginPage.loggedInAsName.getText());


    }
    @Then("user clicks Delete Account button and sees ACCOUNT DELETED! text is displayed")
    public void user_clicks_delete_account_button_and_sees_account_deleted_text_is_displayed() {

    }
    @Then("user clicks Continue")
    public void user_clicks_continue() {

    }


}
