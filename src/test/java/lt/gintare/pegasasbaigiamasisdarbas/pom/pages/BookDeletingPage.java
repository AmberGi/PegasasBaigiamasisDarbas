package lt.gintare.pegasasbaigiamasisdarbas.pom.pages;

public class BookDeletingPage {

    public static void open() {
        Common.openUrl("https://www.pegasas.lt"
        );
    }

    public static void closeCookies() {
        Common.clickElement(
                Locator.BookDeletingPage.buttonCloseCookies
        );
    }

    public static void clickOnMainMeniuKnygos() {
        Common.clickElement(
                Locator.BookDeletingPage.mainMeniuKnygos
        );
    }

    public static void clickOnNaujosKnygos() {
        Common.clickElement(
                Locator.BookDeletingPage.meniuGroupKnygosNaujosKnygos
        );
    }

    public static void clickOnBookMedineKauke() {
        Common.clickElement(
                Locator.BookDeletingPage.bookMedineKauke
        );
    }

    public static void clikOnAddMedineKaukeToCart() {
        Common.clickElement(
                Locator.BookDeletingPage.buttonMedineKaukeToChart
        );
    }

    public static void clickOnCheckTheCart() {
        Common.clickElement(
                Locator.BookDeletingPage.buttonCheckTheCart
        );
    }

    public static void clickOnDeleteTheBookFromTheCart() {
        Common.clickElement(
                Locator.BookDeletingPage.buttonDelete
        );
    }

    public static String theCartIsEmpty() {
        return Common.getElementText(
                Locator.BookDeletingPage.messageTheCartIsEmpty
        );
    }
}
