package foxNewsHome;

import common.WebAPI;
import datadriven.DataSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;

public class FoxNewsHome extends WebAPI{


    @FindBy(how = How.XPATH, using = "//*[@id=\"main-nav\"]/ul/li[3]/a")
    public static WebElement searchButton1;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/header/div[4]/div[1]/div/div/form/fieldset/input[1]")
    public static WebElement searchBox;
    @FindBy(how = How.CSS, using = "#wrapper > header > div.expandable-nav > div.inner > div > div > form > fieldset > input.resp_site_submit")
    public static WebElement searchButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/div/div[1]/div/div[2]/div[2]/h2")
    public static WebElement searchText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"main-nav\"]/ul/li[3]/a")
    public static WebElement opinionButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/div/div[1]/div[2]/h1")
    public  static WebElement searchTextOpinion;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/header/div[2]/div/div[2]")
    public  static WebElement loginHoverButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"account\"]/div/a")
    public  static WebElement loginButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/div/div[2]/main/section/div/form/div[1]/input")
    public static WebElement emailTextBox;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/div/div[2]/main/section/div/form/div[2]/input")
    public static WebElement passwordTextBox;

    @FindBy(how = How.CSS, using = "body.fn.page-foxid:nth-child(2) div.wrapper:nth-child(1) div.page div.page-content main.main-content section.foxid-wrap.foxid-login div.foxid-content form.foxid-form.login-form div.foxid-row:nth-child(3) > button.foxid-btn.foxid-btn-primary.login")  ////*[@id="wrapper"]/div/div[2]/main/section/div/form/div[3]/button
    public  static WebElement submitButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/div/div[2]/main/section/header/h1")
    public static WebElement searchTextLogin;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/div/div[2]/main/section/div/form/div[3]")
    public static WebElement searchTextInvalidLogin;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/footer/div[1]/div/div/nav[10]/h6/a")
    public static WebElement TechButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"google_ads_iframe_/4145/fnc/desk/sf/tech/lb1_0__container__\"]")
    public static WebElement TechText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/footer/div[1]/div/div/nav[10]/ul/li[1]/a")
    public static WebElement SecurityButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/div/div[2]/h1")
    public static WebElement SecurityText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/footer/div[1]/div/div/nav[10]/ul/li[2]/a")
    public static WebElement InnovationButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/div/div[1]/div[2]/section/header/div/picture/img")
    public static WebElement InnovationText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/footer/div[1]/div/div/nav[9]/ul/li[5]/a")
    public static WebElement NaturalAndScienceButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/div/div[2]/h1")
    public static WebElement NaturalAndScienceText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/footer/div[1]/div/div/nav[10]/ul/li[3]/a")
    public static WebElement DronesButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/div/div[2]/h1")
    public static WebElement DronesText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/footer/div[1]/div/div/nav[10]/ul/li[4]/a")
    public static WebElement ComputersButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/div/div[2]/h1")
    public static WebElement ComputersText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/footer/div[1]/div/div/nav[10]/ul/li[5]/a")
    public static WebElement VideoGamesButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/div/div[2]/h1")
    public static WebElement VideoGamesText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/footer/div[1]/div/div/nav[10]/ul/li[6]/a")
    public static WebElement MilitaryTechButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/div/div[2]/h1")
    public static WebElement MilitaryTechText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/footer/div[1]/div/div/nav[9]/h6/a")
    public static WebElement ScienceButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/div/div[1]/div[2]/h1")
    public static WebElement ScienceText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/footer/div[1]/div/div/nav[9]/ul/li[1]/a")
    public static WebElement ArchaeologyButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/div/div[2]/h1")
    public static WebElement ArchaeologyText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/footer/div[1]/div/div/nav[9]/ul/li[2]/a")
    public static WebElement AirSpaceButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/div/div[2]/h1")
    public static WebElement AirSpaceText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/footer/div[1]/div/div/nav[9]/ul/li[3]/a")
    public static WebElement PlanetEarthButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/div/div[2]/h1")
    public static WebElement PlanetEarthText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/footer/div[1]/div/div/nav[9]/ul/li[4]/a")
    public static WebElement WildNatureButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrapper\"]/div/div[2]/h1")
    public static WebElement WildNatureText;








    // BDD (Login) :
    public void clickOnLoginButton() {
        loginButton.click();

    }


    public void enterUserName(){
        emailTextBox.sendKeys("hassan_arib@hotmail.com");
    }


    public void enterPassWord(){
        passwordTextBox.sendKeys("elhacen27");
    }


    public void submitLoginButton(){
        submitButton.submit();

    }


    // Action Method Scenario Outline============
    public void enterSearchKeyword(String titleName) {
        searchBox.sendKeys(titleName);

    }

    public void clickOnSearchBox(){
        this.searchButton.click();
    }


    public void validateSearchBoxText(String verifyTitle) {
        String actualResult = this.searchText.getText();
        String expectedResult = verifyTitle;
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }
    public void validateSearchTextOpinion() {
        String actualResult = this.searchTextOpinion.getText();
        String expectedResult = "Opinion";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }
    //2nd Scenario
    public void clickOnTechButton(){
        TechButton.click();

    }
    public void validateTechButton(){
        String actualResult = TechText.getText();
        String expectedResult = "Tech";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    //3rd Scenario
    public void clickOnSecurityButton(){
        SecurityButton.click();

    }
    public void validateSecurityButton(){
        String actualResult = this.SecurityText.getText();
        String expectedResult = "Security";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    //4th Scenario
    public void clickOnInnovationButton(){
        InnovationButton.click();

    }
    public void validateInnovationButton(){
        boolean imagePresent= driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[1]/div[2]/section/header/div/picture/img")).isDisplayed();
        System.out.println(imagePresent);
        boolean expected = true;
        Assert.assertEquals(imagePresent,expected);
    }

    //5th Scenario
    public void clickOnNaturalAndScienceButton(){
        NaturalAndScienceButton.click();

    }
    public void validateNaturalAndScienceButton(){
        String actualResult = this.NaturalAndScienceText.getText();
        String expectedResult = "Natural Science";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    //6th Scenario
    public void clickOnDronesButton(){
        DronesButton.click();

    }
    public void validateDronesButton(){
        String actualResult = this.DronesText.getText();
        String expectedResult = "Natural Science";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    //7th Scenario
    public void clickOnComputersButton(){
        ComputersButton.click();

    }
    public void validateComputersButton(){
        String actualResult = this.ComputersText.getText();
        String expectedResult = "Natural Science";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    //8th Scenario
    public void clickOnVideoGamesButton(){
        VideoGamesButton.click();

    }
    public void validateVideoGamesButton(){
        String actualResult = this.VideoGamesText.getText();
        String expectedResult = "Video Games";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    //9th Scenario
    public void clickOnMilitaryTechButton(){
        MilitaryTechButton.click();

    }
    public void validateMilitaryTechButton(){
        String actualResult = this.MilitaryTechText.getText();
        String expectedResult = "Military Tech";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    //10th Scenario
    public void clickOnScienceButton(){
        ScienceButton.click();

    }
    public void validateScienceButton(){
        String actualResult = this.ScienceText.getText();
        String expectedResult = "Science";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    //11th Scenario
    public void clickOnArchaeologyButton(){
        ArchaeologyButton.click();

    }
    public void validateArchaeologyButton(){
        String actualResult = this.ArchaeologyText.getText();
        String expectedResult = "Science";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    //12th Scenario
    public void clickOnAirSpaceButton(){
        AirSpaceButton.click();

    }
    public void validateAirSpaceButton(){
        String actualResult = this.AirSpaceText.getText();
        String expectedResult = "Science";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    //13th Scenario
    public void clickOnPlanetEarthButton(){
        PlanetEarthButton.click();

    }
    public void validatePlanetEarthButton(){
        String actualResult = this.PlanetEarthText.getText();
        String expectedResult = "Science";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    //14th Scenario
    public void clickOnWildNatureButton(){
        WildNatureButton.click();

    }
    public void validateWildNatureButton(){
        String actualResult = this.WildNatureText.getText();
        String expectedResult = "Science";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }





    //TDD (Search Box) :
     public void searchBoxCheck(String searchItem) {
        this.clickOnElement("//*[@id=\"wrapper\"]/header/div[2]/div/div[2]/div[1]/a");
        this.searchBox.sendKeys(new CharSequence[]{searchItem});
        this.searchButton.click();
        }
    public void validateSearchText(String searchItem) {
         String actualResult = this.searchText.getText();
         String expectedResult = "By Content";
         Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
        }

    public void validateSearchLoginText(String searchItem) {
        String actualResult = this.searchTextLogin.getText();
        String expectedResult = "My Account";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

    public void validateSearchInvalidLoginText(String searchItem) {
        String actualResult = this.searchTextInvalidLogin.getText();
        String expectedResult = "My Account";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }

        public void login() {
            this.clickOnElement("/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/div[2]/div[1]/a[1]");
            this.typeOnElement("//*[@id=\"wrapper\"]/header/div[4]/div[1]/div/div/form/fieldset/input[1]", "Algeria");
            this.clickOnElement("#wrapper > header > div.expandable-nav > div.inner > div > div > form > fieldset > input.resp_site_submit");
        }

        public void searchBoxCheckUsingGetItemValue() throws InterruptedException {
            List<String> itemList = DataSource.getTitleValue();
            this.searchButton1.click();
            Iterator var2 = itemList.iterator();

            while(var2.hasNext()) {
                String st = (String)var2.next();
                this.searchBox.sendKeys(new CharSequence[]{st});
                this.searchBox.submit();
                String expectedResult = "\"" + st + "\"";
                System.out.println("Expected Result : " + expectedResult);
                String actualResult = this.searchText.getText();
                System.out.println("Actual Result : " + actualResult);
                Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
                sleepFor(3);
                this.searchBox.clear();
            }

        }

        public void searchBoxCheckGetItemsListFromExcel() throws Exception {
            List<String> itemList = DataSource.getItemsListFromExcel();
            this.searchButton1.click();

            for(int i = 1; i < itemList.size(); ++i) {
                String item = (String)itemList.get(i);
                this.searchBox.sendKeys(new CharSequence[]{item});
                this.searchBox.submit();
                String expectedResult = "\"" + item + "\"";
                System.out.println("Expected Result : " + expectedResult);
                String actualResult = this.searchText.getText();
                System.out.println("Actual Result : " + actualResult);
                Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
                sleepFor(3);
                this.searchBox.clear();
            }

        }
        // TDD (Search Box) :
        public void searchBoxCheckGetTitlesListFromDB() throws Exception {
            DataSource.insertDataIntoDB();
            List<String> titlesList = DataSource.getTitlesListFromDB();
            this.clickOnElement("//*[@id=\"wrapper\"]/header/div[2]/div/div[2]/div[1]/a");

            for(int i = 1; i < titlesList.size(); ++i) {
                String title = (String)titlesList.get(i);
                this.searchBox.sendKeys(new CharSequence[]{title});
                this.searchBox.submit();
                String linkUrl = "https://www.foxnews.com/search-results/search?q=" + title;
                System.out.println("Expected Result : " + linkUrl);
                sleepFor(3);
                String actualResult = driver.getCurrentUrl();
                System.out.println("Actual Result : " + actualResult);
                Assert.assertEquals(actualResult, linkUrl, "Search Title not match");
                sleepFor(3);
                driver.navigate().back();
                this.clickOnElement("//*[@id=\"wrapper\"]/header/div[2]/div/div[2]/div[1]/a");
            }

        }
}
