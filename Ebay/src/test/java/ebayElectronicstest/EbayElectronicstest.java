package ebayElectronicstest;

import common.WebAPI;
import ebayElectronics.EbayElectronics;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbayElectronicstest extends WebAPI {
EbayElectronics ebayElectronics;

    @BeforeMethod // to use the driver to open the browser
    public void getInit() {
        ebayElectronics = PageFactory.initElements(driver, EbayElectronics.class);
    }
    @Test (timeOut = 3000)
    public void testElectronicsButtonCheck() {
        ebayElectronics.electronicsButtonCheck();
    }
    @Test (timeOut = 3000)
    public void testCameraAndPhotosButtonCheck() {
        ebayElectronics.electronicsButtonCheck();
        ebayElectronics.cameraAndPhotosButtonCheck();
    }
    @Test (timeOut = 3000)
    public void testCellPhonesSmartWatchesAndAccessoriesButtonCheck() {
        ebayElectronics.electronicsButtonCheck();
        ebayElectronics.cellPhonesSmartWatchesAndAccessoriesButtonCheck();
    }
    @Test (timeOut = 3000)
    public void testComputersTabletsNetworkHardwareButtonCheck() {
        ebayElectronics.electronicsButtonCheck();
        ebayElectronics.computersTabletsNetworkHardwareButtonCheck();
    }
}