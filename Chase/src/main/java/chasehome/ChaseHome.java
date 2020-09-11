package chasehome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static chasehome.ChasehomeWebElement.*;


public class ChaseHome extends WebAPI {
    public static WebElement webElement;

    /**
     * Author:Gana
     */
    @FindBy(how = How.XPATH,using = Tools_to_manage_your_accountWebElement)
    public WebElement Tools_to_manage_your_account;

//Action

    public void Tools_to_manage_your_account(){
        moveToElement(Tools_to_manage_your_accountWebElement);
        //clickWebElement(Tools_to_manage_your_account);
    }
    //Assertion

    @FindBy(how = How.XPATH,using = Videos_to_help_you_bank_from_your_deviceWebElement)
    public WebElement Videos_to_help_you_bank_from_your_device;
    //Action
    public void Videos_to_help_you_bank_from_your_device(){
        moveToElement(Videos_to_help_you_bank_from_your_deviceWebElement);

        clickWebElement(Videos_to_help_you_bank_from_your_device);
    }
    //Assertion

    @FindBy(how = How.XPATH,using = A_Virtual_Commencement_for_HBCU_GradsWebElement)
    public WebElement A_Virtual_Commencement_for_HBCU_Grads;
    //Action
    public void A_Virtual_Commencement_for_HBCU_Grads(){
        moveToElement(A_Virtual_Commencement_for_HBCU_GradsWebElement);

        clickWebElement(A_Virtual_Commencement_for_HBCU_Grads);
    }
    //Assertion

    @FindBy(how = How.XPATH,using = ways_to_prevent_and_handle_elder_financial_abuseWebElement)
    public WebElement ways_to_prevent_and_handle_elder_financial_abuse;
    //Action
    public void ways_to_prevent_and_handle_elder_financial_abuse(){
        moveToElement(ways_to_prevent_and_handle_elder_financial_abuseWebElement);
        okAlert();
        clickWebElement(ways_to_prevent_and_handle_elder_financial_abuse);
    }
    //Assertion

    @FindBy(how = How.XPATH,using = Comedian_Amanda_Seales_digs_into_financial_confidenceWebElement)
    public WebElement Comedian_Amanda_Seales_digs_into_financial_confidence;
    //Action
    public void Comedian_Amanda_Seales_digs_into_financial_confidence(){
        moveToElement(Comedian_Amanda_Seales_digs_into_financial_confidenceWebElement);
        okAlert();
        clickWebElement(Comedian_Amanda_Seales_digs_into_financial_confidence);
    }
    //Assertion

    @FindBy(how = How.XPATH,using = Payment_systems_for_today_entrepreneurWebElement)
    public WebElement Payment_systems_for_today_entrepreneur;
    //Action
    public void Payment_systems_for_today_entrepreneur(){
        moveToElement(Payment_systems_for_today_entrepreneurWebElement);
        okAlert();
        clickWebElement(Payment_systems_for_today_entrepreneur);
    }
    //Assertion
    @FindBy(how = How.XPATH,using = The_5_best_ways_to_save_money_on_wellnessWebElement)
    public WebElement The_5_best_ways_to_save_money_on_wellness;
    //Action
    public void The_5_best_ways_to_save_money_on_wellness(){
        moveToElement(The_5_best_ways_to_save_money_on_wellnessWebElement);
        okAlert();
        clickWebElement(The_5_best_ways_to_save_money_on_wellness);
    }
    //Assertion
    @FindBy(how = How.XPATH,using = In_your_40_Start_planning_for_your_second_actWebElement)
    public WebElement In_your_40_Start_planning_for_your_second_act;
    //Action
    public void In_your_40_Start_planning_for_your_second_act(){
        moveToElement(In_your_40_Start_planning_for_your_second_actWebElement);
        okAlert();
        clickWebElement(In_your_40_Start_planning_for_your_second_act);
    }
    //Assertion
    @FindBy(how = How.XPATH,using = Are_you_ready_to_share_your_bank_accountWebElement)
    public WebElement Are_you_ready_to_share_your_bank_account;
    //Action
    public void Are_you_ready_to_share_your_bank_account(){
        moveToElement(Are_you_ready_to_share_your_bank_accountWebElement);
        okAlert();
        clickWebElement(Are_you_ready_to_share_your_bank_account);
    }
    //Assertion
     @FindBy(how = How.XPATH,using = For_this_WNBA_star_passion_and_philanthropy_are_keyWebElement)
       public WebElement For_this_WNBA_star_passion_and_philanthropy_are_key;
       //Action
     public void For_this_WNBA_star_passion_and_philanthropy_are_key(){
            moveToElement(For_this_WNBA_star_passion_and_philanthropy_are_keyWebElement);
            okAlert();
           clickWebElement(For_this_WNBA_star_passion_and_philanthropy_are_key);
       }
    //
    // Assertion
    @FindBy(how = How.XPATH,using = Why_you_need_to_get_digitally_organizedWebElement)
    public WebElement Why_you_need_to_get_digitally_organized;
    //Action
    public void Why_you_need_to_get_digitally_organized(){
        moveToElement(Why_you_need_to_get_digitally_organizedWebElement);
        okAlert();
        clickWebElement(Why_you_need_to_get_digitally_organized);
    }
    //Assertion

    @FindBy(how = How.XPATH,using = Going_on_a_summer_vacation_Here_s_how_to_save_nowWebElement)
    public WebElement Going_on_a_summer_vacation_Here_s_how_to_save_now;
    //Action
    public void Going_on_a_summer_vacation_Here_s_how_to_save_now(){
        moveToElement(Going_on_a_summer_vacation_Here_s_how_to_save_nowWebElement);
        okAlert();
        clickWebElement(Going_on_a_summer_vacation_Here_s_how_to_save_now);
    }
    //Assertion

}
