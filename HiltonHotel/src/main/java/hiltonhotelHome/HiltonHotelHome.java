package hiltonhotelHome;




import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static hiltonhotelHome.HiltonHotelWebElement .*;

public class HiltonHotelHome extends WebAPI{

    @FindBy(xpath = locationButton_xpath)
    WebElement locationButton;

    public void locationButtonMethod() throws InterruptedException {
        locationButton.click();
        Thread.sleep(5000);
    }
    @FindBy(xpath = joinButton_xpath)
    WebElement joinButton;
    public void joinButtonMethod(){
        joinButton.click();
    }

@FindBy(xpath = searchBox_xpath)
WebElement searchBox;
    public void searchBoxMethod(){
        searchBox.click();
    }
}
