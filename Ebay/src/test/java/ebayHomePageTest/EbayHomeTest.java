package ebayHomePageTest;

import common.WebAPI;
import ebayhome.EbayHome;
//import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class EbayHomeTest extends WebAPI {

    EbayHome ebayHome;
    @Test
    public void HomeGardenTest() throws InterruptedException {
        EbayHome homeObj = PageFactory.initElements(driver, EbayHome.class);
        homeObj.MyHomeGarden();
        Thread.sleep(5000);
    }
    @Test
    public void BabiesTest() throws InterruptedException {
       // HomeGardenTest();
        EbayHome homeObj1 = PageFactory.initElements(driver, EbayHome.class);
        homeObj1.BabiesShop();
        Thread.sleep(5000);
    }
    @Test
    public void lastPage() throws InterruptedException {
        //HomeGardenTest();
        ebayHome.MyHomeGarden();
        EbayHome home = PageFactory.initElements(driver, EbayHome.class);
        home.endOfPage();
    }
    @Test
    public void beddingTest() throws InterruptedException {
        ebayHome.bedding();
    }
    @Test
    public void craftsTest() throws InterruptedException {
        ebayHome.MyHomeGarden();
        EbayHome home = PageFactory.initElements(driver, EbayHome.class);
        home.crafts();
    }
    @Test
    public void FoodBeveragesTest() throws InterruptedException {
       ebayHome.MyHomeGarden();
        EbayHome home = PageFactory.initElements(driver, EbayHome.class);
        home.FoodBeverages();
    }
    @Test
    public void FurnitureTest() throws InterruptedException {
        ebayHome.MyHomeGarden();
        EbayHome home = PageFactory.initElements(driver, EbayHome.class);
        home.Furniture();
    }
    @Test
    public void homeDecorTest() throws InterruptedException {
       ebayHome.MyHomeGarden();
        EbayHome home = PageFactory.initElements(driver, EbayHome.class);
        home.homeDecor();
    }
    @Test
    public void homeImprovementTest() throws InterruptedException {
       ebayHome.MyHomeGarden();
        EbayHome home = PageFactory.initElements(driver, EbayHome.class);
        home.homeImprovement();
    }
    @Test
    public void toolsTest() throws InterruptedException {
       ebayHome.MyHomeGarden();
        EbayHome home = PageFactory.initElements(driver, EbayHome.class);
        home.tools();
    }
    @Test
    public void wineTest() throws InterruptedException {
        ebayHome.MyHomeGarden();
        EbayHome home = PageFactory.initElements(driver, EbayHome.class);
        home.wine();
    }
    @Test
    public void smartHomeTest() throws InterruptedException {
        ebayHome.MyHomeGarden();
        EbayHome home = PageFactory.initElements(driver, EbayHome.class);
        home.smartHome();
    }
    @Test
    public void brevilleTest() throws InterruptedException {
        ebayHome.MyHomeGarden();
        EbayHome home = PageFactory.initElements(driver, EbayHome.class);
        home.breville();
    }
    @Test
    public void dewaltTest() throws InterruptedException {
        ebayHome.MyHomeGarden();
        EbayHome home = PageFactory.initElements(driver, EbayHome.class);
        home.dewalt();
    }
    @Test
    public void cleanHouseTest() throws InterruptedException {
        ebayHome.MyHomeGarden();
        EbayHome home = PageFactory.initElements(driver, EbayHome.class);
        home.cleanHouse();
    }
    @Test
    public void yearsOfPeopleTest() throws InterruptedException {
       ebayHome.MyHomeGarden();
        EbayHome home = PageFactory.initElements(driver, EbayHome.class);
        home.yearsOfPeople();
    }
    @Test
    public void shopToBrandTest() throws InterruptedException {
       ebayHome.MyHomeGarden();
        EbayHome home = PageFactory.initElements(driver, EbayHome.class);
        home.shopToBrand();
    }
    @Test
    public void coffeeTest() throws InterruptedException {
        ebayHome.MyHomeGarden();
        EbayHome home = PageFactory.initElements(driver, EbayHome.class);
        home.coffee();
    }
    @Test
    public void exploreInterestTest() throws InterruptedException {
        ebayHome.MyHomeGarden();
        EbayHome home = PageFactory.initElements(driver, EbayHome.class);
        home.exploreInterest();
    }
    @Test
    public void SaveUpToTest() throws InterruptedException {
       ebayHome.MyHomeGarden();
        EbayHome home = PageFactory.initElements(driver, EbayHome.class);
        home.SaveUpTo();
    }
    @Test
    public void advancedTest() throws InterruptedException {
       ebayHome.MyHomeGarden();
        EbayHome home = PageFactory.initElements(driver, EbayHome.class);
        home.advanced();
    }
    @Test
    public void shopByCategoryTest() throws InterruptedException {
       ebayHome.MyHomeGarden();
        EbayHome home = PageFactory.initElements(driver, EbayHome.class);
        home.shopByCategory();
    }
    @Test
    public void petSuppliesTest() throws InterruptedException {
        ebayHome.MyHomeGarden();
        EbayHome home = PageFactory.initElements(driver, EbayHome.class);
        home.petSupplies();
    }
    @Test
    public void majorApplianceTest() throws InterruptedException {
        ebayHome.MyHomeGarden();
        EbayHome home = PageFactory.initElements(driver, EbayHome.class);
        home.majorAppliance();
    }
    @Test
    public void housekeepingTest() throws InterruptedException {
        ebayHome.MyHomeGarden();
        EbayHome home = PageFactory.initElements(driver, EbayHome.class);
        home.housekeeping();
    }
}