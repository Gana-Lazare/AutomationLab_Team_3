package AetnaHometest;

import aetnahome.AetnaHome;
import common.WebAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AetnaHometest extends WebAPI {

    AetnaHome aetnaHome;
    @BeforeMethod
   public void getInit(){
        aetnaHome=PageFactory.initElements(driver,AetnaHome.class);
        aetnaHome.checkAetnaSites();
        aetnaHome.checkForProviders();
        aetnaHome.checkFindAForm();
    }

    @Test
    public void testAetnaSites(){
        aetnaHome.checkAetnaSites();

    }

    @Test
    public void testForProviders(){
        aetnaHome.checkForProviders();

    }

    @Test
    public void testFindAForm(){
        aetnaHome.checkFindAForm();

    }

    @Test
    public void testAddressPhoneNumberChange(){
        aetnaHome.checkAddressPhoneNumberChange();
        aetnaHome.assertCheckAddressPhoneNumberChange();
    }

    @Test
    public void testBehavioralHealthPreCertification(){
        aetnaHome.checkBehavioralHealthPreCertification();

    }

    @Test
    public void testCoordinationOfBenefits(){
       aetnaHome.checkCoordinationOfBenefits();

    }

    @Test
    public void testDisputeAndAppeals(){
        aetnaHome.checkDisputeAndAppeals();

    }

    @Test
    public void testEmployeeAssistanceProgram(){
        aetnaHome.checkEmployeeAssistanceProgram();

    }

    @Test
    public void testMedicalPreCertification(){
        aetnaHome.checkMedicalPreCertification();

    }

    @Test
    public void testMedicare(){
        aetnaHome.checkMedicare();

    }

    @Test
    public void testDrugAndPartB(){
        aetnaHome.checkDrugAndPartB();

    }

    @Test
    public void testNationalProviderIdentifier(){
        aetnaHome.checkNationalProviderIdentifier();

    }

    @Test
    public void testNetworkApplicationRequests(){
        aetnaHome.checkNetworkApplicationRequests();

    }

    @Test
    public void testPatientSpecific(){
        aetnaHome.checkPatientSpecific();

    }

    @Test
    public void testPharmacy(){
        aetnaHome.checkPharmacy();

    }

    @Test
    public void testPhysicianCommunications(){
        aetnaHome.checkPhysicianCommunications();

    }

    @Test
    public void testProviderTermination(){
        aetnaHome.checkProviderTermination();

    }

    @Test
    public void testSpecialityPharmacyMedications(){
        aetnaHome.checkSpecialityPharmacyMedications();

    }

    @Test
    public void testSpecialityPharmacyPreCertification(){
        aetnaHome.checkSpecialityPharmacyPreCertification();

    }

    @Test
    public void testStateSpecific(){
        aetnaHome.checkStateSpecific();

    }
}
