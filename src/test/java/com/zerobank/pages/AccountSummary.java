package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSummary extends BasePage{

    @FindBy(xpath = "//a[.='Brokerage']")
    public WebElement brokerage;
    @FindBy(xpath = "//a[.='Savings']")
    public WebElement savings;
    @FindBy(xpath = "//a[.='Checking']")
    public WebElement shecking;
    @FindBy(xpath = "//a[.='Credit Card']")
    public WebElement sredit_Card;
    @FindBy(xpath = "//a[.='Loan']")
    public WebElement loan;

    public void click(String string){

    }
}
