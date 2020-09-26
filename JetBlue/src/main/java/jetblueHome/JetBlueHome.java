package jetblueHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import static jetblueHome.JetBlueWebElements.*;

public class JetBlueHome extends WebAPI {

    @BeforeMethod
    public void openBrowser() throws IOException {
        setUp(false, "browserstack", "OS X", "catalina", "chrome", "85", "https://www.jetblue.com");
    }


    @FindBy(xpath = WebElementTrueBlue)
    WebElement trueBlue;
    public void trueBlueMethod(){
        trueBlue.click();
    }@FindBy(xpath = WebElementReasonsToJoin)
    WebElement reasonsToJoin;
    public void reasonsToJoinMethod(){
        reasonsToJoin.isDisplayed();
    }
}
