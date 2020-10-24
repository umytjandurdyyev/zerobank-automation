package com.zerobank.step_definitions;

import com.zerobank.pages.DashboardPage;
import com.zerobank.pages.PayBills;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddNewPayeeStepDefs {

    PayBills payBills = new PayBills();
    @Given("Add New Payee tab")
    public void add_New_Payee_tab() {
        System.out.println("Add New Payee tab");
        new DashboardPage().navigateToModule("Pay Bills");
        payBills.addNewPayee.click();


    }



    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(io.cucumber.datatable.DataTable dataTable) {
        System.out.println("creates new payee using following information");
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }
    @Then("message {string} should be displayed")
    public void message_should_be_displayed(String string) {
        System.out.println("message {string} should be displayed");

    }



}
