package ebayElectronics;
import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static ebayElectronics.EbayElectronicsWebElement.*;

public class EbayElectronics extends WebAPI{
    @FindBy(how = How.XPATH,using = webElementElectronicsButton_Xpath)public WebElement electronicsButton;
    @FindBy(how = How.CSS, using = webElementText) public WebElement text;


    //Action
    public void electronicsButtonCheck(){
          electronicsButton.click();
    }

    // Validate Method
    public void validateSearchText(){

        String actualResult=text.getText();
        String expectedResult="Electroncs";
        Assert.assertEquals(actualResult,expectedResult,"Text not match");
    }

}


