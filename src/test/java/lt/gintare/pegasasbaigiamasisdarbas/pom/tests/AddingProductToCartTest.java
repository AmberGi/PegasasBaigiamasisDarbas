package lt.gintare.pegasasbaigiamasisdarbas.pom.tests;

import lt.gintare.pegasasbaigiamasisdarbas.pom.pages.AddingGiftCardToCartPage;
import lt.gintare.pegasasbaigiamasisdarbas.pom.pages.AddingProductToCartPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddingProductToCartTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        AddingProductToCartPage.open();
    }

    @Test
    public void testAddingProductToCart() {
        AddingProductToCartPage.clickOnKnygos();
        AddingProductToCartPage.clickOnNaujosKnygos();
        AddingProductToCartPage.clickOnBookMedineKauke();
        AddingProductToCartPage.clikOnAddMedineKaukeToCart();
        AddingProductToCartPage.clickOnCheckTheCart();

    }
}
