package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBills  extends BasePage{

    @FindBy(xpath = "//a[.='Add New Payee']")
    public WebElement addNewPayee;
    @FindBy(css = "#np_new_payee_name")
    public WebElement payeeName;
}
