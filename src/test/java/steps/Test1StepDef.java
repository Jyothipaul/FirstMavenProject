package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test1StepDef {

    @Given("^Login to Home Page$")
    public void login_to_Home_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();

        System.out.println("Login to Home Page\n");
    }

    @When("^Enter Details$")
    public void enter_Details() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();

        System.out.println("Enter Details\n");
    }

    @Then("^Print Details$")
    public void print_Details() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();

        System.out.println("Print Details\n");
    }

}
