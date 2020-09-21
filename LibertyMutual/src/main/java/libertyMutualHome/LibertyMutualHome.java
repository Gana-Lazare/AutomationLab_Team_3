package libertyMutualHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import static libertyMutualHome.LibertyMutualWebElements.*;

public class LibertyMutualHome  extends WebAPI {
    @BeforeMethod
    public void openBrowser() throws IOException {
        setUp(false,"browserstack","OS X","catalina","chrome","85","https://www.libertymutual.com");
    }

    @FindBy(xpath = libertyMutualInsuranceWebElement)
    WebElement libertyMutualInsurance;

    public void libertyMutualInsuranceMethod() {
        libertyMutualInsurance.click();
    }

    @FindBy(xpath = businessInsuranceWebElement)
    WebElement businessInsurance;

    public void businessInsuranceMethod() {
        businessInsurance.click();}

        @FindBy(xpath = webElementSearchBox)
         WebElement searchBox;
        public void searchBoxMethod(){
           searchBox.submit();
        }

    // Action Method
    public void enterSearchKeyword(String searchItem) {
        searchBox.sendKeys(searchItem);
        }
        public void clickOnSearchButton() {
        //searchButton.click();
        searchBox.submit();

    }

    }
