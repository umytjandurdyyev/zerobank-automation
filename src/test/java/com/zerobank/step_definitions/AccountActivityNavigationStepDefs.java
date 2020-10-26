package com.zerobank.step_definitions;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityNavigationStepDefs  {


    @When("the user clicks on {string} link on the {string} page")
    public void the_user_clicks_on_link_on_the_page(String string, String string2) {
        Driver.get().findElement(By.xpath("//a[.='"+string+"']")).click();
    }

    @Then("the Account Activity page should be displayed")
    public void the_page_should_be_displayed() {
        try {
            String expectedUrl = "http://zero.webappsecurity.com/bank/account-activity.html";
            String actualUrl = Driver.get().getCurrentUrl();
            Assert.assertTrue(expectedUrl.contains(expectedUrl));
            System.out.println(expectedUrl);
        }catch (Exception e){
            System.out.println("Something went wrong");
        }


    }

    @And("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String string) {
        BrowserUtils.waitFor(2);
        WebElement dropdownElement = Driver.get().findElement(By.name("accountId"));
        Select accountActivity = new Select(dropdownElement);
        String actual = accountActivity.getFirstSelectedOption().getText();
        System.out.println(actual);
        Assert.assertEquals(string,actual);
    }





}
