package lt.gintare.pegasasbaigiamasisdarbas.pom.tests;

import lt.gintare.pegasasbaigiamasisdarbas.pom.pages.CartPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        CartPage.open();
        CartPage.closeCookies();
    }

    @Test
    public void testAddKoposVaikaiToCart() {
        String expectedResult = "Kopos vaikai";
        String actualResult;

        CartPage.clickOnMainMeniuKnygos();
        CartPage.clickOnNaujosKnygos();
        CartPage.clickOnTheBook();
        CartPage.clikOnAddTheBookToCart();
        CartPage.clickOnCheckTheCart();

        actualResult = CartPage.theBookIsInTheCart();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeleteBookKoposVaikaiFromCart() {
        String expectedResult = "Jūsų krepšelis tuščias!";
        String actualResult;

        CartPage.clickOnMainMeniuKnygos();
        CartPage.clickOnNaujosKnygos();
        CartPage.clickOnTheBook();
        CartPage.clikOnAddTheBookToCart();
        CartPage.clickOnCheckTheCart();
        CartPage.clickOnDeleteTheBookFromTheCart();

        actualResult = CartPage.theCartIsEmpty();
        Assert.assertTrue(expectedResult.contains(actualResult));
    }
}