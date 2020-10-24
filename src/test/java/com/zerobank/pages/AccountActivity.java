package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountActivity extends BasePage {

    public AccountActivity(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "//a[.='Show Transactions']")
    public WebElement showTransactions;

    @FindBy(xpath = "//a[.='Find Transactions']")
    public WebElement findTransactions;

    @FindBy(xpath = "//*[@id='aa_fromDate']")
    public WebElement fromDate;

    @FindBy(xpath = "//*[@id='aa_toDate']")
    public WebElement toDate;

    @FindBy(xpath = "//*[@id='aa_description']")
    public WebElement description;

    @FindBy(xpath = "//*[@id='aa_fromAmount']")
    public WebElement fromAmount;

    @FindBy(xpath = "//*[@id='aa_toAmount']")
    public WebElement toAmount;

    @FindBy(id = "aa_type")
    public WebElement type;

    @FindBy(xpath = "//*[@id='find_transactions_form']/div[2]/button")
    public WebElement find;

    @FindBy(xpath = "//*[@id='filtered_transactions_for_account']/table/tbody/tr")
    public WebElement tableWithOutHead;


    public void sendKeysDates(String str1, String str2){
        BrowserUtils.waitFor(2);
        fromDate.sendKeys(str1);
        toDate.sendKeys(str2);
        clickFind();
    }
    public void clickFind(){
        find.click();
    }


}
