package lt.gintare.pegasasbaigiamasisdarbas.pom.tests;

import lt.gintare.pegasasbaigiamasisdarbas.pom.pages.SortingProductsByMaxDiscountPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SortingProductsByMaxDiscountTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        SortingProductsByMaxDiscountPage.open();
    }

    @Test
    public void testSortingProductsByMaxDiscount() {


    }
}
