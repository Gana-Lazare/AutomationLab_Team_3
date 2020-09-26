package stepDefinitions;

import hiltonhotelOffers.HiltonHotelOffers;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.junit.runner.RunWith;

import java.io.IOException;


@RunWith(Cucumber.class)
public class OffersPageStepDefinition extends HiltonHotelOffers {


    static HiltonHotelOffers offers;


     //Cucumber Hook
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Demo1"); // ... and embed it in the report.
        }
        cleanUp();
    }

//    @After
//    public void closeBrowser(){
//        cleanUp();
//    }

    @BeforeStep
    public static void getInit() {
        offers = PageFactory.initElements(driver,HiltonHotelOffers.class);
    }


    //1st Scenario
    @Given("I am in hilton hotel homepage")
    public void i_am_in_hilton_hotel_homepage() throws IOException {
        offers.openBrowser("https://www.hilton.com/en/hilton/");

    }

    @And("I click on offers button")
    public void i_click_on_offers_button() {
        offers.clickOnElement("//*[@id=\"NavMenu\"]/ul/li[8]/a");

    }

    @Then("I verify offers is appear properly")
    public void i_verify_offers_is_appear_properly() {
        offers.validateOffersTextOffers();

    }

    @Then("I verify page title as hilton hotel")
    public void i_verify_page_title_as_hilton_hotel() {
        String expectedTitle="Special Offers from Hilton Hotels and Resorts";
        String actualTitle= driver.getTitle();
        Assert.assertEquals("Title does not match",actualTitle,expectedTitle);
    }

    //2nd Scenario
    @When("I click on Our Best Deal To Dream button")
    public void i_click_on_our_best_deal_to_dream_button() {
        offers.clickOnOurBestDealToDreamButton();

    }

    @Then("I verify Our Best Deal To Dream is appear properly")
    public void i_verify_our_best_deal_to_dream_is_appear_properly() {
        offers.validateOurBestDealToDreamButton();

    }
    //3rd Scenario
    @When("I click on SWEETEN YOUR STAY button")
    public void i_click_on_sweeten_your_stay_button() {
        offers.sweetenYourStayButton();

    }

    @Then("I verify Sweeten is appear properly")
    public void i_verify_sweeten_is_appear_properly() {
        offers.validateSweetenYourStayButton();

    }
    //4th Scenario
    @When("I click on BREAKFAST & WI-FI button")
    public void i_click_on_breakfast_wi_fi_button() {
        offers.clickBreakfastAndWifiButton();

    }

    @Then("I verify BREAKFAST & WI-FI is appear properly")
    public void i_verify_breakfast_wi_fi_is_appear_properly() {
        offers.validateBreakfastAndWifiButtonButton();

    }
    //5th Scenario
    @When("I click on BREAKFAST INCLUDED button")
    public void i_click_on_breakfast_included_button() {
        offers.clickBreakfastIncludedButton();

    }

    @Then("I verify BREAKFAST INCLUDED is appear properly")
    public void i_verify_breakfast_included_is_appear_properly() {
        offers.validateBreakfastIncludedButton();

    }
    //6th Scenario
    @When("I click on FAMILY FUN PACKAGE button")
    public void i_click_on_family_fun_package_button() {
        offers.clickFAMILYFUNPACKAGEButton();

    }

    @Then("I verify FAMILY FUN PACKAGE is appear properly")
    public void i_verify_family_fun_package_is_appear_properly() {
        offers.validateFAMILYFUNPACKAGEButton();
    }
    //7th Scenario
    @When("I click on HILTON GIFT CARD button")
    public void i_click_on_hilton_gift_card_button() {
        offers.clickHILTONGIFTCARDButton();


    }

    @Then("I verify HILTON GIFT CARD is appear properly")
    public void i_verify_hilton_gift_card_is_appear_properly() {
        offers.validateHILTONGIFTCARDButton();

    }
    //8th Scenario
    @When("I click on THE DOUBLE REWARDS PROMOTION button")
    public void i_click_on_the_double_rewards_promotion_button() {
        offers.clickDOUBLEREWARDSPROMOTIONButton();

    }

    @Then("I verify MEMBER LOGIN is appear properly")
    public void i_verify_member_login_is_appear_properly() {
        offers.validateDOUBLEREWARDSPROMOTIONButton();

    }
    //9th Scenario
    @When("I click on HILTON HONORS AMEX SURPASS® button")
    public void i_click_on_hilton_honors_amex_surpass_button() {
        offers.clickHILTONHONORSAMEXSURPASSButton();

    }

    @Then("I verify Four bold ways to accelerate rewards is appear properly")
    public void i_verify_four_bold_ways_to_accelerate_rewards_is_appear_properly() {
        offers.validateHILTONHONORSAMEXSURPASSButton();

    }
    //10th Scenario
    @When("I click on HILTON HONORS CARD button")
    public void i_click_on_hilton_honors_card_button() {
        offers.clickHILTONHONORSCARDButton();

    }

    @Then("I verify Find a Card that's right for you is appear properly")
    public void i_verify_find_a_card_that_s_right_for_you_is_appear_properly() {
        offers.validateHILTONHONORSCARDButton();

    }
    //11th Scenario
    @When("I click on EARN & REDEEM POINTS WITH LYFT button")
    public void i_click_on_earn_redeem_points_with_lyft_button() {
        offers.clickEARNANDREDEEMPOINTSWITHLYFTButton();

    }

    @Then("I verify How it works is appear properly")
    public void i_verify_how_it_works_is_appear_properly() {
        offers.validateEARNANDREDEEMPOINTSWITHLYFTButton();

    }
    //12th Scenario
    @When("I click on HILTON HONORS BUSINESS CARD button")
    public void i_click_on_hilton_honors_business_card_button() {
        offers.clickHILTONHONORSBUSINESSCARDButton();

    }
    //13th Scenario
    @When("I click on HILTON HONORS ASPIRE CARD button")
    public void i_click_on_hilton_honors_aspire_card_button() {
        offers.validateHILTONHONORSBUSINESSCARDButton();

    }

    @Then("I verify HILTON PURCHASES is appear properly")
    public void i_verify_hilton_purchases_is_appear_properly() {
        offers.clickHILTONHONORSASPIRECARDButton();

    }
    //14th Scenario
    @When("I click on SAVE UP TO FIFTY PERCENT OFF SUNDAYS button")
    public void i_click_on_save_up_to_fifty_percent_off_sundays_button() {
        offers.validateHILTONHONORSASPIRECARDButton();

    }

    @Then("I verify Departure is appear properly")
    public void i_verify_departure_is_appear_properly() {
        offers.clickSAVEUPTOFIFTYPERCENTOFFSUNDAYSButton();

    }
    //15th Scenario
    @When("I click on SUITE INDULGENCE button")
    public void i_click_on_suite_indulgence_button() {
        offers.validateSAVEUPTOFIFTYPERCENTOFFSUNDAYSButton();

    }

    @Then("I verify SUITE INDULGENCE is appear properly")
    public void i_verify_suite_indulgence_is_appear_properly() {
        offers.clickSUITEINDULGENCEButton();

    }
    //16th Scenario
    @When("I click on IN PARADISE button")
    public void i_click_on_in_paradise_button() {
        offers.validateSUITEINDULGENCEButton();

    }

    @Then("I verify IN PARADISE is appear properly")
    public void i_verify_in_paradise_is_appear_properly() {
        offers.clickINPARADISEButton();

    }
    //17th Scenario
    @When("I click on two forward button")
    public void i_click_on_two_forward_button() {
        offers.validateINPARADISEButton();

    }

    @Then("I verify HILTON OFFERS is appear properly")
    public void i_verify_hilton_offers_is_appear_properly() {
        offers.clicktwoForwardButton();

    }
    //18th Scenario
    @Given("I click on two button")
    public void i_click_on_two_button() {
        offers.validateTwoForwardButton();

    }

    @When("I click on GOLF STAY & PLAY PACKAGE button")
    public void i_click_on_golf_stay_play_package_button() {
        offers.clickGOLFSTAYANDPLAYPACKAGEButton();

    }

    @Then("I verify Get Ready For Future Travel is appear properly")
    public void i_verify_get_ready_for_future_travel_is_appear_properly() {
        offers.validateGOLFSTAYANDPLAYPACKAGEButton();

    }
    //19th Scenario
    @When("I click on HONORS DISCOUNT ADVANCE PURCHASE button")
    public void i_click_on_honors_discount_advance_purchase_button() {
        offers.clickHONORSDISCOUNTADVANCEPURCHASEButton();

    }

    @Then("I verify FIND A PARTICIPATING HOTEL is appear properly")
    public void i_verify_find_a_participating_hotel_is_appear_properly() {
        offers.validateHONORSDISCOUNTADVANCEPURCHASEButton();

    }
    //20th Scenario
    @When("I click on MILITARY FAMILY RATE button")
    public void i_click_on_military_family_rate_button() {
        offers.clickMILITARYFAMILYRATEButton();

    }

    @Then("I verify MILITARY FAMILY RATE is appear properly")
    public void i_verify_military_family_rate_is_appear_properly() {
        offers.validateMILITARYFAMILYRATEButton();

    }
    //21st Scenario
    @When("I click on CELEBRATE IN STYLE button")
    public void i_click_on_celebrate_in_style_button() {
        offers.clickCELEBRATEINSTYLEButton();

    }

    @Then("I verify CELEBRATE IN STYLE is appear properly")
    public void i_verify_celebrate_in_style_is_appear_properly() {
        offers.validateCELEBRATEINSTYLEButton();

    }
    //22nd Scenario
    @When("I click on 2X POINTS PACKAGE button")
    public void i_click_on_2x_points_package_button() {
        offers.clickXPOINTSPACKAGEButton();

    }

    @Then("I verify 2X POINTS PACKAGE is appear properly")
    public void i_verify_2x_points_package_is_appear_properly() {
        offers.validateXPOINTSPACKAGEButton();

    }
    //23rd Scenario
    @When("I click on STAY HILTON GO OUT button")
    public void i_click_on_stay_hilton_go_out_button() {
        offers.clickSTAYHILTONGOOUTButton();

    }

    @Then("I verify STAY HILTON GO OUT is appear properly")
    public void i_verify_stay_hilton_go_out_is_appear_properly() {
        offers.validateSTAYHILTONGOOUTButton();

    }
    //24th Scenario
    @When("I click on WEEKEND GETAWAY button")
    public void i_click_on_weekend_getaway_button() {
        offers.clickWEEKENDGETAWAYButton();

    }

    @Then("I verify WEEKEND GETAWAY is appear properly")
    public void i_verify_weekend_getaway_is_appear_properly() {
        offers.validateWEEKENDGETAWAYButton();

    }
    //Mouse Hover
    public static void mouseHover(WebElement loginHoverButton){
        Actions actions = new Actions (driver);
        actions.moveToElement(loginHoverButton).perform();
    }



}
