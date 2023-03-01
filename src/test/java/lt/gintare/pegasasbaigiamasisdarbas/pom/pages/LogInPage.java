package lt.gintare.pegasasbaigiamasisdarbas.pom.pages;

public class LogInPage {
    public static void open() {
        Common.openUrl("https://www.pegasas.lt"
        );
    }

    public static void closeCookies() {
        Common.clickElement(
                Locator.LogInPage.closeCookiesbutton
        );
    }

    public static void clickOnLoginRegister() {
        Common.clickElement(
                Locator.LogInPage.buttonLogIn
        );
    }

    public static void enterNonExistingEmailToFieldEmail(String text) {
        Common.sendKeysToElement(
                Locator.LogInPage.inputEmail, text
        );
    }

    public static void enterNonExistingPasswordToFieldPassword(String text) {
        Common.sendKeysToElement(
                Locator.LogInPage.inputPassword, text
        );
    }

    public static void clickOnButtonPrisijungti() {
        Common.clickElement(
                Locator.LogInPage.buttonPrisijungti
        );
    }

    public static String readMessage() {
        return Common.getElementText(
                Locator.LogInPage.paragraphMessageAlert
        );
    }
}
