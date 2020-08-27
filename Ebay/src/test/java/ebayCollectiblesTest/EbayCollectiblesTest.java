package ebayCollectiblesTest;

import common.WebAPI;
import ebayCollectiblesArt.EbayCollectibles;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbayCollectiblesTest extends WebAPI {

        EbayCollectibles ebayCollectibles;

        @BeforeMethod // to use the driver to open the browser
        public void getInit1() {
            ebayCollectibles = PageFactory.initElements(driver, EbayCollectibles.class);
        }
        @Test (timeOut = 4000)
        public void testCollectiblesAndArtButtonCheck() {
            ebayCollectibles.collectiblesAndArtButtonCheck();
        }
        @Test (timeOut = 4000)
        public void testDollsTeddyBearsButtonCheck() {
            ebayCollectibles.collectiblesAndArtButtonCheck();
            ebayCollectibles.dollsTeddyBearsButtonCheck();
        }
        @Test (timeOut = 4000)
        public void testArtCraftSuppliesButtonCheck() {
            ebayCollectibles.collectiblesAndArtButtonCheck();
            ebayCollectibles.artCraftSuppliesButtonCheck();
        }
        @Test (timeOut = 4000)
        public void testAntiquesButtonCheck() {
            ebayCollectibles.collectiblesAndArtButtonCheck();
            ebayCollectibles.antiquesButtonCheck();
        }
        @Test
        public void testStampsButtonCheck() {
            ebayCollectibles.collectiblesAndArtButtonCheck();
            ebayCollectibles.stampsButtonCheck();
        }
        @Test (timeOut = 4000)
        public void testEntertainmentMemorabiliaButtonCheck() {
            ebayCollectibles.collectiblesAndArtButtonCheck();
            ebayCollectibles.entertainmentMemorabiliaButtonCheck();
        }
        @Test (timeOut = 4000)
        public void testCollectiblesButtonCheck() {
            ebayCollectibles.collectiblesAndArtButtonCheck();
            ebayCollectibles.collectiblesButtonCheck();
        }
        @Test (timeOut = 4000)
        public void testArtButtonCheck() {
            ebayCollectibles.collectiblesAndArtButtonCheck();
            ebayCollectibles.artButtonCheck();
        }
        @Test (timeOut = 4000)
        public void testEBayCollectiveButtonCheck() {
            ebayCollectibles.collectiblesAndArtButtonCheck();
            ebayCollectibles.eBayCollectiveButtonCheck();
        }
        @Test (timeOut = 4000)
        public void testCollectibleDealsButtonCheck() {
            ebayCollectibles.collectiblesAndArtButtonCheck();
            ebayCollectibles.collectibleDealsButtonCheck();
        }
        @Test (timeOut = 4000)
        public void testVintageAntiqueFineJewelryButtonCheck() {
            ebayCollectibles.collectiblesAndArtButtonCheck();
            ebayCollectibles.vintageAntiqueFineJewelryButtonCheck();
        }
        @Test (timeOut = 4000)
        public void testLiveAuctioneersButtonCheck() {
            ebayCollectibles.collectiblesAndArtButtonCheck();
            ebayCollectibles.liveAuctioneersButtonCheck();
        }

}
