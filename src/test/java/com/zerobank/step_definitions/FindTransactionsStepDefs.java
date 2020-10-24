package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivity;
import com.zerobank.pages.DashboardPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class FindTransactionsStepDefs  {

    AccountActivity accountActivity = new AccountActivity();

    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {

        new DashboardPage().navigateToModule("Account Activity");
        accountActivity.findTransactions.click();
        BrowserUtils.waitFor(2);
    }

    @When("the firstly user enters date range from {string} to {string}")
    public void the_firstly_user_enters_date_range_from_to(String string, String string2) {
        accountActivity.fromDate.sendKeys(string);
        BrowserUtils.waitFor(1);
        accountActivity.toDate.sendKeys(string2);
        BrowserUtils.waitFor(1);
    }

    @Then("clicks search")
    public void clicks_search() {
        accountActivity.find.click();
        BrowserUtils.waitFor(1);

    }
    @Then("first results table should only show transactions dates between {string} to {string}")
    public void first_results_table_should_only_show_transactions_dates_between_to(String string, String string2) {
        List<String> actualValue = new ArrayList<>();

        for (int i = 1; i <= getNumberOfRows(); i++) {
            WebElement valueRow = Driver.get().findElement(By.xpath("//*[@id='filtered_transactions_for_account']/table/tbody/tr[" + i + "]/td[" + 1 + "]"));
            System.out.println(valueRow.getText());
            actualValue.add(valueRow.getText());

        }
        Assert.assertEquals(string,actualValue.get(actualValue.size()-1));
        Assert.assertEquals(string2,actualValue.get(0));

        BrowserUtils.waitFor(1);
    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {

        List<String> actualValue = new ArrayList<>();

        for (int i = 1; i <= getNumberOfRows(); i++) {
            WebElement valueRow = Driver.get().findElement(By.xpath("//*[@id='filtered_transactions_for_account']/table/tbody/tr[" + i + "]/td[" + 1 + "]"));
            System.out.println(valueRow.getText());
            actualValue.add(valueRow.getText());

        }
        System.out.println(actualValue.toString());

    }

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String string, String string2) {

        accountActivity.fromDate.clear();

        accountActivity.fromDate.sendKeys(string);
        BrowserUtils.waitFor(1);

        accountActivity.toDate.clear();
        accountActivity.toDate.sendKeys(string2);
        BrowserUtils.waitFor(1);


    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String string, String string2) {

        List<String> actualValue = new ArrayList<>();

        for (int i = 1; i <= getNumberOfRows(); i++) {
            WebElement valueRow = Driver.get().findElement(By.xpath("//*[@id='filtered_transactions_for_account']/table/tbody/tr[" + i + "]/td[" + 1 + "]"));
            System.out.println(valueRow.getText());
            actualValue.add(valueRow.getText());

        }
        System.out.println(actualValue.toString());
        Assert.assertFalse(actualValue.get(actualValue.size()-1).contains(string));
        Assert.assertEquals(string2,actualValue.get(0));

        BrowserUtils.waitFor(1);

    }

    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String string) {
        List<String> actualValue = new ArrayList<>();

        for (int i = 1; i <= getNumberOfRows(); i++) {
            WebElement valueRow = Driver.get().findElement(By.xpath("//*[@id='filtered_transactions_for_account']/table/tbody/tr[" + i + "]/td[" + 1 + "]"));
            System.out.println(valueRow.getText());
            actualValue.add(valueRow.getText());

        }
        System.out.println(actualValue.toString());
        Assert.assertFalse(string.contains(actualValue.get(actualValue.size()-1)));


        BrowserUtils.waitFor(1);
    }



    @When("the user enters description “ONLINE”")
    public void the_user_enters_description_ONLINE() {

    }
    @Then("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String string) {

    }
    @When("the user enters description {string}")
    public void the_user_enters_description(String string) {

    }
    @Then("results table should not show descriptions containing {string}")
    public void results_table_should_not_show_descriptions_containing(String string) {

    }

    @Then("results table should show at least one result under Deposit")
    public void results_table_should_show_at_least_one_result_under_Deposit() {

    }
    @Then("results table should show at least one result under Withdrawal")
    public void results_table_should_show_at_least_one_result_under_Withdrawal() {

    }
    @When("user selects type {string}")
    public void user_selects_type(String string) {

    }
    @Then("results table should show no result under Withdrawal")
    public void results_table_should_show_no_result_under_Withdrawal() {

    }
    @Then("results table should show no result under Deposit")
    public void results_table_should_show_no_result_under_Deposit() {

    }

    private int getNUmberOfColumn() {
        List<WebElement> allRowsWithHeader = Driver.get().findElements(By.xpath("(//*[@id='filtered_transactions_for_account']/table/thead/tr/th)"));

        return allRowsWithHeader.size();
    }

    private int getNumberOfRows() {
        List<WebElement> numRow = Driver.get().findElements(By.xpath("(//*[@id='filtered_transactions_for_account']/table/tbody/tr)"));

        return numRow.size();
    }


}
