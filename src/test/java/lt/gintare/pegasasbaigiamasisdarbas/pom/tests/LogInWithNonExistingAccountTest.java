package lt.gintare.pegasasbaigiamasisdarbas.pom.tests;

import lt.gintare.pegasasbaigiamasisdarbas.pom.pages.LogInWithNonExistingAccountPage;
import org.apache.commons.logging.Log;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInWithNonExistingAccountTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        LogInWithNonExistingAccountPage.open();
    }

    @Test
    public void testLogInWithNonExistingAccount() {

        String expectedResult
                = "Prisijungimo duomenys neteisingi " +
                "arba jūsų paskyra laikinai yra atjungta. Prašome pabandyti prisijungti vėliau.";

        String actualResult;

        LogInWithNonExistingAccountPage.clickOnLoginRegister();
        LogInWithNonExistingAccountPage.enterTextToFieldEmail("tokioemailnera@gmail.com");
        LogInWithNonExistingAccountPage.enterTextToPassword("nezinau");
        LogInWithNonExistingAccountPage.clickOnButtonPrisijungti();

        actualResult = LogInWithNonExistingAccountPage.readMessage();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
