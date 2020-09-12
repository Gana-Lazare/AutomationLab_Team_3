package ChaseHometest;

import chaseHome.ChaseHome;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChaseHometest extends WebAPI {

    ChaseHome chaseHome;
    @BeforeMethod
    public void getInit(){
        chaseHome= PageFactory.initElements(driver,ChaseHome.class);
        chaseHome.checkSideMenu();
        chaseHome.checkCarBuyingAndLoans();
        chaseHome.checkInvesting();

    }

    @Test
    public void testSideMenu(){
        chaseHome.checkSideMenu();

    }

    @Test
    public void testCarBuyingAndLoans(){
        chaseHome.checkCarBuyingAndLoans();

    }

    @Test
    public void testSimplifyManagingYourCar(){
        chaseHome.checkSimplifyManagingYourCar();

    }

    @Test
    public void testGetPreQualified(){
        chaseHome.checkGetPreQualified();

    }

    @Test
    public void testServiceYourAccount(){
        chaseHome.checkServiceYourAccount();

    }

    @Test
    public void testAutoLoans(){
        chaseHome.checkAutoLoans();

    }

    @Test
    public void testLearnMore(){
        chaseHome.checkLearnMore();

    }

    @Test
    public void testInvesting(){
        chaseHome.checkInvesting();

    }

    @Test
    public void testInvestingOverView(){
        chaseHome.checkInvestingOverView();

    }

    @Test
    public void testOnlineInvesting(){
        chaseHome.checkOnlineInvesting();

    }

    @Test
    public void testYouInvestTrade(){
        chaseHome.checkYouInvestTrade();

    }

    @Test
    public void testYouInvestPortfolios(){
        chaseHome.checkYouInvestPortfolios();

    }

    @Test
    public void testPricing(){
        chaseHome.checkPricing();

    }

    @Test
    public void testJPMorganAdvisor(){
        chaseHome.checkJPMorganAdvisor();

    }

    @Test
    public void testRetirement(){
        chaseHome.checkRetirement();

    }

    @Test
    public void testRetirementCheckLists(){
        chaseHome.checkRetirementCheckLists();

    }

    @Test
    public void testRetirementRollOver(){
        chaseHome.checkRetirementRollOver();

    }

    @Test
    public void testRetirementCalculator(){
        chaseHome.checkRetirementCalculator();

    }

    @Test
    public void testEducationSavings(){
        chaseHome.checkEducationSavings();

    }

    @Test
    public void testLearningAndInsights(){
        chaseHome.checkLearningAndInsights();

    }
    @Test
    public void testConnectWithAnAdvisor(){
        chaseHome.checkConnectWithAnAdvisor();

    }
    @Test
    public void testOpenAnAccount(){
        chaseHome.checkOpenAnAccount();

    }
}
