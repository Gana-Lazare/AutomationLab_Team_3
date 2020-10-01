package stepDefinitions;

import aetnahome.AetnaHome;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
//import org.w3c.dom.html.HTMLInputElement;

import java.io.IOException;


public class HomePageStepDefinitions extends WebAPI {

    static  AetnaHome aetnahome;


    @BeforeStep
    public static void getInit(){
        aetnahome= PageFactory.initElements(driver,AetnaHome.class);
    }



    @After
    public void closeBrowser(){
        cleanUp();
    }


    @Given("I am in Aetna home page")
    public void i_am_in_aetna_home_page() throws IOException {
    openBrowser();
    }

    @Then("I click in drop down button")
    public void i_click_in_drop_down_button() throws InterruptedException {
        aetnahome.exploreAetnaSites();
    }

    @Then("I verify that the list appears correctly")
    public void i_verify_that_the_list_appears_correctly() {
   aetnahome.listAppears();
    }

    @Then("I click in about us button")
    public void i_click_in_about_us_button() {

    }

    @Then("I verify the page title")
    public void i_verify_the_page_title() {

    }

}