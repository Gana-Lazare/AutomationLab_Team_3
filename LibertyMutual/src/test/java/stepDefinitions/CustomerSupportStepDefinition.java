package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import libertymutualHome.LibertyMutualHome;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

public class CustomerSupportStepDefinition extends LibertyMutualHome {



    static LibertyMutualHome customerSupport;


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
        customerSupport = PageFactory.initElements(driver,LibertyMutualHome.class);
    }


    //1st Scenario
    @Given("I am in LibertyMutual homepage")
    public void i_am_in_liberty_mutual_homepage() {
        try {
            customerSupport.openBrowser("https://www.libertymutual.com/");
        }
            catch(Exception exception) {getInit();}

    }

    @And("I click on Customer Support Button")
    public void i_click_on_customer_support_button() {
        customerSupport.customerSupportButtonCheck();
    }

    @Then("I verify Customer Support is appear properly")
    public void i_verify_customer_support_is_appear_properly() {
        customerSupport.validateCustomerSupportText();
    }

    @And("I verify page title as Customer Support")
    public void i_verify_page_title_as_customer_support() {
        String expectedTitle="Save Money with a Free Insurance Quote from Liberty Mutual | Liberty Mutual";
        String actualTitle= driver.getTitle().toString();
        Assert.assertEquals("Title does not match",actualTitle,expectedTitle);
    }


    //2nd Scenario
    @And("I click on Covid support Button")
    public void i_click_on_covid_support_button() {
        customerSupport.customerCovidSupportButtonCheck();
    }

    @Then("I verify Covid support is appear properly")
    public void i_verify_covid_support_is_appear_properly() {
        customerSupport.validateCustomerCovidSupportText();
    }

    @And("I verify page title as Covid support Support")
    public void i_verify_page_title_as_covid_support_support() {
        String expectedTitle="COVID-19 | Liberty Mutual";
        String actualTitle= driver.getTitle().toString();
        Assert.assertEquals("Title does not match",actualTitle,expectedTitle);

    }


    //3rd Scenario
    @And("I click on frequently Asked Questions Button")
    public void i_click_on_frequently_asked_questions_button() {
        customerSupport.frequentlyAskedQuestionsButtonCheck();
    }

    @Then("I verify frequently Asked Questions is appear properly")
    public void i_verify_frequently_asked_questions_is_appear_properly() {
        customerSupport.validateFrequentlyAskedQuestionsText();
    }

    @And("I verify page title as frequently Asked Questions Support")
    public void i_verify_page_title_as_frequently_asked_questions_support() {
        String expectedTitle="Frequently Asked Questions | Liberty Mutual";
        String actualTitle= driver.getTitle().toString();
        Assert.assertEquals("Title does not match",actualTitle,expectedTitle);
    }


    @And("I click on Manage your policy Button")
    public void i_click_on_manage_your_policy_button() {
        customerSupport.ManageYourPolicyButtonCheck();
    }

    @Then("I verify Manage your policy is appear properly")
    public void i_verify_manage_your_policy_is_appear_properly() {
        customerSupport.validateManageYourPolicyText();
    }

    @And("I verify page title as Manage your policy Support")
    public void i_verify_page_title_as_manage_your_policy_support() {
        String expectedTitle="Manage Your Policy Online | Liberty Mutual";
        String actualTitle= driver.getTitle().toString();
        Assert.assertEquals("Title does not match",actualTitle,expectedTitle);
    }


    @And("I click on Billing & payment options Button")
    public void i_click_on_billing_payment_options_button() {
        customerSupport.BillingPaymentOptionsButtonCheck();
    }

    @Then("I verify Billing & payment options is appear properly")
    public void i_verify_billing_payment_options_is_appear_properly() {
        customerSupport.validateBillingPaymentOptionsText();
    }

    @And("I verify page title as Billing & payment options Support")
    public void i_verify_page_title_as_billing_payment_options_support() {
        String expectedTitle="Billing & Payment Options | Liberty Mutual";
        String actualTitle= driver.getTitle().toString();
        Assert.assertEquals("Title does not match",actualTitle,expectedTitle);
    }

}
