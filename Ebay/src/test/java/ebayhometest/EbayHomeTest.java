package ebayhometest;

import common.WebAPI;
import ebayHomePage.EbayHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class EbayHomeTest extends WebAPI {

    @Test(priority = 1)
    public void HomeMotorTest () throws InterruptedException {
        EbayHome homeObj = PageFactory.initElements(driver, EbayHome.class);
        homeObj.MyHomeMotor();
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    public void findPartsTest() throws InterruptedException {
        HomeMotorTest();
        EbayHome homeObj1 = PageFactory.initElements(driver, EbayHome.class);
        homeObj1.myParts();
        Thread.sleep(5000);


    }


    @Test()
    public void ebayMotors() throws InterruptedException {
        HomeMotorTest();
        EbayHome homeObj2 = PageFactory.initElements(driver, EbayHome.class);
        homeObj2.myMotors();
        Thread.sleep(5000);
    }

    @Test
    public void findVehicle()throws InterruptedException {
        HomeMotorTest();
        EbayHome homeObj3 = PageFactory.initElements(driver, EbayHome.class);
        homeObj3.myVehicles();
        Thread.sleep(5000);


    }
    @Test
    public void otherVehicles()throws InterruptedException{
        HomeMotorTest();
        EbayHome homeObj4 = PageFactory.initElements(driver, EbayHome.class);
        homeObj4.myOthersVehicles();
        Thread.sleep(5000);

    }

     @Test
     public void boats()throws InterruptedException{
         HomeMotorTest();
         EbayHome homeObj5= PageFactory.initElements(driver, EbayHome.class);
         homeObj5.myBoats();
         Thread.sleep(5000);

     }


    @Test
    public void collectorCars() throws InterruptedException {
        HomeMotorTest();
        EbayHome homeObj6= PageFactory.initElements(driver, EbayHome.class);
        homeObj6.myCollectorCars();
        Thread.sleep(5000);
    }


    @Test
    public void exoticCar() throws InterruptedException {
        HomeMotorTest();
        EbayHome homeObj7= PageFactory.initElements(driver, EbayHome.class);
        homeObj7.myExoticCar();
        Thread.sleep(5000);
    }


    @Test
    public void commercialTruck() throws InterruptedException {
        HomeMotorTest();
        EbayHome homeObj8= PageFactory.initElements(driver, EbayHome.class);
        homeObj8.myCommercialTrucks();
        Thread.sleep(5000);
    }

    @Test(priority = 1)
    public void HomeFashionTest () throws InterruptedException {
        EbayHome homeObj = PageFactory.initElements(driver, EbayHome.class);
        homeObj.MyHomeFashion();
        Thread.sleep(5000);
    }

    @Test
    public void shoes () throws InterruptedException {
        HomeFashionTest();
        EbayHome homeObjx= PageFactory.initElements(driver, EbayHome.class);
        homeObjx.myShoes();
        Thread.sleep(5000);
    }

    @Test
    public void health () throws InterruptedException {
        HomeFashionTest();
        EbayHome homeObjB= PageFactory.initElements(driver, EbayHome.class);
        homeObjB.myHealthShop();
        Thread.sleep(5000);

    }


    @Test
    public void adidas () throws InterruptedException {
        HomeFashionTest();
        EbayHome homeObja= PageFactory.initElements(driver, EbayHome.class);
        homeObja.myAdidas();
        Thread.sleep(5000);

    }


    @Test
    public void chanel () throws InterruptedException {
        HomeFashionTest();
        EbayHome homeObjs= PageFactory.initElements(driver, EbayHome.class);
        homeObjs.myChanel();
        Thread.sleep(5000);

    }

    @Test
    public void airJordan () throws InterruptedException {
        HomeFashionTest();
        EbayHome homeObjT= PageFactory.initElements(driver, EbayHome.class);
        homeObjT.myAirJordan();
        Thread.sleep(5000);

    }


    @Test
    public void watches () throws InterruptedException {
        HomeFashionTest();
        EbayHome homeObjN= PageFactory.initElements(driver, EbayHome.class);
        homeObjN.myWatches();
        Thread.sleep(5000);

    }



    @Test
    public void vintage () throws InterruptedException {
        HomeFashionTest();
        EbayHome homeObjk= PageFactory.initElements(driver, EbayHome.class);
        homeObjk.myVintage();
        Thread.sleep(5000);

    }


    @Test
    public void calvinKlein() throws InterruptedException {
        HomeFashionTest();
        EbayHome homeObjP= PageFactory.initElements(driver, EbayHome.class);
        homeObjP.myCoach();
        Thread.sleep(5000);

    }


    @Test
    public void topBrands() throws InterruptedException {
        HomeFashionTest();
        EbayHome homeObjL= PageFactory.initElements(driver, EbayHome.class);
        homeObjL.myCoach();
        Thread.sleep(5000);

    }

    @Test
    public void freePeople() throws InterruptedException {
        HomeFashionTest();
        EbayHome homeObjo= PageFactory.initElements(driver, EbayHome.class);
        homeObjo.myCoach();
        Thread.sleep(5000);

    }

    @Test()
    public void motorcycles() throws InterruptedException {
        HomeMotorTest();
        EbayHome homeObjL = PageFactory.initElements(driver, EbayHome.class);
        homeObjL.myMotorcycles();
        Thread.sleep(5000);
    }

    @Test
    public void sell () throws InterruptedException {
        HomeFashionTest();
        EbayHome homeObjn= PageFactory.initElements(driver, EbayHome.class);
        homeObjn.mySell();
        Thread.sleep(5000);

    }


    @Test
    public void watclist() throws InterruptedException {
        HomeFashionTest();
        EbayHome homeObj0= PageFactory.initElements(driver, EbayHome.class);
        homeObj0.myWatclist();
        Thread.sleep(5000);

    }


    @Test
    public void search() throws InterruptedException {
        HomeFashionTest();
        EbayHome homeObj1= PageFactory.initElements(driver, EbayHome.class);
        homeObj1.mySearch();
        Thread.sleep(5000);

    }

//    @Test
//    public void myEbay() throws InterruptedException {
//        HomeFashionTest();
//        EbayHome homeObjc= PageFactory.initElements(driver, EbayHome.class);
//        homeObjc.myEbay();
//        Thread.sleep(5000);
//
//    }














}




