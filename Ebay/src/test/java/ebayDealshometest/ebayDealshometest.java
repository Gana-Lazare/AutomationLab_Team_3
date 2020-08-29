package ebayDealshometest;

import common.WebAPI;
import ebayDealshome.EbayDealsHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ebayDealshometest extends WebAPI {
EbayDealsHome DealsHome ;

    @BeforeMethod // to use the driver to open the browser
    public void getInit() {
        DealsHome= PageFactory.initElements(driver, EbayDealsHome.class);
        // registrationPage = PageFactory.initElements(driver,SignUpPage.class);
    }

    @Test
    public void testClickFeatured()throws InterruptedException {
        //((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        DealsHome.ClickFeatured();
    }
    @Test
    public void testfindClickTech(){
        DealsHome.findClickTech();
    }
    @Test
    public void testFindClickFashion(){
        DealsHome.findClickFashion();
    }
    @Test
    public void testClickHomeAndGarden(){
       DealsHome.ClickHomeAndGarden();
    }
    @Test
    public void testSportingGoods(){
        DealsHome.SportingGoods();
    }
    @Test
    public void testAutomotive(){
        DealsHome.Automotive();
    }
    @Test
    public void testOtherDeals(){
       DealsHome.OtherDeals();
    }
    @Test
    public void testSalesEvents(){
        DealsHome.SalesEvents();
    }
    @Test
    public void testClickEspressoLink(){
        DealsHome.ClickEspressoLink();
        DealsHome.validateEspresso();
    }
    @Test
    public void testClickPumaLink(){
        DealsHome.ClickPumaLink();
    }
    @Test
   public void testcliCkMiniSpeaker(){
        DealsHome.clickMiniSpeaker();
    }
    @Test
   public void testClickAdidasFreedomLink(){
       DealsHome.clickAdidasFreedomLink();
   }
    @Test
   public void testClickAdidasEssentials(){
       DealsHome.clickAdidasEssentials();
   }
    @Test
   public void testClickHeadset(){
       DealsHome.ClickHeadset();
  }
//    @Test
//    public void testClickWatchList(){
//      DealsHome.ClickWatchList();
//    }
//    @Test
//    public void testClickSell(){
//        DealsHome.ClickSell();
//    }
//    @Test
//    public void ClickHelpContact(){
//       DealsHome.ClickHelpContact();
//    }
//    @Test
//    public void ClickBrandOutLet(){
//        DealsHome.ClickBrandOutLet();
//    }
//    @Test
//    public void testClickDailyDeals(){
//        DealsHome.ClickDailyDeals();
//    }
//    @Test
//    public void testClickRegister(){
//        DealsHome.ClickRegister();
//    }
//    @Test
//    public void test(){
//        DealsHome.ClickSignIn();
//    }

}
