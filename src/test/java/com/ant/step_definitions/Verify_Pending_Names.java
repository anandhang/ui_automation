package com.ant.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_Pending_Names {

    @Given("user is in home page")
    public void user_is_in_home_page() {
        System.out.println("user_is_in_home_page");
    }

    @When("click option on menu")
    public void click_option_on_menu()
    {
        System.out.println("click_option_on_menu");
    }

    @When("enter option name {string}")
    public void enter_option_name(String string) {
        System.out.println("enter_option_name: "+string);
    }

    @Then("click on enter button")
    public void click_on_enter_button()
    {
        System.out.println("logged_in_to_home_page");
    }

    @Then("the user should see the message as {string}")
    public void the_user_should_see_the_message_as(String string) {
        System.out.println("logged_in_to_home_page:"+string);
    }
}
