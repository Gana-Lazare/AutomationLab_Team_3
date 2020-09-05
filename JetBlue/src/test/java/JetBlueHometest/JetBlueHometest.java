package JetBlueHometest;

import common.WebAPI;
import jetblueHome.JetBlueHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JetBlueHometest extends WebAPI {
    JetBlueHome jetBlueHome;
    @BeforeMethod // to use the driver to open the browser
    public void getInit() throws InterruptedException {
        jetBlueHome = PageFactory.initElements(driver, JetBlueHome.class);

    }
@Test
public void manageTripstest() throws InterruptedException {
    jetBlueHome.mytrips();
    jetBlueHome.manageTrips();
}
  @Test
    public void checkIntest() throws InterruptedException {
      jetBlueHome.mytrips();
       jetBlueHome.checkIn();
    }
   @Test
    public void flighttrackertest() throws InterruptedException {
       jetBlueHome.mytrips();
        jetBlueHome.flighttracker();
    }

}
