package lt.gintare.pegasasbaigiamasisdarbas.pom.tests;

import lt.gintare.pegasasbaigiamasisdarbas.pom.pages.BookPurchingPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookPurchingTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        BookPurchingPage.open();
    }

    @Test
    public void testAddingProductToCart() {

        String expectedResult = "Medinė kaukė. Tikroji mano istorija";
        String actualResult;

        BookPurchingPage.clickOnKnygos();
        BookPurchingPage.clickOnNaujosKnygos();
        BookPurchingPage.clickOnBookMedineKauke();
        BookPurchingPage.clikOnAddMedineKaukeToCart();
        BookPurchingPage.clickOnCheckTheCart();

        actualResult = BookPurchingPage.medineKaukeIsInTheCart();

        Assert.assertEquals(expectedResult, actualResult);
    }
}
