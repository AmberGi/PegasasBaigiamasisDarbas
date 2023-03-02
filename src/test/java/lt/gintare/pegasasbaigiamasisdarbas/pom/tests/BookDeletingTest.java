package lt.gintare.pegasasbaigiamasisdarbas.pom.tests;

import lt.gintare.pegasasbaigiamasisdarbas.pom.pages.BookDeletingPage;
import lt.gintare.pegasasbaigiamasisdarbas.pom.pages.BookPurchingPage;
import lt.gintare.pegasasbaigiamasisdarbas.pom.pages.Locator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.print.Book;

public class BookDeletingTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        BookDeletingPage.open();
        BookDeletingPage.closeCookies();
    }

    @Test
    public void testDeleteBookMedineKaukeFromCart() {
        String expectedResult = "Jūsų krepšelis tuščias!";
        String actualResult;

        BookDeletingPage.clickOnMainMeniuKnygos();
        BookDeletingPage.clickOnNaujosKnygos();
        BookDeletingPage.clickOnBookMedineKauke();
        BookDeletingPage.clikOnAddMedineKaukeToCart();
        BookDeletingPage.clickOnCheckTheCart();
        BookDeletingPage.clickOnDeleteTheBookFromTheCart();

        actualResult = BookDeletingPage.theCartIsEmpty();
        Assert.assertTrue(expectedResult.contains(actualResult));

    }
}

