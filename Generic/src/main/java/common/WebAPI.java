package common;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import reporting.ExtentManager;
import reporting.ExtentTestManager;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebAPI {
    //ExtentReport
    public static ExtentReports extent;


    //Create the WebDriver element here
    public static WebDriver driver;
    WebElement webElement;
    String elementresearch;


    @BeforeSuite
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }

    public void openFoxNewsBrowser() throws IOException {
        setUp(false, "BrowserStack", "windows", "7", "chrome", "85", "http:\\www.foxnews.com");
    }

    public void openHiltonHotelBrowser() throws IOException {
        setUp(false, "BrowserStack", "windows", "7", "chrome", "85", "http:\\www.hiltonhotel.com");

    }


    //Creating a common method to click on a WebElement
    //giving as a parameter the WebElement
    public void clickWebElement(WebElement webElement) {
        this.webElement = webElement;
        webElement.click();
    }

    public String getTextFrom(WebElement webElement) {
        this.webElement = webElement;
        return webElement.getText();
    }

    //Creating a method that use a locator to click what ever is the type of this locator
    public void clickByLocator(String locator) {

    }

    @BeforeMethod
    public void startExtent(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName().toLowerCase();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(className);
    }
@BeforeClass
    public void startExtentbdd(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName().toLowerCase();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(className);
    }

    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }

    //Gana comment it because getting a nullpointerexception and finally  the

    @AfterMethod
    public void afterEachTestMethod(ITestResult result) {
        try {
            ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
            ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));

            for (String group : result.getMethod().getGroups()) {
                ExtentTestManager.getTest().assignCategory(group);
            }

            if (result.getStatus() == 1) {
                ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
            } else if (result.getStatus() == 2) {
                ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
            } else if (result.getStatus() == 3) {
                ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
            }
            ExtentTestManager.endTest();
            extent.flush();
            if (result.getStatus() == ITestResult.FAILURE) {
                captureScreenshot(driver, result.getName());
            }
            driver.quit();
        } catch (NullPointerException e) {
            e.getStackTrace();
            e.getMessage();
        }
    }

    @AfterEach
    public void afterEachTestMethodBDD(ITestResult result) {
    ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
    ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));

    for (String group : result.getMethod().getGroups()) {
        ExtentTestManager.getTest().assignCategory(group);
    }

    if (result.getStatus() == 1) {
        ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
    } else if (result.getStatus() == 2) {
        ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
    } else if (result.getStatus() == 3) {
        ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
    }
    ExtentTestManager.endTest();
    extent.flush();
    if (result.getStatus() == ITestResult.FAILURE) {
        captureScreenshot(driver, result.getName());
    }
    driver.quit();
}

    @After
    public void generateReportBDD() {
        extent.close();
    }

    @AfterSuite
    public void generateReport() {
        extent.close();
    }


    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }



    public static void captureScreenshot(WebDriver driver, String screenshotName) {
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

    public static String convertToString(String st) {
        String splitString = "";
        splitString = StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(st), ' ');
        return splitString;
    }

    public String browserstack_username = "ganahamrioui1";
    public String browserstack_accesskey = "PumTSx2dywjMsyXLZpmZ";
    public String saucelabs_username = "";
    public String saucelabs_accesskey = "";

    @Parameters({"useCloudEnv", "cloudEnvName", "os", "os_version", "browserName", "browserVersion", "url"})
    @BeforeMethod
    public void setUp(@Optional("false") boolean useCloudEnv, @Optional("false") String cloudEnvName,
                      @Optional("windows") String os, @Optional("10") String os_version, @Optional("chrome-options") String browserName, @Optional("84")
                              String browserVersion, @Optional("https://www.google.com") String url) throws IOException {

        if (useCloudEnv == true) {
            if (cloudEnvName.equalsIgnoreCase("browserstack")) {
                getCloudDriver(cloudEnvName, browserstack_username, browserstack_accesskey, os, os_version, browserName, browserVersion);
            } else if (cloudEnvName.equalsIgnoreCase("saucelabs")) {
                getCloudDriver(cloudEnvName, saucelabs_username, saucelabs_accesskey, os, os_version, browserName, browserVersion);
            }
        } else {
            getLocalDriver(os, browserName);
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.get(url);
        //driver.manage().window().maximize();
    }

    public WebDriver getLocalDriver(@Optional("mac") String OS, String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            if (OS.equalsIgnoreCase("OS X")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/BrowserDriver/mac/chromedriver");
            } else if (OS.equalsIgnoreCase("Windows")) {
                //  System.setProperty("webdriver.chrome.driver", "../Generic/BrowserDriver/windows/chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", "../Generic/BrowserDriver/windows/chromedriver85.exe");
            }
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("chrome-options")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            if (OS.equalsIgnoreCase("OS X")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/BrowserDriver/mac/chromedriver");
            } else if (OS.equalsIgnoreCase("Windows")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/BrowserDriver/windows/chromedriver.exe");
            }
            driver = new ChromeDriver(options);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            if (OS.equalsIgnoreCase("OS X")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/BrowserDriver/mac/geckodriver");
            } else if (OS.equalsIgnoreCase("Windows")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/BrowserDriver/windows/geckodriver.exe");
            }
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "../Generic/BrowserDriver/windows/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        return driver;
    }


    public WebDriver getCloudDriver(String envName, String envUsername, String envAccessKey, String os, String os_version, String browserName,
                                    String browserVersion) throws IOException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browser", browserName);
        cap.setCapability("browser_version", browserVersion);
        cap.setCapability("os", os);
        cap.setCapability("os_version", os_version);

        if (envName.equalsIgnoreCase("Saucelabs")) {
            //resolution for Saucelabs
            driver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey +
                    "@ondemand.saucelabs.com:80/wd/hub"), cap);
        } else if (envName.equalsIgnoreCase("Browserstack")) {
            cap.setCapability("resolution", "1024x768");
            driver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey +
                    "@hub-cloud.browserstack.com/wd/hub"), cap);
        }
        return driver;
    }


    //Creating a method to scroll into view Element
    public void moveToElement(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

    }

    public void scrollIntoViewElement(WebElement element) {
        this.webElement = element;
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    //Method to switch window giving the url of the new Window
    //giving as string the url of tje page
    //we can
    public void switchWindow(String url) throws InterruptedException {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "n");
        Thread.sleep(3000);
        for (String windowHandel : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandel);

        }
    }
    //Method to Mouse Hover giving the element and the subelement fo menu


    public void mouseHover(WebElement element, WebElement subElement) throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        Thread.sleep(2000);
        action.click(subElement).perform();
    }

    //method to check the status of a radiobutton or a checkbox
    public void radioButton(WebElement radioButton) {
        this.webElement = radioButton;
        boolean isChecked;
    }


    /**
     * radioButton by Gana
     */
    //method to check the status of a radiobutton or a checkbox
    public void radioButton2(WebElement radioButton) {
        this.webElement = radioButton;
        boolean isChecked;

        isChecked = radioButton.isSelected();
        System.out.println(isChecked);
    }


    //creating a method to send a keyssearch

    /**
     * Sendkeymethod by Gana
     *
     * @param searchBar
     * @param elementresearch
     * @throws NoSuchElementException
     */

    //creating a method to send a keyssearch

    WebElement searchBar;

    public void sendKey(WebElement searchBar, String elementresearch) throws NoSuchElementException {
        this.webElement = searchBar;
        this.elementresearch = elementresearch;
        searchBar.sendKeys(elementresearch);
        searchBar.submit();
    }


    /**
     * ALL following methods By Mh
     */
    //helper methods
    public void clickOnElement(String locator) {
        try {
            driver.findElement(By.cssSelector(locator)).click();
        } catch (Exception ex) {
            try {
                driver.findElement(By.className(locator)).click();
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.id(locator)).click();
                } catch (Exception ex3) {
                    driver.findElement(By.xpath(locator)).click();
                }
            }
        }
    }

    public void typeOnElement(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        } catch (Exception ex) {
            driver.findElement(By.xpath(locator)).sendKeys(value);
        }
    }

    public static void typeOnElementNEnter(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex1) {
            try {
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
            } catch (Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
                }
            }
        }
    }
//MEthod to convert locator to web element
    public static WebElement convertTOWebElement(String locator) {
        WebElement webElement = null;
        try {
            webElement = driver.findElement(By.xpath(locator));
        } catch (Exception e) {
            try {
                webElement = driver.findElement((By.cssSelector(locator)));
            } catch (Exception e2) {
                try {
                    webElement = driver.findElement(By.id(locator));
                } catch (Exception e3) {
                    try {
                        webElement = driver.findElement(By.className(locator));
                    } catch (Exception e4) {
                        webElement = driver.findElement(By.tagName(locator));
                    }
                }
            }

        } finally {
            return webElement;
        }
    }


    public static void typeOnElementNEnter(String locator, String value, WebDriver driver1) {
        try {
            driver1.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex1) {
            try {
                System.out.println("First Attempt was not successful");
                driver1.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
            } catch (Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver1.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver1.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                }
            }
        }
    }

    public void clearField(String locator) {
        driver.findElement(By.id(locator)).clear();
    }

    public void navigateBack() {
        driver.navigate().back();
    }

    public static void clickOnElement(String locator, WebDriver driver1) {
        try {
            driver1.findElement(By.cssSelector(locator)).click();
        } catch (Exception ex1) {
            try {
                driver1.findElement(By.xpath(locator)).click();
            } catch (Exception ex2) {
                driver1.findElement(By.id(locator)).click();
            }
        }
    }

    public void typeOnInputField(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        } catch (Exception ex) {
            driver.findElement(By.id(locator)).sendKeys(value);
        }

    }

    public void clickByXpath(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public void typeByCss(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }

    public void typeByCssNEnter(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }

    public void typeByXpath(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }

    public void takeEnterKeys(String locator) {
        driver.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
    }

    public void clearInputField(String locator) {
        driver.findElement(By.cssSelector(locator)).clear();
    }

    public List<WebElement> getListOfWebElementsById(String locator) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.id(locator));
        return list;
    }

    public static List<String> getTextFromWebElements(String locator) {
        List<WebElement> element = new ArrayList<WebElement>();
        List<String> text = new ArrayList<String>();
        element = driver.findElements(By.cssSelector(locator));
        for (WebElement web : element) {
            String st = web.getText();
            text.add(st);
        }
        return text;
    }

    public static List<String> getTextFromWebElements(String locator, WebDriver driver1) {
        List<WebElement> element = new ArrayList<WebElement>();
        List<String> text = new ArrayList<String>();
        element = driver1.findElements(By.cssSelector(locator));
        for (WebElement web : element) {
            String st = web.getText();
            text.add(st);
        }

        return text;
    }

    public static List<WebElement> getListOfWebElementsByCss(String locator) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.cssSelector(locator));
        return list;
    }

    public static List<WebElement> getListOfWebElementsByCss(String locator, WebDriver driver1) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver1.findElements(By.cssSelector(locator));
        return list;
    }

    public List<WebElement> getListOfWebElementsByXpath(String locator) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.xpath(locator));
        return list;
    }

    public String getCurrentPageUrl() {
        String url = driver.getCurrentUrl();
        return url;
    }

    public void navigateForward() {
        driver.navigate().forward();
    }

    public String getTextByCss(String locator) {
        String st = driver.findElement(By.cssSelector(locator)).getText();
        return st;
    }

    public String getTextByXpath(String locator) {
        String st = driver.findElement(By.xpath(locator)).getText();
        return st;
    }

    public String getTextById(String locator) {
        return driver.findElement(By.id(locator)).getText();
    }

    public String getTextByName(String locator) {
        String st = driver.findElement(By.name(locator)).getText();
        return st;
    }

    public List<String> getListOfString(List<WebElement> list) {
        List<String> items = new ArrayList<String>();
        for (WebElement element : list) {
            items.add(element.getText());
        }
        return items;
    }


    public void selectOptionByVisibleText(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public static void sleepFor(int sec) throws InterruptedException {
        Thread.sleep(sec * 1000);
    }

    public void mouseHoverByCSS(String locator) {
        try {
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            Actions hover = action.moveToElement(element);
        } catch (Exception ex) {
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        }
    }

    public void mouseHoverByXpath(String locator) {
        try {
            WebElement element = driver.findElement(By.xpath(locator));
            Actions action = new Actions(driver);
            Actions hover = action.moveToElement(element);
        } catch (Exception ex) {
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.xpath(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        }
    }

    //handling Alert
    public void okAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void cancelAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    //iFrame Handle
    public void iframeHandle(WebElement element) {
        driver.switchTo().frame(element);
    }

    public void goBackToHomeWindow() {
        driver.switchTo().defaultContent();
    }

    //get Links
    public void getLinks(String locator) {
        driver.findElement(By.linkText(locator)).findElement(By.tagName("a")).getText();
    }

    //Taking Screen shots
    public void takeScreenShot() throws IOException {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(file, new File("screenShots.png"));
    }

    //Synchronization
    public void waitUntilClickAble(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitUntilVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitUntilSelectable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        boolean element = wait.until(ExpectedConditions.elementToBeSelected(locator));
    }

    public void upLoadFile(String locator, String path) {
        driver.findElement(By.cssSelector(locator)).sendKeys(path);
        /* path example to upload a file/image
           path= "C:\\Users\\rrt\\Pictures\\ds1.png";
         */
    }

    public void clearInput(String locator) {
        driver.findElement(By.cssSelector(locator)).clear();
    }

    public void keysInput(String locator) {
        driver.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
    }

    //Handling New Tabs
    public static WebDriver handleNewTab(WebDriver driver1) {
        String oldTab = driver1.getWindowHandle();
        List<String> newTabs = new ArrayList<String>(driver1.getWindowHandles());
        newTabs.remove(oldTab);
        driver1.switchTo().window(newTabs.get(0));
        return driver1;
    }

    public static boolean isPopUpWindowDisplayed(WebDriver driver1, String locator) {
        boolean value = driver1.findElement(By.cssSelector(locator)).isDisplayed();
        return value;
    }

    public void typeOnInputBox(String locator, String value) {
        try {
            driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex1) {
            System.out.println("ID locator didn't work");
        }
        try {
            driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex2) {
            System.out.println("Name locator didn't work");
        }
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex3) {
            System.out.println("CSS locator didn't work");
        }
    }


    // Customer Made Helper Methods for Amex.com
    public void brokenLink() throws IOException {
        //Step:1-->Get the list of all the links and images
        List<WebElement> linkslist = driver.findElements(By.tagName("a"));
        linkslist.addAll(driver.findElements(By.tagName("img")));

        System.out.println("Total number of links and images--------->>> " + linkslist.size());

        List<WebElement> activeLinks = new ArrayList<WebElement>();
        //Step:2-->Iterate linksList: exclude all links/images which does not have any href attribute
        for (int i = 0; i < linkslist.size(); i++) {
            //System.out.println(linkslist.get(i).getAttribute("href"));
            if (linkslist.get(i).getAttribute("href") != null && (!linkslist.get(i).getAttribute("href").contains("javascript") && (!linkslist.get(i).getAttribute("href").contains("mailto")))) {
                activeLinks.add(linkslist.get(i));
            }
        }
        System.out.println("Total number of active links and images-------->>> " + activeLinks.size());

        //Step:3--> Check the href url, with http connection api
        for (int j = 0; j < activeLinks.size(); j++) {

            HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();

            connection.connect();
            String response = connection.getResponseMessage();
            connection.disconnect();
            System.out.println(activeLinks.get(j).getAttribute("href") + "--------->>> " + response);
        }
    }

    public void inputValueInTextBoxByWebElement(WebElement webElement, String value) {

        webElement.sendKeys(value + Keys.ENTER);

    }

    public void clearInputBox(WebElement webElement) {
        webElement.clear();
    }

    public String getTextByWebElement(WebElement webElement) {
        String text = webElement.getText();
        return text;
    }

    /**
     * Author:Gana
     * Description: Here a method that returns true if a new window is popo up false otherwise
     */
    public Boolean isAlive(WebDriver driver) {
        try {
            driver.getCurrentUrl();//or driver.getTitle();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @AfterMethod(alwaysRun = true)
    public static void closeBrowser() {
        driver.quit();
    }

}