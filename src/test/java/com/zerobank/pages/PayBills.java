package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBills  extends BasePage{

    @FindBy(xpath = "//a[.='Add New Payee']")
    public WebElement addNewPayee;

    @FindBy(xpath = "//*[@id='np_new_payee_name']")
    public WebElement payeeName;

    @FindBy(xpath = "//*[@id='np_new_payee_account']")
    public WebElement account;

    @FindBy(xpath = "//*[@id='np_new_payee_details']")
    public WebElement payeeDetails;

    @FindBy(xpath = "//*[@id='np_new_payee_address']")
    public WebElement addNewAddress;

    @FindBy(xpath = "//*[@value='Add']")
    public WebElement add;

    @FindBy(xpath = "//a[.='Purchase Foreign Currency']")
    public WebElement purchaseForeignCurrency;

    @FindBy(xpath = "//*[@name='currency']")
    public WebElement currency;

    @FindBy(xpath = "//*[@value='Purchase']")
    public  WebElement purchase;

    @FindBy(xpath = "//*[@id='pc_amount']")
    public WebElement amount;
}
