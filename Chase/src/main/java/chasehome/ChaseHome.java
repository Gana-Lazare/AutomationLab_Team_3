package chasehome;

import WebElements.HomePageWebElements;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChaseHome extends HomePageWebElements {

    @FindBy(xpath = chaseRadioButton_xpath)
    WebElement myButton;
    public void clickButtonMethod() throws InterruptedException {
        myButton.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath = chasePrivateClient_xpath)
    WebElement privateClient;
    public void privateClientMethod(){
        privateClient.click();
    }

    @FindBy(xpath = Banking_xpath)
    WebElement bankingButton;
    public void bankingMethod(){
        bankingButton.click();
    }


    @FindBy(xpath = letConnect_xpath)
    WebElement letConnectButton;
    public void letConnectMethod(){
        letConnectButton.click();
    }

    @FindBy(xpath = login_xpath)
    WebElement loginButton;
    public void loginMethod(){
        loginButton.click();
    }


    @FindBy(xpath = home_xpath)
    WebElement homeButton;
    public void homeMethod(){
        homeButton.click();
    }

    @FindBy(xpath = creditCardLending_xpath)
    WebElement creditCardLendingButton;
    public void creditCardLendingMethod(){
        creditCardLendingButton.click();
    }



    @FindBy(xpath = investingWithJP_xpath)
    WebElement investingWithJPButton;
    public void investingWithJPtMethod(){
        investingWithJPButton.click();
    }

    @FindBy(xpath = preparingForRetirement_xpath)
    WebElement preparingForRetirementButton;
    public void preparingForRetirementMethod(){
        preparingForRetirementButton.click();
    }


    @FindBy(xpath =planningForEducation_xpath)
    WebElement planningForEducationButton;
    public void planningForEducationMethod(){
        planningForEducationButton.click();
    }

    @FindBy(xpath = getInspired_xpath)
    WebElement getInspiredButton;
    public void getInspiredMethod(){
        getInspiredButton.click();
    }


    @FindBy(xpath = retirementCalculator_xpath)
    WebElement retirementCalculatorButton;
    public void retirementCalculatorMethod(){
        retirementCalculatorButton.click();
    }



    @FindBy(xpath = planningBenefits_xpath)
    WebElement planningBenefitsButton;
    public void planningBenefitstMethod(){
        planningBenefitsButton.click();
    }

    @FindBy(xpath = ourThinking_xpath)
    WebElement ourThinkingButton;
    public void ourThinkingMethod(){
        ourThinkingButton.click();
    }


    @FindBy(xpath =contactUs_xpath)
    WebElement contactUsButton;
    public void contactUsMethod(){
        contactUsButton.click();
    }

    @FindBy(xpath = contactsUs_xpath)
    WebElement contactsUsButton;
    public void contactsUsMethod(){
        contactsUsButton.click();
    }

    @FindBy(xpath = findBranch_xpath)
    WebElement findBranchButton;
    public void findBranchMethod(){
        findBranchButton.click();
    }


    @FindBy(xpath =clickHere_xpath)
    WebElement clickHereButton;
    public void clickHereMethod(){
        clickHereButton.click();
    }

    @FindBy(xpath = glimpsGoals_xpath)
    WebElement glimpsGoalsButton;
    public void glimpsGoalsMethod(){
        glimpsGoalsButton.click();
    }







































}