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
        creditCardButton.click();
        featuredCreditCardsButton.click();
    }
    public void allCreditCardsButtonCheck(){
        creditCardButton.click();
        allCreditCardsButton.click();
    }
    public void cashBackCreditCardsButtonCheck(){
        creditCardButton.click();
        cashBackCreditCardsButton.click();
    }
    public void travelCreditCardsButtonCheck(){
        creditCardButton.click();
        travelCreditCardsButton.click();
    }
    public void businessCreditCardsButtonCheck(){
        creditCardButton.click();
        businessCreditCardsButton.click();
    }
    public void rewardsCreditCardsButtonCheck(){
        creditCardButton.click();
        rewardsCreditCardsButton.click();
    }
    public void airLineCreditCardsButtonCheck(){
        creditCardButton.click();
        airLineCreditCardsButton.click(); }
    public void hotelCreditCardsButtonCheck(){
        creditCardButton.click();
        hotelCreditCardsButton.click();
    }
    public void noAnnualFeeCreditCardsButtonCheck(){
        creditCardButton.click();
        noAnnualFeeCreditCardsButton.click();
    }
    public void creditJourneyButtonCheck(){
        creditCardButton.click();
        creditJourneyButton.click();
    }
    public void onlineBankingButtonCheck(){
        creditCardButton.click();
        onlineBankingButton.click();
    }
    public void checkingAccountsButtonCheck(){
        creditCardButton.click();
        checkingAccountsButton.click();
    }
    public void savingAccountsButtonCheck(){
        creditCardButton.click();
        savingAccountsButton.click();
    }
    public void certificatesOfDepositsButtonCheck(){
        creditCardButton.click();
        certificatesOfDepositsButton.click();
    }
    public void mortgagesButtonCheck(){
        creditCardButton.click();
        mortgagesButton.click();
    }
    public void autoLoansButtonCheck(){
        creditCardButton.click();
        autoLoansButton.click();
    }
    public void planningAndInvestmentsButtonCheck(){
        creditCardButton.click();
        planningAndInvestmentsButton.click();
    }
    public void mobileBankingButtonCheck(){
        creditCardButton.click();
        mobileBankingButton.click();
    }
    public void cardMemberAgreementsButtonCheck(){
        creditCardButton.click();
        cardMemberAgreementsButton.click();
    }
    public void creditCardNewsButtonCheck(){
        creditCardButton.click();
        creditCardNewsButton.click();
    }
    public void creditCardGlossaryButtonCheck(){
        creditCardButton.click();
        creditCardGlossaryButton.click();
    }
    public void ultimateRewardsButtonCheck(){
        creditCardButton.click();
        ultimateRewardsButton.click();
    }
    public void creditCardEducationButtonCheck(){
        creditCardButton.click();
        creditCardEducationButton.click();
    }
    public void scheduleAmeetingButtonCheck(){
        creditCardButton.click();
        scheduleAmeetingButton.click();
    }

    // Validate Method
        public void validateSearchText() {
        String actualResult = text.getText();
        String expectedResult = "Our Most Popular Rewards Cards";
        Assert.assertEquals(actualResult, expectedResult, "Text not match");}
        public void validateSearchText1() {
        String actualResult1 = text1.getText();
        String expectedResult1 = "";//All Cards
        Assert.assertEquals(actualResult1, expectedResult1, "Text not match");}
        public void validateSearchText2() {
        String actualResult2 = text2.getText();
        String expectedResult2 = "All Credit Cards";//All Credit Cards
        Assert.assertEquals(actualResult2, expectedResult2, "Text not match");}
        public void validateSearchText3() {
        String actualResult3 = text3.getText();
        String expectedResult3 = "";//Cash Back Credit Cards
        Assert.assertEquals(actualResult3, expectedResult3, "Text not match");}
        public void validateSearchText4() {
        String actualResult4 = text4.getText();
        String expectedResult4 = "";//Travel Credit Cards
        Assert.assertEquals(actualResult4, expectedResult4, "Text not match");}
        public void validateSearchText5() {
        String actualResult5 = text5.getText();
        String expectedResult5 = "";//Business Credit Cards
        Assert.assertEquals(actualResult5, expectedResult5, "Text not match");}
        public void validateSearchText6() {
        String actualResult6 = text6.getText();
        String expectedResult6 = "";//Rewards Credit Cards
        Assert.assertEquals(actualResult6, expectedResult6, "Text not match");}
        public void validateSearchText7() {
        String actualResult7 = text7.getText();
        String expectedResult7 = "";//Airline Credit Cards
        Assert.assertEquals(actualResult7, expectedResult7, "Text not match");}
        public void validateSearchText8() {
        String actualResult8 = text8.getText();
        String expectedResult8 = "";//Hotel Credit Cards
        Assert.assertEquals(actualResult8, expectedResult8, "Text not match");}
        public void validateSearchText9() {
        String actualResult9 = text9.getText();
        String expectedResult9 = "";//No Annual Fee Credit Cards
        Assert.assertEquals(actualResult9, expectedResult9, "Text not match");}
        public void validateSearchText10() {
        String actualResult10 = text10.getText();
        String expectedResult10 = "";//Chase Credit Journey
        Assert.assertEquals(actualResult10, expectedResult10, "Text not match");}
        public void validateSearchText11() {
        String actualResult11 = text11.getText();
        String expectedResult11 = "";//Chase OnlineSM Banking
        Assert.assertEquals(actualResult11, expectedResult11, "Text not match");}
        public void validateSearchText12() {
        String actualResult12 = text12.getText();
        String expectedResult12 = "";//Compare accounts and select the one that fits your needs
        Assert.assertEquals(actualResult12, expectedResult12, "Text not match");}
        public void validateSearchText13() {
        String actualResult13 = text13.getText();
        String expectedResult13 = "";//Welcome to Chase Savings Accounts
        Assert.assertEquals(actualResult13, expectedResult13, "Text not match");}
        public void validateSearchText14() {
        String actualResult14 = text14.getText();
        String expectedResult14 = "";//What is your ZIP code?
        Assert.assertEquals(actualResult14, expectedResult14, "Text not match");}
        public void validateSearchText15() {
        String actualResult15 = text15.getText();
        String expectedResult15 = "";//Your home journey starts here
        Assert.assertEquals(actualResult15, expectedResult15, "Text not match");}
        public void validateSearchText16() {
        String actualResult16 = text16.getText();
        String expectedResult16 = "";//It's your road, choose where to go.
        Assert.assertEquals(actualResult16, expectedResult16, "Text not match");}
        public void validateSearchText17() {
        String actualResult17 = text17.getText();
        String expectedResult17 = "";//Invest your way with J.P. Morgan
        Assert.assertEquals(actualResult17, expectedResult17, "Text not match");}
        public void validateSearchText18() {
        String actualResult18 = text18.getText();
        String expectedResult18 = "";//It's easy to get the app
        Assert.assertEquals(actualResult18, expectedResult18, "Text not match");}
        public void validateSearchText19() {
        String actualResult19 = text19.getText();
        String expectedResult19 = "";//Sample Cardmember Agreements
        Assert.assertEquals(actualResult19, expectedResult19, "Text not match");}
        public void validateSearchText20() {
        String actualResult20 = text20.getText();
        String expectedResult20 = "";//Media Contacts
        Assert.assertEquals(actualResult20, expectedResult20, "Text not match");}
        public void validateSearchText21() {
        String actualResult21 = text21.getText();
        String expectedResult21 = "";//Credit card glossary A-Z
        Assert.assertEquals(actualResult21, expectedResult21, "Text not match");}
        public void validateSearchText22() {
        String actualResult22 = text22.getText();
        String expectedResult22 = "";//Explore the possibilities
        Assert.assertEquals(actualResult22, expectedResult22, "Text not match");}
        public void validateSearchText23() {
        String actualResult23 = text23.getText();
        String expectedResult23 = "";//Education on Credit Cards
        Assert.assertEquals(actualResult23, expectedResult23, "Text not match");}
        public void validateSearchText24() {
        String actualResult24 = text24.getText();
        String expectedResult24 = "";//Are you a Chase customer?
        Assert.assertEquals(actualResult24, expectedResult24, "Text not match");
    }
}
