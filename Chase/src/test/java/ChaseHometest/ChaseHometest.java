package ChaseHometest;

import chasehome.ChaseHome;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChaseHometest extends WebAPI {
    ChaseHome chaseHome;

    @BeforeMethod // to use the driver to open the browser
    public void getInit() {
        chaseHome = PageFactory.initElements(driver, ChaseHome.class);

        // registrationPage = PageFactory.initElements(driver,SignUpPage.class);
    }

    @Test
    public void facebookChasetest() {
        chaseHome.facebookChase();
    }

    @Test
    public void instagramChase() {
        chaseHome.instagramChase();
    }

    @Test
    public void twitterChasetest() {
        chaseHome.twitterChase();
    }

    @Test
    public void youtubeChasetest() {
        chaseHome.youtubeChase();
    }

    @Test
    public void linkedInChasetest() {
        chaseHome.linkedInChase();
    }

    @Test
    public void pinterestChasetest() {
        chaseHome.pinterestChase();
    }
}
