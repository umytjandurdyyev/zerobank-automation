package com.zerobank.step_definitions;

import com.zerobank.pages.DashboardPage;
import com.zerobank.pages.PayBills;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Map;

public class AddNewPayeeStepDefs {

    PayBills payBills = new PayBills();

    @Given("Add New Payee tab")
    public void add_New_Payee_tab() {

        new DashboardPage().navigateToModule("Pay Bills");
        payBills.addNewPayee.click();


    }



    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String,String> newPayee) {
        try{
            payBills.payeeName.sendKeys(newPayee.get("Payee Name "));
            BrowserUtils.waitFor(1);
            payBills.addNewAddress.sendKeys(newPayee.get("Payee Address "));
            BrowserUtils.waitFor(1);
            payBills.account.sendKeys(newPayee.get("Account"));
            BrowserUtils.waitFor(1);
            payBills.payeeDetails.sendKeys(newPayee.get("Payee details"));
            BrowserUtils.waitFor(1);
            payBills.add.click();
        }catch (Exception e){
            System.out.println(e);
        }


    }
    @Then("message {string} should be displayed")
    public void message_should_be_displayed(String string) {
        String actual = Driver.get().findElement(By.partialLinkText("The new payee The Law ")).getText();
        Assert.assertEquals(string,actual);


    }



}
