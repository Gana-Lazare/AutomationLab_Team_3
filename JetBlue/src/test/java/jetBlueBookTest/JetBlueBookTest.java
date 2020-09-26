package jetBlueBookTest;

import common.WebAPI;
import jetblueHome.JetBlueBook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JetBlueBookTest extends WebAPI {

    JetBlueBook jetBlueBook;


    @BeforeMethod // to use the driver to open the browser
    public void getInit() {
        jetBlueBook = PageFactory.initElements(driver, JetBlueBook.class);
    }

    @Test
    public void testBookButtonCheck() {
        jetBlueBook.bookButtonCheck();
        jetBlueBook.validateBookText();
    }

    @Test
    public void testFlightsButtonCheck() {
        jetBlueBook.flightsButtonCheck();
        jetBlueBook.validateFlightsText();
    }

    @Test
    public void testReservationCheck() {
        jetBlueBook.ReservationCheck();
        jetBlueBook.validateReservationText();
    }
//
//    @Test
//    public void testBookButtonCheck() {
//        jetBlueBook.bookButtonCheck();
//        jetBlueBook.validateBookText();
//    }
//
//    @Test
//    public void testBookButtonCheck() {
//        jetBlueBook.bookButtonCheck();
//        jetBlueBook.validateBookText();
//    }
//
//    @Test
//    public void testBookButtonCheck() {
//        jetBlueBook.bookButtonCheck();
//        jetBlueBook.validateBookText();
//    }
//
//    @Test
//    public void testBookButtonCheck() {
//        jetBlueBook.bookButtonCheck();
//        jetBlueBook.validateBookText();
//    }
//
//    @Test
//    public void testBookButtonCheck() {
//        jetBlueBook.bookButtonCheck();
//        jetBlueBook.validateBookText();
//    }
//    @Test
//    public void testBookButtonCheck() {
//        jetBlueBook.bookButtonCheck();
//        jetBlueBook.validateBookText();
//    }
//
//    @Test
//    public void testBookButtonCheck() {
//        jetBlueBook.bookButtonCheck();
//        jetBlueBook.validateBookText();
//    }
//
//    @Test
//    public void testBookButtonCheck() {
//        jetBlueBook.bookButtonCheck();
//        jetBlueBook.validateBookText();
//    }
//
//    @Test
//    public void testBookButtonCheck() {
//        jetBlueBook.bookButtonCheck();
//        jetBlueBook.validateBookText();
//    }
//
//    @Test
//    public void testBookButtonCheck() {
//        jetBlueBook.bookButtonCheck();
//        jetBlueBook.validateBookText();
//    }
//
//    @Test
//    public void testBookButtonCheck() {
//        jetBlueBook.bookButtonCheck();
//        jetBlueBook.validateBookText();
//    }
//
//    @Test
//    public void testBookButtonCheck() {
//        jetBlueBook.bookButtonCheck();
//        jetBlueBook.validateBookText();
//    }
//
//
//    @Test
//    public void testBookButtonCheck() {
//        jetBlueBook.bookButtonCheck();
//        jetBlueBook.validateBookText();
//    }
//
//
//    @Test
//    public void testBookButtonCheck() {
//        jetBlueBook.bookButtonCheck();
//        jetBlueBook.validateBookText();
//    }



}
