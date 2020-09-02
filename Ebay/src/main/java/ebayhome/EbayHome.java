package ebayhome;
import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static ebayhome.ebayhomeWebElement.*;

public class EbayHome extends WebAPI{

    @FindBy(how = How.XPATH,using = WebElementSearchBox_Xpath)
    public WebElement searchBox;

    @FindBy(how = How.XPATH,using = WebElementsearchbutton)
    public WebElement searchButton;

    @FindBy(how = How.XPATH, using = sellXpath)
    public WebElement sellButton;

    @FindBy(how = How.XPATH, using = helpAndContactXpath)
    public WebElement helpAndContact;

    @FindBy(how = How.XPATH, using = helpSearchBoxXpath)
    public WebElement helpSeachBox;

    @FindBy(how = How.XPATH, using = returnsAndRefundsXpath)
    public WebElement returnsAndRefunds;

    @FindBy(how = How.XPATH,using = shippingAndTrackingXpath)
    public WebElement shippingAndTracking;

    @FindBy(how = How.XPATH,using = sellingXpath)
    public WebElement selling;

    @FindBy(how = How.XPATH,using = buyingXpath)
    public WebElement buying;

    @FindBy(how = How.XPATH,using = accountXpath)
    public WebElement account;

    @FindBy(how = How.XPATH,using = feesAndInvoicesXpath)
    public WebElement feesAndInvoices;

    @FindBy(how = How.XPATH,using = contactUsXpath)
    public WebElement contactUs;

    @FindBy(how = How.XPATH,using = askTheCommunityXpath)
    public WebElement askTheCommunity;

    @FindBy(how = How.XPATH,using = startReturnXpath)
    public WebElement startReturn;

    @FindBy(how = How.XPATH,using = undeliveredItemXpath)
    public WebElement undeliveredItem;

    @FindBy(how = How.XPATH,using = startSharingXpath)
    public WebElement startSharing;





    //Action
    public void searchBoxCheck(String searchItem){
        searchBox.sendKeys("iphone11 pro max");
          searchBox.submit();
    }

    public void sellButtonCheck() throws InterruptedException {
        sellButton.click();
        Thread.sleep(5000);

    }

    public void helpAndContactCheck()  {
        helpAndContact.click();


    }

    public void helpSearchBoxCheck(String searchItem)  {
        helpSeachBox.sendKeys("How to Sell");
        helpSeachBox.submit();


    }

    public void returnsAndRefundsCheck()  {
        returnsAndRefunds.click();


    }

    public void shippingAndTrackingCheck(){
        shippingAndTracking.click();
    }

    public void sellingCheck(){
        selling.click();
    }

    public void buyingCheck(){
        buying.click();
    }

    public void accountCheck(){
        account.click();
    }

    public void feesAndInvoicesCheck(){
        feesAndInvoices.click();
    }

    public void contactUsCheck(){
        contactUs.click();
    }

    public void askTheCommunityCheck(){
        askTheCommunity.click();
    }

    public void startReturnCheck(){
        startReturn.click();
    }

    public void undeliveredItemCheck(){
        undeliveredItem.click();
    }

    public void startSharingCheck(){
        startSharing.click();
    }

}


