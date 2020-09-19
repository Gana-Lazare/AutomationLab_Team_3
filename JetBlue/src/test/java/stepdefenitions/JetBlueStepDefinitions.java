package stepdefenitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.io.IOException;

import static jetblueHome.JetBlueHomeWebElement.*;


public class JetBlueStepDefinitions extends WebAPI {


    @Given("IM in Jetblue Home Page")
    public void im_in_jetblue_home_page() throws IOException {
        setUp(false, "BrowserStack", "Windows", "7", "chrome", "85", "https://www.jetblue.com");
    }
    @When("I click on book")
    public void i_click_on_book() {
        clickByLocator(bookWebElement);
    }

    @When("I click on flight")
    public void i_click_on_flight() {
        clickByLocator(flight_book_WebElement);
    }

    @Then("I verify im in flight page")
    public void i_verify_im_in_flight_page() {
        String expectedresult="https://www.jetblue.com/flights";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not equal",expectedresult,actualresult);
    }

    @When("I click on flight and hotel")
    public void i_click_on_flight_and_hotel() {
        clickByLocator(flight_And_Hotels_WebElement);
    }

    @Then("I verify im In flight and hotel page")
    public void i_verify_im_in_flight_and_hotel_page() {
        //okAlert();
        String expectedresult="https://www.jetbluevacations.com/";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not equal",expectedresult,actualresult);
    }




    @After
    public void close(){
        driver.quit();
    }
}
