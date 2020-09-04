package FoxNewsHometest;

import common.WebAPI;
import foxnewsHome.FoxNewsHome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FoxNewsHometest extends FoxNewsHome {

    @BeforeMethod
    public void testChrome() {
        chrome();

    }

    @Test
    public void testFoxNewsUS(){
        checkFoxNewsUS();

    }

}
