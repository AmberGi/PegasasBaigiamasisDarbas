package lt.gintare.pegasasbaigiamasisdarbas.pom.pages;

public class CartPage {
    public static void open() {
        Common.openUrl("https://www.pegasas.lt"
        );
    }

    public static void closeCookies() {
        Common.clickElement(
                Locator.cartPage.buttonCloseCookies
        );
    }

    public static void clickOnMainMeniuKnygos() {
        Common.clickElement(
                Locator.cartPage.mainMeniuKnygos
        );
    }

    public static void clickOnNaujosKnygos() {
        Common.clickElement(
                Locator.cartPage.meniuGroupKnygosNaujosKnygos
        );
    }

    public static void clickOnTheBook() {
        Common.clickElement(
                Locator.cartPage.theBook
        );
    }

    public static void clikOnAddTheBookToCart() {
        Common.clickElement(
                Locator.cartPage.buttonTheBookToChart
        );
    }

    public static String theBookIsInTheCart() {
        return Common.getElementText(
                Locator.cartPage.theBookIsInTheCart
        );
    }

    public static void clickOnCheckTheCart() {
        Common.clickElement(
                Locator.cartPage.buttonCheckTheCart
        );
    }

    public static void clickOnDeleteTheBookFromTheCart() {
        Common.clickElement(
                Locator.cartPage.buttonDelete
        );
    }

    public static String theCartIsEmpty() {
        return Common.getElementText(
                Locator.cartPage.messageTheCartIsEmpty
        );
    }
}