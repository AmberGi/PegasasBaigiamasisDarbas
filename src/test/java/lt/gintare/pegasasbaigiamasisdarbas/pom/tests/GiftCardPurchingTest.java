package lt.gintare.pegasasbaigiamasisdarbas.pom.tests;

import lt.gintare.pegasasbaigiamasisdarbas.pom.pages.GiftCardPurchingPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GiftCardPurchingTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        GiftCardPurchingPage.open();
        GiftCardPurchingPage.closeCookies();
    }

    @Test
    public void testAddBlackDizainGiftCardToCart() {
        String expectedResult = "El. dovanų kuponas vaikiškas (tamsus)";
        String actualResult;

        GiftCardPurchingPage.clickOnDovanuKuponai();
        GiftCardPurchingPage.clickOnDovanuKuponasVaikiskasTamsus();
        GiftCardPurchingPage.clickOnPasirinkiteSuma5Eurai();
        GiftCardPurchingPage.clickOnIdekiteKuponaIKrepseli();
        GiftCardPurchingPage.clickOnPerziurekiteKrepseli();

        actualResult = GiftCardPurchingPage.dovanuKuponasVaikiskasTamsusIsInTheCart();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult)
        );
    }
}