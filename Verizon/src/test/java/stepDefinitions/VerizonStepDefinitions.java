package stepDefinitions;

import common.WebAPI;
import databases.ConnectToSqlDB;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

import static verizonhome.VerizonHomeWebElement.*;

public class VerizonStepDefinitions extends WebAPI {

    @Given("^Im in Verizon Home Page$")
    public void im_in_verizon_home_page() throws IOException {
        setUp(false, "BrowserStack", "Windows", "7", "chrome", "85", "https://www.verizon.com/");

    }

    @When("I mouse over shop")
    public void i_mouse_over_shop() {
        moveToElement(shopWebElement);
    }

    @When("I click on smartphone")
    public void i_click_on_smartphone() {
        clickByXpath(smartphonesWebElement);
    }

    @Then("I verify Im in page page")
    public void i_verify_im_in_page_page() {
        System.out.println("ok");
    }

    @When("I click on {string} element")
    public void i_click_on_element(String string) {
clickByXpath(string);
    }

    @Then("I verify Im in {string} page")
    public void i_verify_im_in_page(String string) {
String expectedresult=string;
String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not equal",expectedresult,actualresult);
    }

    //5Gphones
    @When("I click on  G5phones element")
    public void i_click_on_g5phones_element() {
        clickByXpath(g5phonesWebElement);
    }

    @Then("I verify Im in G5phones webpage")
    public void i_verify_im_in_g5phones_webpage() {
        String expectedresult="https://www.verizon.com/5g/phones/?adobe_mc=MCMID%3D13354807219508001731320662505102754890%7CMCORGID%3D843F02BE53271A1A0A490D4C%2540AdobeOrg%7CTS%3D1600298685&mboxSession=2b20bb09e7e34b3b974971be12f59963&wireless_gn_exp=0-129904";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not equal",expectedresult,actualresult);
    }
    //Otherphones
    @When("i CLICK on otherphones element")
    public void i_click_on_otherphones_element() {
        clickByXpath(otherphonesWebElement);
    }

    @Then("I verify Im in otherphoneswebpage")
    public void i_verify_im_in_otherphoneswebpage() {
        String expectedresult="https://www.verizon.com/featured/shop-phones-devices/?adobe_mc=MCMID%3D13354807219508001731320662505102754890%7CMCORGID%3D843F02BE53271A1A0A490D4C%2540AdobeOrg%7CTS%3D1600298537&mboxSession=2b20bb09e7e34b3b974971be12f59963&wireless_gn_exp=0-129904";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not equal",expectedresult,actualresult);
    }

    @When("i click on accessories element")
    public void i_click_on_accessories_element() {
        clickByXpath(accessoriesWebElement);
    }

    @Then("I verify Im in accessories page")
    public void i_verify_im_in_accessories_page() {
        String expectedresult="https://www.verizon.com/products/?adobe_mc=MCMID%3D13354807219508001731320662505102754890%7CMCORGID%3D843F02BE53271A1A0A490D4C%2540AdobeOrg%7CTS%3D1600298510&mboxSession=2b20bb09e7e34b3b974971be12f59963&wireless_gn_exp=0-129904";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not equal",expectedresult,actualresult);
    }

    @When("i click on tradeYourPhone element")
    public void i_click_on_trade_your_phone_element() {
 clickByXpath(tradeYourPhoneWebElement);
    }

    @Then("I verify Im in tradeYourPhone page")
    public void i_verify_im_in_trade_your_phone_page() {
        String expectedresult="https://www.verizon.com/od/trade-in/?adobe_mc=MCMID%3D13354807219508001731320662505102754890%7CMCORGID%3D843F02BE53271A1A0A490D4C%2540AdobeOrg%7CTS%3D1600298236&mboxSession=2b20bb09e7e34b3b974971be12f59963&wireless_gn_exp=0-129904#/";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not equal",expectedresult,actualresult);
    }

    @When("i click on bringYourOwnDevice element")
    public void i_click_on_bring_your_own_device_element() {
clickByXpath(bringYourOwnDeviceWebElement);
    }

    @Then("I verify Im in bringYourOwnDevice page")
    public void i_verify_im_in_bring_your_own_device_page() {
        String expectedresult="https://www.verizon.com/bring-your-own-device/";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not equal",expectedresult,actualresult);
    }
    @When("i click on tablets element")
    public void i_click_on_tablets_element() {
        clickByXpath(tabletsWebElement);
    }

    @Then("I verify Im in tablets page")
    public void i_verify_im_in_tablets_page() {
        String expectedresult="https://www.verizon.com/tablets/?adobe_mc=MCMID%3D13354807219508001731320662505102754890%7CMCORGID%3D843F02BE53271A1A0A490D4C%2540AdobeOrg%7CTS%3D1600298164&mboxSession=2b20bb09e7e34b3b974971be12f59963&wireless_gn_exp=0-129904";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not equal",expectedresult,actualresult);
    }
    @When("i click on connectedSmartWatche element")
    public void i_click_on_connected_smart_watche_element() {
clickByXpath(connectedSmartWatchesWebElement);
    }

    @Then("I verify Im in connectedSmartWatche page")
    public void i_verify_im_in_connected_smart_watche_page() {
        String expectedresult="https://www.verizon.com/connected-smartwatches/";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not equal",expectedresult,actualresult);
    }

    @When("i click on plansunlimited element")
    public void i_click_on_plansunlimited_element() {
        clickByXpath(plansunlimitedWebElement);
    }

    @Then("I verify Im in plansunlimited page")
    public void i_verify_im_in_plansunlimited_page() {
       String expectedresult="https://www.verizon.com/plans/unlimited/?adobe_mc=MCMID%3D13354807219508001731320662505102754890%7CMCORGID%3D843F02BE53271A1A0A490D4C%2540AdobeOrg%7CTS%3D1600298033&mboxSession=2b20bb09e7e34b3b974971be12f59963&wireless_gn_exp=0-129904";
       String actualresult=driver.getCurrentUrl();
       Assert.assertEquals("Not equal",expectedresult,actualresult);
    }

    @When("i click on planssharedData element")
    public void i_click_on_plansshared_data_element() {
        clickByXpath(planssharedDataWebElement);
    }

    @Then("I verify Im in planssharedData page")
    public void i_verify_im_in_plansshared_data_page() {
        String expectedresult="https://www.verizon.com/plans/?adobe_mc=MCMID%3D13354807219508001731320662505102754890%7CMCORGID%3D843F02BE53271A1A0A490D4C%2540AdobeOrg%7CTS%3D1600297995&mboxSession=2b20bb09e7e34b3b974971be12f59963&wireless_gn_exp=0-129904#shared";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not equal",expectedresult,actualresult);
    }

    @When("i click on plansprepaid element")
    public void i_click_on_plansprepaid_element() {
        clickByXpath(plansprepaidWebElement);
    }

    @Then("I verify Im in plansprepaid page")
    public void i_verify_im_in_plansprepaid_page() {
        String expectedresult="https://www.verizon.com/prepaid/?adobe_mc=MCMID%3D13354807219508001731320662505102754890%7CMCORGID%3D843F02BE53271A1A0A490D4C%2540AdobeOrg%7CTS%3D1600297970&mboxSession=2b20bb09e7e34b3b974971be12f59963&wireless_gn_exp=0-129904";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not equal",expectedresult,actualresult);
    }

    @When("i click on planssingledevice element")
    public void i_click_on_planssingledevice_element() {
        clickByXpath(planssingledeviceWebElement);
    }

    @Then("I verify Im in planssingledevice page")
    public void i_verify_im_in_planssingledevice_page() {
        String expectedresult="https://www.verizon.com/plans/single-device-plan/?adobe_mc=MCMID%3D13354807219508001731320662505102754890%7CMCORGID%3D843F02BE53271A1A0A490D4C%2540AdobeOrg%7CTS%3D1600297930&mboxSession=2b20bb09e7e34b3b974971be12f59963&wireless_gn_exp=0-129904";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not equal",expectedresult,actualresult);
    }

    @When("i click on plansthoseWhoServe element")
    public void i_click_on_plansthose_who_serve_element() {
        clickByXpath(plansthoseWhoServeWebElement);
    }

    @Then("I verify Im in plansthoseWhoServe page")
    public void i_verify_im_in_plansthose_who_serve_page() {
        String expectedresult="https://www.verizon.com/featured/giving-more/?adobe_mc=MCMID%3D13354807219508001731320662505102754890%7CMCORGID%3D843F02BE53271A1A0A490D4C%2540AdobeOrg%7CTS%3D1600297895&mboxSession=2b20bb09e7e34b3b974971be12f59963&wireless_gn_exp=0-129904";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not equal",expectedresult,actualresult);
    }
    @When("i click on planskidsPlans element")
    public void i_click_on_planskids_plans_element() {
        clickByXpath(planskidsPlansWebElement);
    }

    @Then("I verify Im in planskidsPlans page")
    public void i_verify_im_in_planskids_plans_page() {
        String expectedresult="https://www.verizon.com/family-tech/?adobe_mc=MCMID%3D13354807219508001731320662505102754890%7CMCORGID%3D843F02BE53271A1A0A490D4C%2540AdobeOrg%7CTS%3D1600297859&mboxSession=2b20bb09e7e34b3b974971be12f59963&wireless_gn_exp=0-129904";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not equal",expectedresult,actualresult);
    }

    @When("i click on plansstudent element")
    public void i_click_on_plansstudent_element() {
        clickByXpath(plansstudentPlansWebElement);
    }

    @Then("I verify Im in plansstudent page")
    public void i_verify_im_in_plansstudent_page() {
        String expectedresult="https://www.verizon.com/featured/students/?adobe_mc=MCMID%3D13354807219508001731320662505102754890%7CMCORGID%3D843F02BE53271A1A0A490D4C%2540AdobeOrg%7CTS%3D1600297811&mboxSession=2b20bb09e7e34b3b974971be12f59963&wireless_gn_exp=0-129904";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not equal",expectedresult,actualresult);
    }
    @When("i click on plansotherplans element")
    public void i_click_on_plansotherplans_element() {
        clickByXpath(plansotherplansWebElement);
    }

    @Then("I verify Im in plansotherplans page")
    public void i_verify_im_in_plansotherplans_page() {
        String expectedresult="https://www.verizon.com/plans/?adobe_mc=MCMID%3D13354807219508001731320662505102754890%7CMCORGID%3D843F02BE53271A1A0A490D4C%2540AdobeOrg%7CTS%3D1600297777&mboxSession=2b20bb09e7e34b3b974971be12f59963&wireless_gn_exp=0-129904";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not equal",expectedresult,actualresult);
    }
    @When("i click on plansdBrinYourOwnDevice element")
    public void i_click_on_plansd_brin_your_own_device_element() {
        clickByXpath(plansdBrinYourOwnDeviceWebElement);
    }

    @Then("I verify Im in plansdBrinYourOwnDevice page")
    public void i_verify_im_in_plansd_brin_your_own_device_page() {
        String expectedresult="https://www.verizon.com/bring-your-own-device/?adobe_mc=MCMID%3D13354807219508001731320662505102754890%7CMCORGID%3D843F02BE53271A1A0A490D4C%2540AdobeOrg%7CTS%3D1600297750&mboxSession=2b20bb09e7e34b3b974971be12f59963&wireless_gn_exp=0-129904";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("Not equal",expectedresult,actualresult);
    }


    @When("I scroll to site map")
    public void i_scroll_to_site_map() {
        moveToElement(siteMapWebElement);
    }

    @When("I click on site map")
    public void i_click_on_site_map() {
        clickByXpath(siteMapWebElement);
    }

    @When("I get the list of smartphones")
    public void i_get_the_list_of_smartphones() {
        List<WebElement> smartphones = driver.findElements(By.xpath(smartphoneslistWebElement));
        System.out.println(smartphones);
List<String> listsmartphone=null;
        for (WebElement element: smartphones) {
            listsmartphone.add(element.getText());
            System.out.println(element.getText());
            element.click();

        }
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayListToSqlTable(listsmartphone,"Verizon","verizonSmartphone");
    }
    @When("I fetch it from data base")
    public void i_fetch_it_from_data_base() {

    }

    @When("I mouse over signin")
    public void i_mouse_over_signin() {
        moveToElement(signInWebElement);
    }

    @When("I click n my account")
    public void i_click_n_my_account() {
clickByXpath(myaccountWebElement);
    }

    @Then("I verify Im in my account page")
    public void i_verify_im_in_my_account_page() {
        String expectedresult="Sign in";
        String actualResult=driver.findElement(By.xpath("//*[@id=\"main-content\"]/h1")).getText();
        Assert.assertEquals("not equal",expectedresult,actualResult);
    }
    @When("I click on Register")
    public void i_click_on_register() {
clickByXpath(registerWebElement);
    }

    @Then("I verify Im in register page")
    public void i_verify_im_in_register_page() {
        String expectedresult="Sign in";
        String actualResult=driver.findElement(By.xpath("//*[@id=\"main-content\"]/h1")).getText();
        Assert.assertEquals("not equal",expectedresult,actualResult);
    }
    @When("I click on prepaidInstantPay")
    public void i_click_on_prepaid_instant_pay() {
        clickByXpath(prepaidInstantPayWebElement);
    }

    @Then("I verify Im in prepaidInstantPay")
    public void i_verify_im_in_prepaid_instant_pay() {
        String expectedresult="Hi Prepaid customer! Ready to take care of your monthly payment?";
        String actualResult=driver.findElement(By.xpath("//*[@id=\"main-panel\"]/span/div[2]/h1")).getText();
        Assert.assertEquals("not equal",expectedresult,actualResult);
    }
    @When("I click on search Button")
    public void i_click_on_search_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I type {string} on search bar")
    public void i_type_on_search_bar(String string) {
        clickByXpath(searchButtonWebElement);
        typeByXpath(searchButtonWebElement,string);
    }

    @Then("I verify in parthresearchVerify is correct")
    public void i_verify_is_correct() {
        String actualresult=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[4]/div[1]/div/h3/a/div[1]")).getText();
        String expectedresult= true+"";
        String ans=false+"";
        try {
            //returns true if research show the whole research
            ans=actualresult.contains("how to subscript") +"";
        }
        catch (Exception e ){
            //returns true i research return partial research
            ans=actualresult.contains("subscript") +"";
        try {

        }
        catch (Exception r){
            ans=false +"";
        }
        }

        Assert.assertEquals("not match result",expectedresult,ans);
    }

    // Cucumber Hook
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Demo1"); // ... and embed it in the report.
        }
    }


    @After
    public void close(){
        driver.quit();
    }
}
