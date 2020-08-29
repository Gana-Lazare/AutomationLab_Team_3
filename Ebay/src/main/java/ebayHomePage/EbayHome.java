package ebayHomePage;
import com.google.gson.internal.bind.util.ISO8601Utils;
import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static ebayHomePage.ebayhomeWebElement.*;

public class EbayHome extends WebAPI {





    @FindBy(xpath = motor_xpath)
    WebElement homeMotor;
    public void MyHomeMotor() throws InterruptedException {
        homeMotor.click();
        Thread.sleep(5000);
    }


    @FindBy(xpath = findParts_xpath)
    WebElement findingParts;
    public void myParts() throws InterruptedException {
        findingParts.click();
        Thread.sleep(5000);
    }


    @FindBy(xpath=ebayMotors_xpath)
    WebElement ebayMotors;
    public void myMotors() throws InterruptedException {
        ebayMotors.click();
        Thread.sleep(5000);
    }

   @FindBy(xpath=findVehicle_xpath)
   WebElement findingVehicles;
    public void myVehicles() throws InterruptedException {
        findingVehicles.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath=otherVehicles_xpath)
    WebElement othersVehicles;
    public void myOthersVehicles() throws InterruptedException {
        othersVehicles.click();
        Thread.sleep(5000);
    }


    @FindBy(xpath=boats_xpath)
    WebElement findingBoats;
    public void myBoats() throws InterruptedException {
      findingBoats.click();
      Thread.sleep(5000);
    }

    @FindBy(xpath=collectorCars_xpath)
    WebElement collectorCars;
    public void myCollectorCars() throws InterruptedException {
        collectorCars.click();
        Thread.sleep(5000);
    }


    @FindBy(xpath=exoticCar_xpath)
    WebElement exoticCarTest;
    public void myExoticCar() throws InterruptedException {
        exoticCarTest.click();
        Thread.sleep(5000);
    }


    @FindBy(xpath=commercialTruck_xpath)
    WebElement commercialTrucks;
    public void myCommercialTrucks() throws InterruptedException {
        commercialTrucks.click();
        Thread.sleep(5000);
    }


    @FindBy(xpath = fashion_xpath)
    WebElement homeFashion;
    public void MyHomeFashion() throws InterruptedException {
        homeFashion.click();
        Thread.sleep(5000);
    }


    @FindBy(xpath=shoes_xpath)
    WebElement shoesShop;
    public void myShoes() throws InterruptedException {
        shoesShop.click();
        Thread.sleep(5000);
    }


    @FindBy(xpath=health_xpath)
    WebElement healthShop;
    public void myHealthShop() throws InterruptedException {
        healthShop.click();
        Thread.sleep(5000);
    }


    @FindBy(xpath=adidas_xpath)
    WebElement adidasShop;
    public void myAdidas() throws InterruptedException {
        adidasShop.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath=chanel_xpath)
    WebElement chanelShop;
    public void myChanel() throws InterruptedException {
        chanelShop.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath=airJordan_xpath)
    WebElement airJordanShop;
    public void myAirJordan() throws InterruptedException {
        airJordanShop.click();
        Thread.sleep(5000);
    }


    @FindBy(xpath=watches_xpath)
    WebElement watchesShop;
    public void myWatches() throws InterruptedException {
        watchesShop.click();
        Thread.sleep(5000);
    }


    @FindBy(xpath=vintage_xpath)
    WebElement vintageShop;
    public void myVintage() throws InterruptedException {
        vintageShop.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath=beauty_xpath)
    WebElement beautyShop;
    public void myBeauty() throws InterruptedException {
        beautyShop.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath=jewelry_xpath)
    WebElement jewelryShop;
    public void myJewelry() throws InterruptedException {
        jewelryShop.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath=coach_xpath)
    WebElement coachShop;
    public void myCoach() throws InterruptedException {
        coachShop.click();
        Thread.sleep(5000);
    }


    @FindBy(xpath=shopByCategory_xpath)
    WebElement shopByCategories;
    public void myShopByCategory() throws InterruptedException {
        jewelryShop.click();
        Thread.sleep(5000);
    }


    @FindBy(xpath=calvinKlein_xpath)
    WebElement calvinKleinShop;
    public void myCalvinKlein() throws InterruptedException {
        calvinKleinShop.click();
        Thread.sleep(5000);
    }


    @FindBy(xpath=topBrands_xpath)
    WebElement topBrandsShop;
    public void myTopBrands() throws InterruptedException {
        topBrandsShop.click();
        Thread.sleep(5000);
    }


    @FindBy(xpath=freePeople_xpath)
    WebElement freePeoples;
    public void freePeopleTest() throws InterruptedException {
        freePeoples.click();
        Thread.sleep(5000);
    }


    @FindBy(xpath=motorcycles_xpath)
    WebElement motorcycles;
    public void myMotorcycles() throws InterruptedException {
        motorcycles.click();
        Thread.sleep(5000);
    }


    @FindBy(xpath=sell_xpath)
    WebElement sell;
    public void mySell() throws InterruptedException {
        sell.click();
        Thread.sleep(5000);
    }


    @FindBy(xpath=watclist_xpath)
    WebElement watclistShop;
    public void myWatclist() throws InterruptedException {
        watclistShop.click();
        Thread.sleep(5000);
    }


    @FindBy(xpath=search_xpath)
    WebElement searchShop;
    public void mySearch() throws InterruptedException {
        searchShop.click();
        Thread.sleep(5000);
    }


    @FindBy(xpath=myEbay_xpath)
    WebElement myEbay;
    public void myEbayTest() throws InterruptedException {
        myEbay.click();
        Thread.sleep(5000);
    }



}


