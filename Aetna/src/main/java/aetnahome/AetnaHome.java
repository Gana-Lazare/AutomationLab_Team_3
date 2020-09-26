package aetnahome;

import common.WebAPI;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static aetnahome.AetnaWebElements.*;
import static org.junit.Assert.assertEquals;


public class AetnaHome extends WebAPI {

    @FindBy(xpath = searchButton_xpath)
    WebElement searchButton;
    public void searchBox() throws InterruptedException {
        searchButton.sendKeys("provider");
        searchButton.click();
        Thread.sleep(3000);
    }
    public  void checkForPartners(){
        driver.findElement(By.xpath(forPartners_xpath)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @FindBy(xpath = dropDown_xpath)
    WebElement dropDown;
    public void dropDown() throws InterruptedException {
        dropDown.click();
        Thread.sleep(3000);

    }

    @FindBy(xpath =forAgentsBrokers_xpath)
    WebElement forAgentsBrokers;
    public void forAgentsBrokers() throws InterruptedException {
        dropDown();
        forAgentsBrokers.click();

    }

    @FindBy(xpath =forPartners_xpath)
    WebElement forPartners;
    public void forPartners() throws InterruptedException {
        dropDown();
        forPartners.click();

    }

    @FindBy(css = loginButton_xpath)
    WebElement loginButton;
    public void loginButton() throws InterruptedException {
        loginButton.click();

    }

    @FindBy(how = How.XPATH, using = loginButton_xpath)
    WebElement loginButton1;
    public void loginButton1() throws InterruptedException {
        AetnaExploreSite.click();
        Thread.sleep(3000);
        //searchBox.sendKeys(searchItem);
        loginButton1.click();
        Thread.sleep(3000);
    }

    @FindBy(xpath = aetnaExploreSite_xpath)
    WebElement AetnaExploreSite;
    public void AetnaExploreSite() throws InterruptedException {
        sleepFor(3);
        AetnaExploreSite.click();
        //Thread.sleep(5000);
    }

    @FindBy(xpath = siteMap_xpath)
    WebElement siteMap;
    public void siteMap() throws InterruptedException {
        JavascriptExecutor myExecutor = (JavascriptExecutor) driver;
        myExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        siteMap.click();
    }
    public static void screenShotWindows() throws IOException {
        TakesScreenshot myShot = (TakesScreenshot) driver;
        File sourceOfFile = myShot.getScreenshotAs(OutputType.FILE);
        File fileName = new File(System.getProperty("User.dir") + "/Screenshots/" + "foxNewsScreenShots.png");
        FileUtils.copyFile(sourceOfFile, fileName);
        System.out.println("Screenshot 1 captured");

    }

    @FindBy(xpath = solution_xpath)
    WebElement solution;
    public void solution() throws InterruptedException {
        AetnaExploreSite();
        forAgentsBrokers();

        Thread.sleep(5000);
        solution.click();
    }

    @FindBy(how = How.XPATH,using = getCoronVirus_xpath)
    public WebElement getCoronVirus;
    public void getCoronVirusMethod(){
        getCoronVirus.click();

    }

    public void pageLoadingValidation(){
        String expectedTitle="Health Insurance Products for Agents &amp; Brokers | Aetna";
        String actualTitle= driver.getTitle().toString();
        assertEquals("The page failed to load",actualTitle,expectedTitle);
    }
    public void openBrowser() throws IOException {
        setUp(false,"browserstack","OS X","catalina","chrome","85","https://www.aetna.com");
    }
    public void verifyPageTitle( String st) {
        String actualTitle = driver.getTitle();
        String expectedTitle = st;
        assertEquals(expectedTitle, actualTitle);
        //assertTrue(driver.getTitle().contains("Title of Page"));
    }
    @FindBy(xpath = WebElementAetnaCom)
    WebElement aetnaCom;
    public void aetnaCom(){
        aetnaCom.click();
    }
    @FindBy(xpath = WebElementForProvider)
    WebElement forProvider;
    public void forProviderMethod(){
        forProvider.click();

    }
    @FindBy(xpath = WebElementForEmployer)
    WebElement forEmployer;
    public void forEmployerMethod(){
        forEmployer.click();
    }@FindBy(xpath = WebElementForAgent)
    WebElement forAgent;
    public void forAgentMethod(){
        forAgent.click();
    }



}
