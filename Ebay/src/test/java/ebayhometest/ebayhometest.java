package ebayhometest;

import common.WebAPI;
import ebayhome.EbayHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ebayhometest extends WebAPI {
    EbayHome ebayHome;

    @BeforeMethod // to use the driver to open the browser
    public void getInit() {
        ebayHome = PageFactory.initElements(driver, EbayHome.class);

        // registrationPage = PageFactory.initElements(driver,SignUpPage.class);
    }



    @Test
    public void AdancedButtonClickTest() {
        ebayHome.advancedButtonClick();
        ebayHome.assertAdvancedButtonClick();
    }

    @Test
    public void SearchBoxResearchTest() throws InterruptedException {
        ebayHome.insertResearch();
        //   ebayHome.assertsearchBox();
    }

    @Test
    public void rightOptionSelectiontest() {
        ebayHome.rightOptionsearch();
        ebayHome.assertionrightOptionsearch();
    }

    @Test
    public void shopbycategorytest() {
        ebayHome.collectiblesandart();
        ebayHome.assertCollectiblesandart();
    }

    @Test
    public void homePagetest() {

        ebayHome.homepage();
        ebayHome.assertHomePage();
    }

    @Test
    public void advancedresearchtest() {
        ebayHome.advancedButtonClick();
        ebayHome.advancedsearch();
        //ebayHome.assertadvancedsearch();
    }

    @Test
    public void advancedexcludeKey() {
        ebayHome.advancedButtonClick();
        //ebayHome.advancedsearch();
        ebayHome.advancedExcludeKey();
        ebayHome.assertadvancedExcludeKey();
        ebayHome.selectOrderWordsResearch();
    }

    @Test
    public void categoryadvancedtest() {
        ebayHome.advancedButtonClick();
        ebayHome.categoryadvancedselection();
        ebayHome.assertcategoryAdvancedSelection();

    }

    @Test
    public void searchtipstest() {
        ebayHome.advancedButtonClick();
        ebayHome.searchTips();
    }

    @Test
    public void searchoptionLinktest() {
        ebayHome.advancedButtonClick();
        ebayHome.usingsearchoptionlink();
    }

    @Test
    public void titleandDescriptionCheckBoxtest() {
        ebayHome.advancedButtonClick();
        ebayHome.titleAndDescriptionCheckbox();
    }

    @Test
    public void findItemsTest() {
        ebayHome.advancedButtonClick();
        ebayHome.finditems();
    }

    @Test
    public void onEbayTest() {
        ebayHome.advancedButtonClick();
        ebayHome.onEbayMotor();
    }

    @Test
    public void bySeller() {
        ebayHome.advancedButtonClick();
        ebayHome.byseller();
    }

    @Test
    public void byItemtest() {
        ebayHome.advancedButtonClick();
        ebayHome.byitem();
    }

    @Test
    public void advancedSiteMap() {
        ebayHome.advancedButtonClick();
        ebayHome.advancedsiteMap();
    }

    @Test
    public void switchtoSiteMap() throws Exception {
        ebayHome.advancedButtonClick();
        ebayHome.switchtositeMap();
    }

    @Test
    public void showItems() throws Exception {

        ebayHome.advancedButtonClick();
        ebayHome.showitemschekcBox();
        ebayHome.assertshowitemsCheckBox();
    }

    @Test
    public void itemInStore() {
        ebayHome.advancedButtonClick();
        ebayHome.itemsInstore();
        ebayHome.assertitemsInStore();
    }

    @Test
    public void findStore() {
        ebayHome.advancedButtonClick();
        ebayHome.findStore();
        ebayHome.assertfindStore();
    }

    @Test
    public void aboutEbay() {
        ebayHome.advancedButtonClick();
        ebayHome.aboutEbayAdvanced();
        ebayHome.assertaboutEbayAdvanced();
    }

    @Test
    public void annoucement() {
        ebayHome.advancedButtonClick();
        ebayHome.annoucement();
        ebayHome.assertannoucement();
    }

    @Test
    public void community() {
        ebayHome.advancedButtonClick();
        ebayHome.community();
        ebayHome.assertcommunity();
    }

    @Test
    public void securityCenter() {
        ebayHome.advancedButtonClick();
        ebayHome.securityCenter();
        ebayHome.assertsecurityCenter();
    }

    @Test
    public void resolution() {
        ebayHome.advancedButtonClick();
        ebayHome.resolution();
        ebayHome.assertresolution();
    }

    @Test
    public void sellerCenter() {
        ebayHome.advancedButtonClick();
        ebayHome.sellerCenter();
        ebayHome.assertsellerCenter();
    }

    @Test
    public void policies() {
        ebayHome.advancedButtonClick();
        ebayHome.policies();
        ebayHome.assertpolicies();
    }

    @Test
    public void affiliates() {
        ebayHome.advancedButtonClick();
        ebayHome.affiliates();
        ebayHome.assertaffiliates();
    }

    @Test
    public void helpAndContact() {
        ebayHome.advancedButtonClick();
        ebayHome.helpAndContact();
        ebayHome.asserthelpAndContact();
    }

    @Test
    public void ringSignIn() throws InterruptedException {
        ebayHome.advancedButtonClick();
        ebayHome.ringAlert();
    }
//how to check if i real
    @Test
    public void scrollToTop() throws InterruptedException {
        ebayHome.advancedButtonClick();
        ebayHome.scrollToTop();
    }
}
