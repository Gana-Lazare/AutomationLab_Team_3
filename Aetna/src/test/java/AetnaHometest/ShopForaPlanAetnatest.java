package AetnaHometest;

import aetnahome.ShopForaPlanAetna;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShopForaPlanAetnatest extends WebAPI {
    ShopForaPlanAetna shopForaPlanAetna;

    @BeforeMethod // to use the driver to open the browser
    public void getInit() {
        shopForaPlanAetna = PageFactory.initElements(driver, ShopForaPlanAetna.class);
        shopForaPlanAetna.shopforPlan(); // to not repeat cliking on shop for plando inside before
        // registrationPage = PageFactory.initElements(driver,SignUpPage.class);
    }
@Test
    public void testsearchBoxCheckUsingGetItemValue() throws InterruptedException {

        shopForaPlanAetna.searchBoxCheckUsingGetItemValue();
    }
@Test
    public void browseAetna() throws InterruptedException ,NullPointerException {
        shopForaPlanAetna.medicare();
        Thread.sleep(3000);
       // shopForaPlanAetna.assertMedicare();
}
@Test
    public void findDoctortest() throws  InterruptedException{
        shopForaPlanAetna.findDoctor();
       // shopForaPlanAetna.assertFindDoctor();
}
@Test
    public void checkdrugListest() throws InterruptedException{
        shopForaPlanAetna.checkDrugList();
}
@Test
public void understanMedicaretest() throws InterruptedException {
    shopForaPlanAetna.understanMedicare();
}
@Test
public void findAPlanMeetYourNeedtest() throws  InterruptedException {
    shopForaPlanAetna.findAPlanMeetYourNeed();
}
@Test
public void enrollInMedicaretest() throws InterruptedException{
  shopForaPlanAetna.enrollInMedicare();
}
@Test
public void viewAllPlanstest()throws InterruptedException{
        enrollInMedicaretest();
        shopForaPlanAetna.viewAllPlans();
}
@Test
public void getstartedtest() throws InterruptedException{
        enrollInMedicaretest();
        shopForaPlanAetna.getstarted();
}
@Test
public void increaseTexttest() throws InterruptedException{
        enrollInMedicaretest();
        shopForaPlanAetna.increaseText();
}
@Test
public void planThroughEmployertest() throws InterruptedException{
    shopForaPlanAetna.planThroughEmployer();
}
@Test
public  void studentsPlantest() throws InterruptedException {
  shopForaPlanAetna.studentsPlan();
}
@Test
public void internationnalPlantest() throws  InterruptedException{
   shopForaPlanAetna.internationnalPlan();
}
@Test
public void findADoctortest() throws InterruptedException {
   shopForaPlanAetna.findADoctor();
}

@Test
public void dentalPlanstest() throws InterruptedException{
    shopForaPlanAetna.dentalPlans();
}
@Test
public void findAdentisttest() throws InterruptedException{
   shopForaPlanAetna.findAdentist();
}
@Test
public void visioPlanstest() throws InterruptedException{
    shopForaPlanAetna.visioPlans();
}
@Test
public void findAnEyeDoctortest() throws InterruptedException{
    shopForaPlanAetna.findAnEyeDoctor();
}
@Test
public void supplementalPlanstest() throws InterruptedException{
    shopForaPlanAetna.supplementalPlans();
}

@Test
public void medicaidPlanstest() throws InterruptedException{
    shopForaPlanAetna.medicaidPlans();
}
@Test
public void medicaidFindDoctortest() throws InterruptedException{
    shopForaPlanAetna.medicaidFindDoctor();
}

@Test
public void pharmacyPlanInformationtest() throws InterruptedException{
    shopForaPlanAetna.pharmacyPlanInformation();
}
@Test
public void findApharmacytest() throws InterruptedException{
    shopForaPlanAetna.findApharmacy();
}
@Test
public void findMedecineAndCosstest() throws InterruptedException{
    shopForaPlanAetna.findMedecineAndCoss();
}
}
