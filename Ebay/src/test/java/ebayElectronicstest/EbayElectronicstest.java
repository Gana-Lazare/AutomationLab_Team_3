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
    @Test (timeOut = 4000)
    public void testCellPhonesSmartWatchesAndAccessoriesButtonCheck() {
        ebayElectronics.electronicsButtonCheck();
        ebayElectronics.cellPhonesSmartWatchesAndAccessoriesButtonCheck();
    }
    @Test (timeOut = 3000)
    public void testComputersTabletsNetworkHardwareButtonCheck() {
        ebayElectronics.electronicsButtonCheck();
        ebayElectronics.computersTabletsNetworkHardwareButtonCheck();
    }
    @Test (timeOut = 3000)
    public void testTVVideoHomeAudioElectronicsButtonCheck(){
        ebayElectronics.electronicsButtonCheck();
        ebayElectronics.tvVideoHomeAudioElectronicsButtonCheck();
    }
    @Test (timeOut = 4000)
    public void testPortableAudioHeadphonesButtonCheck(){
        ebayElectronics.electronicsButtonCheck();
        ebayElectronics.portableAudioHeadphonesButtonCheck();
    }
    @Test (timeOut = 4000)
    public void testCarElectronicsButtonCheck(){
        ebayElectronics.electronicsButtonCheck();
        ebayElectronics.carElectronicsButtonCheck();
    }
    @Test (timeOut = 4000)
    public void testHomeSurveillanceButtonCheck(){
        ebayElectronics.electronicsButtonCheck();
        ebayElectronics.homeSurveillanceButtonCheck();
    }
    @Test (timeOut = 4000)
    public void testSmartHomeButtonCheck(){
        ebayElectronics.electronicsButtonCheck();
        ebayElectronics.smartHomeButtonCheck();
    }
    @Test (timeOut = 4000)
    public void testVideoPCGamingButtonCheck(){
        ebayElectronics.electronicsButtonCheck();
        ebayElectronics.videoPCGamingButtonCheck();
    }
    @Test (timeOut = 4000)
    public void testVirtualRealityButtonCheck(){
        ebayElectronics.electronicsButtonCheck();
        ebayElectronics.virtualRealityButtonCheck();
    }
    @Test (timeOut = 5000)
    public void testAppleButtonCheck(){
        ebayElectronics.electronicsButtonCheck();
        ebayElectronics.appleButtonCheck();
    }
    @Test (timeOut = 5000)
    public void testSamsungButtonCheck(){
        ebayElectronics.electronicsButtonCheck();
        ebayElectronics.samsungButtonCheck();
    }
}