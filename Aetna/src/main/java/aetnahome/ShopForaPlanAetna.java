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
   /* public void assertMedicare(){
String expectedresult=browseAetnaURL;
String actualresult=driver.getCurrentUrl();
      Assert.assertEquals(actualresult,expectedresult,"this is not browse Aetna Plan Url");
       System.out.println(actualresult);
    }*/

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

    @FindBy(how = How.XPATH,using = EnrollInMedicareWebElement)
    public WebElement EnrollInMedicare;
    //Action
    public void enrollInMedicare() throws InterruptedException{
        mouseHover(medicare,EnrollInMedicare);
    }
    //Assertion

    @FindBy(how = How.XPATH,using = viewAllPlans_medicareWebElement)
    public WebElement viewAllPlans;
    //Action
    public void viewAllPlans() throws InterruptedException{
        scrollIntoViewElement(viewAllPlans);
        clickWebElement(viewAllPlans);
    }
    //Assertion
    @FindBy(how = How.XPATH,using = getStarted_mediareWebElement)
    public WebElement getstarted;
    //Action
    public void getstarted() throws InterruptedException{
        scrollIntoViewElement(viewAllPlans);
        clickWebElement(getstarted);
    }
    //Assertion
    @FindBy(how = How.XPATH,using = increaseTest_medicareWebElement)
    public WebElement increaseText;
    //Action
    public void increaseText() throws InterruptedException{

        clickWebElement(increaseText);
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
    //****
    @FindBy(how = How.XPATH,using = dentalVisionAndSupplementationWebElement)
    public WebElement dentalVisionAndSupplementation;

    @FindBy(how = How.XPATH,using = dentalPlansWebElement)
    public WebElement dentalPlans;
    //Action
    public void dentalPlans() throws InterruptedException{
        mouseHover(dentalVisionAndSupplementation,dentalPlans);
    }
    //Assertion

    @FindBy(how = How.XPATH,using = findADentistWebElement)
    public WebElement findDentist;
    //Action
    public void findAdentist() throws InterruptedException{
        mouseHover(dentalVisionAndSupplementation,findDentist);
    }
    //Assertion

    @FindBy(how = How.XPATH,using = visioPlansWebElement)
    public WebElement visioplans;
    //Action
    public void visioPlans() throws InterruptedException{
        mouseHover(dentalVisionAndSupplementation, visioplans);
    }
    //Assertion

    @FindBy(how = How.XPATH,using = findAnEyeDoctorWebElement )
    public WebElement findanEyeDoctor;
    //Action
    public void findAnEyeDoctor() throws InterruptedException{
        mouseHover(dentalVisionAndSupplementation, findanEyeDoctor);
    }
    //Assertion

    @FindBy(how = How.XPATH,using =findMedecineAndCostsWebElement)
    public WebElement findMedecineAndCosts;
    //Action
    public void findMedecineAndCoss() throws InterruptedException{
        mouseHover(dentalVisionAndSupplementation,findMedecineAndCosts);
    }
    //Assertion


    @FindBy(how = How.XPATH,using =supplementalPlansWebElement)
    public WebElement supplementalplans;
    //Action
    public void supplementalPlans() throws InterruptedException{
        mouseHover(dentalVisionAndSupplementation, supplementalplans);
    }
    //Assertion


    @FindBy(how = How.XPATH,using =pharmacyWebElement)
    public WebElement pharmacy;

    @FindBy(how = How.XPATH,using =pharmacyPlanInformationWebElement)
    public WebElement pharmacyplanInformation;
    //Action
    public void pharmacyPlanInformation() throws InterruptedException{
        mouseHover(pharmacy, pharmacyplanInformation);
    }
    //Assertion

    @FindBy(how = How.XPATH,using =findAPharmacyWebElement)
    public WebElement findApharmacy;
    //Action
    public void findApharmacy() throws InterruptedException{
        mouseHover(pharmacy, findApharmacy);
    }
    //Assertion

    @FindBy(how = How.XPATH,using =medicaidWebElement)
    public WebElement medicaid;
    @FindBy(how = How.XPATH,using =medicaidPlansWebElement)
    public WebElement medicaidPlans;
    //Action
    public void medicaidPlans() throws InterruptedException{
        mouseHover(medicaid, medicaidPlans);
    }
    //Assertion

    @FindBy(how = How.XPATH,using =medicaidFindADoctorWebElement)
    public WebElement medicaidDoctor;
    //Action
    public void medicaidFindDoctor() throws InterruptedException{
        mouseHover(medicaid, medicaidDoctor);
    }
    //Assertion


}
