package com.api.cucumber.stepdefinition;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
    @Given("^today is Sunday$")
    public void today_is_Sunday() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("1st Test");
    }
    @Given("^today is Monday$")
    public void today_is_Monday() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("4th Test");
    }

    @When("^I ask whether it's Friday yet$")
    public void i_ask_whether_it_s_Friday_yet() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("2nd Test");
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("3rd Test");
    }


}
