package chaseHome;

import common.WebAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static chaseHome.ChaseHomeWebElement.*;

public class ChaseHome extends WebAPI {

    public WebDriver driver;

    public void checkSideMenu(){
        clickByXpath(sideMenu);

    }
    public void checkCarBuyingAndLoans(){
        moveToElement(carBuyingAndLoans);
        clickByXpath(carBuyingAndLoans);


    }
    public void checkSimplifyManagingYourCar(){
        clickByXpath(simplifyManagingYourCar);


    }

    public void checkGetPreQualified(){
        clickByXpath(getPreQualified);

    }

    public void checkServiceYourAccount(){
        clickByXpath(serviceYourAccount);



    }
    public void checkAutoLoans(){
        clickByXpath(autoLoans);


    }
    public void checkLearnMore(){
        clickByXpath(learnMore);


    }
    public void checkInvesting(){
        moveToElement(investing);
        clickByXpath(investing);


    }
    public void checkInvestingOverView(){
        moveToElement(investingOverView);
        clickByXpath(investingOverView);


    }
    public void checkOnlineInvesting(){
        moveToElement(onlineInvesting);
        clickByXpath(onlineInvesting);


    }
    public void checkYouInvestTrade(){
        moveToElement(youInvestTrade);
        clickByXpath(youInvestTrade);


    }
    public void checkYouInvestPortfolios(){
        moveToElement(youInvestPortfolios);
        clickByXpath(youInvestPortfolios);


    }
    public void checkPricing(){
        moveToElement(pricing);
        clickByXpath(pricing);


    }
    public void checkJPMorganAdvisor(){
        moveToElement(JPMorganAdvisor);
        clickByXpath(JPMorganAdvisor);


    }
    public void checkRetirement(){
        moveToElement(retirement);
        clickByXpath(retirement);


    }
    public void checkRetirementCheckLists(){
        moveToElement(retirementCheckLists);
        clickByXpath(retirementCheckLists);

    }
    public void checkRetirementRollOver(){
        moveToElement(retirementRollOver);
        clickByXpath(retirementRollOver);


    }
    public void checkRetirementCalculator(){
        moveToElement(retirementCalculator);
        clickByXpath(retirementCalculator);


    }
    public void checkEducationSavings(){
        moveToElement(educationSavings);
        clickByXpath(educationSavings);


    }
    public void checkLearningAndInsights(){
        moveToElement(learningAndInsights);
        clickByXpath(learningAndInsights);


    }
    public void checkConnectWithAnAdvisor(){
        moveToElement(connectWithAnAdvisor);
        clickByXpath(connectWithAnAdvisor);


    }
    public void checkOpenAnAccount(){
        moveToElement(openAnAccount);
        clickByXpath(openAnAccount);


    }





}
