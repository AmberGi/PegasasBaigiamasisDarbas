package lt.gintare.pegasasbaigiamasisdarbas.pom.tests;

import lt.gintare.pegasasbaigiamasisdarbas.pom.pages.SortBooksPage;
import net.bytebuddy.TypeCache;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SortBooksTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        SortBooksPage.open();
        SortBooksPage.closeCookies();
    }

    @Test
    public void testSortingProductsByMaxDiscount() {

        String expectedResult = "-80%";
        String actualResult;

        SortBooksPage.clickOnKnygosVaikamsPaaugliamsIrJaunimui();
        SortBooksPage.clickOnPaaugliamsIrJaunimui();
        SortBooksPage.clickOnDropListPrekiuRikiavimas();
        SortBooksPage.clickOnDidziausiaNuolaida();

        actualResult = SortBooksPage.getMaxDiscountMessage();

        Assert.assertTrue(actualResult.contains(expectedResult));

    }
}
