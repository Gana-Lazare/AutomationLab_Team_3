package stepDefinitions;


import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

import static hiltonhotelHome.HiltonHotelHomeWebElement.*;

public class HiltonStepDefinition_G  extends WebAPI {


    @Given("IM In HiltonHotel home page")
    public void im_in_hilton_hotel_home_page() throws IOException {
        setUp(false, "BrowserStack", "Windows", "7", "chrome", "85", "https://www.hilton.com/");

    }


    @When("I enter {string} on Where to")
    public void i_enter_on_where_to(String string) {
typeOnElementNEnter(HiltonSearchForDestinationSearchBarWebElement,string);

    }

    @When("I enter {string} on start date")
    public void i_enter_on_start_date(String string) throws InterruptedException {
clickByLocator(HiltonStartDateWebElement);
Thread.sleep(3000);
        String todaysDate="//*[@id='month-0']/button[@data-date='"+string+"']";
        clickByLocator(todaysDate);
       // driver.findElement(By.xpath(HiltonStartDateWebElement)).sendKeys(Keys.ESCAPE);

    }

    @When("I enter {string} on end date")
    public void i_enter_on_end_date(String string) {
clickByLocator(HiltonEndDateWebElement);
        String endDate="//*[@id='month-0']/button[@data-date='"+string+"']";
        clickByLocator(endDate);
       // driver.findElement(By.xpath(HiltonEndDateWebElement)).sendKeys(Keys.ESCAPE);


    }

    @When("I enter {string}")
    public void i_enter(String string) {
        System.out.println("figure it out");
    }

    @Then("I click Find hotel")
    public void i_click_find_hotel() {
clickByLocator(HiltonFindHotelButtonWebElement);
    }
    // TRIP
    @FindBy(how = How.XPATH,using = HiltonHotelExploreYourtripNow)
    public WebElement HiltonHotelExplore;

    @When("I Scrol down to Explore Now Element")
    public void i_scrol_down_to_explore_now_element() {
moveToElement(HiltonHotelExploreYourtripNow);

    }

    @When("I click On Explore Now Element")
    public void i_click_on_explore_now_element() {
clickByXpath(HiltonHotelExploreYourtripNow);
    }
    @Then("I verify Im In explore your trip Now Page")
    public void i_verify_im_in_explore_your_trip_now_page() throws InterruptedException {
  String expectedResult="https://apply.americanexpress.com/hilton-card/?page_url=378";
  switchWindow(expectedResult);
  String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not explore",expectedResult,actualresult);
    }
 @FindBy(how = How.XPATH,using = videohotelcleanWebElement)
    public WebElement videoclean;
    @When("I scrol down to the video")
    public void i_scrol_down_to_the_video() {

        moveToElement(learnMore_nextToVideo);
    }

    @When("I play this video")
    public void i_play_this_video() throws InterruptedException {
       clickByXpath(videohotelcleanWebElement);
       Thread.sleep(3000);
    }

    @Then("I verify that the video is running")
    public void i_verify_that_the_video_is_running() {
        String actualresult="0";
        String  expectedresult="true";
        actualresult=driver.findElement(By.xpath(videohotelcleanWebElement)).getAttribute("currentTime");

        if(Integer.parseInt(actualresult)   != 0 )
    actualresult="true";
        System.out.println(actualresult);
   Assert.assertEquals("video not playing",expectedresult,actualresult);

    }

    //waikola_huwai
    @When("I Scrol down waikola_huwaiWebELment")
    public void i_scrol_down_waikola_huwai_web_e_lment() {
       moveToElement(waikola_huwaiWebELment);
    }

    @When("I click On waikola_huwaiWebELment Button Image")
    public void i_click_on_waikola_huwai_web_e_lment_button_image() {
        clickByXpath(waikola_huwaiWebELment);
    }

    @Then("I verify Im In waikola_huwaiWebElement")
    public void i_verify_im_in_waikola_huwai_web_element() {
        String actualResult=driver.findElement(By.xpath(waikola_huwaiVerify)).getText();
        String expectedresult="Hilton Waikola Village";
        Assert.assertEquals("Hilton Waikola Village",expectedresult,actualResult);
    }














    @After
    public void close(){
        driver.quit();
    }

}
