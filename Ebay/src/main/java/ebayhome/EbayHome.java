package ebayhome;
import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static ebayhome.ebayhomeWebElement.*;

public class EbayHome extends WebAPI{

    @FindBy(how = How.XPATH, using = AdvancedWebElement_xpath)
    public WebElement AdvancedButton;
    @FindBy(how = How.XPATH, using = advancedSearchTextArea_xpath)
    public WebElement adv_text;
    //Action
//CLICK ON advanced on th top right
  public void advancedButtonClick() {
     AdvancedButton.click();
  }
    //Assertion
//using the title of the page to assert the result
    public void assertAdvancedButtonClick() {
        String actualresult = getTextFrom(adv_text);
        String expectedresult = "Advanced Search";
        Assert.assertEquals(actualresult, expectedresult, "it's not advanced page");
    }

}



