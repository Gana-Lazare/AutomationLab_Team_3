package ebayhome;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static ebayhome.EbayHomeWebElement.*;



public class EbayHome extends WebAPI {
//
   @FindBy(how = How.XPATH, using = WebElementsearchBox)
    public WebElement searchBox;


    @FindBy(xpath = HomeGarden_Xpath)
    WebElement homeGarden;

    public void MyHomeGarden() throws InterruptedException {
        homeGarden.click();
    }

    @FindBy(xpath = BabyGear_Locator)
    WebElement Babies;

    public void BabiesShop() {
        Babies.click();
    }

    @FindBy(xpath = endPage)
    WebElement EndPage;

    public void endOfPage() throws InterruptedException {
        JavascriptExecutor myExecutor = (JavascriptExecutor) driver;
        myExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        EndPage.click();
    }

    @FindBy(xpath = bedding_Xpath)
    WebElement bedding;

    public void bedding() throws InterruptedException {
        Thread.sleep(3000);
        bedding.click();

    }

    @FindBy(xpath = crafts_Xpath)
    WebElement crafts;

    public void crafts() throws InterruptedException {
        Thread.sleep(3000);
        crafts.click();
    }

    @FindBy(css = FoodBeverages_css)
    WebElement Food;

    public void FoodBeverages() throws InterruptedException {
        Thread.sleep(3000);
        Food.click();
    }

    @FindBy(xpath = furniture_Xpath)
    WebElement furniture;

    public void Furniture() throws InterruptedException {
        Thread.sleep(3000);
        furniture.click();
    }

    @FindBy(xpath = homeDecor_Xpath)
    WebElement homeDecor;

    public void homeDecor() throws InterruptedException {
        Thread.sleep(3000);
        homeDecor.click();
    }

    @FindBy(xpath = homeImprovement_Xpath)
    WebElement homeImprovement;

    public void homeImprovement() throws InterruptedException {
        Thread.sleep(3000);
        homeImprovement.click();
    }

    @FindBy(xpath = tools_Xpath)
    WebElement tools;

    public void tools() throws InterruptedException {
        Thread.sleep(3000);
        tools.click();
    }

    @FindBy(xpath = wine_Xpath)
    WebElement wine;

    public void wine() throws InterruptedException {
        Thread.sleep(3000);
        wine.click();
    }

    @FindBy(xpath = smartHome_Xpath)
    WebElement smartHome;

    public void smartHome() throws InterruptedException {
        Thread.sleep(3000);
        smartHome.click();
    }

    @FindBy(xpath = breville_xpath)
    WebElement breville;

    public void breville() throws InterruptedException {
        Thread.sleep(3000);
        breville.click();
    }

    @FindBy(xpath = dewalt_Xpath)
    WebElement dewalt;

    public void dewalt() throws InterruptedException {
        Thread.sleep(3000);
        dewalt.click();
    }

    @FindBy(xpath = cleanHouse_Xpath)
    WebElement cleanHouse;

    public void cleanHouse() throws InterruptedException {
        Thread.sleep(3000);
        cleanHouse.click();
    }

    @FindBy(xpath = yearsOfPeople_Xpath)
    WebElement yearsOfPeople;

    public void yearsOfPeople() throws InterruptedException {
        Thread.sleep(3000);
        yearsOfPeople.click();
    }

    @FindBy(xpath = shopToBrand_Xpath)
    WebElement shopToBrand;

    public void shopToBrand() throws InterruptedException {
        Thread.sleep(3000);
        shopToBrand.click();
    }

    @FindBy(xpath = coffee_Xpath)
    WebElement coffee;

    public void coffee() throws InterruptedException {
        Thread.sleep(3000);
        coffee.click();
    }

    @FindBy(xpath = exploreInterest_Xpath)
    WebElement exploreInterest;

    public void exploreInterest() throws InterruptedException {
        Thread.sleep(3000);
        exploreInterest.click();
    }

    @FindBy(xpath = SaveUpTo_Xpath)
    WebElement SaveUpTo;

    public void SaveUpTo() throws InterruptedException {
        Thread.sleep(3000);
        SaveUpTo.click();
    }

    @FindBy(xpath = advanced_Xpath)
    WebElement advanced;

    public void advanced() throws InterruptedException {
        Thread.sleep(3000);
        advanced.click();
    }

    @FindBy(xpath = shopByCategory_Xpath)
    WebElement shopByCategory;

    public void shopByCategory() throws InterruptedException {
        Thread.sleep(3000);
        shopByCategory.click();
    }

    @FindBy(xpath = petSupplies_Xpath)
    WebElement petSupplies;

    public void petSupplies() throws InterruptedException {
        Thread.sleep(3000);
        petSupplies.click();
    }

    @FindBy(xpath = majorAppliance_Xpath)
    WebElement majorAppliance;

    public void majorAppliance() throws InterruptedException {
        Thread.sleep(3000);
        majorAppliance.click();
    }

    @FindBy(xpath = housekeeping_Xpath)
    WebElement housekeeping;

    public void housekeeping() throws InterruptedException {
        Thread.sleep(3000);
        housekeeping.click();
    }

    public void typeOnElement(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        } catch (Exception ex) {
            driver.findElement(By.xpath(locator)).sendKeys(value);
        }
    }

    @FindBy(xpath = searchButton_Xpath)
    WebElement searchButton;

    public void clickOnSearchButton() {
        searchButton.click();
    }

//    public void validateSearchText(String expectedResult) {
//        String actualResult = searchText.getText();
//        // String expectedResult="\"Hand Sanitizer\"";
//        //Assert.assertEquals(actualResult, expectedResult, "Search Item not match");
//        // Junit Assert
//        Assert.assertEquals("Search Item not match", expectedResult, actualResult);
//
//    }
    public void enterSearchKeyword() {
        searchBox.sendKeys("Hand Sanitizer");

}
}