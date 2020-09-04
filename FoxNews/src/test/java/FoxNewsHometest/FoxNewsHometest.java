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

    @Test
    public void testFoxNewsWorld(){
        checkFoxNewsWorld();

    }

    @Test
    public void testFoxNewsScience(){
        checkFoxNewsScience();

    }

    @Test
    public void testFoxNewsPolitics(){
        checkFoxNewsPolitics();

    }

    @Test
    public void testFoxNewsEntertainment(){
        checkFoxNewsEntertainment();

    }

    @Test
    public void testFoxNewsBusiness(){
        checkFoxNewsBusiness();

    }

    @Test
    public void testFoxNewsLifestyle(){
        checkFoxNewsLifestyle();

    }

    @Test
    public void testFoxNewsTech(){
        checkFoxNewsTech();

    }

    @Test
    public void testFoxNewsHealth(){
        checkFoxNewsHealth();

    }

    @Test
    public void testFoxNewsTV(){
        checkFoxNewsTV();

    }

    @Test
    public void testFoxNewsCareers(){
        checkFoxNewsCareers();

    }

    @Test
    public void testFoxNewsOther(){
        checkFoxNewsOther();

    }

    @Test
    public void testFoxNewsFacebookIcon(){
        checkFoxNewsFacebookIcon();

    }

    @Test
    public void testFoxNewsTwitterIcon(){
        checkFoxNewsTwitterIcon();

    }

    @Test
    public void testFoxNewsFlipBoardIcon(){
        checkFoxNewsFlipBoardIcon();

    }

    @Test
    public void testFoxNewsGoogleIcon(){
        checkFoxNewsGoogleIcon();

    }

    @Test
    public void testFoxNewsInstagramIcon(){
        checkFoxNewsInstagramIcon();

    }

}
