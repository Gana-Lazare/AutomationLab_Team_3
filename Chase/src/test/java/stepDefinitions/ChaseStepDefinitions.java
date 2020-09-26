package stepDefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.IOException;

import static chasehome.ChasehomeWebElement.*;

public class ChaseStepDefinitions extends WebAPI {

    @Given("Im in Chase Bank Home page")
    public void im_in_chase_bank_home_page() throws IOException,InterruptedException {
        setUp(false, "BrowserStack", "Windows", "7", "chrome", "85", "https://www.chase.com/");
        Thread.sleep(1000);
    }

    @When("I scrol to social media zone")
    public void i_scrol_to_social_media_zone() {

        moveToElement(socialMediaZoneWebElement);
    }

    @When("I click On facebookIcon")
    public void i_click_on_facebook_icon() {
        //here i proceed to 2 scrolls down as my web page load in 2 times 1 scroll down doesnt work
        moveToElement(facebookIconWebElement);
        clickByXpath(facebookIconWebElement);
    }
    @Then("I proceed to quit chase")
    public void i_proceed_to_quit_chase() throws InterruptedException {
        clickByXpath(proccedtoQuitChaseWebElement);
        Thread.sleep(5000);
    }
    @Then("I verify Im in facebook page")
    public void i_verify_im_in_facebook_page() throws InterruptedException {
        // switch to the actual result window not hardcoded to not mistake the result
        switchWindow(driver.getCurrentUrl());
        String expectedresult="https://www.facebook.com/login.php?next=https%3A%2F%2Fwww.facebook.com%2Fchase";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }
    @When("I click On Instagram")
    public void i_click_on_instagram() {
        clickByXpath(instagramIconWebElement);
    }

    @Then("I verify Im in Instagram page")
    public void i_verify_im_in_instagram_page() throws InterruptedException {
        switchWindow(driver.getCurrentUrl());
        String expectedresult="https://www.instagram.com/chase/";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }

    @When("I click On Twitter")
    public void i_click_on_twitter() {
        clickByXpath(twitterIconWebElement);
    }

    @Then("I verify Im in Twitter page")
    public void i_verify_im_in_twitter_page() throws InterruptedException {
        switchWindow(driver.getCurrentUrl());
        String expectedresult="https://twitter.com/Chase";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }

    @When("I click On Youtube")
    public void i_click_on_youtube() {
    clickByXpath(youtubeIconWebElement);
    }

    @Then("I verify Im in Youtube page")
    public void i_verify_im_in_youtube_page() throws InterruptedException {
        switchWindow(driver.getCurrentUrl());
        String expectedresult="https://www.youtube.com/chase";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }

    @When("I click On LinkedIn")
    public void i_click_on_linked_in() {
       clickByXpath(linkedInIconWebElement);
    }

    @Then("I verify Im in LinkedIn page")
    public void i_verify_im_in_linked_in_page() throws InterruptedException {
        switchWindow(driver.getCurrentUrl());
        String expectedresult="https://www.linkedin.com/company/chase?trk=company_logo";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }

    @When("I click On Pinterest")
    public void i_click_on_pinterest() {
        clickByXpath(pinterestIconWebElement);
    }

    @Then("I verify Im in Pinterest page")
    public void i_verify_im_in_pinterest_page() throws InterruptedException {
        switchWindow(driver.getCurrentUrl());
        String expectedresult="https://www.pinterest.com/chase/";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }
    @When("I clck on ATmAndBranch")
    public void i_clck_on_a_tm_and_branch() {
        clickByXpath(atmAndBranchWebElement);
    }

    @Then("I verify Im in AtmAndBranch")
    public void i_verify_im_in_atm_and_branch() {
        String expectedresult="https://locator.chase.com/?locale=en_US";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }

    @When("I move to credit card zone")
    public void i_move_to_credit_card_zone() {
        moveToElement(creditCardszone);
    }

    @When("I click on credit card")
    public void i_click_on_credit_card() {
        clickByXpath(creditcard);
    }


    @Then("I verify I have all credit card")
    public void i_verify_i_have_all_credit_card() {
        String expectedresult="https://creditcards.chase.com/";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }

    @When("I click on offert reward")
    public void i_click_on_offert_reward() {
  clickByXpath(offerRewardWebElement);
    }

    @When("I verify offert reward")
    public void i_verify_offert_reward() {
        String expectedresult="https://www.chase.com/personal/credit-cards/education/rewards-benefits/what-are-travel-rewards-cards";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }

    @When("I click on cashBack reward")
    public void i_click_on_cash_back_reward() {
        clickByXpath(cashBackWebElement);
    }

    @When("I verify cashBack reward")
    public void i_verify_cash_back_reward() {
        String expectedresult="https://creditcards.chase.com/cash-back-credit-cards";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }

    @When("I click on freeCreditScore reward")
    public void i_click_on_free_credit_score_reward() {
       clickByXpath(freeCreditScoreWebElement);
    }

    @When("I verify freeCreditScore reward")
    public void i_verify_free_credit_score_reward() {
        String expectedresult="https://www.chase.com/personal/credit-cards/chase-credit-journey";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }

    @When("I click on mortgage reward")
    public void i_click_on_mortgage_reward() {
       clickByXpath(mortgageWebElement);
    }

    @When("I verify mortgage reward")
    public void i_verify_mortgage_reward() {
        String expectedresult="https://www.chase.com/personal/mortgage/mortgage-purchase";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }

    @When("I click on lowDownpaymentmortgage reward")
    public void i_click_on_low_downpaymentmortgage_reward() {
        clickByXpath(lowDownpaymentmortgageWebElement);
    }

    @When("I verify lowDownpaymentmortgage reward")
    public void i_verify_low_downpaymentmortgage_reward() {
        String expectedresult="https://www.chase.com/personal/mortgage/affordablelending";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }

    @When("I click on jumboMortgage reward")
public void i_click_on_jumbo_mortgage_reward() {
       clickByXpath(jumboMortgageWebElement);
    }


    @When("I verify jumboMortgage reward")
    public void i_verify_jumbo_mortgage_reward() {
        String expectedresult="https://www.chase.com/personal/mortgage/jumbo-mortgage";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }
   // https://www.chase.com/personal/mortgage/mortgage-refinance
   @When("I click on refinanceyourhome reward")
   public void i_click_on_refinanceyourhome_reward() {
       clickByXpath(refinanceyourhomeWebElement);
   }

    @When("I verify refinanceyourhome reward")
    public void i_verify_refinanceyourhome_reward() {
        String expectedresult="https://www.chase.com/personal/mortgage/mortgage-refinance";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }
    @When("I click on learningCenter reward")
    public void i_click_on_learning_center_reward() {
       clickByXpath(learningCenterWebElement);
    }

    @When("I verify learningCenter reward")
    public void i_verify_learning_center_reward() {
        String expectedresult="https://www.chase.com/personal/mortgage/tools-and-education";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }
    @When("I click on mortgagerates reward")
    public void i_click_on_mortgagerates_reward() {
        clickByXpath(mortgageratesWebElement);
    }

    @When("I verify mortgagerates reward")
    public void i_verify_mortgagerates_reward() {
        String expectedresult="https://www.chase.com/personal/mortgage/mortgage-rates";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }

    @When("I click on mortgagecalculator reward")
    public void i_click_on_mortgagecalculator_reward() {
        clickByXpath(mortgagecalculatorWebElement);
    }

    @When("I verify mortgagecalculator reward")
    public void i_verify_mortgagecalculator_reward() {
        String expectedresult="https://www.chase.com/personal/mortgage/calculators-resources";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }
    @When("I click on appliyingForAMortgage reward")
    public void i_click_on_appliying_for_a_mortgage_reward() {
       clickByXpath(appliyingForAMortgageWebElement);
    }

    @When("I verify appliyingForAMortgage reward")
    public void i_verify_appliying_for_a_mortgage_reward() {
        String expectedresult="https://secure05b.chase.com/web/oao/application/retail#/origination/gettingStarted/gettingStarted/initiate;cfgCode=502002;channel=C30;params=502,002,,no,no,,,";
        String actualresult=driver.getCurrentUrl();
        Assert.assertNotSame("not the right page",expectedresult,actualresult);
    }
    @When("I click on chaseAuto reward")
    public void i_click_on_chase_auto_reward() {
        clickByXpath(chaseAutoWebElement);
    }

    @When("I verify chaseAuto reward")
    public void i_verify_chase_auto_reward() {
        String expectedresult="https://autopreferred.chase.com/";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }
    @When("I click on autoloane reward")
    public void i_click_on_autoloane_reward() {
        clickByXpath(autoloaneWebElement);
    }

    @When("I verify autoloane reward")
    public void i_verify_autoloane_reward() {
        String expectedresult="https://autofinance.chase.com/auto-finance/auto-loans?offercode=WDXDPXXX02";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }
    @When("I click on paymentCalculator reward")
    public void i_click_on_payment_calculator_reward() {
        clickByXpath(paymentCalculatorWebElement);
    }

    @When("I verify paymentCalculator reward")
    public void i_verify_payment_calculator_reward() {
        String expectedresult="https://autofinance.chase.com/auto-finance/auto-refinance/payment-calculator?offercode=WDXDPXXX02";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }
    @When("I click on refinance reward")
    public void i_click_on_refinance_reward() {
        clickByXpath(refinanceyourhomeWebElement);
    }

    @When("I verify refinance reward")
    public void i_verify_refinance_reward() {
        String expectedresult="https://autofinance.chase.com/auto-finance/auto-refinance?offercode=WDXDPXXX02";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }
    @When("I click on financialAdvisor reward")
    public void i_click_on_financial_advisor_reward() {
        clickByXpath(financialAdvisorWebElement);
    }

    @When("I verify financialAdvisor reward")
    public void i_verify_financial_advisor_reward() {
        String expectedresult="https://www.chase.com/personal/investments/advisor";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }
    @When("I click on offertPromotionsAndCuppons reward")
    public void i_click_on_offert_promotions_and_cuppons_reward() {
        clickByXpath(offertPromotionsAndCupponsWebElement);
    }

    @When("I verify offertPromotionsAndCuppons reward")
    public void i_verify_offert_promotions_and_cuppons_reward() {
        String expectedresult="https://accounts.chase.com/consumer/investing/online/youinvestoffer";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }
    @When("I click on inverstOnline reward")
    public void i_click_on_inverst_online_reward() {
        clickByXpath(inverstOnlineWebElement);
    }

    @When("I verify inverstOnline reward")
    public void i_verify_inverst_online_reward() {
        String expectedresult="https://www.chase.com/personal/investments/you-invest";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not the right page",expectedresult,actualresult);
    }











    @After
    public void close(){
        driver.quit();
    }
}
