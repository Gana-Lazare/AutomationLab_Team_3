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
    public void Tools_to_manage_your_accountTest(){
       chaseHome.Tools_to_manage_your_account();
    }

    @Test
    public void Videos_to_help_you_bank_from_your_deviceTest(){
       chaseHome.Videos_to_help_you_bank_from_your_device();
    }

    @Test
    public void A_Virtual_Commencement_for_HBCU_GradsTest(){
       chaseHome.A_Virtual_Commencement_for_HBCU_Grads();
    }

    @Test
    public void ways_to_prevent_and_handle_elder_financial_abuseTest(){
       chaseHome.ways_to_prevent_and_handle_elder_financial_abuse();
    }

    @Test
    public void Comedian_Amanda_Seales_digs_into_financial_confidenceTest(){
       chaseHome.Comedian_Amanda_Seales_digs_into_financial_confidence();
    }

    @Test
    public void Payment_systems_for_today_entrepreneurTest(){
     chaseHome.Payment_systems_for_today_entrepreneur();
    }

    @Test
    public void The_5_best_ways_to_save_money_on_wellnessTest(){
     chaseHome.The_5_best_ways_to_save_money_on_wellness();
    }

    @Test
    public void In_your_40_Start_planning_for_your_second_actTest(){
      chaseHome.In_your_40_Start_planning_for_your_second_act();
    }

    @Test
    public void Are_you_ready_to_share_your_bank_accountTest(){
       chaseHome.Are_you_ready_to_share_your_bank_account();
    }

    @Test
    public void For_this_WNBA_star_passion_and_philanthropy_are_keyTest(){
        chaseHome.For_this_WNBA_star_passion_and_philanthropy_are_key();
    }

    @Test
    public void Why_you_need_to_get_digitally_organizedTest(){
      chaseHome.Why_you_need_to_get_digitally_organized();
    }

    @Test
    public void Going_on_a_summer_vacation_Here_s_how_to_save_nowTest(){
        chaseHome.Going_on_a_summer_vacation_Here_s_how_to_save_now();
    }
}
