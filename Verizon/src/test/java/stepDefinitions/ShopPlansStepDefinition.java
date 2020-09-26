package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import verizonhome.VerizonHome;

public class ShopPlansStepDefinition extends VerizonHome {

    static VerizonHome shopPlans;


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
        shopPlans = PageFactory.initElements(driver,VerizonHome.class);
    }



    @Given("I am in Verizon homepage")
    public void i_am_in_verizon_homepage() {
        try {
            shopPlans.openBrowser("https://www.verizon.com/");
        }
        catch(Exception exception) {getInit();}

    }

    @Given("I click on Shop Button")
    public void i_click_on_shop_button() {
        shopPlans.ShopButtonCheck();

    }

    @Then("I verify Deals is appear properly")
    public void i_verify_deals_is_appear_properly() {
        shopPlans.validateShopButtonText();

    }

    @Then("I verify page title as Shop")
    public void i_verify_page_title_as_shop() {
        String expectedTitle="Shop Deals on Smartphones, Accessories, Devices & Plans | Verizon";
        String actualTitle= driver.getTitle().toString();
        Assert.assertEquals("Title does not match",actualTitle,expectedTitle);

    }

}
