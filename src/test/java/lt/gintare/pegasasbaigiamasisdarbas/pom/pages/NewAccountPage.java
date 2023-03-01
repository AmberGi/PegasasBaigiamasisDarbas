package lt.gintare.pegasasbaigiamasisdarbas.pom.pages;

public class NewAccountPage {
    public static void open() {
        Common.openUrl("https://www.pegasas.lt/customer/login"
        );
    }

    public static void closeCookies() {
        Common.clickElement(
                Locator.NewAccountPage.closeCookiesbutton
        );
    }

    public static void clickOnLoginRegister() {
        Common.clickElement(
                Locator.NewAccountPage.buttonLogIn
        );
    }

    public static void clickOnSukurtiPaskyra() {
        Common.clickElement(
                Locator.NewAccountPage.buttonSukurtiPaskyra
        );
    }

    public static void enterTextToFieldEmail(String text) {
        Common.sendKeysToElement(
                Locator.NewAccountPage.inputEmail, text
        );
    }

    public static void enterTextToFieldPassword(String text) {
        Common.sendKeysToElement(
                Locator.NewAccountPage.inputPassword, text
        );
    }

    public static void enterTextToFieldConfirmPassword(String text) {
        Common.sendKeysToElement(
                Locator.NewAccountPage.inputConfirmPassword, text
        );
    }

    public static void checkOnCheckBoxSusipazinauSuTaisyklem() {
        Common.clickElement(
                Locator.NewAccountPage.checkBoxSusipazinauSuTaisyklem
        );
    }

    public static void clickOnSukurtiPaskyraWithEnteredInfo() {
        Common.clickElement(
                Locator.NewAccountPage.buttonSukurtiPaskyraWithEnteredInfo
        );
    }

    public static String readAlertMessage() {
        return Common.getElementText(
                Locator.NewAccountPage.paragraphMessageAlert
        );
    }
}
