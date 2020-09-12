package foxnewsHome;

import common.WebAPI;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import dataDriven.DataSource;
import static foxnewsHome.FoxNewsWebElements.*;


public class FoxNewsHome extends WebAPI {

    @FindBy(xpath = entertainment_xpath)
    WebElement entertainment;

    public void entertainment() throws InterruptedException {
        entertainment.click();
    }

    @FindBy(xpath = E2020ElectionButton_xpath)
    WebElement E2020ElectionButton;

    public void E2020ElectionButton() throws InterruptedException {
        entertainment.click();
        Thread.sleep(3000);
        E2020ElectionButton.click();

    }


    @FindBy(xpath = searchButton)
    public WebElement searchButton1;

    public void searchButton1Method() throws InterruptedException {
        Thread.sleep(3000);
        searchButton1.click();
    }

    @FindBy(how = How.XPATH, using = coronaVirusButton_xpath)
    WebElement coronaVirusButton;

    public void coronaVirusButton() throws InterruptedException {
        entertainment.click();
        Thread.sleep(3000);
        //searchBox.sendKeys(searchItem);
        coronaVirusButton.click();
        Thread.sleep(3000);
    }


    public void readExcelFile() throws IOException {

        FileInputStream myFile = new FileInputStream("/Users/rabahlamri/IdeaProjects/AutomationLab_Team_3/FoxNews/DataSource/FoxNewsData.xlsx");//in here we set the path of our file
        XSSFWorkbook myWorkBook = new XSSFWorkbook(myFile);
        XSSFSheet mySheet = myWorkBook.getSheet("Products");
        //Before we reach the data , we will have to find out how many rows and columns our workBook has:
        int rowCount = mySheet.getLastRowNum();// this will return the amount of rows our sheet has.
        int colCount = mySheet.getRow(0).getLastCellNum(); // this will return the amount of the columns
        // to be able to read the excel file , we will have to use for loop (outer and inner for lop);
        for (int i = 0; i <= rowCount; i++) {
            XSSFRow firstRow = mySheet.getRow(i);// this is used to read the first Row and so on
            for (int j = 0; j < colCount; j++) {// this for loop was used to read the columns
                String Data = firstRow.getCell(j).toString(); // the toString method is used to read cells
                System.out.print("   " + Data); //in this line of code , i removed the ln from print , so our outpute will be organized
            }
            System.out.println();
        }
    }


    public static void screenShotOfPage() throws IOException {
        TakesScreenshot myShot = (TakesScreenshot) driver;
        File sourceOfFile = myShot.getScreenshotAs(OutputType.FILE);
        File fileName = new File(System.getProperty("User.dir") + "/Screenshots/" + "foxNewsScreenShots.png");
        FileUtils.copyFile(sourceOfFile, fileName);
        System.out.println("Screenshot 1 captured");
    }

    @FindBy(xpath = endOfPage_Xpath)
    WebElement endOfPage;

    public void endOfPage() throws InterruptedException {
        JavascriptExecutor myExecutor = (JavascriptExecutor) driver;
        myExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        endOfPage.click();
    }

    @FindBy(xpath = endOfPageHelp_xpath)
    WebElement endOfPageHelp;

    public void endOfPageHelp() throws InterruptedException {
        JavascriptExecutor myExecutor = (JavascriptExecutor) driver;
        myExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        endOfPageHelp.click();
    }

    @FindBy(xpath = showMore_xpath)
    WebElement showMore;

    public void showMore() throws InterruptedException {
        JavascriptExecutor myExecutor = (JavascriptExecutor) driver;
        myExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        showMore.click();
    }

    @FindBy(xpath = jacobBlakeProtests_css)
    WebElement jacobBlakeProtests;

    public void clickHereMethod() {
        jacobBlakeProtests.click();
    }


    @FindBy(xpath = whatYouNeedToKnow_xpath)
    WebElement whatYouNeedToKnow;

    public void whatYouNeedToKnowMethod() {
        whatYouNeedToKnow.click();
    }

    @FindBy(xpath = stopCaptioningPolicy_xpath)
    WebElement stopCaptioningPolicy;

    public void stopCaptioningPolicy() throws InterruptedException {
        coronaVirusButton.click();
        JavascriptExecutor myExecutor = (JavascriptExecutor) driver;
        myExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        stopCaptioningPolicy.click();
    }

    @FindBy(xpath = tvButton_xpath)
    WebElement tvButton;

    public void tvButton() {
        //searchBox.sendKeys();
        tvButton.click();
    }

    @FindBy(xpath = watchLive_xpath)
    WebElement watchLive;

    public void watchLive() {
        driver.findElement(By.xpath(watchLive_xpath)).isDisplayed();
        boolean result = watchLive.isDisplayed();
        System.out.println("is the element displayed? " + result);

    }

    @FindBy(css = podcast_css)
    WebElement podcast;

    public void podcastMethod() {
        driver.findElement(By.xpath(podcast_css)).isDisplayed();
        boolean result = podcast.isDisplayed();
        System.out.println("is the element displayed? " + result);


    }

    public static void captureScreenshot() throws Exception {
        DateFormat df = new SimpleDateFormat("(yyMMddHHmmssZ)");
        //DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        df.format(date);

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,
                    new File(System.getProperty("user.dir") + "/Screenshots/" + screenshotName + " " + df.format(date) + ".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
        }

    }


    @FindBy(how = How.XPATH, using = searchText_xpath)
    public WebElement searchText;


    @FindBy(how = How.CSS, using = searchBox)
    public WebElement searchBox1;


    public void searchBoxCheckGetItemsListFromExcel() throws Exception {
        //String path;
        List<String> itemList =DataSource.getItemsListFromExcel();
        //searchButton1.click();
        for (int i = 1; i < itemList.size(); i++) {
            String item = itemList.get(i);
            //Thread.sleep(4000);
            searchBox1.sendKeys(item);
            searchBox1.submit();
            String linkUrl = "https://www.foxnews.com/search-results/search?q=" + item;
            String expectedResult = linkUrl;
            System.out.println("Expected Result : " + expectedResult);
            String actualResult = driver.getCurrentUrl();
            System.out.println("Actual Result : " + actualResult);
            Assert.assertEquals(actualResult, expectedResult, "Search Item not match");
            Thread.sleep(3000);
            //searchBox1.clear();
            driver.navigate().back();
            //searchButton1.click();
            clickOnElement(searchButton);
        }
    }

        @FindBy(how = How.CSS, using = picture_css)
        public WebElement picture1;

        public void picture1method () {
            driver.findElement(By.cssSelector(picture_css)).isDisplayed();
            boolean result = picture1.isDisplayed();
            System.out.println("is the element displayed? " + result);

        }
        @FindBy(how = How.CSS, using = foxNation_xpath)
        public WebElement foxNation;
        public void foxNationMethod () {
            foxNation.click();
        }
        @FindBy(how = How.XPATH, using = crime_xpath)
        public WebElement crime;
        public void crimeMethod () {
            crime.click();
        }


        public static List<String> getItemValue () {
            List<String> itemsList = new ArrayList<String>();
            itemsList.add("Vote");
            itemsList.add("Labor");
            itemsList.add("Niagara");
            itemsList.add("Elections");
            itemsList.add("Flight");
            itemsList.add("Camera");
            return itemsList;
        }
    }











   
    





