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
        LogInPage.closeCookies();
    }

    @Test
    public void testLogInWithNonExistingAccountInformation() {
        String expectedResult
                = "Prisijungimo duomenys neteisingi";

        String actualResult;

        LogInPage.clickOnLoginRegister();
        LogInPage.enterNonExistingEmailToFieldEmail("tokioemailnera@gmail.com");
        LogInPage.enterNonExistingPasswordToFieldPassword("nezinau");
        LogInPage.clickOnButtonPrisijungti();

        actualResult = LogInPage.readMessage();

        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}