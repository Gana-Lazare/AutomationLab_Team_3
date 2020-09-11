package foxnewsHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static foxnewsHome.FoxNewsHomeWebElement.*;

public class WatchTv extends WebAPI {
    public static WebElement webElement;



    @FindBy(how = How.XPATH, using = watchTvWebElement)
    public WebElement watchtv;
    @FindBy(how = How.XPATH,using = watchtvPagevalidation)
    public WebElement valid_watchtv;
    public void watchtv() {
        clickWebElement(watchtv);
    }
    public void watchtv_validation(){
        String expectedresult="Watch Live";
        String actualresult= valid_watchtv.getText();
        System.out.println(actualresult);
    }
    //HomePage Button
    @FindBy(how = How.XPATH,using = foxNewsHomeButtonWebElement)
    public WebElement foxNewsHomeButton;
    //Action
    public void foxNewshomeButton_Watchtv(){
        foxNewsHomeButton.click();
    }
    //Assertion

    //Business FoxNews
    @FindBy(how = How.XPATH,using = foxNewsBusinessWebElement)
    public WebElement  foxNewsBusiness;
    //Action
    public void foxnewsBusiness(){
        foxNewsBusiness.click();
    }
    //RadioFoxNews
    @FindBy(how = How.XPATH,using = foxNewsRadioWebElement)
    public WebElement  foxNewsRadio;
    //Action
    public void foxNewsRadio(){
        foxNewsBusiness.click();
    }
    //Assertion



}
