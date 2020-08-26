package ebayhome;
import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static ebayhome.ebayhomeWebElement.*;

public class EbayHome extends WebAPI{
    @FindBy(how = How.XPATH,using = WebElementSearchBox_Xpath)
    public WebElement searchBox;

    @FindBy(how = How.XPATH,using = WebElementsearchbutton)
    public WebElement searchButton;

    //Action
    public void searchBoxCheck(String searchItem){
        searchBox.sendKeys("iphone11 pro max");
          searchBox.submit();
    }

}


