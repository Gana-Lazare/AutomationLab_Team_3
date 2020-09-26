package libertymutualHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static libertymutualHome.LibertyMutualWebElement.*;


public class LibertyMutualHome extends WebAPI {


    String expectedResult;



    @FindBy(how = How.XPATH, using = webElementCustomerSupportButton)
    public WebElement CustomerSupportButton;
    @FindBy(how = How.XPATH, using = webElementCustomerSupportText)
    public WebElement CustomerSupportText;

    @FindBy(how = How.XPATH, using = webElementCovidSupportButton)
    public WebElement CustomerCovidSupportButton;
    @FindBy(how = How.XPATH, using = webElementCovidSupportText)
    public WebElement CustomerCovidSupportText;

    @FindBy(how = How.XPATH, using = webElementFrequentlyAskedQuestionsButton)
    public WebElement FrequentlyAskedQuestionsButton;
    @FindBy(how = How.XPATH, using = webElementFrequentlyAskedQuestionsText)
    public WebElement FrequentlyAskedQuestionsText;

    @FindBy(how = How.XPATH, using = webElementManageYourPolicyButton)
    public WebElement ManageYourPolicyButton;
    @FindBy(how = How.XPATH, using = webElementManageYourPolicyText)
    public WebElement ManageYourPolicyText;

    @FindBy(how = How.XPATH, using = webElementBillingPaymentOptionsButton)
    public WebElement BillingPaymentOptionsButton;
    @FindBy(how = How.XPATH, using = webElementBillingPaymentOptionsText)
    public WebElement BillingPaymentOptionsText;



    public void customerSupportButtonCheck() {
        CustomerSupportButton.click();
    }


    public void validateCustomerSupportText() {
        String actualResult = CustomerSupportText.getText();
        expectedResult = "Get answers";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    public void customerCovidSupportButtonCheck(){
        //CustomerSupportButton.click();
        CustomerCovidSupportButton.click();
    }


    public void validateCustomerCovidSupportText() {
        String actualResult = CustomerCovidSupportText.getText();
        expectedResult = "Our continued commitment to customers during coronavirus";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }


    public void frequentlyAskedQuestionsButtonCheck(){
        //CustomerSupportButton.click();
        FrequentlyAskedQuestionsButton.click();
    }


    public void validateFrequentlyAskedQuestionsText() {
        String actualResult = FrequentlyAskedQuestionsText.getText();
        expectedResult = "Frequently asked questions";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }


    public void ManageYourPolicyButtonCheck(){
        //CustomerSupportButton.click();
        ManageYourPolicyButton.click();
    }


    public void validateManageYourPolicyText() {
        String actualResult = ManageYourPolicyText.getText();
        expectedResult = "Log in to manage your policy online";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }


    public void BillingPaymentOptionsButtonCheck(){
        //CustomerSupportButton.click();
        BillingPaymentOptionsButton.click();
    }


    public void validateBillingPaymentOptionsText() {
        String actualResult = BillingPaymentOptionsText.getText();
        expectedResult = "Enroll in Autopay and never miss a payment";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    //validate Url :
//        implicitWait(5);
//        String actualURL=driver.getCurrentUrl();
//        implicitWait(1);
//        String expectedURL="https://google.com";
//        Assert.assertEquals(actualURL,expectedURL);



}
