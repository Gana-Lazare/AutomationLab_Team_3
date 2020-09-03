package foxnewsHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static foxnewsHome.FoxNewsHomeWebElement.*;

public class FoxNewsHome  extends WebAPI {
    public static WebElement webElement;

     @FindBy(how = How.XPATH,using =watchTvWebElement )
    public WebElement watchtv;
}
