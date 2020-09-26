package libertyMuStepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import libertyMutualHome.LibertyMutualHome;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LibertyMutStepDefinitions extends LibertyMutualHome {
     LibertyMutualHome libertyMutualHome;

    @After
    public void closeBrowser(){ cleanUp();}

    @Before
    public void getInit(){ libertyMutualHome = PageFactory.initElements(driver,LibertyMutualHome.class);
    }

    @Given("I am in liberty mutual home page")
    public void i_am_in_liberty_mutual_home_page() throws IOException {
      libertyMutualHome.openBrowser();
    }

    @Then("I click on liberty Mutual button")
    public void i_click_on_liberty_mutual_button() {
        libertyMutualHome.libertyMutualInsuranceMethod();
    }

    @Then("I click on Business Insurance button")
    public void i_click_on_business_insurance_button() throws InterruptedException {
       libertyMutualHome.businessInsuranceMethod();
    }

    @Then("I verify the liberty Mutual page title")
    public void i_verify_the_liberty_mutual_page_title() {
      libertyMutualHome.verifyPageTitle();
    }

    @Then("I enter  string {string} in search box")
    public void i_enter_string_in_search_box(String string) {
       libertyMutualHome.searchTextMethod();
    }

    @Then("I verify the policy page title")
    public void i_verify_the_policy_page_title() {
    libertyMutualHome.verifyPolicyPageTitle();
    }

    @Then("i verify the Business Insurance page title")
    public void i_verify_the_business_insurance_page_title() {
    libertyMutualHome.verifyBusinessInsurancePageTitle();
    }

    @Then("I click on coverage button")
    public void i_click_on_coverage_button() {
    libertyMutualHome.coverageMethod();
    }

    @Then("I verify coverage page title")
    public void i_verify_coverage_page_title() {
    libertyMutualHome.verifyCoveragePageTitle();
    }

    @Then("I click on Industries button")
    public void i_click_on_industries_button() {
       libertyMutualHome.industriesMethod();
    }

    @Then("I verify Industries page title")
    public void i_verify_industries_page_title() {
    libertyMutualHome.verifyIndustriesPageTitle();
    }

    @Then("I click on claims button")
    public void i_click_on_claims_button() {
        libertyMutualHome.claimsMethod();
    }

    @Then("I verify claims page title")
    public void i_verify_claims_page_title() throws InterruptedException {
    libertyMutualHome.verifyClaimPageTitle();
    }

    @Then("I click on Services button")
    public void i_click_on_services_button() {
        libertyMutualHome.servicesMethod();
    }

    @Then("I verify Services page title")
    public void i_verify_services_page_title() {
    libertyMutualHome.verifyServicesPageTitle();
    }

    @Then("I click on Business size button")
    public void i_click_on_business_size_button() throws InterruptedException {
        libertyMutualHome.businessSizeMethod();
    }

    @Then("I verify Business size page title")
    public void i_verify_business_size_page_title() {
        libertyMutualHome.verifyBusinessSizePageTitle();
    }



//    @Given("I am in liberty mutual home page")
//    public void i_am_in_liberty_mutual_home_page() throws IOException {
//        openBrowser();
//    }
//
//    @Then("I click on Business Insurance button")
//    public void i_click_on_business_insurance_button() {
//    libertyMutualHome.businessInsuranceMethod();
//    }
//
//    @Then("I verify the page title")
//    public void i_verify_the_page_title() {
//        libertyMutualHome.verifyPageTitle();
//    }
//
//    @Then("I enter  string {string} in search box")
//    public void i_enter_string_in_search_box(String string) {
//        libertyMutualHome.enterSearchKeyword("policy");
//
//    }
//
//    @Then("I click on search button")
//    public void i_click_on_search_button() {
//        libertyMutualHome.clickOnSearchButton();
//
//    }
//
//
//
//    @Then("I click on liberty Mutual button")
//    public void i_click_on_liberty_mutual_button() {
//       libertyMutualHome.libertyMutualInsuranceMethod();
//    }
//
//    @Then("I do mouse hover on About liberty mutual Button")
//    public void i_do_mouse_hover_on_about_liberty_mutual_button() {
//
//    }
//
//    @Then("I verify that careers appears properly")
//    public void i_verify_that_careers_appears_properly() {
//
//    }
//
//    @Then("I scroll down to Find an agent button")
//    public void i_scroll_down_to_find_an_agent_button() {
//
//    }
//
//    @Then("I verify that More Button appears properly")
//    public void i_verify_that_more_button_appears_properly() {
//
//    }
//
//    @Then("I click on more button")
//    public void i_click_on_more_button() {
//
//    }
//
//    @Then("i verify the page title appears properly")
//    public void i_verify_the_page_title_appears_properly() {
//
//    }
//
//    @Then("I enter the a valid {string}")
//    public void i_enter_the_a_valid(String string) {
//
//
//    }
//
//    @Then("I enter  {string}")
//    public void i_enter(String string) {
//
//    }
//
//    @Then("I enter {string}")
//    public void i_enter(String string, io.cucumber.datatable.DataTable dataTable) {
//        // Write code here that turns the phrase above into concrete actions
//        // For automatic transformation, change DataTable to one of
//        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//        // Double, Byte, Short, Long, BigInteger or BigDecimal.
//        //
//        // For other transformations you can register a DataTableType.
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("I click on Go button")
//    public void i_click_on_go_button() {
//
//    }
//
//    @Then("I verify that list of Agent displays")
//    public void i_verify_that_list_of_agent_displays() {
//
//    }

}


