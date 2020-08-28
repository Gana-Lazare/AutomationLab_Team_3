package chaseCreditCard;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static chaseCreditCard.ChaseCreditCardWebElement.*;

public class ChaseCreditCard extends WebAPI {

    @FindBy(how = How.XPATH,using = webElementCreditCardButton_Xpath)public WebElement creditCardButton;
    @FindBy(how = How.XPATH, using = webElementText) public WebElement text;
    @FindBy(how = How.CSS,using = webElementFeaturedCreditCardsButton_Xpath)public WebElement featuredCreditCardsButton;
    @FindBy(how = How.CSS, using = webElementText1) public WebElement text1;
    @FindBy(how = How.CSS,using = webElementAllCreditCardsButton_Xpath)public WebElement allCreditCardsButton;
    @FindBy(how = How.CSS, using = webElementText2) public WebElement text2;
    @FindBy(how = How.XPATH,using = webElementCashBackCreditCardsButton_Xpath)public WebElement cashBackCreditCardsButton;
    @FindBy(how = How.XPATH, using = webElementText3) public WebElement text3;
    @FindBy(how = How.XPATH,using = webElementTravelCreditCardsButton_Xpath)public WebElement travelCreditCardsButton;
    @FindBy(how = How.XPATH, using = webElementText4) public WebElement text4;
    @FindBy(how = How.XPATH,using = webElementBusinessCreditCardsButton_Xpath)public WebElement businessCreditCardsButton;
    @FindBy(how = How.XPATH, using = webElementText5) public WebElement text5;
    @FindBy(how = How.XPATH,using = webElementRewardsCreditCardsButton_Xpath)public WebElement rewardsCreditCardsButton;
    @FindBy(how = How.XPATH, using = webElementText6) public WebElement text6;
    @FindBy(how = How.XPATH,using = webElementAirLineCreditCardsButton_Xpath)public WebElement airLineCreditCardsButton;
    @FindBy(how = How.XPATH, using = webElementText7) public WebElement text7;
    @FindBy(how = How.XPATH,using = webElementHotelCreditCardsButton_Xpath)public WebElement hotelCreditCardsButton;
    @FindBy(how = How.XPATH, using = webElementText8) public WebElement text8;
    @FindBy(how = How.XPATH,using = webElementNoAnnualFeeCreditCardsButton_Xpath)public WebElement noAnnualFeeCreditCardsButton;
    @FindBy(how = How.XPATH, using = webElementText9) public WebElement text9;
    @FindBy(how = How.XPATH,using = webElementCreditJourneyButton_Xpath)public WebElement creditJourneyButton;
    @FindBy(how = How.XPATH, using = webElementText10) public WebElement text10;
    @FindBy(how = How.XPATH,using = webElementOnlineBankingButton_Xpath)public WebElement onlineBankingButton;
    @FindBy(how = How.XPATH, using = webElementText11) public WebElement text11;
    @FindBy(how = How.XPATH,using = webElementCheckingAccountsButton_Xpath)public WebElement checkingAccountsButton;
    @FindBy(how = How.XPATH, using = webElementText12) public WebElement text12;
    @FindBy(how = How.XPATH,using = webElementSavingAccountsButton_Xpath)public WebElement savingAccountsButton;
    @FindBy(how = How.XPATH, using = webElementText13) public WebElement text13;
    @FindBy(how = How.XPATH,using = webElementCertificatesOfDepositsButton_Xpath)public WebElement certificatesOfDepositsButton;
    @FindBy(how = How.XPATH, using = webElementText14) public WebElement text14;
    @FindBy(how = How.XPATH,using = webElementMortgagesButton_Xpath)public WebElement mortgagesButton;
    @FindBy(how = How.XPATH, using = webElementText15) public WebElement text15;
    @FindBy(how = How.XPATH,using = webElementAutoLoansButton_Xpath)public WebElement autoLoansButton;
    @FindBy(how = How.XPATH, using = webElementText16) public WebElement text16;
    @FindBy(how = How.XPATH,using = webElementPlanningAndInvestmentsButton_Xpath)public WebElement planningAndInvestmentsButton;
    @FindBy(how = How.XPATH, using = webElementText17) public WebElement text17;
    @FindBy(how = How.XPATH,using = webElementMobileBankingButton_Xpath)public WebElement mobileBankingButton;
    @FindBy(how = How.XPATH, using = webElementText18) public WebElement text18;
    @FindBy(how = How.XPATH,using = webElementCardMemberAgreementsButton_Xpath)public WebElement cardMemberAgreementsButton;
    @FindBy(how = How.XPATH, using = webElementText19) public WebElement text19;
    @FindBy(how = How.XPATH,using = webElementCreditCardNewsButton_Xpath)public WebElement creditCardNewsButton;
    @FindBy(how = How.XPATH, using = webElementText20) public WebElement text20;
    @FindBy(how = How.XPATH,using = webElementCreditCardGlossaryButton_Xpath)public WebElement creditCardGlossaryButton;
    @FindBy(how = How.XPATH, using = webElementText21) public WebElement text21;
    @FindBy(how = How.XPATH,using = webElementUltimateRewardsButton_Xpath)public WebElement ultimateRewardsButton;
    @FindBy(how = How.XPATH, using = webElementText22) public WebElement text22;
    @FindBy(how = How.XPATH,using = webElementCreditCardEducationButton_Xpath)public WebElement creditCardEducationButton;
    @FindBy(how = How.XPATH, using = webElementText23) public WebElement text23;
    @FindBy(how = How.XPATH,using = webElementScheduleAmeetingButton_Xpath)public WebElement scheduleAmeetingButton;
    @FindBy(how = How.XPATH, using = webElementText24) public WebElement text24;

    // Action
    public void creditCardButtonCheck() throws InterruptedException {
        creditCardButton.click();
    }
    public void featuredCreditCardsButtonCheck(){
        featuredCreditCardsButton.click();
    }
    public void allCreditCardsButtonCheck(){
        allCreditCardsButton.click();
    }
    public void cashBackCreditCardsButtonCheck(){
        cashBackCreditCardsButton.click();
    }
    public void travelCreditCardsButtonCheck(){
        travelCreditCardsButton.click();
    }
    public void businessCreditCardsButtonCheck(){
        businessCreditCardsButton.click();
    }
    public void rewardsCreditCardsButtonCheck(){
        rewardsCreditCardsButton.click();
    }
    public void airLineCreditCardsButtonCheck(){
        airLineCreditCardsButton.click();
    }
    public void hotelCreditCardsButtonCheck(){
        hotelCreditCardsButton.click();
    }
    public void noAnnualFeeCreditCardsButtonCheck(){
        noAnnualFeeCreditCardsButton.click();
    }
    public void creditJourneyButtonCheck(){
        creditJourneyButton.click();
    }
    public void onlineBankingButtonCheck(){
        onlineBankingButton.click();
    }
    public void checkingAccountsButtonCheck(){
        checkingAccountsButton.click();
    }
    public void savingAccountsButtonCheck(){
        savingAccountsButton.click();
    }
    public void certificatesOfDepositsButtonCheck(){
        certificatesOfDepositsButton.click();
    }
    public void mortgagesButtonCheck(){
        mortgagesButton.click();
    }
    public void autoLoansButtonCheck(){
        autoLoansButton.click();
    }
    public void planningAndInvestmentsButtonCheck(){
        planningAndInvestmentsButton.click();
    }
    public void mobileBankingButtonCheck(){
        mobileBankingButton.click();
    }
    public void cardMemberAgreementsButtonCheck(){
        cardMemberAgreementsButton.click();
    }
    public void creditCardNewsButtonCheck(){
        creditCardNewsButton.click();
    }
    public void creditCardGlossaryButtonCheck(){
        creditCardGlossaryButton.click();
    }
    public void ultimateRewardsButtonCheck(){
        ultimateRewardsButton.click();
    }
    public void creditCardEducationButtonCheck(){
        creditCardEducationButton.click();
    }
    public void scheduleAmeetingButtonCheck(){
        scheduleAmeetingButton.click();
    }

    // Validate Method
    public void validateSearchText() {

        String actualResult = text.getText();
        String actualResult1 = text1.getText();
        String actualResult2 = text2.getText();
        String actualResult3 = text3.getText();
        String actualResult4 = text4.getText();
        String actualResult5 = text5.getText();
        String actualResult6 = text6.getText();
        String actualResult7 = text7.getText();
        String actualResult8 = text8.getText();
        String actualResult9 = text9.getText();
        String actualResult10 = text10.getText();
        String actualResult11 = text11.getText();
        String actualResult12 = text12.getText();
        String actualResult13 = text13.getText();
        String actualResult14 = text14.getText();
        String actualResult15 = text15.getText();
        String actualResult16 = text16.getText();
        String actualResult17 = text17.getText();
        String actualResult18 = text18.getText();
        String actualResult19 = text19.getText();
        String actualResult20 = text20.getText();
        String actualResult21 = text21.getText();
        String actualResult22 = text22.getText();
        String actualResult23 = text23.getText();
        String actualResult24 = text24.getText();

        String expectedResult = "Our Most Popular\n" + "Rewards Cards";
        String expectedResult1 = "All Cards";
        String expectedResult2 = "All Credit Cards";
        String expectedResult3 = "Cash Back Credit Cards";
        String expectedResult4 = "Travel Credit Cards";
        String expectedResult5 = "Business Credit Cards";
        String expectedResult6 = "Rewards Credit Cards";
        String expectedResult7 = "Airline Credit Cards";
        String expectedResult8 = "Hotel Credit Cards";
        String expectedResult9 = "No Annual Fee Credit Cards";
        String expectedResult10 = "Chase Credit Journey";
        String expectedResult11 = "Chase OnlineSM Banking";
        String expectedResult12 = "Compare accounts and select the one that fits your needs";
        String expectedResult13 = "Welcome to Chase Savings Accounts";
        String expectedResult14 = "What is your ZIP code?";
        String expectedResult15 = "Your home journey starts here";
        String expectedResult16 = "It's your road, choose where to go.";
        String expectedResult17 = "Invest your way with J.P. Morgan";
        String expectedResult18 = "It's easy to get the app";
        String expectedResult19 = "Sample Cardmember Agreements";
        String expectedResult20 = "Media Contacts";
        String expectedResult21 = "Credit card glossary A-Z";
        String expectedResult22 = "Explore the possibilities";
        String expectedResult23 = "Education on Credit Cards";
        String expectedResult24 = "Are you a Chase customer?";

        Assert.assertEquals(actualResult, expectedResult, "Text not match");
        Assert.assertEquals(actualResult1, expectedResult1, "Text not match");
        Assert.assertEquals(actualResult2, expectedResult2, "Text not match");
        Assert.assertEquals(actualResult3, expectedResult3, "Text not match");
        Assert.assertEquals(actualResult4, expectedResult4, "Text not match");
        Assert.assertEquals(actualResult5, expectedResult5, "Text not match");
        Assert.assertEquals(actualResult6, expectedResult6, "Text not match");
        Assert.assertEquals(actualResult7, expectedResult7, "Text not match");
        Assert.assertEquals(actualResult8, expectedResult8, "Text not match");
        Assert.assertEquals(actualResult9, expectedResult9, "Text not match");
        Assert.assertEquals(actualResult10, expectedResult10, "Text not match");
        Assert.assertEquals(actualResult11, expectedResult11, "Text not match");
        Assert.assertEquals(actualResult12, expectedResult12, "Text not match");
        Assert.assertEquals(actualResult13, expectedResult13, "Text not match");
        Assert.assertEquals(actualResult14, expectedResult14, "Text not match");
        Assert.assertEquals(actualResult15, expectedResult15, "Text not match");
        Assert.assertEquals(actualResult16, expectedResult16, "Text not match");
        Assert.assertEquals(actualResult17, expectedResult17, "Text not match");
        Assert.assertEquals(actualResult18, expectedResult18, "Text not match");
        Assert.assertEquals(actualResult19, expectedResult19, "Text not match");
        Assert.assertEquals(actualResult20, expectedResult20, "Text not match");
        Assert.assertEquals(actualResult21, expectedResult21, "Text not match");
        Assert.assertEquals(actualResult22, expectedResult22, "Text not match");
        Assert.assertEquals(actualResult23, expectedResult23, "Text not match");
        Assert.assertEquals(actualResult24, expectedResult24, "Text not match");
    }
}
