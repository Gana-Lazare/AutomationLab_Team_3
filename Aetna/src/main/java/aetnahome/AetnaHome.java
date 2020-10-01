package aetnahome;
import common.WebAPI;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import static aetnahome.AetnaWebElement.*;

public class AetnaHome extends WebAPI {
//    AetnaHome aetnaHome;
//    @BeforeMethod
//    public void getInit(){
//        aetnaHome= PageFactory.initElements(driver,AetnaHome.class);
//    }


    @FindBy(xpath = exploreAetnaSites_xpath)
    WebElement exploreAetnaSites;

    public void exploreAetnaSites() throws InterruptedException {
        exploreAetnaSites.click();
        Thread.sleep(5000);

    }

    @FindBy(xpath = aboutUs_xpath)
    WebElement aboutUs;

    public void aboutUs() {
        aboutUs.click();
    }


    @FindBy
            (xpath = login_xpath)
    WebElement login;

    public void login() {
        login.click();
    }
    @FindBy(xpath = listAppears_xpath)
    WebElement listAppears;
    public void listAppears(){
        listAppears.isDisplayed();

    }
//    @FindBy(xpath = siteMap_xpath)
//    WebElement siteMap;
//    public void siteMap() throws InterruptedException {
//        JavascriptExecutor myExecutor = (JavascriptExecutor) driver;
//        myExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//        Thread.sleep(3000);
//        siteMap.click();
//    }

//    public static void screenShotWindows() throws IOException {
//        TakesScreenshot myShot = (TakesScreenshot) driver;
//        File sourceOfFile = myShot.getScreenshotAs(OutputType.FILE);
//        File fileName = new File(System.getProperty("User.dir") + "/Screenshots/" + "foxNewsScreenShots.png");
//        FileUtils.copyFile(sourceOfFile, fileName);
//        System.out.println("Screenshot 1 captured");
//}


//    @FindBy(how = How.XPATH, using = coronaVirusButton_xpath)
//    WebElement coronaVirusButton;
//    public void coronaVirusButton() throws InterruptedException {
//        entertainment.click();
//        Thread.sleep(3000);
//        //searchBox.sendKeys(searchItem);
//        coronaVirusButton.click();
//        Thread.sleep(3000);
//    }


    @FindBy(xpath = register_xpath)
    WebElement register;

    public void register() {
        register.click();
    }


































}
