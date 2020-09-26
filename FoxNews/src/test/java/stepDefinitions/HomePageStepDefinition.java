package stepDefinitions;

import common.WebAPI;

import foxNewsHome.*;
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

import static foxNewsHome.FoxNewsHome.*;

@RunWith(Cucumber.class)
public class HomePageStepDefinition extends FoxNewsHome {


    static FoxNewsHome opinion;
    static FoxNewsHome login;

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
        opinion = PageFactory.initElements(driver,FoxNewsHome.class);
    }



    @Given("I am in foxNews homepage")
    public void i_am_in_fox_news_homepage() throws IOException {
        opinion.openBrowser("https://www.foxnews.com");

    }

    @And("I click on opinion button")
    public void i_click_on_opinion_button() {
        opinion.clickOnElement("//*[@id=\"main-nav\"]/ul/li[3]/a");

    }

    @Then("I verify opinion is appear properly")
    public void i_verify_opinion_is_appear_properly() {
        opinion.validateSearchTextOpinion();

    }

    @Then("I verify page title as Fox News")
    public void i_verify_page_title_as_fox_news() {
        String expectedTitle="Opinion | Fox News";
        String actualTitle= driver.getTitle();
        Assert.assertEquals("Title does not match",actualTitle,expectedTitle);

    }



                                            // login
    //Mouse Hover
    public static void mouseHover(WebElement loginHoverButton){
        Actions actions = new Actions (driver);
        actions.moveToElement(loginHoverButton).perform();
    }

    @Then("I click on login Button")
    public void i_click_on_login_button() throws InterruptedException {
        //login.mouseHoverByXpath("//*[@id=\"wrapper\"]/header/div[2]/div/div[2]");
        //login.clickOnElement("//*[@id=\"account\"]/div/a");
        //login.clickOnLoginButton();   ?????? why doesn't work ?
        sleepFor(5);
        loginButton.click();
        //sleepFor(6);

    }

    @Then("I enter a valid username")
    public void i_enter_a_valid_username() {
        //login.inputValueInTextBoxByWebElement(emailTextBox, "hassan_arib@hotmail.com");
        //login.typeOnElement("//*[@id=\"wrapper\"]/div/div[2]/main/section/div/form/div[1]/input","hassan_arib@hotmail.com");
        //login.typeByXpath("//*[@id=\"wrapper\"]/div/div[2]/main/section/div/form/div[1]/input","hassan_arib@hotmail.com");
        //login.enterUserName();    ?????? why doesn't work ?
        emailTextBox.sendKeys("hassan_arib@hotmail.com");
    }

    @Then("I enter a valid password")
    public void i_enter_a_valid_password() {
        //login.inputValueInTextBoxByWebElement(passwordTextBox, "elhacen27");
        //login.typeOnElement("//*[@id=\"wrapper\"]/div/div[2]/main/section/div/form/div[2]/input","elhacen27");
        //login.enterPassWord();    ?????? why doesn't work ?
        passwordTextBox.sendKeys("elhacen27");
    }

    @When("I click login Button")
    public void i_click_login_button() {
        //loginButton.submit();
        //login.submitLoginButton();  //?????? why doesn't work ?
        login.clickOnElement("body.fn.page-foxid:nth-child(2) div.wrapper:nth-child(1) div.page div.page-content main.main-content section.foxid-wrap.foxid-login div.foxid-content form.foxid-form.login-form div.foxid-row:nth-child(3) > button.foxid-btn.foxid-btn-primary.login");
    }

    @Then("I verify if My Account appear properly")
    public void i_verify_if_my_account_appear_properly() {
        login.validateSearchLoginText("My Account");
        login.clickOnElement("//*[@id=\"wrapper\"]/div/div[2]/main/section/header/button");

    }

    @Then("I enter a invalid username")
    public void i_enter_a_invalid_username() {
        login.inputValueInTextBoxByWebElement(emailTextBox, "elhacena@gmail.com");

    }

    @Then("I verify if Invalid login credentials appear properly")
    public void i_verify_if_invalid_login_credentials_appear_properly() {
        login.validateSearchInvalidLoginText("Invalid login credentials");

    }

    @Then("I enter a invalid password")
    public void i_enter_a_invalid_password() {
        login.inputValueInTextBoxByWebElement(passwordTextBox, "elhacen");

    }










    //Search Box Check (BDD)
    @Given("I enter {string} in searchBox")
    public void i_enter_in_search_box(String titleName) {
        opinion.enterSearchKeyword(titleName);
        throw new io.cucumber.java.PendingException();
    }

    @When("I click searchButton")
    public void i_click_search_button() {
        opinion.clickOnSearchBox();
        throw new io.cucumber.java.PendingException();
    }

    @Then("I verify {string} is appear properly")
    public void i_verify_is_appear_properly(String verifyTitle) {
        opinion.validateSearchBoxText(verifyTitle);
        throw new io.cucumber.java.PendingException();
    }
    //2nd Scenario
    @Then("I am in opinion Home page")
    public void i_am_in_opinion_home_page() throws InterruptedException {
        opinion.clickOnElement("//*[@id=\"main-nav\"]/ul/li[3]/a");
        sleepFor(3);
    }

    @Then("I click on Tech Button")
    public void i_click_on_tech_button() {
        opinion.clickOnTechButton();

    }

    @Then("I verify Tech is appear properly")
    public void i_verify_tech_is_appear_properly() {
        opinion.validateTechButton();
        throw new io.cucumber.java.PendingException();
    }

    //3rd Scenario
    @Then("I click on Security Button")
    public void i_click_on_security_button() {
        opinion.clickOnSecurityButton();
        throw new io.cucumber.java.PendingException();
    }

    @Then("I verify Security appear properly")
    public void i_verify_security_appear_properly() {
        opinion.validateSecurityButton();
        throw new io.cucumber.java.PendingException();
    }

    //4th Scenario
    @Then("I click on Innovation Button")
    public void i_click_on_innovation_button() {
        opinion.clickOnInnovationButton();

    }

    @Then("I verify Innovation appear properly")
    public void i_verify_innovation_appear_properly() {
        opinion.validateInnovationButton();

    }

    //5th Scenario
    @Then("I click on Natural Science Button")
    public void i_click_on_natural_science_button() {
        opinion.clickOnNaturalAndScienceButton();

    }

    @Then("I verify Natural Science appear properly")
    public void i_verify_natural_science_appear_properly() {
        opinion.validateNaturalAndScienceButton();

    }

    //6th Scenario
    @Then("I click on Drones Button")
    public void i_click_on_drones_button() {
        opinion.clickOnDronesButton();

    }

    @Then("I verify Drones appear properly")
    public void i_verify_drones_appear_properly() {
        opinion.validateDronesButton();

    }

    //7th Scenario
    @Then("I click on Computers Button")
    public void i_click_on_computers_button() {
        opinion.clickOnComputersButton();

    }

    @Then("I verify Computers appear properly")
    public void i_verify_computers_appear_properly() {
        opinion.validateComputersButton();

    }

    //8th Scenario
    @Then("I click on Video Games Button")
    public void i_click_on_video_games_button() {
        opinion.clickOnVideoGamesButton();

    }

    @Then("I verify Video Games appear properly")
    public void i_verify_video_games_appear_properly() {
        opinion.validateVideoGamesButton();

    }

    //9th Scenario
    @Then("I click on Military Tech Button")
    public void i_click_on_military_tech_button() {
        opinion.clickOnMilitaryTechButton();

    }


    @Then("I verify Military Tech appear properly")
    public void i_verify_military_tech_appear_properly() {
        opinion.validateMilitaryTechButton();

    }

    //10th Scenario
    @Then("I click on Science Button")
    public void i_click_on_science_button() {
        opinion.clickOnScienceButton();

    }


    @Then("I verify Science appear properly")
    public void i_verify_science_appear_properly() {
        opinion.validateScienceButton();

    }

    //11th Scenario
    @Then("I click on Archaeology Button")
    public void i_click_on_archaeology_button() {
        opinion.clickOnArchaeologyButton();

    }

    @Then("I verify Archaeology appear properly")
    public void i_verify_archaeology_appear_properly() {
        opinion.validateArchaeologyButton();

    }

    //12th Scenario
    @Then("I click on Air & Space Button")
    public void i_click_on_air_space_button() {
        opinion.clickOnAirSpaceButton();

    }

    @Then("I verify Air & Space appear properly")
    public void i_verify_air_space_appear_properly() {
        opinion.validateAirSpaceButton();

    }

    //13th Scenario
    @Then("I click on Planet Earth Button")
    public void i_click_on_planet_earth_button() {
        opinion.clickOnPlanetEarthButton();

    }

    @Then("I verify Planet Earth appear properly")
    public void i_verify_planet_earth_appear_properly() {
        opinion.validatePlanetEarthButton();

    }

    //14th Scenario
    @Then("I click on Wild Nature Button")
    public void i_click_on_wild_nature_button() {
        opinion.clickOnWildNatureButton();

    }

    @Then("I verify Wild Nature appear properly")
    public void i_verify_wild_nature_appear_properly() {
        opinion.validateWildNatureButton();

    }


}
