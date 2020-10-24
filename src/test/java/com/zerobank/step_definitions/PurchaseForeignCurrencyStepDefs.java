package com.zerobank.step_definitions;

import com.zerobank.pages.DashboardPage;
import com.zerobank.pages.PayBills;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PurchaseForeignCurrencyStepDefs {

    PayBills payBills = new PayBills();
    @Given("the user accesses the Purchase foreign currency cash tab")
    public void the_user_accesses_the_Purchase_foreign_currency_cash_tab() {
        new DashboardPage().navigateToModule("Pay Bills");
        payBills.purchaseForeignCurrency.click();
    }

    @Then("following currencies should be available")
    public void following_currencies_should_be_available(List<String> followingCurrencies) {

        Select currencyDropDown = new Select(payBills.currency);
        List<WebElement> options = currencyDropDown.getOptions();
        System.out.println("options.size() = " + options.size());

    }

    @When("user tries to calculate cost without selecting a currency")
    public void user_tries_to_calculate_cost_without_selecting_a_currency() {

    }
    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {

    }

    @When("user tries to calculate cost without entering a value")
    public void user_tries_to_calculate_cost_without_entering_a_value() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
