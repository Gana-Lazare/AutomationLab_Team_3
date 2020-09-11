package stepdefinition;

import common.WebAPI;
import foxnewsHome.WatchTv;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import static foxnewsHome.FoxNewsHomeWebElement.*;

@RunWith(Cucumber.class)
public class WatchTvStepDefinitions extends WebAPI {

    WatchTv watchTv;


    @BeforeMethod
    public void getinit() {
        PageFactory.initElements(driver, WatchTv.class);
    }

    @After
    public void closebrowserfox() {
        closeBrowser();
    }

    @Given("Im in Fox News Home Page")
    public void im_in_fox_news_home_page() throws IOException {
        openFoxNewsBrowser();
    }

    @Given("I click on WatchTV Button")
    public void i_click_on_watch_tv_button() {
//watchTv.watchtv();
        clickByXpath(watchTvWebElement);
    }

    @Then("I Verify Im in Watch TV Homepage")
    public void i_verify_im_in_watch_tv_homepage() {
        clickByXpath(watchtvPagevalidation);
    }

    //home page click button
    @Given("I click On fox News Home Page")
    public void i_click_on_fox_news_home_page() {
        clickByXpath(foxNewsHomeButtonWebElement);
    }

    @Then("I verify Im in Fox News Home Page")
    public void i_verify_im_in_fox_news_home_page() {
        String expectedresult = "https://www.foxnews.com/";
        String actualresult = driver.getCurrentUrl();
        Assert.assertEquals("Not Home Page", expectedresult, actualresult);
    }

    //Business Button
    @Given("I click on FoxBusiness")
    public void i_click_on_fox_business() {
        clickByXpath(foxNewsBusinessWebElement);
    }

    @Then("I verify Im in FoxFor Business Page")
    public void i_verify_im_in_fox_for_business_page() {
        String expectedresult = "https://www.foxbusiness.com/";
        String actualresult = driver.getCurrentUrl();
        Assert.assertEquals("Not Fox News  Page", expectedresult, actualresult);
    }

    //RadiofoxNews
    @Given("I click on FoxNews Radio")
    public void i_click_on_fox_news_radio() {
        clickByXpath(foxNewsRadioWebElement);
    }

    @Then("I verify Im in Fox News Radio Page")
    public void i_verify_im_in_fox_news_radio_page() {
        String expectedresult = "https://radio.foxnews.com/";
        String actualresult = driver.getCurrentUrl();
        Assert.assertEquals("Not Radio Fox News  Page", expectedresult, actualresult);
    }

    //Nation Button
    @Given("I click on  Fox Nation")
    public void i_click_on_fox_nation() {
        clickByXpath(foxNewsNationWebElement);
    }

    @Then("I verify Im in Fox Nation Page")
    public void i_verify_im_in_fox_nation_page() {
        String expectedresult = "https://nation.foxnews.com/";
        String actualresult = driver.getCurrentUrl();
        Assert.assertEquals("Not Nation Fox News  Page", expectedresult, actualresult);

    }

    @Given("I click on Fox NEws Flash")
    public void i_click_on_fox_n_ews_flash() {
        clickByXpath(foxNewsflashWebElement);

    }

    @Then("I verify Im in fox News Flash")
    public void i_verify_im_in_fox_news_flash() {
        String expectedresult = "https://www.foxnews.com/category/media/fox-news-flash";
        String actualresult = driver.getCurrentUrl();
        Assert.assertEquals("Not Nation Fox News  Page", expectedresult, actualresult);

    }

    //SHow
    @Given("I click on show clips")
    public void i_click_on_show_clips() {
        clickByXpath(foxNewsShowWebElement);
    }

    @Then("I verify Im in show Clips")
    public void i_verify_im_in_show_clips() {
        String expectedresult = "https://www.foxnews.com/category/media/fox-news-flash";
        String actualresult = driver.getCurrentUrl();
        Assert.assertEquals("Not Nation Fox News  Page", expectedresult, actualresult);
    }

    //New Clips
    @Given("I click on News Clips")
    public void i_click_on_news_clips() {
        clickByXpath(foxNewsNewsClipsWebElement);
    }

    @Then("I verify Im In News Clips")
    public void i_verify_im_in_news_clips() {
        String expectedresult = "https://video.foxnews.com/v/6188967902001#sp=news-clips";
        String actualresult = driver.getCurrentUrl();
        Assert.assertEquals("Not Nation NEws Clip  Page", expectedresult, actualresult);
    }

    //Facebook
    @Given("I click on facebook Icon")
    public void i_click_on_facebook_icon() {
        clickByXpath(foxNewsFacebookWebElement);
    }

    @Then("I verify facebook Window Pop up")
    public void i_verify_facebook_window_pop_up() {
String expectedresult="Facebook";
String actualresult=driver.getTitle();
Assert.assertEquals("no facebookwidow",expectedresult,actualresult);

    }
    @Given("I click on Twitter Icon")
    public void i_click_on_twitter_icon() {
clickByXpath(foxNewsTwitterWebElement);
    }
    @Then("I verify Twitter Window Pop Up")
    public void i_verify_twitter_window_pop_up() {
        boolean expectedresult= true;
        boolean actualresult=false;
if(driver.getCurrentUrl().contains("twitter"))   actualresult=true;

        Assert.assertEquals("no facebookwindow",expectedresult,actualresult);
    }
    //Scroll to top button
    @FindBy(how = How.XPATH,using = foxNewsButtonToScrollToTopWebElement)
WebElement scrollToTop;

    @Given("scroll down to scroll to top button")
    public void scroll_down_to_scroll_to_top_button() {
moveToElement(foxNewsButtonToScrollToTopWebElement);

    }

    @Then("click on button")
    public void click_on_button() {
clickOnElement(foxNewsButtonToScrollToTopWebElement);
    }
@FindBy(how = How.XPATH,using = foxNewsIconWebElement)
public WebElement iconFoxNews;

    @Then("check im on top of Page")
    public void check_im_on_top_of_page() {
 String expectedresult="Fox News";
 String actualresult=iconFoxNews.getText();
        Assert.assertEquals(expectedresult,actualresult);
    }



}









