package com.framework.pages;

import com.framework.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AP_HomePage {

    public AP_HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.=' Signup / Login']")
    public WebElement signupLoginButton;

    @FindBy(xpath = "//i[@class='fa fa-user']/following-sibling::b")
    public WebElement loggedInAsName;


}
