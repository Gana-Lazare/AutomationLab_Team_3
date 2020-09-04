package AetnaHometest;

import aetnahome.ShopForaPlanAetna;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShopForaPlanAetnatest extends WebAPI {
    ShopForaPlanAetna shopForaPlanAetna;

    @BeforeMethod // to use the driver to open the browser
    public void getInit() {
        shopForaPlanAetna = PageFactory.initElements(driver, ShopForaPlanAetna.class);
        shopForaPlanAetna.shopforPlan(); // to not repeat cliking on shop for plando inside before
        // registrationPage = PageFactory.initElements(driver,SignUpPage.class);
    }
@Test
    public void browseAetna() throws InterruptedException ,NullPointerException {
        shopForaPlanAetna.medicare();
        Thread.sleep(3000);
       // shopForaPlanAetna.assertMedicare();
}
@Test
    public void findDoctortest() throws  InterruptedException{
        shopForaPlanAetna.findDoctor();
       // shopForaPlanAetna.assertFindDoctor();
}
@Test
    public void checkdrugListest() throws InterruptedException{
        shopForaPlanAetna.checkDrugList();
}

}
