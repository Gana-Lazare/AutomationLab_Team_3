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
    @FindBy(how = How.XPATH,using = facebookIncon1WebEelement_class)
    public WebElement face_icon;

//Action

    public void facebookChase(){
        clickWebElement(face_icon);
    }
    //Assertion

    @FindBy(how = How.XPATH,using = instagramIconWebElement)
    public WebElement insta1_icon;
    //Action
    public void instagramChase(){
        scrollIntoViewElement(insta1_icon);
        okAlert();
        clickWebElement(insta1_icon);
    }
    //Assertion

    @FindBy(how = How.XPATH,using = twitterIconWebElement)
    public WebElement twitter_icon;
    //Action
    public void twitterChase(){
        scrollIntoViewElement(twitter_icon);
        okAlert();
        clickWebElement(twitter_icon);
    }
    //Assertion

    @FindBy(how = How.XPATH,using = youtubeIconWebElement)
    public WebElement youtube_icon;
    //Action
    public void youtubeChase(){
        scrollIntoViewElement(youtube_icon);
        okAlert();
        clickWebElement(youtube_icon);
    }
    //Assertion

    @FindBy(how = How.XPATH,using = linkedInIconWebElement)
    public WebElement linkedIn_icon;
    //Action
    public void linkedInChase(){
        scrollIntoViewElement(linkedIn_icon);
        okAlert();
        clickWebElement(linkedIn_icon);
    }
    //Assertion

    @FindBy(how = How.XPATH,using = pinterestIconWebElement)
    public WebElement pinterest_icon;
    //Action
    public void pinterestChase(){
        scrollIntoViewElement(pinterest_icon);
        okAlert();
        clickWebElement(pinterest_icon);
    }
    //Assertion
}
