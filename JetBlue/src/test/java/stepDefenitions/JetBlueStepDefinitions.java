package stepDefenitions;

import common.WebAPI;
import databases.ConnectToSqlDB;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.IOException;
import java.sql.SQLException;

import static jetblueHome.JetBlueHomeWebElement.*;


public class JetBlueStepDefinitions extends WebAPI {


    @Given("IM in Jetblue Home Page")
    public void im_in_jetblue_home_page() throws IOException {
        setUp(false, "BrowserStack", "Windows", "7", "chrome", "85", "https://www.jetblue.com");
    driver.manage().window().maximize();
    }
    @When("I click on book")
    public void i_click_on_book() throws InterruptedException {
        clickByXpath(bookWebElement);
        Thread.sleep(2000);

    }

    @When("I click on flight")
    public void i_click_on_flight() {

        //clickByXpath(flight_book_WebElement);
        driver.findElement(By.cssSelector("#subnav-wrapper_rztzt60h6-0 > div > div > div.left-book-list-wrapper.fl.col-8-l.col-12-m.bottom-divider.pb3-l.pb5-m > ul > li:nth-child(1) > jb-bubble-link > a")).click();
    }

    @Then("I verify im in flight page")
    public void i_verify_im_in_flight_page() {
        String expectedresult="https://www.jetblue.com/flights";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not equal",expectedresult,actualresult);
    }
    @When("I send  {string} from and submite")
    public void i_send_from_and_submite(String string) {
        //clickByXpath(fromWebElement);
        typeByCss("#city-selector_lox84zazk",string);
        driver.findElement(By.xpath(fromWebElement)).submit();
    }

    @When("I send {string} destination and submite")
    public void i_send_destination_and_submite(String string) {
        typeByXpath(destinationWebElement,string);
        driver.findElement(By.xpath(destinationWebElement)).submit();
    }


    //***********
    @When("I click on flight and hotel")
    public void i_click_on_flight_and_hotel() {
        clickByLocator(flight_And_Hotels_WebElement);
    }

    @Then("I verify im In flight and hotel page")
    public void i_verify_im_in_flight_and_hotel_page() {
        //okAlert();
        String expectedresult="";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not equal",expectedresult,actualresult);
    }

    @When("i Click on travelBankCredit")
    public void i_click_on_travel_bank_credit() {
       clickByXpath(travelBankCreditWebElement);
    }

    @Then("I verify Im in travelBankCredit")
    public void i_verify_im_in_travel_bank_credit() {
       String expectedresult="Travel Bank Credits";
       String actualresult=driver.findElement(By.xpath(travelBANKVerifyWebElement)).getText();
       Assert.assertEquals("Not Equal",expectedresult,actualresult);
    }
    @When("i Click on checkIn")
    public void i_click_on_check_in() {
        clickByXpath(checkInWebElement);
    }

    @Then("I verify Im in checkIn")
    public void i_verify_im_in_check_in() {
        //String expectedresult="You can check in online up to 24 hours in advance.";
        //String actualresult=driver.findElement(By.xpath(checkInVerifyWebElement)).getText();
       // Assert.assertEquals("Not Equal",expectedresult,actualresult);
    }

    @Then("I send {string} firstname and {string} lastName")
    public void i_send_firstname_and_last_name(String string, String string2) {
        typeByXpath(firstName_CheckIn_WebElement,string);
        typeByXpath(lastName_CheckIn_WebElement,string2);
    }

    @Then("I click on confirmationcode")
    public void i_click_on_confirmationcode() {
        clickByXpath(confirmationCode_CheckIn_WebElement);
    }

    @Then("I chose flightNumber option")
    public void i_chose_flight_number_option() {
        clickByXpath(flightNumberOption_CheckIn_WebElement);
    }

    @Then("I send {string} flight Number")
    public void i_send_flight_number(String string) {
        typeByXpath(flightNumber_CheckIn_WebElement,string);
    }

    @Then("I click On departure airport")
    public void i_click_on_departure_airport() {
        clickByXpath(departureAirport_CheckIn_WebElement);
    }

    @Then("I chose albany airport")
    public void i_chose_albany_airport() {
        clickByXpath(albanyOptionDeparture_WebElement);
    }

    @Then("I click on find flight")
    public void i_click_on_find_flight() {
        clickByXpath(findFlightWebElement);
    }

    @When("i Click on flightTraker")
    public void i_click_on_flight_traker() {
        clickByXpath(flightTrakerWebElement);
    }

    @Then("I verify Im in flightTraker")
    public void i_verify_im_in_flight_traker() {
        String expectedresult="Flight Tracker";
        String actualresult=driver.findElement(By.xpath(flighttrakerVerifyWebElement)).getText();
        Assert.assertEquals("Not Equal",expectedresult,actualresult);
    }

    @When("i Click on travelAlert")
    public void i_click_on_travel_alert() {
     clickByXpath(travelAlertWebElement);
    }

    @Then("I verify Im in travelAlert")
    public void i_verify_im_in_travel_alert() {
        String expectedresult="Travel Alerts";
        String actualresult=driver.findElement(By.xpath(travelAlerterifyWebElement)).getText();
        Assert.assertEquals("Not Equal",expectedresult,actualresult);
    }
    @When("i Click on espagnol")
    public void i_click_on_espagnol() {
        clickByXpath(espagnolWebElement);
    }

    @Then("I verify Im in espagnol")
    public void i_verify_im_in_espagnol() {
        String expectedresult="https://hola.jetblue.com/";
    String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not Equal",expectedresult,actualresult);
    }


    @When("I click on sign In")
    public void i_click_on_sign_in() {
        clickByXpath(signInWebElement);

    }

    @When("I send {string} email")
    public void i_send_email(String email) throws Exception {
        setEmailInDB();
        ConnectToSqlDB connectToSqlDB=new ConnectToSqlDB();
        email=connectToSqlDB.readDataBase("JetBlue","emails").get(0);
    Thread.sleep(3000);
        typeByXpath(emailSignInWebElement,email);
    }
public static void setEmailInDB() throws SQLException, IOException, ClassNotFoundException {
    ConnectToSqlDB.connectToSqlDatabase();
    ConnectToSqlDB connectToSqlDB=new ConnectToSqlDB();
    String emails="houy@gmail.com";
    connectToSqlDB.insertDataFromStringToSqlTable(emails,"JetBlue","emails");
}
    @When("I send {string} password")
    public void i_send_password(String password) {
//coukd not figur it out paths
    }

    @Then("I click on signinsubmite")
    public void i_click_on_signinsubmite() {
        clickByXpath(submiteSignInWebElement);
    }

    @When("i scroll Down to join our emaillist")
    public void i_scroll_down_to_join_our_emaillist() {
        moveToElement(joinOurEmailListWebElement);
    }

    @When("I click on join our emaillist")
    public void i_click_on_join_our_emaillist() {
        clickByXpath(joinOurEmailListWebElement);

    }

    @Then("I verify Im in join our emaillist Page")
    public void i_verify_im_in_join_our_emaillist_page() {
        String expectedresult="Email preferences";
        String actualresult=driver.findElement(By.xpath(joinOurEmailListVerifyWebElement)).getText();
        Assert.assertEquals("Not Equal",expectedresult,actualresult);
    }
    @When("i scroll Down to DowloadJetBlueAPP")
    public void i_scroll_down_to_dowload_jet_blue_app() {
        moveToElement(dowloadJetBlueAPPWebElement);
    }

    @When("I click on join our DowloadJetBlueAPP")
    public void i_click_on_join_our_dowload_jet_blue_app() {
       clickByXpath(dowloadJetBlueAPPWebElement);
    }

    @Then("I verify Im in join our DowloadJetBlueAPP Page")
    public void i_verify_im_in_join_our_dowload_jet_blue_app_page() {
        String expectedresult="Mobile App";
        String actualresult=driver.findElement(By.xpath(dowloadJetBlueAPPVerifyWebElement)).getText();
        Assert.assertEquals("Not Equal",expectedresult,actualresult);
    }
    @When("i scroll Down to facebookicon")
    public void i_scroll_down_to_facebookicon() {
        moveToElement(facebookICONWebElement);
    }

    @When("I click on join our facebookicon")
    public void i_click_on_join_our_facebookicon() throws InterruptedException {
 clickByXpath(facebookICONWebElement);
        Thread.sleep(2000);
    }

    @Then("I verify Im in join our facebookIcon Page")
    public void i_verify_im_in_join_our_facebook_icon_page() {
String expectedresult="https://www.facebook.com/JetBlue";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not Equal",expectedresult,actualresult);
    }
    @When("i scroll Down to instagram")
    public void i_scroll_down_to_instagram() {
     moveToElement(instagramiconWebElement);
    }

    @When("I click on join our instagram")
    public void i_click_on_join_our_instagram() throws InterruptedException {
        clickByXpath(instagramiconWebElement);
        Thread.sleep(2000);
    }

    @Then("I verify Im in join our instagram Page")
    public void i_verify_im_in_join_our_instagram_page() {
        String expectedresult="https://www.instagram.com/jetblue/";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not Equal",expectedresult,actualresult);
    }
    @When("i scroll Down to twitter")
    public void i_scroll_down_to_twitter() {
moveToElement(twitterIconWebElement);
    }

    @When("I click on join our twitter")
    public void i_click_on_join_our_twitter() throws InterruptedException {
clickByXpath(twitterIconWebElement);
        Thread.sleep(2000);
    }

    @Then("I verify Im in join our twitter Page")
    public void i_verify_im_in_join_our_twitter_page() {
        String expectedresult="https://twitter.com/jetblue";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not Equal",expectedresult,actualresult);
    }

    @When("i scroll Down to youtube")
    public void i_scroll_down_to_youtube() {
        moveToElement(youtubeiconWebElement);
    }

    @When("I click on join our youtube")
    public void i_click_on_join_our_youtube() throws InterruptedException {
        clickByXpath(youtubeiconWebElement);
        Thread.sleep(2000);
    }

    @Then("I verify Im in join our youtube Page")
    public void i_verify_im_in_join_our_youtube_page() {
        String expectedresult="https://www.youtube.com/user/jetblue";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not Equal",expectedresult,actualresult);
    }


    @When("i scroll Down to jetblueSwag")
    public void i_scroll_down_to_jetblue_swag() {
        moveToElement(jetblueSwagWebElement);
    }

    @When("I click on jetblueSwag")
    public void i_click_on_jetblue_swag() {
        clickByXpath(jetblueSwagWebElement);
    }

    @Then("I verify Im in jetblueSwag Page")
    public void i_verify_im_in_jetblue_swag_page() throws InterruptedException {
        switchWindow(driver.getCurrentUrl());
        String expectedresult="https://shopjetblue.com/";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not Equal",expectedresult,actualresult);
    }
    @When("i scroll Down to ourCompagny")
    public void i_scroll_down_to_our_compagny() {
       moveToElement(ourCompagnyWebElement);
    }

    @When("I click on join our ourCompagny")
    public void i_click_on_join_our_our_compagny() {
        clickByXpath(ourCompagnyWebElement);
    }

    @Then("I verify Im in ourCompagnyPage")
    public void i_verify_im_in_our_compagny_page() {
        String expectedresult="https://www.jetblue.com/our-company";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not Equal",expectedresult,actualresult);
    }
    @When("i scroll Down to ourPlanes")
    public void i_scroll_down_to_our_planes() {
        moveToElement(ourPlanesWebElement);
    }

    @When("I click on ourPlanes")
    public void i_click_on_our_planes() {
        clickByXpath(ourPlanesWebElement);
    }

    @Then("I verify Im ourPlanes Page")
    public void i_verify_im_our_planes_page() {
        String expectedresult="https://www.jetblue.com/flying-with-us/our-planes";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not Equal",expectedresult,actualresult);
    }
    @When("i scroll Down to partnerAirlines")
    public void i_scroll_down_to_partner_airlines() {
        moveToElement(partnerAirlinesWebElement);
    }

    @When("I click on partnerAirlines")
    public void i_click_on_partner_airlines() {
        clickByXpath(partnerAirlinesWebElement);
    }

    @Then("I verify Im partnerAirlines Page")
    public void i_verify_im_partner_airlines_page() {
        String expectedresult="https://www.jetblue.com/airline-partners";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not Equal",expectedresult,actualresult);
    }
    @When("i scroll Down to investorRelations")
    public void i_scroll_down_to_investor_relations() {
moveToElement(investorRelationsWebElement);
    }

    @When("I click on investorRelations")
    public void i_click_on_investor_relations() {
 clickByXpath(investorRelationsWebElement);
    }

    @Then("I verify Im in investorRelations Page")
    public void i_verify_im_in_investor_relations_page() throws InterruptedException {
        switchWindow(driver.getCurrentUrl());
        String expectedresult="http://blueir.investproductions.com/investor-relations";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not Equal",expectedresult,actualresult);
    }
    @When("i scroll Down to travelAgents")
    public void i_scroll_down_to_travel_agents() {
  moveToElement(travelAgentsWebElement);
    }

    @When("I click on travelAgents")
    public void i_click_on_travel_agents() {
  clickByXpath(travelAgentsWebElement);
    }

    @Then("I verify Im in travelAgents Page")
    public void i_verify_im_in_travel_agents_page() {
        String expectedresult="https://www.jetblue.com/travel-agents";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not Equal",expectedresult,actualresult);
    }
    @When("i scroll Down to sonsorships")
    public void i_scroll_down_to_sonsorships() {
       moveToElement(sonsorshipsWebElement);
    }

    @When("I click on sonsorships")
    public void i_click_on_sonsorships() {
     clickByXpath(sonsorshipsWebElement);
    }

    @Then("I verify Im in sonsorships Page")
    public void i_verify_im_in_sonsorships_page() {
        String expectedresult="https://www.jetblue.com/our-company/sponsorships";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not Equal",expectedresult,actualresult);
    }
    @When("i scroll Down to careers")
    public void i_scroll_down_to_careers() {
        moveToElement(careersWebElement);
    }

    @When("I click on careers")
    public void i_click_on_careers() {
        clickByXpath(careersWebElement);
    }

    @Then("I verify Im in careers Page")
    public void i_verify_im_in_careers_page() throws InterruptedException {
        switchWindow(driver.getCurrentUrl());
        String expectedresult="https://careers.jetblue.com/";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not Equal",expectedresult,actualresult);
    }


    @When("i scroll Down to timetables")
    public void i_scroll_down_to_timetables() {
       moveToElement(timetablesWebElement);
    }

    @When("I click on timetables")
    public void i_click_on_timetables() {
        clickByXpath(timetablesWebElement);
    }

    @Then("I verify Im in timetables Page")
    public void i_verify_im_in_timetables_page() throws InterruptedException {
        switchWindow(driver.getCurrentUrl());
        String expectedresult="https://b6.innosked.com/(S(wnsbaxqrybifmtpnt34asxzl))/default.aspx";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not Equal",expectedresult,actualresult);
    }
    @When("i scroll Down to siteMap")
    public void i_scroll_down_to_site_map() {
        moveToElement(siteMapWebElement);
    }

    @When("I click on siteMap")
    public void i_click_on_site_map() {
        clickByXpath(siteMapWebElement);
    }

    @Then("I verify Im in siteMap Page")
    public void i_verify_im_in_site_map_page() {
        String expectedresult="https://www.jetblue.com/sitemap";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not Equal",expectedresult,actualresult);
    }

    @When("i scroll Down to contactUs")
    public void i_scroll_down_to_contact_us() {
        moveToElement(contactUsWebElement);
    }

    @When("I click on contactUs")
    public void i_click_on_contact_us() {
        clickByXpath(contactUsWebElement);
    }

    @Then("I verify Im in contactUs Page")
    public void i_verify_im_in_contact_us_page() {
        String expectedresult="https://www.jetblue.com/contact-us";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not Equal",expectedresult,actualresult);
    }






    @After
    public void close(){
      driver.quit();
    }
}
