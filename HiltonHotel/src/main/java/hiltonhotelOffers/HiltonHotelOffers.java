package hiltonhotelOffers;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HiltonHotelOffers extends WebAPI {


    @FindBy(how = How.XPATH, using = "//*[@id=\"main-nav\"]/ul/li[3]/a")
    public static WebElement offersButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"find_a_offer\"]/div/div/div[1]/h2")
    public static WebElement FindAndOfferText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"compareOffersForm\"]/div/div[1]/div[2]/a/h3")
    public static WebElement ourBestDealToDreamButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"Masthead-0\"]/div[2]/div/h2")
    public static WebElement ourBestDealToDreamText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"compareOffersForm\"]/div/div[2]/div[2]/a/h3")
    public static WebElement sweetenYourStayButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mastheadCopy\"]/h1")
    public static WebElement sweetenYourStayText;

    @FindBy(how = How.XPATH, using = "")
    public static WebElement BreakfastAndWifiButton;
    @FindBy(how = How.XPATH, using = "")
    public static WebElement BreakfastAndWifiText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"compareOffersForm\"]/div/div[4]/div[2]/a/h3")
    public static WebElement BreakfastIncludedButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"1323265895483\"]/div/div/div/div[2]/div[3]/div/span[1]")
    public static WebElement BreakfastIncludedText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"compareOffersForm\"]/div/div[5]/div[2]/a/h3")
    public static WebElement FamilyFunPackageButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"1323265895483\"]/div/div/div/div[2]/div[3]/div/span[1]")
    public static WebElement FamilyFunPackageText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"compareOffersForm\"]/div/div[6]/div[2]/a/h3")
    public static WebElement HiltonGiftCardButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"1323265895483\"]/div/div/div/div[2]/div[3]/div/span[1]")
    public static WebElement HiltonGiftCardText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"compareOffersForm\"]/div/div[7]/div[2]/a/h3")
    public static WebElement DoubleRewardsPromotionButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"_content_hilton-promo_en_US_hh2-aug-2020_landing_jcr__content_mainpar_columnrow2_column1523449745544\"]/div/div/div/div/div/div/div/h3")
    public static WebElement MemberLoginText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"compareOffersForm\"]/div/div[8]/div[2]/a/h3")
    public static WebElement HiltonHonorSameXSurPassButton;
    @FindBy(how = How.XPATH, using = "/html/body/section[3]/div/h2")
    public static WebElement FourBoldWaysToAccelerateRewardsText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"compareOffersForm\"]/div/div[9]/div[2]/a/h3")
    public static WebElement HiltonHonorsCardButton;
    @FindBy(how = How.XPATH, using = "/html/body/section[3]/div/div[1]")
    public static WebElement FindaCardThatsRightForYouText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"compareOffersForm\"]/div/div[10]/div[2]/a/h3")
    public static WebElement EarnAndRedeemPointsWithLYFTButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"points-loyalty-wallet-app\"]/div[2]/div/div[2]/h2/span")
    public static WebElement HowItWorksText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"compareOffersForm\"]/div/div[11]/div[2]/a/h3")
    public static WebElement HiltonHonorsBusinessCardButton;
    @FindBy(how = How.XPATH, using = "/html/body/section[3]/div/h2")
    public static WebElement FourBoldWaysToAccelerateRewardText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"compareOffersForm\"]/div/div[12]/div[2]/a/h3")
    public static WebElement HiltonHonorsAspireCardButton;
    @FindBy(how = How.XPATH, using = "/html/body/section[3]/div/div[2]/h4")
    public static WebElement HiltonPurchasesText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"compareOffersForm\"]/div/div[13]/div[2]/a/h3")
    public static WebElement SAVEUPTOFIFTYPERCENTOFFSUNDAYSButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"fsCheckoutInline\"]/label")
    public static WebElement DepartureText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"compareOffersForm\"]/div/div[14]/div[2]/a/h3")
    public static WebElement SUITEINDULGENCEButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"1323265895483\"]/div/div/div/div[2]/div[3]/div/span[1]")
    public static WebElement SUITEINDULGENCEText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"compareOffersForm\"]/div/div[15]/div[2]/a/h3")
    public static WebElement INPARADISEButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"1323265895483\"]/div/div/div/div[2]/div[3]/div/span[1]")
    public static WebElement INPARADISEText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"compareOffersForm\"]/div/div[17]/div/span[2]/a[2]")
    public static WebElement twoForwardButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"1493887490503\"]/div[2]/h1")
    public static WebElement HILTONOFFERSText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"compareOffersForm\"]/div/div[1]/div[2]/a/h3")
    public static WebElement GOLFSTAYANDPLAYPACKAGEButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"Carousel-0-tabpanel-0\"]/div[2]/div/div[1]/div[3]/div/div[1]/h2")
    public static WebElement GetReadyForFutureTravelText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"compareOffersForm\"]/div/div[2]/div[2]/a/h3")
    public static WebElement HONORSDISCOUNTADVANCEPURCHASEButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"find_a_offer\"]/div/div[1]/div/div[1]/h2")
    public static WebElement FINDAPARTICIPATINGHOTELText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"compareOffersForm\"]/div/div[3]/div[2]/a/h3")
    public static WebElement MILITARYFAMILYRATEButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"1323265895483\"]/div/div/div/div[2]/div[3]/div/span[1]")
    public static WebElement MILITARYFAMILYRATEText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"compareOffersForm\"]/div/div[4]/div[2]/a/h3")
    public static WebElement CELEBRATEINSTYLEButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"1323265895483\"]/div/div/div/div[2]/div[3]/div/span[1]")
    public static WebElement CELEBRATEINSTYLEText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"compareOffersForm\"]/div/div[5]/div[2]/a/h3")
    public static WebElement XPOINTSPACKAGEButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"1323265895483\"]/div/div/div/div[2]/div[3]/div/span[1]")
    public static WebElement XPOINTSPACKAGEText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"compareOffersForm\"]/div/div[6]/div[2]/a/h3")
    public static WebElement STAYHILTONGOOUTButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"1323265895483\"]/div/div/div/div[2]/div[3]/div/span[1]")
    public static WebElement STAYHILTONGOOUTText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"compareOffersForm\"]/div/div[7]/div[2]/a/h3")
    public static WebElement WEEKENDGETAWAYButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"1323265895483\"]/div/div/div/div[2]/div[3]/div/span[1]")
    public static WebElement WEEKENDGETAWAYText;







    public void validateOffersTextOffers(){
        String actualResult = FindAndOfferText.getText();
        String expectedResult = "FIND AN OFFER";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");

    }

    public void clickOnOurBestDealToDreamButton(){
        ourBestDealToDreamButton.click();

    }
    public void validateOurBestDealToDreamButton(){
        String actualResult = ourBestDealToDreamText.getText();
        String expectedResult = "Our Best Deal To Dream";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    public void sweetenYourStayButton(){
        sweetenYourStayButton.click();

    }
    public void validateSweetenYourStayButton(){
        String actualResult = sweetenYourStayText.getText();
        String expectedResult = "Sweeten";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }


    public void clickBreakfastAndWifiButton(){
        BreakfastAndWifiButton.click();

    }
    public void validateBreakfastAndWifiButtonButton(){
        String actualResult = BreakfastAndWifiText.getText();
        String expectedResult = "BREAKFAST & WI-FI";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    public void clickBreakfastIncludedButton(){
        BreakfastIncludedButton.click();

    }
    public void validateBreakfastIncludedButton(){
        String actualResult = BreakfastIncludedText.getText();
        String expectedResult = "BREAKFAST INCLUDED";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    public void clickFAMILYFUNPACKAGEButton(){
        FamilyFunPackageButton.click();

    }
    public void validateFAMILYFUNPACKAGEButton(){
        String actualResult = FamilyFunPackageText.getText();
        String expectedResult = "FAMILY FUN PACKAGE";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    public void clickHILTONGIFTCARDButton(){
        HiltonGiftCardButton.click();

    }
    public void validateHILTONGIFTCARDButton(){
        String actualResult = HiltonGiftCardText.getText();
        String expectedResult = "HILTON GIFT CARD";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    public void clickDOUBLEREWARDSPROMOTIONButton(){
        DoubleRewardsPromotionButton.click();

    }
    public void validateDOUBLEREWARDSPROMOTIONButton(){
        String actualResult = MemberLoginText.getText();
        String expectedResult = "MEMBER LOGIN";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    public void clickHILTONHONORSAMEXSURPASSButton(){
        HiltonHonorSameXSurPassButton.click();

    }
    public void validateHILTONHONORSAMEXSURPASSButton(){
        String actualResult = FourBoldWaysToAccelerateRewardsText.getText();
        String expectedResult = "Four bold ways to accelerate rewards.";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    public void clickHILTONHONORSCARDButton(){
        HiltonHonorsCardButton.click();

    }
    public void validateHILTONHONORSCARDButton(){
        String actualResult = FindaCardThatsRightForYouText.getText();
        String expectedResult = "Find a Card that's right for you:";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    public void clickEARNANDREDEEMPOINTSWITHLYFTButton(){
        EarnAndRedeemPointsWithLYFTButton.click();

    }
    public void validateEARNANDREDEEMPOINTSWITHLYFTButton(){
        String actualResult = HowItWorksText.getText();
        String expectedResult = "How it works";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    public void clickHILTONHONORSBUSINESSCARDButton(){
        HiltonHonorsBusinessCardButton.click();

    }
    public void validateHILTONHONORSBUSINESSCARDButton(){
        String actualResult = FourBoldWaysToAccelerateRewardText.getText();
        String expectedResult = "Four bold ways to accelerate rewards.";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    public void clickHILTONHONORSASPIRECARDButton(){
        HiltonHonorsAspireCardButton.click();

    }
    public void validateHILTONHONORSASPIRECARDButton(){
        String actualResult = HiltonPurchasesText.getText();
        String expectedResult = "HILTON PURCHASES";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    public void clickSAVEUPTOFIFTYPERCENTOFFSUNDAYSButton(){
        SAVEUPTOFIFTYPERCENTOFFSUNDAYSButton.click();

    }
    public void validateSAVEUPTOFIFTYPERCENTOFFSUNDAYSButton(){
        String actualResult = DepartureText.getText();
        String expectedResult = "Departure";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    public void clickSUITEINDULGENCEButton(){
        SUITEINDULGENCEButton.click();

    }
    public void validateSUITEINDULGENCEButton(){
        String actualResult = SUITEINDULGENCEText.getText();
        String expectedResult = "SUITE INDULGENCE";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    public void clickINPARADISEButton(){
        INPARADISEButton.click();

    }
    public void validateINPARADISEButton(){
        String actualResult = INPARADISEText.getText();
        String expectedResult = "IN PARADISE";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    public void clicktwoForwardButton(){
        twoForwardButton.click();

    }
    public void validateTwoForwardButton(){
        String actualResult = HILTONOFFERSText.getText();
        String expectedResult = "HILTON OFFERS";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    public void clickGOLFSTAYANDPLAYPACKAGEButton(){
        GOLFSTAYANDPLAYPACKAGEButton.click();

    }
    public void validateGOLFSTAYANDPLAYPACKAGEButton(){
        String actualResult = GetReadyForFutureTravelText.getText();
        String expectedResult = "Get Ready For Future Travel";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    public void clickHONORSDISCOUNTADVANCEPURCHASEButton(){
        HONORSDISCOUNTADVANCEPURCHASEButton.click();

    }
    public void validateHONORSDISCOUNTADVANCEPURCHASEButton(){
        String actualResult = FINDAPARTICIPATINGHOTELText.getText();
        String expectedResult = "FIND A PARTICIPATING HOTEL";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    public void clickMILITARYFAMILYRATEButton(){
        MILITARYFAMILYRATEButton.click();

    }
    public void validateMILITARYFAMILYRATEButton(){
        String actualResult = MILITARYFAMILYRATEText.getText();
        String expectedResult = "MILITARY FAMILY RATE";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    public void clickCELEBRATEINSTYLEButton(){
        CELEBRATEINSTYLEButton.click();

    }
    public void validateCELEBRATEINSTYLEButton(){
        String actualResult = CELEBRATEINSTYLEText.getText();
        String expectedResult = "CELEBRATE IN STYLE";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    public void clickXPOINTSPACKAGEButton(){
        XPOINTSPACKAGEButton.click();

    }
    public void validateXPOINTSPACKAGEButton(){
        String actualResult = XPOINTSPACKAGEText.getText();
        String expectedResult = "2X POINTS PACKAGE";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }
    public void clickSTAYHILTONGOOUTButton(){
        STAYHILTONGOOUTButton.click();

    }
    public void validateSTAYHILTONGOOUTButton(){
        String actualResult = STAYHILTONGOOUTText.getText();
        String expectedResult = "STAY HILTON. GO OUT.";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }
    public void clickWEEKENDGETAWAYButton(){
        WEEKENDGETAWAYButton.click();

    }
    public void validateWEEKENDGETAWAYButton(){
        String actualResult = WEEKENDGETAWAYText.getText();
        String expectedResult = "WEEKEND GETAWAY";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }



}
