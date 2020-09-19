package ChasestepDefinitions;


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

        moveToElement(videohotelcleanWebElement);
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
        actualresult=videoclean.getAttribute("currentTime");

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

    //Going On join Page
    @When("I click on Join")
    public void i_click_on_join() {
clickByXpath(joinWebElement);
    }

    @When("I enter {string} in FirstNameBare")
    public void i_enter_in_first_name_bare(String string) {
        moveToElement(firstNameWebElement);
        driver.findElement(By.xpath(firstNameWebElement)).sendKeys(string);

    }

    @When("I enter {string} in LastNameBare")
    public void i_enter_in_last_name_bare(String string) {
        moveToElement(lastnameWebElement);
        driver.findElement(By.xpath(lastnameWebElement)).sendKeys(string);
    }

    @When("I enter \"{int}\"in Phone NUmberBar")
    public void i_enter_in_phone_n_umber_bar(Integer int1) {
        String string = Integer.toString(int1);
        moveToElement(phoneNumberWebElement);
        driver.findElement(By.xpath(phoneNumberWebElement)).sendKeys(string);

    }

    @When("I enter {string} in EmailBare")
    public void i_enter_in_email_bare(String string) {
        moveToElement(emailWebElement);
        driver.findElement(By.xpath(emailWebElement)).sendKeys(string);

    }
    @When("I enter {string} In adress")
    public void i_enter_in_adress(String string) {
        moveToElement(adressWebElement);
        driver.findElement(By.xpath(adressWebElement)).sendKeys(string);
    }


    @When("I enter valid {string} code")
    public void i_enter_valid_code(String string) {
        moveToElement(zipWebElement);
        driver.findElement(By.xpath(zipWebElement)).sendKeys(string);

    }

    @When("I enter new {string} in password")
    public void i_enter_new_in_password(String string) {
        moveToElement(passwordWebElement);
        driver.findElement(By.xpath(passwordWebElement)).sendKeys(string);

    }

    @When("I enter {string} in confirmpsw")
    public void i_enter_in_confirmpsw(String string) {
        moveToElement(confirmpasswordWebElement);
        driver.findElement(By.xpath(confirmpasswordWebElement)).sendKeys(string);

    }

    @When("I click on join for free")
    public void i_click_on_join_for_free() {
        moveToElement(joindforFreeWebElement);
clickByXpath(joindforFreeWebElement);
    }

    @Then("I verify newaccount registration")
    public void i_verify_newaccount_registration() {

    }

    //******LOcations Page

    //North America
    @When("I click on locations")
    public void i_click_on_locations() {
        clickByXpath(locationsWebElement);
    }

    @When("I scroll down to north america")
    public void i_scroll_down_to_north_america() {
       moveToElement(northAmericaWebElement);
    }

    @When("I click On north america")
    public void i_click_on_north_america() {
       clickByXpath(northAmericaWebElement);
    }

    @Then("I confirm I m in north america")
    public void i_confirm_i_m_in_north_america() {
       String expectedresult="United States";
       String actualresult=driver.findElement(By.xpath(northAmericaConfirWebElement)).getText();
       Assert.assertEquals("not north america",expectedresult,actualresult);
    }

    //**South America
    @When("I scroll down to southAmerica")
    public void i_scroll_down_to_south_america() {
        moveToElement(southAmericaWebElement);
    }

    @When("I click On southAmerica")
    public void i_click_on_south_america() {
        clickByXpath(southAmericaWebElement);
    }

    @Then("I confirm I m in southAmerica")
    public void i_confirm_i_m_in_south_america() {
        String expectedresult="South America";
        String actualresult=driver.findElement(By.xpath(southAmericaVerifyWebElement)).getText();
        Assert.assertEquals("not south america",expectedresult,actualresult);
    }


    //****central America
    @When("I scroll down to centralAmerica")
    public void i_scroll_down_to_central_america() {
        moveToElement(centralAmericaWebElement);
    }

    @When("I click On centralAmerica")
    public void i_click_on_central_america() {
        clickByXpath(centralAmericaWebElement);
    }

    @Then("I confirm I m in centralAmerica")
    public void i_confirm_i_m_in_central_america() {
        String expectedresult="Central America & Caribbean";
        String actualresult=driver.findElement(By.xpath(centralAmericaVerifyWebElement)).getText();
        Assert.assertEquals("not central america",expectedresult,actualresult);
    }

    //***europe
    @When("I scroll down to europe")
    public void i_scroll_down_to_europe() {
        moveToElement(europeWebElement);
    }

    @When("I click On europe")
    public void i_click_on_europe() {
        clickByXpath(europeWebElement);
    }

    @Then("I confirm I m in europe")
    public void i_confirm_i_m_in_europe() {
        String expectedresult="Europe";
        String actualresult=driver.findElement(By.xpath(europeVerifyWebElement)).getText();
        Assert.assertEquals("not europe",expectedresult,actualresult);
    }

    //***middel east
    @When("I scroll down to Middle East")
    public void i_scroll_down_to_middle_east() {
        moveToElement(middelEastWebElement);
    }

    @When("I click On Middle East")
    public void i_click_on_middle_east() {
        clickByXpath(middelEastWebElement);
    }

    @Then("I confirm I m in Middle East")
    public void i_confirm_i_m_in_middle_east() {
        String expectedresult="Middle East";
        String actualresult=driver.findElement(By.xpath(middelEastVerifyWebElement)).getText();
        Assert.assertEquals("not Middle East",expectedresult,actualresult);
    }

    //***Africa
    @When("I scroll down to Africa")
    public void i_scroll_down_to_africa() {
moveToElement(africaWebElement);
    }

    @When("I click On Africa")
    public void i_click_on_africa() {
clickByXpath(africaWebElement);
    }

    @Then("I confirm I m in Africa")
    public void i_confirm_i_m_in_africa() {
        String expectedresult="Africa";
        String actualresult=driver.findElement(By.xpath(africaVerifyWebElement)).getText();
        Assert.assertEquals("not Africa",expectedresult,actualresult);
    }

    //***Asia
    @When("I scroll down to Asia")
    public void i_scroll_down_to_asia() {
        moveToElement(asiaWebElement);
    }

    @When("I click On Asia")
    public void i_click_on_asia() {
        clickByXpath(asiaWebElement);
    }

    @Then("I confirm I m in Asia")
    public void i_confirm_i_m_in_asia() {
        String expectedresult="Asia";
        String actualresult=driver.findElement(By.xpath(asiaVerifyWebElement)).getText();
        Assert.assertEquals("not Asia",expectedresult,actualresult);
    }

    //***Australia
    @When("I scroll down to Australia")
    public void i_scroll_down_to_australia() {
        moveToElement(australiaWebElement);
    }

    @When("I click On Australia")
    public void i_click_on_australia() {
        clickByXpath(australiaWebElement);
    }

    @Then("I confirm I m in Australia")
    public void i_confirm_i_m_in_australia() {
        String expectedresult="Australia / Pacific Islands";
        String actualresult=driver.findElement(By.xpath(australiaVerifyWebElement)).getText();
        Assert.assertEquals("not Australia / Pacific Islands",expectedresult,actualresult);
    }
//Event and meeting

    @When("I click on meeting")
    public void i_click_on_meeting() {
        clickByXpath(meetingWebElement);
    }

    @When("I confirm Im in newWindow meeting")
    public void i_confirm_im_in_new_window_meeting() throws InterruptedException {
        switchWindow(meetingURLpage);
    }

    @When("I mouse hover Event buton")
    public void i_mouse_hover_event_buton() {
moveToElement(eventWebElement);
clickByXpath(eventWebElement);
    }

    @Then("I confirm Im in wedding Page")
    public void i_confirm_im_in_wedding_page() {
String expectedresult="";
String actualresult=driver.getCurrentUrl();
Assert.assertEquals("not equal",expectedresult,actualresult);
    }
    @Then("I click on wedding")
    public void i_click_on_wedding() {
        clickByXpath(weddingWebElement);
    }
    @Then("I click on social button")
    public void i_click_on_social_button() {
        clickByXpath(socialWebElement);
    }

    //facebook

    @When("I scroll down to facebook Icon")
    public void i_scroll_down_to_facebook_icon() {
        moveToElement(socialmedialocation);
    }

    @When("I click on Facebook Icon")
    public void i_click_on_facebook_icon() {
        clickByXpath(facebookIconWebElement);
    }

    @When("I switch to the new facebook window")
    public void i_switch_to_the_new_facebook_window() throws InterruptedException {
        switchWindow("https://www.facebook.com/hiltonnewsroom/");
    }

    @Then("I verify im in faceboo window")
    public void i_verify_im_in_faceboo_window() {
String expectedresult="https://www.facebook.com/hiltonnewsroom/";
String actualresult=driver.getCurrentUrl();
Assert.assertEquals("no equal",expectedresult,actualresult);
    }
//Twitter
@When("I scroll down to twitter Icon")
public void i_scroll_down_to_twitter_icon() {
   moveToElement(socialmedialocation);
}

    @When("I click on twitter Icon")
    public void i_click_on_twitter_icon() {
        clickByXpath((twitterWebElement));
    }

    @When("I switch to the new twitter window")
    public void i_switch_to_the_new_twitter_window() throws InterruptedException {
        switchWindow("https://twitter.com/hiltonnewsroom");

    }

    @Then("I verify im in twitter window")
    public void i_verify_im_in_twitter_window() {
String expectedresult="https://twitter.com/hiltonnewsroom";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("no equal",expectedresult,actualresult);
    }
    //INstagram
    @When("I scroll down to Instagram Icon")
    public void i_scroll_down_to_instagram_icon() {
        moveToElement(socialmedialocation);
    }

    @When("I click on instagram Icon")
    public void i_click_on_instagram_icon() {
       clickByXpath(instragramWebElement);
    }

    @When("I switch to the new instagram window")
    public void i_switch_to_the_new_instagram_window() throws InterruptedException {
        switchWindow("https://www.instagram.com/hiltonnewsroom/");
    }

    @Then("I verify im in instagram window")
    public void i_verify_im_in_instagram_window() {
        String expectedresult="https://www.instagram.com/hiltonnewsroom/";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("no equal",expectedresult,actualresult);
    }
//members-offers
@When("I click on offers")
public void i_click_on_offers() {
    clickByXpath(offersWebElement);
}

    @When("I click On member benefits")
    public void i_click_on_member_benefits() {
        clickByXpath(memberoffersWebElement);
    }

    @Then("I verify Im in member benefit")
    public void i_verify_im_in_member_benefit() {
        String expectedresult="https://www.hilton.com/en/hilton-honors/member-benefits/";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("no equal",expectedresult,actualresult);
    }

    //points
    @When("I click On points")
    public void i_click_on_points() {
        clickByXpath(pointsWebElement);
    }

    @Then("I verify Im in member points")
    public void i_verify_im_in_member_points() {
        String expectedresult="https://www.hilton.com/en/hilton-honors/points/";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("no equal",expectedresult,actualresult);
    }






























    @After
    public void close(){
        driver.quit();
    }

}
