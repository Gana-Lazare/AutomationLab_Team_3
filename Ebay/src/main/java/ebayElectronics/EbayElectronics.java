package ebayElectronics;
import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static ebayElectronics.EbayElectronicsWebElement.*;

public class EbayElectronics extends WebAPI{
    @FindBy(how = How.XPATH,using = webElementElectronicsButton_Xpath)public WebElement electronicsButton;
    @FindBy(how = How.CSS, using = webElementText) public WebElement text;

    @FindBy(how = How.XPATH,using = webElementCamerasAndPhotosButton_Xpath)public WebElement cameraAndPhotosButton;
    @FindBy(how = How.CSS, using = webElementText1) public WebElement text1;

    @FindBy(how = How.XPATH,using = webElementCellPhonesSmartWatchesAndAccessoriesButton_Xpath)public WebElement cellPhonesSmartWatchesAndAccessoriesButton;
    @FindBy(how = How.CSS, using = webElementText2) public WebElement text2;

    @FindBy(how = How.XPATH,using = webElementComputersTabletsNetworkHardwareButton_Xpath) public WebElement computersTabletsNetworkHardwareButton;
    @FindBy(how = How.CSS,using = webElementText3) public WebElement text3;

    @FindBy(how = How.XPATH,using = webElementTVVideoHomeAudioElectronicsButton_Xpath) public WebElement tvVideoHomeAudioElectronicsButton;
    @FindBy(how = How.CSS,using = webElementText4)public WebElement text4;

    @FindBy(how = How.XPATH,using = webElementPortableAudioHeadphonesButton_Xpath) public WebElement portableAudioHeadphonesButton;
    @FindBy(how = How.CSS,using = webElementText5)public WebElement text5;

    @FindBy(how = How.XPATH,using = webElementCarElectronicsButton_Xpath) public WebElement CarElectronicsButton;
    @FindBy(how = How.CSS,using = webElementText6)public WebElement text6;

    @FindBy(how = How.XPATH,using = webElementHomeSurveillanceButton_Xpath) public WebElement HomeSurveillanceButton;
    @FindBy(how = How.CSS,using = webElementText7)public WebElement text7;

    @FindBy(how = How.XPATH,using = webElementSmartHomeButton_Xpath) public WebElement SmartHomeButton;
    @FindBy(how = How.CSS,using = webElementText8)public WebElement text8;

    @FindBy(how = How.XPATH,using = webElementVideoPCGamingButton_Xpath) public WebElement VideoPCGamingButton;
    @FindBy(how = How.CSS,using = webElementText9)public WebElement text9;

    @FindBy(how = How.XPATH,using = webElementVirtualRealityButton_Xpath) public WebElement VirtualRealityButton;
    @FindBy(how = How.CSS,using = webElementText10)public WebElement text10;

    @FindBy(how = How.XPATH,using = webElementAppleButton_Xpath) public WebElement AppleButton;
    @FindBy(how = How.CSS,using = webElementText11)public WebElement text11;

    @FindBy(how = How.XPATH,using = webElementSamsungButton_Xpath) public WebElement SamsungButton;
    @FindBy(how = How.CSS,using = webElementText12)public WebElement text12;


    //Action
    public void electronicsButtonCheck() {
        electronicsButton.click();

    }
    public void cameraAndPhotosButtonCheck()  {
        cameraAndPhotosButton.click();

    }
    public void cellPhonesSmartWatchesAndAccessoriesButtonCheck()  {
        cellPhonesSmartWatchesAndAccessoriesButton.click();

    }
    public void computersTabletsNetworkHardwareButtonCheck(){
        computersTabletsNetworkHardwareButton.click();
    }
    public void tvVideoHomeAudioElectronicsButtonCheck(){
        tvVideoHomeAudioElectronicsButton.click();
    }
    public void portableAudioHeadphonesButtonCheck(){
        portableAudioHeadphonesButton.click();
    }
    public void carElectronicsButtonCheck(){
        CarElectronicsButton.click();
    }
    public void homeSurveillanceButtonCheck(){
        HomeSurveillanceButton.click();
    }
    public void smartHomeButtonCheck(){
        SmartHomeButton.click();
    }
    public void videoPCGamingButtonCheck(){
        VideoPCGamingButton.click();
    }
    public void virtualRealityButtonCheck(){
        VirtualRealityButton.click();
    }
    public void appleButtonCheck(){
        AppleButton.click();
    }
    public void samsungButtonCheck(){
        SamsungButton.click();
    }

    // Validate Method
    public void validateSearchText(){
        String actualResult=text.getText();
        String actualResult1=text1.getText();
        String actualResult2=text2.getText();
        String actualResult3=text3.getText();
        String actualResult4=text4.getText();
        String actualResult5=text5.getText();
        String actualResult6=text6.getText();
        String actualResult7=text7.getText();
        String actualResult8=text8.getText();
        String actualResult9=text9.getText();
        String actualResult10=text10.getText();
        String actualResult11=text11.getText();
        String actualResult12=text12.getText();

        String expectedResult="Electronics";
        String expectedResult1="Camera Drones";
        String expectedResult2="See all Cell Phones, Smart Watches, & Accessories";
        String expectedResult3="See all Computers, Tablets & Network Hardware";
        String expectedResult4="See all TV, Video & Home Audio Electronics";
        String expectedResult5="Portable Audio & Headphones";
        String expectedResult6="Vehicle Electronics & GPS";
        String expectedResult7="Home Surveillance Systems";
        String expectedResult8="Smart Home";
        String expectedResult9="See all Video & PC Gaming";
        String expectedResult10="Shop by Category";
        String expectedResult11="Apple";
        String expectedResult12="Samsung";

        Assert.assertEquals(actualResult,expectedResult,"Text not Match");
        Assert.assertEquals(actualResult1,expectedResult1,"Text not Match");
        Assert.assertEquals(actualResult2,expectedResult2,"Text not Match");
        Assert.assertEquals(actualResult3,expectedResult3,"Text not Match");
        Assert.assertEquals(actualResult4,expectedResult4,"Text not Match");
        Assert.assertEquals(actualResult5,expectedResult5,"Text not Match");
        Assert.assertEquals(actualResult6,expectedResult6,"Text not Match");
        Assert.assertEquals(actualResult7,expectedResult7,"Text not Match");
        Assert.assertEquals(actualResult8,expectedResult8,"Text not Match");
        Assert.assertEquals(actualResult9,expectedResult9,"Text not Match");
        Assert.assertEquals(actualResult10,expectedResult10,"Text not Match");
        Assert.assertEquals(actualResult11,expectedResult11,"Text not Match");
        Assert.assertEquals(actualResult12,expectedResult12,"Text not Match");

    }

}