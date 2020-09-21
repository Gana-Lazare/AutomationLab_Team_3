package foxNewsHome;

import common.WebAPI;
import datadriven.DataSource;
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


    // Action Method Scenario Outline
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




    //TDD (Search Box) :
     public void searchBoxCheck(String searchItem) {
        this.clickOnElement("/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/div[2]/div[1]/a[1]");
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

    public void validateSearchTextOpinion() {
        String actualResult = this.searchTextOpinion.getText();
        String expectedResult = "Opinion";
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
            this.clickOnElement("/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/div[2]/div[1]/a[1]");

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
                this.clickOnElement("/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/div[2]/div[1]/a[1]");
            }

        }
}
