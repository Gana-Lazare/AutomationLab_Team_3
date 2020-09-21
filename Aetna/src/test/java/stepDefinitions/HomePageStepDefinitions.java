package stepDefinitions;

import aetnahome.AetnaHome;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePageStepDefinitions extends AetnaHome {
static AetnaHome aetnaHome;
public WebDriver driver;

    @BeforeStep
    public void getInit(){
        aetnaHome= PageFactory.initElements(driver,AetnaHome.class);
    }
    @After
    public void closeBrowser(){
        cleanUp();
    }


    @Given("I am in Aetna Homepage")
    public void i_am_in_aetna_home_page() throws IOException {
     openBrowser();

    }

    @Given("I click on Expplore Aetna Site")
    public void i_clicked_on_expplore_aetna_site() throws InterruptedException {
       aetnaHome.AetnaExploreSite();
    }
        @Then("I verify the page title")
    public void i_verify_the_page_title() { aetnaHome.pageLoadingValidation();
    }

    @Then("I click on For Agents Brokers")
    public void i_click_on_for_agents_brokers() throws InterruptedException {
        aetnaHome.forAgentsBrokers();
    }

    @Then("I click on search button")
    public void i_click_on_search_button() throws InterruptedException {
    aetnaHome.searchBox();
    }

    @Then("I enter search text {string} and submit")
    public void i_enter_search_text_and_submit(String string) {
    aetnaHome.pageLoadingValidation();
    }

    @Then("I verify the page title")
    public void i_verify_that_the_page_title() {
    aetnaHome.pageLoadingValidation();
    }



}
