package FoxNewsHometest;

import common.WebAPI;
import foxnewsHome.FoxNewsHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FoxNewsHometest extends WebAPI {

    FoxNewsHome foxNewsHome=null;
    @BeforeMethod
    public void getinit(){ PageFactory.initElements(driver, FoxNewsHome.class);}
    @Test
    public void watchtvtest(){
       foxNewsHome.watchtv();
    }
}
