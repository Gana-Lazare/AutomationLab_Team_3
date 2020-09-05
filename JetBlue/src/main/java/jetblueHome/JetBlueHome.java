package jetblueHome;

import common.WebAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static jetblueHome.JetBlueHomeWebElement.*;

public class JetBlueHome extends WebAPI {
    public static WebDriver driver;

    @FindBy(how = How.XPATH,using=minimizeallertButton)
    public WebElement minimizerallertcovid;
    public void covidallert(){
        clickWebElement(minimizerallertcovid);
    }

    @FindBy(how = How.XPATH,using=myTripsWebElement)
    public WebElement mytrips;

    public void mytrips() throws InterruptedException {
   clickWebElement(mytrips);
    }

    @FindBy(how = How.XPATH,using=manageTripsWebElement)
    public WebElement manageTrips;
    //Action
    public void manageTrips(){
        clickWebElement(manageTrips);
    }
    //Assertion

    @FindBy(how = How.XPATH,using=checkInWebElement)
    public WebElement checkin;
    //Action
    public void checkIn(){
        clickWebElement(checkin);
    }
    //Assertion

    @FindBy(how = How.XPATH,using = flightTrackerWebElement)
    public WebElement flightTracker;
    //Action
    public void flighttracker(){
        clickWebElement(flightTracker);
    }
    //Assertion

}
