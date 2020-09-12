package aetnahome;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static aetnahome.AetnaHomeWebElement.*;

public class AetnaHome extends WebAPI {




   public WebDriver driver;

    public void checkAetnaSites(){
        clickByXpath(exploreAetnaSites);

    }
    public void checkForProviders(){
       clickByXpath(forProviders);


    }
    public void checkFindAForm(){
        moveToElement(findAForm);
        clickByXpath(findAForm);


    }
//Action
    public void checkAddressPhoneNumberChange(){
        moveToElement("//*[@id=\"ui-accordion-accordion-6e3bb73b-1da5-42e9-b94d-c1ab7f023fcc/column1/accordion-header-0\"]/span");
        clickByXpath(addressPhoneNumberChange);
        clickByXpath("//*[@id=\"ui-accordion-accordion-6e3bb73b-1da5-42e9-b94d-c1ab7f023fcc/column1/accordion-panel-0\"]/div/div/div/p[2]/a");

    }
    @FindBy(how=How.XPATH,using = "//*[@id=\"en-content\"]/div/div/div/div[2]/b")
    public WebElement onlineDirectoryText;
    //Validation
    public void assertCheckAddressPhoneNumberChange(){
    String expectedResult="Request Changes to Provider Data";
    String actualResult=onlineDirectoryText.getText();
        Assert.assertEquals(actualResult,expectedResult,"Test Fail: ");
    }
    public void checkBehavioralHealthPreCertification(){
        moveToElement(behavioralHealthPreCertification);
        clickByXpath(behavioralHealthPreCertification);



    }
    public void checkCoordinationOfBenefits(){
        moveToElement(coordinationOfBenefits);
        clickByXpath(coordinationOfBenefits);


    }
    public void checkDisputeAndAppeals(){
        moveToElement(disputeAndAppeals);
        clickByXpath(disputeAndAppeals);


    }
    public void checkEmployeeAssistanceProgram(){
        moveToElement(employeeAssistanceProgram);
        clickByXpath(employeeAssistanceProgram);


    }
    public void checkMedicalPreCertification(){
        moveToElement(medicalPreCertification);
        clickByXpath(medicalPreCertification);


    }
    public void checkMedicare(){
        moveToElement(medicare);
        clickByXpath(medicare);


    }
    public void checkDrugAndPartB(){
        moveToElement(drugAndPartB);
        clickByXpath(drugAndPartB);


    }
    public void checkNationalProviderIdentifier(){
        moveToElement(nationalProviderIdentifier);
        clickByXpath(nationalProviderIdentifier);


    }
    public void checkNetworkApplicationRequests(){
        moveToElement(networkApplicationRequests);
        clickByXpath(networkApplicationRequests);


    }
    public void checkPatientSpecific(){
        moveToElement(patientSpecific);
        clickByXpath(patientSpecific);


    }
    public void checkPharmacy(){
        moveToElement(pharmacy);
        clickByXpath(pharmacy);


    }
    public void checkPhysicianCommunications(){
        moveToElement(physicianCommunications);
        clickByXpath(physicianCommunications);

    }
    public void checkProviderTermination(){
        moveToElement(providerTermination);
        clickByXpath(providerTermination);


    }
    public void checkSpecialityPharmacyMedications(){
        moveToElement(specialityPharmacyMedications);
        clickByXpath(specialityPharmacyMedications);


    }
    public void checkSpecialityPharmacyPreCertification(){
        moveToElement(specialityPharmacyPreCertification);
        clickByXpath(specialityPharmacyPreCertification);


    }
    public void checkStateSpecific(){
        moveToElement(stateSpecific);
        clickByXpath(stateSpecific);


    }

}
