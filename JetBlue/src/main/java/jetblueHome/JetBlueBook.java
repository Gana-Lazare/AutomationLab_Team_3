package jetblueHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import static jetblueHome.JetBlueBookWebElement.*;

public class JetBlueBook extends WebAPI {

    @FindBy(how = How.XPATH,using = webElementBookButton_Xpath)public WebElement bookButton;
    @FindBy(how = How.XPATH, using = webElementText) public WebElement text;

    @FindBy(how = How.XPATH,using = webElementFlightsButton_Xpath)public WebElement FlightsButton;
    @FindBy(how = How.XPATH, using = webElementFlightsText) public WebElement FlightsText;

    @FindBy(how = How.XPATH,using = webElementWhereToButton_Xpath)public WebElement WhereToBox;
    @FindBy(how = How.XPATH,using = webElementDepartSelectDate_Xpath)public WebElement DepartSelectDateBox;
    @FindBy(how = How.XPATH,using = webElementReturnSelectDate_Xpath)public WebElement ReturnSelectDateBox;
    @FindBy(how = How.XPATH,using = webElementSearchFlightsButton_Xpath)public WebElement SearchFlightsButton;
    @FindBy(how = How.XPATH, using = webElementFlightsStatusText) public WebElement StatusText;



//    @FindBy(how = How.XPATH,using = webElementBookButton_Xpath)public WebElement FlightsButton;
//    @FindBy(how = How.XPATH, using = webElementText) public WebElement FlightsText;
//
//    @FindBy(how = How.XPATH,using = webElementBookButton_Xpath)public WebElement FlightsButton;
//    @FindBy(how = How.XPATH, using = webElementText) public WebElement FlightsText;
//    @FindBy(how = How.XPATH,using = webElementBookButton_Xpath)public WebElement FlightsButton;
//    @FindBy(how = How.XPATH, using = webElementText) public WebElement FlightsText;
//
//    @FindBy(how = How.XPATH,using = webElementBookButton_Xpath)public WebElement FlightsButton;
//    @FindBy(how = How.XPATH, using = webElementText) public WebElement FlightsText;
//
//    @FindBy(how = How.XPATH,using = webElementBookButton_Xpath)public WebElement FlightsButton;
//    @FindBy(how = How.XPATH, using = webElementText) public WebElement FlightsText;
//
//    @FindBy(how = How.XPATH,using = webElementBookButton_Xpath)public WebElement FlightsButton;
//    @FindBy(how = How.XPATH, using = webElementText) public WebElement FlightsText;
//
//    @FindBy(how = How.XPATH,using = webElementBookButton_Xpath)public WebElement FlightsButton;
//    @FindBy(how = How.XPATH, using = webElementText) public WebElement FlightsText;





    //Action
    public void bookButtonCheck(){
        bookButton.click();
    }

    // Validate Method
    public void validateBookText() {

        String actualResult = text.getText();
        String expectedResult = "Flights";
        Assert.assertEquals(actualResult, expectedResult, "Text not match");
    }


    public void flightsButtonCheck(){
        bookButton.click();
        FlightsButton.click();
    }

    // Validate Method
    public void validateFlightsText() {

        String actualResult = FlightsText.getText();
        String expectedResult = "Search flights";
        Assert.assertEquals(actualResult, expectedResult, "Text not match");
    }


    public void ReservationCheck(){
        bookButton.click();
        FlightsButton.click();
        WhereToBox.click();
        WhereToBox.sendKeys("Miami");
        DepartSelectDateBox.sendKeys("Mon Sep 28");
        ReturnSelectDateBox.sendKeys("Wed Sep 30");
        SearchFlightsButton.click();

    }

    // Validate Method
    public void validateReservationText() {

        String actualResult = StatusText.getText();
        String expectedResult = "New York area, NY (NYC) to Miami area, FL";
        Assert.assertEquals(actualResult, expectedResult, "Text not match");
    }




}
