package lt.gintare.pegasasbaigiamasisdarbas.pom.pages;

public class LogInPage {
    public static void open() {
        Common.openUrl("https://www.pegasas.lt");
    }

    public static void clickOnLoginRegister() {
        Common.clickElement(
                Locator.LogInWithNonExistingAccountPage.buttonLogIn
        );
    }

    public static void enterTextToFieldEmail(String text) {
        Common.sendKeysToElement(
                Locator.MakeNewAccountPage.inputEmail, text
        );
    }

    public static void enterTextToPassword(String text) {
        Common.sendKeysToElement(
                Locator.MakeNewAccountPage.inputPassword, text
        );
    }

    public static void clickOnButtonPrisijungti() {
        Common.clickElement(
                Locator.MakeNewAccountPage.buttonPrisijungti
        );
    }

    public static String readMessage() {
        return Common.getElementText(
                Locator.MakeNewAccountPage.paragraphMessageAlert
        );
    }
}
