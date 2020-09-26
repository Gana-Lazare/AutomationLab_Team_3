package stepDefinitions;

import ebayhome.EbayHome;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class EbayHomePageStepDefinition extends EbayHome{
    static EbayHome ebayHome;

    // Cucumber Hook
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Demo1"); // ... and embed it in the report.
        }
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

  //  @BeforeStep
   // public static void getInit() {
  //      ebayHome = PageFactory.initElements(driver, EbayHome.class);
  //  }


    @Given("I am in Ebay homepage")
    public void i_am_in_ebay_homepage() throws IOException {
        //setUp(false, "BrowserStack", "OX S", "10", "chrome", "85", "https://www.ebay.com/");
     openBrowser("https://www.ebay.com/");

    }
    @Given("I enter Hand sanitizer in searchBox")
    public void i_enter_hand_sanitizer_in_search_box() {
       ebayHome.enterSearchKeyword();

    }
    @When("I click searchButton")
    public void i_click_search_button() {
    ebayHome.clickOnSearchButton();

    }
    @Then("I verify Hand Sanitizer is appear properly")
    public void i_verify_hand_sanitizer_is_appear_properly() {

        //ebayHome.validateSearchText("\"Hand Sanitizer\"");
    }
    @Then("I verify page title as Hand sanitizer")
    public void i_verify_page_title_as_hand_sanitizer() {

    }

}