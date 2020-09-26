package verizonhome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static verizonhome.VerizonWebElement.*;

public class VerizonHome extends WebAPI {

    String expectedResult;

    @FindBy(how = How.XPATH, using = webElementShopButton)
    public WebElement ShopButton;
    @FindBy(how = How.XPATH, using = webElementShopText)
    public WebElement ShopButtonText;


    public void ShopButtonCheck() {
        ShopButton.click();
    }


    public void validateShopButtonText() {
        String actualResult = ShopButtonText.getText();
        expectedResult = "Deals";
        Assert.assertEquals(actualResult, expectedResult, "Search Title not match");
    }
}
