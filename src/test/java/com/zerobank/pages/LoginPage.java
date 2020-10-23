package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "signin_button")
    public WebElement signin_button;
    @FindBy(id="user_login")
    public WebElement userName;

    @FindBy(id="user_password")
    public WebElement password;

    @FindBy(xpath = "//input[@value='Sign in']")
    public WebElement submit;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();

    }


}
