package stepDefinitionsJetBlue;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import jetblueHome.JetBlueHome;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class JetBlueStepDefinitions extends JetBlueHome {
        JetBlueHome jetBlueHome;
    @After
    public void closeBrowser(){ cleanUp();}

    @Before
    public void getInit(){ jetBlueHome = PageFactory.initElements(driver,JetBlueHome.class);
    }


    @Given("I am in jetBlue home page")
    public void i_am_in_jet_blue_home_page() throws IOException {
        jetBlueHome.openBrowser();
    }

    @Then("I click on TrueBlue button")
    public void i_click_on_true_blue_button() {
       jetBlueHome.trueBlueMethod();
    }

    @Then("T verify the TrueBlue page title")
    public void t_verify_the_true_blue_page_title() {

    }

    @Then("I click on Earning Points button")
    public void i_click_on_earning_points_button() {

    }

    @Then("I verify the Earning Points page title")
    public void i_verify_the_earning_points_page_title() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I click on Flight Hotel button")
    public void i_click_on_flight_hotel_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I verify the Flights Hotel page title")
    public void i_verify_the_flights_hotel_page_title() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I click on Reason to join button")
    public void i_click_on_reason_to_join_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("T verify the Reason to join page title")
    public void t_verify_the_reason_to_join_page_title() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I click on Using Points button")
    public void i_click_on_using_points_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I verify the Using Points page title")
    public void i_verify_the_using_points_page_title() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I click on join today button")
    public void i_click_on_join_today_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I verify the join today page title")
    public void i_verify_the_join_today_page_title() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
