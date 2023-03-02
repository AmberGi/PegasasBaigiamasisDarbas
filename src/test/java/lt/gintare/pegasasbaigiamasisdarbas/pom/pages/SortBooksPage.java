package lt.gintare.pegasasbaigiamasisdarbas.pom.pages;

public class SortBooksPage {
    public static void open() {
        Common.openUrl("https://www.pegasas.lt/"
        );
    }

    public static void closeCookies() {
        Common.clickElement(
                Locator.SortBooksPage.closeCookiesButton
        );
    }

    public static void clickOnKnygosVaikamsPaaugliamsIrJaunimui() {
        Common.clickElement(
                Locator.SortBooksPage.buttonKnygosVaikamsPaaugliamsIrJaunimui
        );
    }

    public static void clickOnPaaugliamsIrJaunimui() {
        Common.clickElement(
                Locator.SortBooksPage.buttonPaaugliamsIrJaunimui
        );
    }

    public static void clickOnDropListPrekiuRikiavimas() {
        Common.clickElement(
                Locator.SortBooksPage.dropListPrekiuRikiavimas
        );
    }

    public static void clickOnDidziausiaNuolaida() {
        Common.clickElement(
                Locator.SortBooksPage.selectDidziausiaNuolaida
        );
    }

    public static String getMaxDiscountMessage() {
        return Common.getElementText(
                Locator.SortBooksPage.maxDiscountMessage
        );
    }
}
