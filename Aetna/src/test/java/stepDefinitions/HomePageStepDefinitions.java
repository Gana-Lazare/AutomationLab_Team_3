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
    public static String st="";


    @BeforeStep
    public void getInit() {
        aetnaHome = PageFactory.initElements(driver, AetnaHome.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I am in Aetna Homepage")
    public void i_am_in_aetna_homepage() throws IOException {
        aetnaHome.openBrowser();
    }

    @Then("I click on Expplore Aetna Site")
    public void i_click_on_expplore_aetna_site() throws InterruptedException {
        aetnaHome.aetnaExploreSiteMethod();
    }

    @Then("I verify the Expplore Aetna page title")
    public void i_verify_the_expplore_aetna_page_title() {
        aetnaHome.pageLoadingValidation();
    }

    @Then("I click on search button")
    public void i_click_on_search_button() throws InterruptedException {
        aetnaHome.searchBox();
    }

    @Then("I enter search text {string}")
    public void i_enter_search_text(String string) throws InterruptedException {
    aetnaHome.enterSearchKeyword();
    }

    @Then("I click on submit")
    public void i_click_on_submit() {
        aetnaHome.searchItem();
    }

    @Then("I verify the provider page title")
    public void i_verify_the_provider_page_title() {
    aetnaHome.verifyProviderPageTitle();
    }
//============

    @Then("I click on Aetna_com Button")
    public void i_click_on_aetna_com_button() {
    aetnaHome.aetna();
    }

    @Then("I verify the Aetna_com page title")
    public void i_verify_the_page_title() {
    aetnaHome.verifyAetnaPageTitle();
    }
//====



    @Then("I click on For Providers Button")
    public void i_click_on_for_providers_button() {
      aetnaHome.forProviderMethod();
    }

    @Then("I verify For Providers page title")
    public void i_verify_for_Providers_page_title() {
    aetnaHome.verifyForProvidersPageTitle();
    }
//======

    @Then("I click on For Employers Button")
    public void i_click_on_for_employers_button() {
     aetnaHome.forEmployerMethod();
    }

    @Then("I verify For Employers page title")
    public void i_verify_for_employers_page_title() {
    aetnaHome.verifyForEmployersPageTitle();
    }
    //===

    @Then("I click on For Agents Brokers Button")
    public void i_click_on_for_agents_brokers_button() {
       aetnaHome.forAgentMethod();
    }

    @Then("I verify Agents Brokers page title")
    public void i_verify_agents_brokers_page_title() {
    aetnaHome.verifyAgentBrokersPageTitle();
    }
//======

    @Then("I click on For Partners Button")
    public void i_click_on_for_partners_button() throws InterruptedException {
        aetnaHome.forPartners();
    }

    @Then("I verify For Partners page title")
    public void i_verify_for_partners_page_title() {
    aetnaHome.verifyForPartnersPageTitle();
    }

//======
    @Then("I click on Careers Button")
    public void i_click_on_careers_button() {
    aetnaHome.careersMethod();
}

    @Then("I verify the Careers page title")
    public void i_verify_the_careers_page_title() {
    aetnaHome.verifyCareersPageTitle();
    }
    //=========

    @Then("I click on About Us Button")
    public void i_click_on_about_us_button() {
    aetnaHome.aboutUsMethod();
    }

    @Then("I verify About Us page title")
    public void i_verify_about_us_page_title() {
        aetnaHome.verifyAboutUsPageTitle();
    }


}
