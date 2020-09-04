package aetnahome;

import common.WebAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static aetnahome.ShopForaPlanAetnaWebElement.*;

public class ShopForaPlanAetna extends WebAPI {

    public static WebDriver driver;

    @FindBy(how = How.XPATH,using = shopForAPlanWebElement)
    public WebElement ShopForAPlan;
    //Assertion
    public void shopforPlan(){
       clickWebElement(ShopForAPlan);
    }
    //looking for browser Aetna Medicare Plan
    // click on shop for a pla
    // mousse hover on medicare
    // click on browser Aetna Medicare

@FindBy(how = How.XPATH,using = medicareWebElement)
public WebElement medicare;
    @FindBy(how = How.XPATH,using = browseAetnaMedicarePlanWebElement)
    public WebElement browseAetna;
    //Action
    public void medicare() throws InterruptedException {
        mouseHover(medicare,browseAetna);
    }
    //Assertion
    public void assertMedicare(){
String expectedresult=browseAetnaURL;
//String actualresult=driver.getCurrentUrl();
       // Assert.assertEquals(actualresult,expectedresult,"this is not browse Aetna Plan Url");
      //  System.out.println(actualresult);
    }

    @FindBy(how = How.XPATH,using = findDoctorWebElement)
    public WebElement findDoctor;
    //Action
    public void findDoctor() throws InterruptedException {
        mouseHover(medicare,findDoctor);
    }
    //Assertion
    public void assertFindDoctor(){
        String expectedresult="Find Aetna Medicare Health Care Professionals";
        String actualresult=getTextByXpath(findDoctorText);
        Assert.assertEquals(actualresult,expectedresult,"not same page");
    }

    @FindBy(how = How.XPATH,using = checkOnOurDrugListWebElement)
    public WebElement drugList;
    //Action
    public void checkDrugList() throws InterruptedException {
        mouseHover(medicare,drugList);
    }
    //Assertion

    @FindBy(how = How.XPATH,using = understandMedicareWebElement)
    public WebElement understandMedicare;
    //Action
    public void understanMedicare() throws InterruptedException {
        mouseHover(medicare,understandMedicare);
    }
    //Assertion

    @FindBy(how = How.XPATH,using = findPlanToMeetYourNeedWebElement)
    public WebElement findPlanNeed;
    //Action
    public void findAPlanMeetYourNeed() throws  InterruptedException {
        mouseHover(medicare,findPlanNeed);
    }
    //Assertion

    @FindBy(how = How.XPATH,using = supplementalPlanWebElement)
    public WebElement supplementalPlan;
    //Action
    public void supplementalPlan() throws InterruptedException{
        mouseHover(medicare,supplementalPlan);
    }
    //Assertion

    //****
    @FindBy(how = How.XPATH,using = healthConverageWebElement)
    public WebElement healthCoverage;


    @FindBy(how = How.XPATH,using = planThroughtEmployerWebElement)
    public WebElement planThroughEmployer;
    //Action
    public void planThroughEmployer() throws InterruptedException{
        mouseHover(healthCoverage,planThroughEmployer);
    }
    //Assertion

    @FindBy(how = How.XPATH,using = studentsPlanWebElement)
    public WebElement studentsPlan;
    //Action
    public  void studentsPlan() throws InterruptedException {
        mouseHover(healthCoverage,studentsPlan);
    }
    //Assertion

    @FindBy(how = How.XPATH,using = internationalPlanWebElement)
    public WebElement internationnalPlan;
    //Action
    public void internationnalPlan() throws  InterruptedException{
        mouseHover(healthCoverage,internationnalPlan);
    }
    //Assertion

    @FindBy(how = How.XPATH,using = findADoctorWebElement)
    public WebElement findADoctor;
    //Action
    public void findADoctor() throws InterruptedException{
        mouseHover(healthCoverage,findDoctor);
    }




}
