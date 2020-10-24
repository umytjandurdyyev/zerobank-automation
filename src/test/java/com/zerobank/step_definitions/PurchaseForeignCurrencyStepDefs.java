package com.zerobank.step_definitions;

import com.zerobank.pages.DashboardPage;
import com.zerobank.pages.PayBills;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class PurchaseForeignCurrencyStepDefs {

    PayBills payBills = new PayBills();
    @Given("the user accesses the Purchase foreign currency cash tab")
    public void the_user_accesses_the_Purchase_foreign_currency_cash_tab() {
        new DashboardPage().navigateToModule("Pay Bills");
        payBills.purchaseForeignCurrency.click();
        BrowserUtils.waitFor(3);

    }

    @Then("following currencies should be available")
    public void following_currencies_should_be_available(List<String> followingCurrencies) {

        Select currencyDropDown = new Select(payBills.currency);
        List<WebElement> options = currencyDropDown.getOptions();
        System.out.println("options.size() = " + options.size());
        for (int i = 1; i <= followingCurrencies.size(); i++) {
            currencyDropDown.selectByIndex(i);
            String expected = followingCurrencies.get(i-1);
            String actual = currencyDropDown.getFirstSelectedOption().getText();
            Assert.assertEquals(expected,actual);
            System.out.println(currencyDropDown.getFirstSelectedOption().getText());
        }




    }

    @When("user tries to calculate cost without selecting a currency")
    public void user_tries_to_calculate_cost_without_selecting_a_currency() {

        Random rn = new Random();
        int num = rn.nextInt(1000)+1;
        payBills.amount.sendKeys(Integer.toString(num));
        BrowserUtils.waitFor(1);
        payBills.purchase.click();

    }
    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {

        Alert alert = Driver.get().switchTo().alert();
        BrowserUtils.waitFor(1);
        alert.accept();
    }

    @When("user tries to calculate cost without entering a value")
    public void user_tries_to_calculate_cost_without_entering_a_value() {

        payBills.purchase.click();
    }

}
