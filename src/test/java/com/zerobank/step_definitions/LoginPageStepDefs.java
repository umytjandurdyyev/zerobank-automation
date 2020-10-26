package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;

public class LoginPageStepDefs {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {

        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        String url = ConfigurationReader.get("url");
        Driver.get().manage().window().maximize();
        Driver.get().get(url);
        LoginPage loginPage = new LoginPage();
        loginPage.signin_button.click();
        loginPage.login(username,password);

    }
}
