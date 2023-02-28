package lt.gintare.pegasasbaigiamasisdarbas.pom.tests;

import lt.gintare.pegasasbaigiamasisdarbas.pom.pages.GiftCardPurchingPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GiftCardPurchingTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        GiftCardPurchingPage.open();
    }

    @Test
    public void testAddingGiftCardToCart() {


    }
}
