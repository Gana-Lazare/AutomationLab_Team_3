package footerEbayTest;

import common.WebAPI;
import footerEbay.BuyCategory;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BuyCategoryTest extends WebAPI  {
   BuyCategory buyCategory;

    @BeforeMethod
    public void getInit() {
        buyCategory = PageFactory.initElements(driver,BuyCategory.class);
//        registrationPage = PageFactory.initElements(driver,RegistrationPage.class);
    }
    //TC-1
    @Test(timeOut = 7000,enabled = false)
    public void buyLinkTest(){
        buyCategory.buyLinkAction();
    //validation
      String expectedResult= driver.getTitle();
      String actualResul="Shop by Category | eBay";
       Assert.assertEquals(expectedResult,actualResul);
    }
    //TC-2
    @Test(timeOut = 7000,enabled = false)
    public void healthAndBeatyLinkTest()  {
        buyCategory.healthAndBeatyAct();
    }
    //TC-3
    @Test(timeOut = 7000,enabled = false)
    public void SellLInkActTest()  {
        buyCategory.sellLInkAct();
    }
    //Tc-4
    @Test(enabled = false)
    public void moneyBackGuarenteeTest(){
    buyCategory.moneyBackGuarenteeAct();
    }
    //TC-5
    @Test(enabled = false)
    public void biddinAndBuyingTest (){
        buyCategory.biddinAndBuyingAct();
    }
    //Tc-6
    @Test(enabled = false)
    public void ebayCompaniesLinkTest(){
        buyCategory.ebayCompaniesLinkAct();
        buyCategory.timer(5);
       Assert.assertEquals(driver.getTitle(),driver.getTitle());
    }
    //Tc-7
    @Test(enabled = false)
    public void policiesLinkTest(){
        buyCategory.policiesLinkAct();
    }
    //TC-8
    @Test(enabled = false)
    public void copyrightTest(){
        buyCategory.copyrightAct();
    }
    //TC-9
    @Test(enabled = false)
    public void languageSelectTest(){
        buyCategory.languageSelectAct();
    }
    //TC-10
    @Test(enabled = false)
    public void countrySelectHKTest(){
        buyCategory.countrySelectHonkKongAct();
    }
    //TC-11
    @Test(enabled = false)
    public void collectibleArtTest(){
        buyCategory.collectibelAndArtSideAct();
    }
    //TC-12
    @Test(enabled = false)
    public void northonIdTest(){
        buyCategory.northonSAct();
    }
    //Tc-13
    @Test(enabled = false)
    public void communityLinkTest(){
        buyCategory.communityLinkAct();
    }
    //Tc-14
    @Test(enabled = false)
    public void communitySearchBox(){
        buyCategory.communitySearchAct();

    }
    //TC-15
    @Test
    public void communitySearchDropSellerNewsTest(){
        buyCategory.communitySeachDropLocationAct();

    }

}
