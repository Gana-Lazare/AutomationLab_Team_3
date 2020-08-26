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

    // Validate Method
    public void validateSearchText(){
        String actualResult=text.getText();
        String actualResult1=text1.getText();
        String actualResult2=text2.getText();
        String actualResult3=text3.getText();
        String expectedResult="Electronics";
        String expectedResult1="Camera Drones";
        String expectedResult2="See all Cell Phones, Smart Watches, & Accessories";
        String expectedResult3="See all Computers, Tablets & Network Hardware";
        Assert.assertEquals(actualResult,expectedResult,"Text not Match");
        Assert.assertEquals(actualResult1,expectedResult1,"Text not Match");
        Assert.assertEquals(actualResult2,expectedResult2,"Text not Match");
        Assert.assertEquals(actualResult3,expectedResult3,"Text not Match");
    }

}