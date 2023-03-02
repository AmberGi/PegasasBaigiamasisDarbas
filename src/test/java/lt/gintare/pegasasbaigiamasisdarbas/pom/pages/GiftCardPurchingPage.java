package lt.gintare.pegasasbaigiamasisdarbas.pom.pages;

public class GiftCardPurchingPage {
    public static void open() {
        Common.openUrl("https://www.pegasas.lt"
        );
    }

    public static void closeCookies() {
        Common.clickElement(
                Locator.GiftCardPurchingPage.closeCookiesbutton
        );
    }

    public static void clickOnDovanuKuponai() {
        Common.clickElement(
                Locator.GiftCardPurchingPage.buttonDovanuKuponai
        );
    }

    public static void clickOnDovanuKuponasVaikiskasTamsus() {
        Common.clickElement(
                Locator.GiftCardPurchingPage.buttonDovanuKuponasTamsus
        );
    }

    public static void clickOnPasirinkiteSuma5Eurai() {
        Common.clickElement(
                Locator.GiftCardPurchingPage.buttonPasirinktiSuma5Eurai
        );
    }

    public static void clickOnIdekiteKuponaIKrepseli() {
        Common.clickElement(
                Locator.GiftCardPurchingPage.buttonIdetiKuponaIKrepseli
        );
    }

    public static void clickOnPerziurekiteKrepseli() {
        Common.clickElement(
                Locator.GiftCardPurchingPage.buttonPerziurekiteKrepseliWithGiftCard
        );
    }

    public static String dovanuKuponasVaikiskasTamsusIsInTheCart() {
        return Common.getElementText(
                Locator.GiftCardPurchingPage.buttonDovanuKuponasTamsusIsInTheCart
        );
    }
}
