package com.framework.pages;

import com.framework.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AP_SignupLogin_Page extends AP_HomePage {
    public AP_SignupLogin_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameSignupInput;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailSignupInput;

    @FindBy(xpath = "//button[.='Signup']")
    public WebElement signupButton;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement emailLoginInput;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;


}
