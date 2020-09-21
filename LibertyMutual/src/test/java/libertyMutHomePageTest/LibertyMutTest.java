package libertyMutHomePageTest;

import common.WebAPI;
import libertyMutualHome.LibertyMutualHome;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;


public class LibertyMutTest extends WebAPI {
    LibertyMutualHome libertyMutualHome;
@BeforeMethod
public void getInit (){
        libertyMutualHome= PageFactory.initElements(driver,LibertyMutualHome.class); }

    @Test
    public void libertyMutualInsuranceTest(){
        libertyMutualHome.libertyMutualInsuranceMethod();
    }

}
