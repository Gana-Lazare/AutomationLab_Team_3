package ebayCollectiblesArt;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static ebayCollectiblesArt.EbayCollectiblesWebElement.*;

public class EbayCollectibles extends WebAPI {

        @FindBy(how = How.XPATH,using = webElementCollectiblesAndArtButton_Xpath)public WebElement collectiblesAndArtButton;
        @FindBy(how = How.CSS, using = webElementText) public WebElement text;

        @FindBy(how = How.XPATH,using = webElementDollsTeddyBearsButton_Xpath)public WebElement dollsTeddyBearsButton;
        @FindBy(how = How.CSS, using = webElementText1) public WebElement text1;

        @FindBy(how = How.XPATH,using = webElementArtCraftSuppliesButton_Xpath)public WebElement artCraftSuppliesButton;
        @FindBy(how = How.CSS, using = webElementText2) public WebElement text2;

        @FindBy(how = How.XPATH,using = webElementAntiquesButton_Xpath)public WebElement antiquesButton;
        @FindBy(how = How.CSS, using = webElementText3) public WebElement text3;

        @FindBy(how = How.XPATH,using = webElementStampsButton_Xpath)public WebElement stampsButton;
        @FindBy(how = How.CSS, using = webElementText4) public WebElement text4;

        @FindBy(how = How.XPATH,using = webElementEntertainmentMemorabiliaButton_Xpath)public WebElement entertainmentMemorabiliaButton;
        @FindBy(how = How.CSS, using = webElementText5) public WebElement text5;

        @FindBy(how = How.XPATH,using = webElementCollectiblesButton_Xpath)public WebElement collectiblesButton;
        @FindBy(how = How.CSS, using = webElementText6) public WebElement text6;

        @FindBy(how = How.XPATH,using = webElementArtButton_Xpath)public WebElement artButton;
        @FindBy(how = How.CSS, using = webElementText7) public WebElement text7;

        @FindBy(how = How.XPATH,using = webElementEBayCollectiveButton_Xpath)public WebElement eBayCollectiveButton;
        @FindBy(how = How.CSS, using = webElementText8) public WebElement text8;

        @FindBy(how = How.XPATH,using = webElementCollectibleDealsButton_Xpath)public WebElement collectibleDealsButton;
        @FindBy(how = How.CSS, using = webElementText9) public WebElement text9;

        @FindBy(how = How.XPATH,using = webElementVintageAntiqueFineJewelryButton_Xpath)public WebElement vintageAntiqueFineJewelryButton;
        @FindBy(how = How.CSS, using = webElementText10) public WebElement text10;

        @FindBy(how = How.XPATH,using = webElementLiveAuctioneersButton_Xpath)public WebElement liveAuctioneersButton;
        @FindBy(how = How.CSS, using = webElementText11) public WebElement text11;


        //Action
        public void collectiblesAndArtButtonCheck(){
            collectiblesAndArtButton.click();
        }
        public void dollsTeddyBearsButtonCheck(){
            dollsTeddyBearsButton.click();
        }
        public void artCraftSuppliesButtonCheck(){
            artCraftSuppliesButton.click();
        }
        public void antiquesButtonCheck(){
            antiquesButton.click();
        }
        public void stampsButtonCheck(){
            stampsButton.click();
        }
        public void entertainmentMemorabiliaButtonCheck(){
            entertainmentMemorabiliaButton.click();
        }
        public void collectiblesButtonCheck(){
            collectiblesButton.click();
        }
        public void artButtonCheck(){
            artButton.click();
        }
        public void eBayCollectiveButtonCheck(){
            eBayCollectiveButton.click();
        }
        public void collectibleDealsButtonCheck(){
            collectibleDealsButton.click();
        }
        public void vintageAntiqueFineJewelryButtonCheck(){
            vintageAntiqueFineJewelryButton.click();
        }
        public void liveAuctioneersButtonCheck(){
            liveAuctioneersButton.click();
        }

        // Validate Method
        public void validateSearchText(){

            String actualResult= text.getText();
            String actualResult1= text1.getText();
            String actualResult2= text2.getText();
            String actualResult3= text3.getText();
            String actualResult4= text4.getText();
            String actualResult5= text5.getText();
            String actualResult6= text6.getText();
            String actualResult7= text7.getText();
            String actualResult8= text8.getText();
            String actualResult9= text9.getText();
            String actualResult10= text10.getText();
            String actualResult11= text11.getText();
            String expectedResult="Collectibles & Art";
            String expectedResult1="Collectibles & Art";
            String expectedResult2="Collectibles & Art";
            String expectedResult3="Collectibles & Art";
            String expectedResult4="Collectibles & Art";
            String expectedResult5="Collectibles & Art";
            String expectedResult6="Collectibles & Art";
            String expectedResult7="Collectibles & Art";
            String expectedResult8="Collectibles & Art";
            String expectedResult9="Collectibles & Art";
            String expectedResult10="Collectibles & Art";
            String expectedResult11="Collectibles & Art";

            Assert.assertEquals(actualResult,expectedResult,"Text not match");
            Assert.assertEquals(actualResult1,expectedResult1,"Text not match");
            Assert.assertEquals(actualResult2,expectedResult2,"Text not match");
            Assert.assertEquals(actualResult3,expectedResult3,"Text not match");
            Assert.assertEquals(actualResult4,expectedResult4,"Text not match");
            Assert.assertEquals(actualResult5,expectedResult5,"Text not match");
            Assert.assertEquals(actualResult6,expectedResult6,"Text not match");
            Assert.assertEquals(actualResult7,expectedResult7,"Text not match");
            Assert.assertEquals(actualResult8,expectedResult8,"Text not match");
            Assert.assertEquals(actualResult9,expectedResult9,"Text not match");
            Assert.assertEquals(actualResult10,expectedResult10,"Text not match");
            Assert.assertEquals(actualResult11,expectedResult11,"Text not match");

        }
}
