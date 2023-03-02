package lt.gintare.pegasasbaigiamasisdarbas.pom.tests;

import lt.gintare.pegasasbaigiamasisdarbas.pom.pages.Common;
import lt.gintare.pegasasbaigiamasisdarbas.pom.utils.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public abstract class BaseTest {

    @BeforeMethod
    public abstract void setUp();

    @AfterMethod
    public void tearDown() {
        Common.closeDriver();
    }
}