package com.framework.pages;

import com.framework.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AP_AccountDeletingPage {

    AP_AccountDeletingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2[.='Account Deleted!']")
    public WebElement accountDeletedMessage;

    @FindBy(xpath = "//a[.='Continue']")
    public WebElement continueButton;
}
