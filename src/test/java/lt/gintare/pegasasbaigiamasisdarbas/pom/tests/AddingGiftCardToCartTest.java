package lt.gintare.pegasasbaigiamasisdarbas.pom.tests;

import lt.gintare.pegasasbaigiamasisdarbas.pom.pages.AddingGiftCardToCartPage;
import lt.gintare.pegasasbaigiamasisdarbas.pom.pages.AddingProductToCartPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddingGiftCardToCartTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        AddingGiftCardToCartPage.open();
    }

    @Test
    public void testAddingGiftCardToCart() {


    }
}
