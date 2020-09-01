package ebayhome;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Set;

import static ebayhome.ebayhomeWebElement.*;

public class EbayHome<webElement> extends WebAPI {




    /**
     * Autor:Gana
     * Description: Advanced Button
     */

    public static WebElement webElement;

    //Creating a <new Method to get the title of any page where the drive is
    public String getTitlePage() {

        return driver.getTitle();

    }



    @FindBy(how = How.XPATH, using = AdvancedWebElement_xpath)
    public WebElement AdvancedButton;
    @FindBy(how = How.XPATH, using = advancedSearchTextArea_xpath)
    public WebElement adv_text;
    //Action
//CLICK ON advanced on th top right
    public void advancedButtonClick() {
        AdvancedButton.click();
    }
    //Assertion
//using the title of the page to assert the result
    public void assertAdvancedButtonClick() {
        String actualresult = getTextFrom(adv_text);
        String expectedresult="Advanced Search";
        Assert.assertEquals(actualresult,expectedresult,"it's not advanced page");
    }

    //inside Advanced
    @FindBy(how = How.XPATH, using = keyWordsearchWebElement_xpath)
    public WebElement advancedsearchBox;
    //search button 1
    @FindBy(how = How.XPATH, using = advancedButtonSearch1WebElement_xpath)
    public WebElement advancedsearchbutton1;
    @FindBy(how = How.XPATH, using = advancedsearchResultWebElement_xpath)
    public WebElement advancedsearchresult;


    //Action
    public void advancedsearch() {
        advancedsearchBox.sendKeys(keyWebElement);
        advancedsearchbutton1.click();
    }

    //Assertion
    public void assertadvancedsearch() {
        String actualresult = advancedsearchBox.getText();
        String expectedresult = keyWebElement;
        Assert.assertEquals(actualresult, expectedresult, "Unmatch result");
    }

    @FindBy(how = How.XPATH, using = excludeWordWebElement_xpath)
    public WebElement exclude;

    //Action
    public void advancedExcludeKey() {
        exclude.sendKeys(excludeWebElement_xpath);
        advancedsearchbutton1.click();
    }

    //Assertion
    public void assertadvancedExcludeKey() {
        String actualresult = advancedsearchBox.getText();
        String expectedresult = "-" + excludeWebElement_xpath;
        Assert.assertEquals(actualresult, expectedresult, "unmatch result for exclude key ");
    }

    @FindBy(how = How.XPATH, using = allwordsWordWebElement_xpath)
    public WebElement orderWords;
    @FindBy(how = How.XPATH, using = allwordsOptionExacteWordsWebElement_xpath)
    public WebElement exactWords;

    //Action
    public void selectOrderWordsResearch() {
        orderWords.click();
        exactWords.click();
    }

    @FindBy(how = How.XPATH, using = advancedcategoryWebElement_xpath)
    public WebElement categoryadvanced;
    @FindBy(how = How.XPATH, using = selectioncategoryadvanced_xpath)
    public WebElement categoryoption;
    @FindBy(how = How.XPATH, using = advancedcategorytextArea)
    public WebElement adv_categ_text;
    //Action
    public void categoryadvancedselection() {
        categoryadvanced.click();
        categoryoption.click();
    }
    //Assertion
    public void assertcategoryAdvancedSelection(){
        //using common method to get text from a webElement it's category text area
        String actualresult=getTextFrom(adv_categ_text);
        //geting the text of the selected category
        String expectedresult=getTextFrom(categoryoption);
        Assert.assertEquals(actualresult,expectedresult,"unmatch category");
    }

    @FindBy(how = How.XPATH, using = searchTipsAdvancedWebElement_xpath)
    public WebElement searchTips;

    //Action
    public void searchTips() {
        searchTips.click();
    }

    @FindBy(how = How.XPATH, using = usingsSearchOptionWebElement_xpath)
    public WebElement usingsearchOption;

    //Action
    public void usingsearchoptionlink() {
        usingsearchOption.click();
    }
    //****putAssertion********

    @FindBy(how = How.XPATH, using = titeAndDescriptionCheckBoxWebElement)
    public WebElement titleAndDescription;

    //Action
    public void titleAndDescriptionCheckbox() {
        titleAndDescription.click();
    }

    @FindBy(how = How.XPATH, using = findItemsWebElement_xpath)
    public WebElement finditems;

    //Action
    public void finditems() {

        finditems.click();
    }
    //Assertion


    @FindBy(how = How.XPATH, using = OnEbayMotors_xpath)
    public WebElement onebayMotors;

    //Action
    public void onEbayMotor() {
        onebayMotors.click();
    }

    @FindBy(how = How.XPATH, using = BySellerresearch_xpath)
    public WebElement byseller;

    //Action
    public void byseller() {
        byseller.click();
    }


    @FindBy(how = How.XPATH, using = ByItemsresearch_xpath)
    public WebElement byitem;

    //Action
    public void byitem() {
        byitem.click();
    }


    //==============================================================
    @FindBy(how = How.ID, using = searchButtonWebElement_id)
    public WebElement searchButton;


    @FindBy(how = How.XPATH, using = searchBoxWebElement_xpath)
    public WebElement searchBox;
    //Action
    @FindBy(how = How.XPATH, using = elementResearchResultWebElement_xpath)
    public WebElement searchText;

    //Action
    public void insertResearch() {
        searchBox.sendKeys(elementResearchWebElement);
    }

    //Assertion
    public void assertsearchBox() {
        String expectedresult = elementResearchWebElement;
//Assert.assertEquals(actualresult,expectedresult);
    }


    @FindBy(how = How.XPATH, using = optionrightCategoryWebElement_xpath)
    public WebElement rightOptionButton;
    @FindBy(how = How.XPATH, using = optionelementWebElement_xpath)
    public WebElement rightOptionElement;
    @FindBy(how = How.XPATH, using = selectedCategoryWebElement_xpath)
    public WebElement rightCategoryResult;

    //Action
    public void rightOptionsearch() {

        rightOptionButton.click();
        rightOptionElement.click();
        searchButton.click();
    }

    //Assertion
    public void assertionrightOptionsearch() {
        String actualresult = rightCategoryResult.getText();
        String expectedresult = "Business & Industrial";
        Assert.assertEquals(actualresult, expectedresult, "Result unmatch");
    }


    @FindBy(how = How.ID, using = shopByCategoryWebElement_id)
    public WebElement shopBycategory;
    @FindBy(how = How.XPATH, using = collectiblesandArtWebElement_xpath)
    public WebElement collectiblesAndArt;
    @FindBy(how = How.CLASS_NAME, using = collectiblesandArtresultWebElement_class)
    public WebElement collectiblesAndArtresult;

    //Action
    public void collectiblesandart() {
        clickWebElement(shopBycategory);
        clickWebElement(collectiblesAndArt);
    }

    //Assertion
    public void assertCollectiblesandart() {
        String actualresult = collectiblesAndArtresult.getText();
        String expectedresult = "Collectibles & Art";
    }


    @FindBy(how = How.XPATH, using = ebayhomePage_xpath)
    public WebElement homepage;

    //Action
    public void homepage() {
        //click to change the page to confim later that we are in home page
        clickWebElement(AdvancedButton);
        //going back to homepage
        clickWebElement(homepage);
    }

    //Assertion
    public void assertHomePage() {
        String actualresult = driver.getCurrentUrl();
        String expectedresult = "https://www.ebay.com/";
        Assert.assertEquals(actualresult, expectedresult, "Incorrect Url");
    }

    @FindBy(how = How.XPATH, using = advancedSiteMap)
    public WebElement siteMap;

    //Action
    public void advancedsiteMap() {
        scrollIntoViewElement(siteMap);

    }

    public void switchtositeMap() throws Exception {
        advancedsiteMap();
        String sitemapUrl = driver.getCurrentUrl();
        switchWindow(sitemapUrl);

    }

    @FindBy(how = How.XPATH, using = itemsInStoreWebEelement_xpath)
    public WebElement itemsinStore;
    @FindBy(how = How.XPATH, using = itemsinStoreTextArea_xpath)
    public WebElement itemsinStoretextArea;


    //Action
    public void itemsInstore() {
        clickWebElement(itemsinStore);
    }
    //Assertion
    public void assertitemsInStore(){
        String actualresult=getTextFrom(itemsinStoretextArea);
        String expectedresult="Items in Stores";
        Assert.assertEquals(actualresult,expectedresult,"not items in store");
    }
    @FindBy(how = How.XPATH, using = findStoreWebElement_xpath)
    public WebElement findStore;
    @FindBy(how = How.XPATH, using = findStoretextArea)
    public WebElement findStoretextarea;
    //Action
    public void findStore() {
        clickWebElement(findStore);
    }
    //Assertion
    public void assertfindStore(){
        String actualresult=getTextFrom(findStoretextarea);
        String expectedresult="Find Stores";
        Assert.assertEquals(actualresult,expectedresult,"is not find store");
    }



    @FindBy(how = How.XPATH, using = aboutEbayWebELement_xpath)
    public WebElement aboutEbayadvanced;

    //Action
    public void aboutEbayAdvanced() {
        clickWebElement(aboutEbayadvanced);
    }
    //Assertion
    public void assertaboutEbayAdvanced(){
        String actualresult=driver.getCurrentUrl() + "";
        String expectedresult="https://www.ebayinc.com/";
        Assert.assertEquals(actualresult,expectedresult,"url is different");
    }
    @FindBy(how = How.XPATH, using = annoucementWebElement_xpath)
    public WebElement annoucement;

    //Action
    public void annoucement() {
        scrollIntoViewElement(community);
        clickWebElement(annoucement);
    }
    //Action
    public void assertannoucement(){
        String actualresult=driver.getCurrentUrl() + "";
        String expectedresult="https://community.ebay.com/t5/Announcements/bg-p/Announcements";
        Assert.assertEquals(actualresult,expectedresult,"not annoucement page ");
    }

    @FindBy(how = How.XPATH, using = communityWebElement_xpath)
    public WebElement community;

    //Action
    public void community() {
        scrollIntoViewElement(community);
        clickWebElement(community);
    }
    //Assertion
    public void assertcommunity(){
        String actualresult=driver.getCurrentUrl() + "";
        String expectedresult="https://community.ebay.com/?nobounce=";
        Assert.assertEquals(actualresult,expectedresult,"not community page");
    }

    @FindBy(how = How.XPATH, using = securityCenterWebElement_xpath)
    public WebElement securityCenter;

    //Action
    public void securityCenter() {
        scrollIntoViewElement(securityCenter);
        clickWebElement(securityCenter);
    }
    //Assertion
    public void assertsecurityCenter() {
        String actualresult=driver.getCurrentUrl() +"";
        String expectedresult="https://pages.ebay.com/securitycenter/index.html";
        Assert.assertEquals(actualresult,expectedresult,"not securityPage");
    }

    @FindBy(how = How.XPATH, using = resolutionCenterWebElement_xpath)
    public WebElement resolution;

    //Action
    public void resolution() {
        scrollIntoViewElement(resolution);
        clickWebElement(resolution);
    }
    //Assertion
    public void assertresolution(){
        String actualresult=driver.getCurrentUrl() +"";
        String expecetedresult="https://resolutioncenter.ebay.com/";
        Assert.assertEquals(actualresult,expecetedresult,"not resolution page");
    }

    @FindBy(how = How.XPATH, using = sellerCenterWebElement_xpath)
    public WebElement sellerCenter;

    //Action
    public void sellerCenter() {
        scrollIntoViewElement(sellerCenter);
        clickWebElement(sellerCenter);
    }
    //Assertion
    public void assertsellerCenter(){
        String actualresult= driver.getCurrentUrl()+"";
        String expectedresult="https://pages.ebay.com/seller-center/index.html?utm_source=gf&utm_medium=onsite";
        Assert.assertEquals(actualresult,expectedresult,"not sellercenter page");
    }

    @FindBy(how = How.XPATH, using = policiesWebElement_xpath)
    public WebElement policies;

    //Action
    public void policies() {
        scrollIntoViewElement(policies);
        clickWebElement(policies);
    }
    //Assertion
    public void assertpolicies() {
        String actualresult = driver.getCurrentUrl() +"";
        String expectedresult="https://www.ebay.com/help/policies/default/ebays-rules-policies?id=4205";
        Assert.assertEquals(actualresult,expectedresult,"not pollicies page ");
    }

    @FindBy(how = How.XPATH, using = affiliatesWebElement_xpath)
    public WebElement affiliates;

    //Action
    public void affiliates() {
        scrollIntoViewElement(affiliates);
        clickWebElement(affiliates);
    }
    //Assertion
    public void  assertaffiliates() {
        String actualresult= driver.getCurrentUrl()+"";
        String expectedresult="https://partnernetwork.ebay.com/";
        Assert.assertEquals(actualresult,expectedresult,"not affiliates page");
    }

    @FindBy(how = How.XPATH, using = helpAndContactWebElement_xpath)
    public WebElement helpandContact;

    //Action
    public void helpAndContact() {
        scrollIntoViewElement(helpandContact);
        clickWebElement(helpandContact);
    }
    //Assertion
    public void asserthelpAndContact(){
        String actualresult=driver.getCurrentUrl()+"";
        String expectedresult="https://www.ebay.com/help/home";
        Assert.assertEquals(actualresult,expectedresult,"not help page");
    }

    @FindBy(how = How.XPATH, using = ringAlertWebElement_xpath)
    public WebElement ringAlert;
    @FindBy(how = How.XPATH, using = ringSignIn)
    public WebElement signIn;

    //Action
    public void ringAlert() throws InterruptedException {
        // mouseHover(ringAlert, signIn);
    }
    //Assertion

    @FindBy(how = How.XPATH, using = scrolToTopButton)
    public WebElement scrolltoTop;

    //Action
    public void scrollToTop() throws InterruptedException {
        //  mouseHover(scrolltoTop, scrolltoTop);
    }


    @FindBy(how = How.XPATH, using = showItemsCheckBoxWebElement_xpath)
    public WebElement showitemsCheckBox;

    //Action
    public void showitemschekcBox() throws InterruptedException {
        //clickWebElement(showitemsCheckBox);
        radioButton(showitemsCheckBox);
        Thread.sleep(5000);
    }
    //Assertion
    public void assertshowitemsCheckBox(){
        String actualresult = showitemsCheckBox.isDisplayed() +"" ;
        String expectedresult= true + "";
        Assert.assertEquals(actualresult,expectedresult,"unchechecked box ");
    }



   /*public void setresearch(WebElement research,String researchElement){
        research.sendKeys(researchElement);
    }*/


/*
    @FindBy(how = How.XPATH,using = WebElementSearchBox_Xpath)
    public WebElement searchBox;

    @FindBy(how = How.XPATH,using = WebElementsearchbutton)
    public WebElement searchButton;

    //Action
    public void searchBoxCheck(String searchItem){
        searchBox.sendKeys("iphone11 pro max");
          searchBox.submit();
    }*/
}


