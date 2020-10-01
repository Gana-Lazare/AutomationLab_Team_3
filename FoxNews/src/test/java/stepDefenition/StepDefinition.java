package stepDefenition;

import foxnewsHome.FoxNewsHome;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class StepDefinition extends FoxNewsHome {
    static FoxNewsHome foxNewsHome;
    @After
    public void closeBrowser(){ cleanUp();}

    @Before
    public void getInit(){ foxNewsHome = PageFactory.initElements(driver,FoxNewsHome.class);

    }

    @Given("I am in fox news home page")
    public void i_am_in_fox_news_home_page() throws IOException {
     foxNewsHome.openBrowser();
    }

    @Then("I click on business button")
    public void i_click_on_business_button() throws InterruptedException {
       foxNewsHome.business();
    }

    @Then("I verify the business page title")
    public void i_verify_the_business_page_title() {
 foxNewsHome.verifyBusinessPageTitle();
    }

    @Then("I click on personal Finance button")
    public void i_click_on_personal_finance_button() throws InterruptedException {
        foxNewsHome.personalFinance();
    }

    @Then("I verify the personal Finance page title")
    public void i_verify_the_personal_finance_page_title() {
        foxNewsHome.verifyPersonalFinancePageTitle();
    }

    @Then("I click on morning With Maria button")
    public void i_click_on_morning_with_maria_button() throws InterruptedException {
    foxNewsHome.morningWithMaria();
    }

    @Then("I verify the morning With Maria page title")
    public void i_verify_the_morning_with_maria_page_title() {
       foxNewsHome.verifyMorningWithMariaPageTitle();
    }

    @Then("I click on soccer button")
    public void i_click_on_soccer_button() throws InterruptedException {
        foxNewsHome.soccer();
    }

    @Then("I verify the soccer page title")
    public void i_verify_the_soccer_page_title() {

    }

    @Then("I click on election Button button")
    public void i_click_on_election_button_button() throws InterruptedException {
       foxNewsHome.electionButtonMethod();
    }

    @Then("I verify the election Button page title")
    public void i_verify_the_election_button_page_title() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I click on economy button button")
    public void i_click_on_economy_button_button() {
        foxNewsHome.economyMethod();
    }

    @Then("I verify the economy button page title")
    public void i_verify_the_economy_button_page_title() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
