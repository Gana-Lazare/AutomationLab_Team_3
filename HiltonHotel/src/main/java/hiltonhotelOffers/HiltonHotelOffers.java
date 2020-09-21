package hiltonhotelOffers;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static hiltonhotelOffers.HiltonHotelWebElement.*;

public class HiltonHotelOffers extends WebAPI {

   @FindBy(how = How.CSS, using = webElementText) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText1) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText2) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText3) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText4) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText5) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText6) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText7) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText8) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText9) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText10) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText11) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText12) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText13) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText14) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText15) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText16) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText17) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText18) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText19) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText20) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText21) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText22) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText23) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText24) public WebElement text;
//
//    @FindBy(how = How.XPATH,using = webElementOfferButton_Xpath)public WebElement OfferButton;
//    @FindBy(how = How.CSS, using = webElementText25) public WebElement text;
//
//
//
//
//
//
//
    public void OfferButtonCheck(){
        clickOnElement(webElementOfferButton_Xpath);
        //OfferButton.click();
    }


    public void validateSearchText() {

        String actualResult = text.getText();
        String expectedResult = "OFFERS";
        Assert.assertEquals(actualResult, expectedResult, "Text not match");
    }
}
