package ebayhometest;

import common.WebAPI;
import ebayhome.EbayHome;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ebayhometest extends WebAPI {
EbayHome ebayHome ;

    @BeforeMethod // to use the driver to open the browser
    public void getInit() {
       ebayHome = PageFactory.initElements(driver,EbayHome.class);
        //registrationPage = PageFactory.initElements(driver,SignUpPage.class);

    }

    @Test
    public void AdvancedButtonClickTest() {
        ebayHome.advancedButtonClick();
        ebayHome.assertAdvancedButtonClick();
    }

    @Test
    public void testSellButtonCheck() throws InterruptedException {
        ebayHome.sellButtonCheck();
    }

    @Test
    public void testHelpAndContactCheck(){
        ebayHome.helpAndContactCheck();
    }

    @Test
    public void testHelpSearchBoxCheck(){
        ebayHome.helpSearchBoxCheck("How to Sell");
    }

    @Test
    public void testReturnsAndRefundsCheck(){
        ebayHome.returnsAndRefundsCheck();
    }

    @Test
    public void testShippingAndTrackingCheck(){
        ebayHome.shippingAndTrackingCheck();
    }

    @Test
    public void testSellingCheck(){
        ebayHome.sellingCheck();
    }

    @Test
    public void testBuyingCheck(){
        ebayHome.buyingCheck();
    }

    @Test
    public void testAccountCheck(){
        ebayHome.accountCheck();
    }

    @Test
    public void testFeesAndInvoicesCheck(){
        ebayHome.feesAndInvoicesCheck();
    }

    @Test
    public void testContactUsCheck(){
        ebayHome.contactUsCheck();
    }

    @Test
    public void testAskTheCommunityCheck(){
        ebayHome.askTheCommunityCheck();
    }

    @Test
    public void testStartReturnCheck(){
        ebayHome.startReturnCheck();
    }

    @Test
    public void testUndeliveredItemCheck(){
        ebayHome.undeliveredItemCheck();
    }

    @Test
    public void testStartSharingCheck(){
        ebayHome.startSharingCheck();
    }
}
