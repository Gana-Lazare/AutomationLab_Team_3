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
        aetnaHome.AetnaExploreSite();
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
    public void i_enter_search_text(String string) {

    }

    @Then("I click on submit")
    public void i_click_on_submit() {

    }

    @Then("I verify the provider page title")
    public void i_verify_the_provider_page_title() {

    }



//    @Given("I am in Aetna Homepage")
//    public void i_am_in_aetna_home_page() throws IOException {
//        aetnaHome.openBrowser();
//
//    }
//    @Given("I click on Expplore Aetna Site")
//    public void i_clicked_on_expplore_aetna_site() throws InterruptedException {
//        aetnaHome.AetnaExploreSite();
//    }
//    @Then("I verify the page title0")
//    public void i_verify_the_page_title0() {
//        aetnaHome.pageLoadingValidation();
//    }
//
//    @Then("I click on For Agents Brokers")
//    public void i_click_on_for_agents_brokers() throws InterruptedException {
//        aetnaHome.forAgentsBrokers();
//    }
//
//
//    @Then("I click on search button")
//    public void i_click_on_search_button() throws InterruptedException {
//        aetnaHome.searchBox();
//    }
//
//    @Then("I enter search text {string} and submit")
//    public void i_enter_search_text_and_submit(String string) {
//        aetnaHome.pageLoadingValidation();
//    }
//
//    @Then("I verify the page title")
//    public void i_verify_that_the_page_title() {
//        aetnaHome.pageLoadingValidation();
//    }
//
//
//    @Then("I verify the page title1")
//    public void i_verify_the_page_title1() {
//       aetnaHome.verifyPageTitle(st);
//    }
//
//
//
//    //Scenarion2
//    @Given("I am in Aetna Homepage")
//    public void i_am_in_aetna_homepage() throws IOException {
//        aetnaHome.openBrowser();
//    }
//
//
//    @Then("I click on Expplore Aetna Site")
//    public void i_click_on_expplore_aetna_site() throws InterruptedException {
//        aetnaHome.AetnaExploreSite();
//    }
//
//
//    @Then("I verify the page title2")
//    public void i_verify_the_page_title2() {
//      aetnaHome.verifyPageTitle("Expplore Aetna");
//    }

//    //Scenario 3
//
//
//    @Then("I click on login1 button")
//    public void i_click_on_login1_button() {
//
//    }
//
//    @Then("i verify the login page title3")
//    public void i_verify_the_login_page_title3() {
//
//    }
//
//    @Then("I click on member button")
//    public void i_click_on_member_button() {
//
//    }
//
//    @Then("I verify the member page title4")
//    public void i_verify_the_member_page_title4() {
//       aetnaHome.verifyPageTitle("member");
//    }
//
//    @Then("I click on login2 button")
//    public void i_click_on_login2_button() {
//
//    }
//
//    @Then("I enter a valid user name")
//    public void i_enter_a_valid_user_name() {
//
//    }
//
//    @Then("I enter a valid password")
//    public void i_enter_a_valid_password() {
//
//    }
//
//    @Then("I click on secure login button")
//    public void i_click_on_secure_login_button() {
//
//    }
//
//    //Scenario 4
//
//
//    @Then("I click login button")
//    public void i_click_login_button() {
//
//    }
//
//    @Then("I click on member button1")
//    public void i_click_on_member_button1() {
//
//    }
//
//    @Then("I verify the member page title")
//    public void i_verify_the_member_page_title() {
//        aetnaHome.verifyPageTitle("member");
//    }
//
//    @Then("I click on register button")
//    public void i_click_on_register_button() {
//
//    }
//
//    @Then("I select member iD option")
//    public void i_select_member_i_d_option() {
//
//    }
//
//    @Then(" enter String \" member ID\" and submit")
//    public void i_enter_search_text_and_submit1() {
//
//    }
//
//    @Then("I click on continue button")
//    public void i_click_on_continue_button() {
//
//    }
//
//    @Then("i verify the page title5")
//    public void i_verify_the_page_title5() {
//      aetnaHome.verifyPageTitle("register");
//    }
//
//
//    @Then("I click on Aetna.com Button")
//    public void i_click_on_aetna_com_button() {
//       aetnaHome.aetnaCom();
//    }
//
//    @Then("I verify the page title6")
//    public void i_verify_the_page_title6() {
//        aetnaHome.verifyPageTitle("Individual &amp; Family Health Insurance Plans | Aetna");
//    }
//
//
//    @Then("I click on For Providers Button")
//    public void i_click_on_for_providers_button() {
//    aetnaHome.forProviderMethod();
//    }
//
//    @Then("I verify the page title7")
//    public void i_verify_the_page_title7() {
//       aetnaHome.verifyPageTitle("Aetna for Health Care Providers | Resources &amp; Support for Health Care Professionals");
//    }
//
//
//    @Then("I click on For Employers Button")
//    public void i_click_on_for_employers_button() {
//        aetnaHome.forEmployerMethod();
//    }
//
//    @Then("I verify the page title8")
//    public void i_verify_the_page_title8() {
//        aetnaHome.verifyPageTitle("Employer Group Health Insurance Plans &amp; Benefits | Aetna");
//    }
//
//
//    @Then("I click on For Agents Brokers Button")
//    public void i_click_on_for_agents_brokers_button() {
//        //to be continued
//    }
//
//    @Then("I verify the page title9")
//    public void i_verify_the_page_title9() {
//
//    }
//
//
//    @Then("I click on For Partners Button")
//    public void i_click_on_for_partners_button() {
//
//    }
//
//    @Then("I verify the page title10")
//    public void i_verify_the_page_title10() {
//
//    }
//
//
//    @Then("I click on Careers Button")
//    public void i_click_on_careers_button() {
//
//    }
//
//    @Then("I verify the page title11")
//    public void i_verify_the_page_title11() {
//
//    }
//
//
//    @Then("I click on About Us Button")
//    public void i_click_on_about_us_button() {
//
//    }
//
//    @Then("I verify the page title12")
//    public void i_verify_the_page_title12() {
//
//    }
//
//    @Then("I verify the page title13")
//    public void i_verify_the_page_title13() {
//
//    }
//
//    @Then("I click on For Partners")
//    public void i_click_on_for_partners() {
//
//    }
//
//    @Then("I Scroll down to the end of the page")
//    public void i_scroll_down_to_the_end_of_the_page() {
//
//    }
//
//    @Then("I verify the last element is visible")
//    public void i_verify_the_last_element_is_visible() {
//
//
//    }

}
