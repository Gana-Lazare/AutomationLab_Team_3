package ebayCollectiblesArt;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static ebayCollectiblesArt.EbayCollectiblesWebElement.*;

public class EbayCollectibles extends WebAPI {

        @FindBy(how = How.XPATH,using = webElementCollectiblesButton_Xpath)public WebElement collectiblesButton;
        @FindBy(how = How.CSS, using = webElementText1) public WebElement text1;


        //@FindBy(how = How.XPATH,using = WebElementsearchbutton)
        //public WebElement searchButton;

        //Action
        public void collectiblesButtonCheck(){
            //searchBox.sendKeys("iphone11 pro max");
            collectiblesButton.click();
        }

        // Validate Method
        public void validateSearchText(){

            String actualResult=text1.getText();
            String expectedResult="Collectibles & Art";
            Assert.assertEquals(actualResult,expectedResult,"Text not match");
        }
}
