package lt.gintare.pegasasbaigiamasisdarbas.pom.tests;

import lt.gintare.pegasasbaigiamasisdarbas.pom.pages.Locator;
import lt.gintare.pegasasbaigiamasisdarbas.pom.pages.MakeNewAccountPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MakeNewAccountTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        MakeNewAccountPage.open();
    }

    @Test
    public void testMakeNewAccount() {

        String expectedResult = "Jau yra paskyra su šiuo elektroninio pašto adresu. Prašome prisijungti";
        String actualResult;

        MakeNewAccountPage.clickOnLoginRegister();
        MakeNewAccountPage.enterTextToFieldEmail("gigigi@gmail.com");
        MakeNewAccountPage.enterTextToFieldPassword("Books555");
        MakeNewAccountPage.enterTextToFieldConfirmPasword("Book555");
        MakeNewAccountPage.clickOnButtonPrisijungti();

        actualResult = MakeNewAccountPage.readMessage();

        Assert.assertEquals(actualResult, expectedResult);

    }
}
