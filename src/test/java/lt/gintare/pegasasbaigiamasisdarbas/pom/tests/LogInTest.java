package lt.gintare.pegasasbaigiamasisdarbas.pom.tests;

import lt.gintare.pegasasbaigiamasisdarbas.pom.pages.LogInPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        LogInPage.open();
    }

    @Test
    public void testLogInWithNonExistingAccount() {

        String expectedResult
                = "Prisijungimo duomenys neteisingi";

        String actualResult;

        LogInPage.clickOnLoginRegister();
        LogInPage.enterTextToFieldEmail("tokioemailnera@gmail.com");
        LogInPage.enterTextToPassword("nezinau");
        LogInPage.clickOnButtonPrisijungti();

        actualResult = LogInPage.readMessage();

        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
