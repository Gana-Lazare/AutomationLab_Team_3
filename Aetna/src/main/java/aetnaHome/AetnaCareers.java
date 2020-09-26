package aetnaHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static aetnaHome.AetnaCareersWebElement.*;

public class AetnaCareers extends WebAPI {

    @FindBy(how = How.XPATH,using = webElementCareersButton_Xpath)public WebElement careersButton;
    @FindBy(how = How.XPATH, using = webElementCareersText) public WebElement careersText;

    public void careersButtonCheck(){
        careersButton.click();
    }


    public void validateCareersTextText() {
        String actualResult = careersText.getText();
        String expectedResult = "Career Areas";
        Assert.assertEquals(actualResult, expectedResult, "Text not Match");
    }
}
