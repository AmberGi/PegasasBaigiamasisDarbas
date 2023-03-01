package lt.gintare.pegasasbaigiamasisdarbas.pom.tests;

import lt.gintare.pegasasbaigiamasisdarbas.pom.pages.NewAccountPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewAccountTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        NewAccountPage.open();
        NewAccountPage.closeCookies();
    }

    @Test
    public void testMakeNewAccountWithAlreadyUsedEmail() {

        String expectedResult = "Jau yra paskyra su šiuo elektroninio pašto adresu.";
        String actualResult;

        NewAccountPage.clickOnLoginRegister();
        NewAccountPage.clickOnSukurtiPaskyra();
        NewAccountPage.enterTextToFieldEmail("gigigi@gmail.com");
        NewAccountPage.enterTextToFieldPassword("Books555");
        NewAccountPage.enterTextToFieldConfirmPassword("Books555");
        NewAccountPage.checkOnCheckBoxSusipazinauSuTaisyklem();
        NewAccountPage.clickOnSukurtiPaskyraWithEnteredInfo();

        actualResult = NewAccountPage.readAlertMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult)
        );
    }
}
