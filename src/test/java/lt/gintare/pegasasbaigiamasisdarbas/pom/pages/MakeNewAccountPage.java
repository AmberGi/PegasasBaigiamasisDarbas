package lt.gintare.pegasasbaigiamasisdarbas.pom.pages;

public class MakeNewAccountPage {
    public static void open() {
        Common.openUrl("https://www.pegasas.lt/customer/login");
    }

    public static void clickOnLoginRegister() {
        Common.clickElement(
                Locator.MakeNewAccountPage.buttonLogIn);
    }

    public static void enterTextToFieldEmail(String text) {
        Common.sendKeysToElement(
                Locator.MakeNewAccountPage.inputEmail, text
        );
    }

    public static void enterTextToFieldPassword(String text) {
        Common.sendKeysToElement(
                Locator.MakeNewAccountPage.inputPassword, text
        );
    }

    public static void clickOnButtonPrisijungti() {
        Common.clickElement(
                Locator.MakeNewAccountPage.buttonPrisijungti
        );
    }

    public static void enterTextToFieldConfirmPasword(String text) {
        Common.sendKeysToElement(
                Locator.MakeNewAccountPage.buttonConfirmPassword, text
        );
    }

    public static String readMessage() {
        return Common.getElementText(
                Locator.MakeNewAccountPage.paragraphMessageAlert
        );
    }
}
