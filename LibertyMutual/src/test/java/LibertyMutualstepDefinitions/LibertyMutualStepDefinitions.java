package LibertyMutualstepDefinitions;

import common.WebAPI;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.List;

import static libertymutualHome.LibertyMutualWebElement.*;

public class LibertyMutualStepDefinitions extends WebAPI {

    @Given("IM in LibertyMutual Home Page")
    public void im_in_liberty_mutual_home_page() throws IOException, InterruptedException {
        setUp(false, "BrowserStack", "Windows", "7", "chrome", "85", "https://www.libertymutual.com/");
driver.manage().window().maximize();
Thread.sleep(3000);
    }

    @When("I select Auto")
    public void i_select_auto() {
        moveToElement("//*[@id=\"quoteModuleForm\"]/div/div/div[1]/div[3]/div/div/div/div/div");
clickByXpath(autoWebElement);
    }

    @When("I send zip code")
    public void i_send_zip_code() {
        clickByLocator("//input[@name=\"zipCode\"]");
typeByXpath(zipCodeBareWebELement,"11204");
    }

    @When("i send {string} apt")
    public void i_send_apt(String string) {
        typeByXpath(apt_unitWebElement,string);
    }


    @When("I click on price")
    public void i_click_on_price() throws InterruptedException {
clickByXpath(getMyPriceButtonWebElement);
Thread.sleep(3000);
    }

    @When("close popo Window Alert")
    public void close_popo_window_alert() {
clickByXpath(OKtHANKSWebElement);

    }

    @Then("I verify Im in auto page")
    public void i_verify_im_in_auto_page() {
        System.out.println("not yet");
    }
    @Then("I send {string} bare")
    public void i_send_bare(String string) {
        moveToElement(streetadressWebElement);
typeByXpath(streetadressWebElement,string);
    }

    @Then("click saveandContinue")
    public void click_saveand_continue() {
        moveToElement("//*[@id='nextButton-0']");
clickByXpath(saveAndContinueWebElement);
    }

    @Then("I verify Im in Personal Information page")
    public void i_verify_im_in_personal_information_page() {
String expectedresult="https://buy.libertymutual.com/rwd/standard?city=Brooklyn&jurisdiction=NY&lob=Auto&policyType=Auto&sessionId=[46196166549065990&state=NY&zipCode=11204#group=nav-your_info&product=auto&pane=YI01]&appPhase=quote";
String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not same",expectedresult,actualresult);
    }
    @When("I click on shopInsurance")
    public void i_click_on_shop_insurance() {
        clickByXpath(shopInsuranceWebElement);
    }

    @When("I click on Car")
    public void i_click_on_car() throws InterruptedException {
        clickByXpath(carShopInsuranceWebElement);
        Thread.sleep(3000);
    }

    @Then("I verify Im in Car Page")
    public void i_verify_im_in_car_page() {
        String expectedresult="https://www.libertymutual.com/auto";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not same",expectedresult,actualresult);

    }
    @When("I click on motocycle")
    public void i_click_on_motocycle() throws InterruptedException {
        clickByXpath(motocycleShopInsuranceWebElement);
        Thread.sleep(3000);
    }

    @Then("I verify Im in motocycle Page")
    public void i_verify_im_in_motocycle_page() {
        String expectedresult="https://www.libertymutual.com/motorcycle-insurance";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not same",expectedresult,actualresult);
    }
    @When("I click on boatAndWaterCraft")
    public void i_click_on_boat_and_water_craft() throws InterruptedException {
        clickByXpath(boatAndWaterCraftWebElement);
        Thread.sleep(3000);
    }

    @Then("I verify Im in boatAndWaterCraft Page")
    public void i_verify_im_in_boat_and_water_craft_page() {
        String expectedresult="https://www.libertymutual.com/boat-insurance";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not same",expectedresult,actualresult);
    }

    @When("I click on anticAndClassicCar")
    public void i_click_on_antic_and_classic_car() throws InterruptedException {
        clickByXpath(anticAndClassicCarWebElement);
        Thread.sleep(3000);
    }

    @Then("I verify Im in anticAndClassicCar Page")
    public void i_verify_im_in_antic_and_classic_car_page() {
        String expectedresult="https://www.libertymutual.com/classic-car-insurance";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not same",expectedresult,actualresult);
    }
    @When("I click on AtvAndOfRoadVehicul")
    public void i_click_on_atv_and_of_road_vehicul() throws InterruptedException {
        clickByXpath(atvAndOfRoadVehiculWebElement);
        Thread.sleep(3000);
    }

    @Then("I verify Im in AtvAndOfRoadVehicul Page")
    public void i_verify_im_in_atv_and_of_road_vehicul_page() {
        String expectedresult="https://www.libertymutual.com/atv-insurance";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not same",expectedresult,actualresult);
    }

    @When("I click on recreationalVehicule")
    public void i_click_on_recreational_vehicule() throws InterruptedException {
        clickByXpath(recreationalVehiculeWebElement);
        Thread.sleep(3000);
    }

    @Then("I verify Im in recreationalVehicule Page")
    public void i_verify_im_in_recreational_vehicule_page() {
        String expectedresult="https://www.libertymutual.com/rv-insurance";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not same",expectedresult,actualresult);
    }
    @When("I click on umberella")
    public void i_click_on_umberella() throws InterruptedException {
clickByXpath(umberellaWebElement);
Thread.sleep(3000);
    }

    @Then("I verify Im in umberella Page")
    public void i_verify_im_in_umberella_page() {
        String expectedresult="https://www.libertymutual.com/rv-insurance";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not same",expectedresult,actualresult);
    }
    @When("I click on home")
    public void i_click_on_home() throws InterruptedException {
clickByXpath(homeWebElement);
Thread.sleep(3000);
    }

    @Then("I verify Im in home Page")
    public void i_verify_im_in_home_page() {
        String expectedresult="https://www.libertymutual.com/homeowners-insurance";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not same",expectedresult,actualresult);
    }
    @When("I click on renters")
    public void i_click_on_renters() throws InterruptedException {
       clickByXpath(rentersWebElement);
        Thread.sleep(3000);
    }

    @Then("I verify Im in renters Page")
    public void i_verify_im_in_renters_page() {
        String expectedresult="https://www.libertymutual.com/renters-insurance";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not same",expectedresult,actualresult);
    }
    @When("I click on condo")
    public void i_click_on_condo() throws InterruptedException {
        clickByXpath(condoWebElement);
        Thread.sleep(3000);
    }

    @Then("I verify Im in condo Page")
    public void i_verify_im_in_condo_page() {
        String expectedresult="https://www.libertymutual.com/condo-insurance";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not same",expectedresult,actualresult);
    }


    @When("I click on landlord")
    public void i_click_on_landlord() throws InterruptedException {
       clickByXpath(landlordWebElement);
       Thread.sleep(3000);
    }

    @Then("I verify Im in landlord Page")
    public void i_verify_im_in_landlord_page() {
        String expectedresult="https://www.libertymutual.com/landlord-insurance";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not same",expectedresult,actualresult);
    }
    @When("I click on mobilehome")
    public void i_click_on_mobilehome() throws InterruptedException {
        clickByXpath(mobilehomeWebElement);
        Thread.sleep(3000);
    }

    @Then("I verify Im in mobilehome Page")
    public void i_verify_im_in_mobilehome_page() {
        String expectedresult="https://www.libertymutual.com/mobile-home-insurance";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not same",expectedresult,actualresult);
    }
    @When("I click on flood")
    public void i_click_on_flood() throws InterruptedException {
        clickByXpath(floodWebElement);
        Thread.sleep(3000);
    }

    @Then("I verify Im in flood Page")
    public void i_verify_im_in_flood_page() {
        String expectedresult="https://www.libertymutual.com/flood-insurance";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not same",expectedresult,actualresult);
    }
    @When("I click on umberellaProprety")
    public void i_click_on_umberella_proprety() throws InterruptedException {
        clickByXpath(umberellaPropretyWebElement);
        Thread.sleep(3000);
    }

    @Then("I verify Im in umberellaProprety Page")
    public void i_verify_im_in_umberella_proprety_page() {
        String expectedresult="https://www.libertymutual.com/umbrella-insurance";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not same",expectedresult,actualresult);
    }

    // login

    @When("I click on login")
    public void i_click_on_login() throws InterruptedException {
        clickByXpath(loginWebElement);
        Thread.sleep(3000);
    }

    @When("I try to login")
    public void i_try_to_login(DataTable dataTable) {
List<List<String>>  data = dataTable.asLists(String.class);
clickByXpath(usernameWebElemnt);
        driver.findElement(By.xpath(usernameWebElemnt)).sendKeys(data.get(0).get(0));
        driver.findElement(By.xpath(passwordWebElement)).sendKeys(data.get(0).get(1));

    }

    @When("I click on search on home page")
    public void i_click_on_search_on_home_page() {
        clickByXpath(searchButtonWebElement);
    }

    @When("I send {string} searchKey")
    public void i_send_search_key(String string) {
typeByXpath(searchBarWebElement,string);
    }

    @Then("i verify i get the right result")
    public void i_verify_i_get_the_right_result() {
//do assertion
    }


    @When("I click on submite")
    public void i_click_on_submite() {
        clickByXpath(submiteLoginWebElement);
    }


    @When("I click on claim Button")
    public void i_click_on_claim_button() {
        clickByXpath(claimWebElement);
    }

    @When("I click on claimCenter Button")
    public void i_click_on_claim_center_button() {
        clickByXpath(claimCenter_UnderClaimWebElement);
    }

    @Then("I verify im in claimCenter")
    public void i_verify_im_in_claim_center() throws InterruptedException {
        Thread.sleep(3000);
        String expectedResult="https://www.libertymutual.com/claims-center";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not equal",expectedResult,actualresult);
    }

    @When("I click on howTomanageYourClaim Button")
    public void i_click_on_how_tomanage_your_claim_button() {
        clickByXpath(howTomanageYourClaim_UnderClaimWeElement);
    }

    @Then("I verify im in howTomanageYourClaim")
    public void i_verify_im_in_how_tomanage_your_claim() throws InterruptedException {
        Thread.sleep(3000);
        String expectedResult="https://www.libertymutual.com/claims-center/track-claim";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not equal",expectedResult,actualresult);
    }

    @When("I click on fileAclaimAgainstLibertymutual Button")
    public void i_click_on_file_aclaim_against_libertymutual_button() {
        clickByXpath(fileAclaimAgainstLibertymutualWebElement);
    }

    @Then("I verify im in fileAclaimAgainstLibertymutual")
    public void i_verify_im_in_file_aclaim_against_libertymutual() throws InterruptedException {
        Thread.sleep(3000);
        String expectedResult="https://www.libertymutual.com/claims-center/third-party-claims";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not equal",expectedResult,actualresult);
    }

    @When("I click on fileAnAutoGlassClaim Button")
    public void i_click_on_file_an_auto_glass_claim_button() {
clickByXpath(fileAnAutoGlassClaim_UnderClaimWebElement);

    }

    @Then("I verify im in fileAnAutoGlassClaim")
    public void i_verify_im_in_file_an_auto_glass_claim() throws InterruptedException {
        Thread.sleep(3000);
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String expectedResult="https://submit.glassclaim.com/self-service/Welcome.aspx";
        String actualresult=driver.getCurrentUrl();
        Assert.assertEquals("not equal",expectedResult,actualresult);
    }




    @After
    public void close(){
        driver.quit();
    }
}
