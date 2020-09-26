package verizonStepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import verizonhome.VerizonHome;

import java.io.IOException;

public class VerizonStepDefinitions extends VerizonHome {

    VerizonHome verizonHome;


    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Before
    public void getInit() {
        verizonHome = PageFactory.initElements(driver, VerizonHome.class);
    }


    @Given("I am in verizon  home page")
    public void i_am_in_verizon_home_page() throws IOException {
        openBrowser();
    }

    @Then("I click on store button")
    public void i_click_on_store_button() {
        verizonHome.storeMethod();
    }

    @Then("I verify the page title")
    public void i_verify_the_page_title() {
        verizonHome.verifyPageTitle();

    }

    @Then("I enter  string {string} in type zipcode box")
    public void i_enter_string_in_type_zipcode_box(String string) {
        verizonHome.enterZipCode("43202");

    }

    @Then("I click on search button")
    public void i_click_on_search_button() {
        searchButton.click();
    }

    @Then("I verify the map page title")
    public void i_verify_the_map_page_title() {
        verizonHome.verifyMapPageTitle();

    }

    @Then("I click on verizon button")
    public void i_click_on_verizon_button() {
        verizonHome.verizonButtonMethod();
    }

    @Then("I verify that careers appears properly")
    public void i_verify_that_careers_appears_properly() {
        verizonHome.screenMethod();
    }

    @Then("I scroll down to Find an agent button")
    public void i_scroll_down_to_find_an_agent_button() throws InterruptedException {
        verizonHome.scrollDown();
    }

    @Then("i verify the page title appears properly")
    public void i_verify_the_page_title_appears_properly() throws InterruptedException {
        verizonHome.scrollDown();
    }


//    @Then("I scroll down to Find an agent button")
//    public void i_scroll_down_to_find_an_agent_button() throws InterruptedException {
//
//        public void scrollDown () {
//            JavascriptExecutor myExecutor = (JavascriptExecutor) driver;
//            myExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//            Thread.sleep(3000);
//
//        }

    @Then("I do mouse hover on why verizon button")
    public void i_do_mouse_hover_on_why_verizon_button() {
       verizonHome.mouseHoverByXpath("Why Verizon");
    }

    @Then("I verify that the list drops down")
    public void i_verify_that_the_list_drops_down() {
        verizonHome.verifyPageTitleWhyVerizon();


    }


}
