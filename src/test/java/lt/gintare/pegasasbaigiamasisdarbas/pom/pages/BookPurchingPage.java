package lt.gintare.pegasasbaigiamasisdarbas.pom.pages;

public class BookPurchingPage {
    public static void open() {
        Common.openUrl("https://www.pegasas.lt"
        );
    }

    public static void closeCookies() {
        Common.clickElement(
                Locator.BookPurchingPage.closeCookiesbutton
        );
    }

    public static void clickOnMainMeniuKnygos() {
        Common.clickElement(
                Locator.BookPurchingPage.mainMeniuKnygos
        );
    }

    public static void clickOnNaujosKnygos() {
        Common.clickElement(
                Locator.BookPurchingPage.meniuGroupKnygosNaujosKnygos
        );
    }

    public static void clickOnBookMedineKauke() {
        Common.clickElement(
                Locator.BookPurchingPage.bookMedineKauke
        );
    }

    public static void clikOnAddMedineKaukeToCart() {
        Common.clickElement(
                Locator.BookPurchingPage.buttonMedineKaukeToChart
        );
    }

    public static void clickOnCheckTheCart() {
        Common.clickElement(
                Locator.BookPurchingPage.buttonCheckTheCart
        );
    }

    public static String bookMedineKaukeIsInTheCart() {
        return Common.getElementText(
                Locator.BookPurchingPage.medineKaukeIsInTheCart
        );
    }
}
