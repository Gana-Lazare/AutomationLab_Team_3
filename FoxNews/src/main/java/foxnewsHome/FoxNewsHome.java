package foxnewsHome;

import common.WebAPI;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import static foxnewsHome.FoxNewsHomeWebElement.*;

public class FoxNewsHome extends WebAPI {
    @BeforeMethod
    public void openBrowser() throws IOException {
        setUp(false, "browserstack", "OS X", "catalina", "chrome", "85", "https://www.foxnews.com");
    }


    @FindBy(xpath = business_xpath)
    WebElement business;
    public void business() throws InterruptedException {
        business.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath = personalFinance_xpath)
    WebElement personalFinance;
    public void personalFinance() throws InterruptedException {
        personalFinance.click();
        Thread.sleep(5000);
    }


    @FindBy(xpath = morningWithMaria_xpath)
    WebElement morningWithMaria;
    public void morningWithMaria() throws InterruptedException {
        JavascriptExecutor myExecutor = (JavascriptExecutor) driver;
        myExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        morningWithMaria.click();
    }

    @FindBy(xpath = viewMore_xpath)
    WebElement viewMore;
    public void viewMore() throws InterruptedException {
        JavascriptExecutor myExecutor = (JavascriptExecutor) driver;
        myExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        viewMore.click();
    }

    @FindBy(xpath = soccer_xpath)
    WebElement soccer;
    public void soccer() throws InterruptedException {
        JavascriptExecutor myExecutor = (JavascriptExecutor) driver;
        myExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        soccer.click();
    }
    @FindBy(xpath = login_xpath)
    WebElement loginButton;
    public void loginMethod(){
        loginButton.click();
    }


//    @FindBy(xpath = accountCreate_xpath)
//    WebElement accountCreate;
//    public void accountCreate(){
//        accountCreate.click();
//    }

    @FindBy(xpath = forgotPassword_xpath)
    WebElement forgotPasswordButton;
    public void forgotPasswordMethode(){
        forgotPasswordButton.click();
    }


    public void screenShotOfPage() throws IOException {
        TakesScreenshot myShot = (TakesScreenshot)driver;
        File sourceOfFile = myShot.getScreenshotAs(OutputType.FILE);
        File fileName = new File(System.getProperty("User.dir")+ "/Screenshots/" +"foxNewsScreenShots.png");
        FileUtils.copyFile(sourceOfFile,fileName);

    }
    @FindBy(xpath = covidSafety_xpath)
    WebElement covidSafety;
    public void covidSafety() throws InterruptedException {
        covidSafety.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath = economy_xpath)
    WebElement economy;
    public void economyMethod(){
        economy.click();
    }



    @FindBy(xpath = watchTv_xpath)
    WebElement watchTV;
    public void watchTvMethod(){
        driver.findElement(By.xpath(watchTv_xpath)).isDisplayed();
        boolean result = watchTV.isDisplayed();
        System.out.println("is the element displayed? " + result);
    }
    @FindBy(xpath = E2020ElectionButton_xpath)
    WebElement electionButton;
    public void electionButtonMethod() throws InterruptedException {

        Thread.sleep(3000);
        electionButton.click();

    } public void verifyBusinessPageTitle() {
        String expectedUrl = "https://www.foxbusiness.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }
    public void verifyPersonalFinancePageTitle() {
        String expectedUrl = "https://www.foxbusiness.com/personal-finance";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }public void verifyMorningWithMariaPageTitle() {
        String expectedUrl = "https://www.foxbusiness.com/shows/mornings-with-maria";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }public void verifySoccerPageTitle() {
        String expectedUrl = "https://www.foxbusiness.com/category/soccer";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }






//    public void watchMethod(){
//        boolean  watchTv = driver.findElement(By.xpath(watchTv_xpath)).isDisplayed();
//        System.out.println("Is the watch TV tab displayed ? "+watchTv);
//

//    public static void captureScreenshot() {
//        DateFormat df = new SimpleDateFormat("(yyMMddHHmmssZ)");
//        //DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
//        Date date = new Date();
//        df.format(date);
//
//        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        try {
//            String screenshotName;
//            FileUtils.copyFile(file,
//                    new File(System.getProperty("user.dir") + "/Screenshots/" + screenshotName + " " + df.format(date) + ".png"));
//            System.out.println("Screenshot captured");
//        } catch (Exception e) {
//            System.out.println("Exception while taking screenshot " + e.getMessage());
//        }





//        public static void captureScreenshot() {
//        DateFormat df = new SimpleDateFormat("(yyMMddHHmmssZ)");
//        //DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
//        Date date = new Date();
//        df.format(date);
//
//        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        try {
//            FileUtils.copyFile(file,
//                    new File(System.getProperty("user.dir") + "/Screenshots/" + screenshotName + " " + df.format(date) + ".png"));
//            System.out.println("Screenshot captured");
//        } catch (Exception e) {
//            System.out.println("Exception while taking screenshot " + e.getMessage());
//        }
//

//    public void readExcelFile() throws IOException {
//
//        FileInputStream myFile = new FileInputStream("/Users/rabahlamri/IdeaProjects/AutomationLab_Team_3/FoxNews/DataSource/AmazonData.xlsx");//in here we set the path of our file
//        XSSFWorkbook myWorkBook = new XSSFWorkbook(myFile);
//        XSSFSheet mySheet = myWorkBook.getSheet("Products");
//
//        //Before we reach the data , we will have to find out how many rows and columns our workBook has:
//
//        int rowCount = mySheet.getLastRowNum();// this will return the amount of rows our sheet has.
//        int colCount = mySheet.getRow(0).getLastCellNum(); // this will return the amount of the columns
//
//        // to be able to read the excel file , we will have to use for loop (outer and inner for lop);
//        for (int i = 0; i <= rowCount; i++) {
//            XSSFRow firstRow = mySheet.getRow(i);// this is used to read the first Row and so on
//            for (int j = 0; j < colCount; j++) {// this for loop was used to read the columns
//                String Data = firstRow.getCell(j).toString(); // the toString method is used to read cells
//                System.out.print("   " + Data); //in this line of code , i removed the ln from print , so our outpute will be organized
//            }
//
//            System.out.println();
//








//    @FindBy(how = How.XPATH, using = coronavirusButton_xpath)
//    WebElement coronavirusButton;
//
//    public void coronavirusButton() throws InterruptedException {
//        entertainment.click();
//        Thread.sleep(3000);
//        //searchBox.sendKeys(searchItem);
//        coronavirusButton.click();
//        Thread.sleep(3000);
//    }

       }

//    public void searchBoxCheckGetItemsListFromExcel() throws Exception {
//        List<String> itemList = DataSource.getItemsListFromExcel();
//        //searchButton1.click();
//        for (int i = 1; i < itemList.size(); i++) {
//            String item = itemList.get(i);
//            //Thread.sleep(4000);
//            searchBox1.sendKeys(item);
//            searchBox1.submit();
//            String linkUrl = "https://www.foxnews.com/search-results/search?q=" + item;
//            String expectedResult = linkUrl;
//            System.out.println("Expected Result : " + expectedResult);
//            String actualResult = driver.getCurrentUrl();
//            System.out.println("Actual Result : " + actualResult);
//            Assert.assertEquals(actualResult, expectedResult, "Search Item not match");
//            Thread.sleep(3000);
//            //searchBox1.clear();
//            driver.navigate().back();
//            //searchButton1.click();
//            clickOnElement(searchButton);
//        }
//    }
































