package foxNewsHomeTest;

import common.WebAPI;
import foxNewsHome.FoxNewsHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class FoxNewsHomeTest extends WebAPI {

    FoxNewsHome newsHome;
    @BeforeMethod
    public void getInit(){
        newsHome = PageFactory.initElements(driver, FoxNewsHome.class);
    }
    @Test
    public void testSearchBoxCheck() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        newsHome.searchBoxCheck("Algeria");
        newsHome.validateSearchText("\"Algeria\"");

    }
    @Test
    public void testSearchBoxCheckGetTitlesListFromDB() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        newsHome.searchBoxCheckGetTitlesListFromDB();
    }
}
