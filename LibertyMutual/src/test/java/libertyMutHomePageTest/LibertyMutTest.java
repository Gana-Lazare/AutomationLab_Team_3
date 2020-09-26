package libertyMutHomePageTest;

import common.WebAPI;
import libertyMutualHome.LibertyMutualHome;
//import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LibertyMutTest extends WebAPI {

    LibertyMutualHome libertyMutualHome;

    @BeforeMethod
    public void getInit() {
        libertyMutualHome = PageFactory.initElements(driver, LibertyMutualHome.class);

    }


    @Test
    public void libertyMutualInsuranceTest() {
        libertyMutualHome.libertyMutualInsuranceMethod();
    }

    @Test
    public void businessInsuranceTest() throws InterruptedException {
        libertyMutualHome.libertyMutualInsuranceMethod();
        sleepFor(3);
    }


    @Test
    public void verifyPageTitleTest() throws InterruptedException {
        libertyMutualHome.businessInsuranceMethod();
        sleepFor(3);
        libertyMutualHome.verifyPageTitle();
    }

    @Test
    public void coverageTest() throws InterruptedException {
        libertyMutualHome.businessInsuranceMethod();
        libertyMutualHome.coverageMethod();
        sleepFor(3);
    }

    @Test
    public void searchTestTest() throws InterruptedException {
        libertyMutualHome.businessInsuranceMethod();
        libertyMutualHome.searchTextMethod();
    }

    @Test
    public void aboutLibertyMutualTest() throws InterruptedException {
        libertyMutualHome.businessInsuranceMethod();
        libertyMutualHome.aboutLibertyMutualMethod();
    }

    @Test
    public void industriesTest() throws InterruptedException {
        libertyMutualHome.businessInsuranceMethod();
        libertyMutualHome.industriesMethod();
    }

    @Test
    public void claimsTest() throws InterruptedException {
        libertyMutualHome.businessInsuranceMethod();
        libertyMutualHome.claimsMethod();
    }

    @Test
    public void servicesMeTest() throws InterruptedException {
        libertyMutualHome.businessInsuranceMethod();
        libertyMutualHome.servicesMethod();
    }

    @Test
    public void businessSizeTest() throws InterruptedException {
        libertyMutualHome.businessInsuranceMethod();
        sleepFor(2);
        libertyMutualHome.businessSizeMethod();
    }
    @Test
    public void verifyPolicyPageTitleTest() throws InterruptedException {
        libertyMutualHome.businessInsuranceMethod();
        libertyMutualHome.searchTextMethod();
        sleepFor(5);
        libertyMutualHome.verifyPolicyPageTitle();
    }@Test
    public void verifyBusinessInsurancePageTest() throws InterruptedException {
        libertyMutualHome.businessInsuranceMethod();
        libertyMutualHome.verifyBusinessInsurancePageTitle();
    }@Test
    public void verifyCoveragePageTest() throws InterruptedException {
        libertyMutualHome.businessInsuranceMethod();
        sleepFor(5);
        libertyMutualHome.verifyCoveragePageTitle();
    }@Test
    public void verifyIndustriesPageTest() throws InterruptedException {
        libertyMutualHome.businessInsuranceMethod();
        sleepFor(5);
        libertyMutualHome.verifyIndustriesPageTitle();
    }@Test
    public void verifyClaimPageTest() throws InterruptedException {
        libertyMutualHome.businessInsuranceMethod();
        sleepFor(5);
        libertyMutualHome.verifyClaimPageTitle();
    }@Test
    public void verifyServicesPageTest() throws InterruptedException {
        libertyMutualHome.businessInsuranceMethod();
        sleepFor(5);
        libertyMutualHome.verifyServicesPageTitle();
    }@Test
    public void verifyBusinessSizePageTest() throws InterruptedException {
        libertyMutualHome.businessInsuranceMethod();
        sleepFor(5);
        libertyMutualHome.verifyBusinessSizePageTitle();
    }@Test
    public void validateImageTest() throws InterruptedException {
        libertyMutualHome.businessInsuranceMethod();
        libertyMutualHome.validateImage();
    }@Test
    public void validateImageVisibleTest() throws InterruptedException {
        libertyMutualHome.businessInsuranceMethod();
        libertyMutualHome.validateImageVisible();
    }


}
