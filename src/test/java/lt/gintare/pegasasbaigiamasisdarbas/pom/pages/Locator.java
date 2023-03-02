package lt.gintare.pegasasbaigiamasisdarbas.pom.pages;

import org.openqa.selenium.By;

public class Locator {

    public static class NewAccountPage {
        public static By buttonCloseCookies =
                By.xpath("//a[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
        public static By buttonLogIn =
                By.xpath("//i[@class='UserAccountTrigger-profileIcon-2ow']");
        public static By inputEmail =
                By.xpath("//input[@placeholder='Įveskite el. paštą']");
        public static By inputPassword =
                By.xpath("//input[@name='password']");
        public static By inputConfirmPassword =
                By.xpath("//input[@placeholder='Pakartokite naują slaptažodį']");
        public static By buttonSukurtiPaskyra =
                By.xpath("//button[@data-cy='create-an-account']");
        public static By checkBoxSusipazinauSuTaisyklem =
                By.xpath("//input[@name='privacyPolicyRead'] ");
        public static By buttonSukurtiPaskyraWithEnteredInfo =
                By.xpath("//button[@data-cy='button-customer-account-submit']");
        public static By paragraphMessageAlert =
                By.xpath("//p[@class='Message-message-1d9']");
    }

    public static class LogInPage {
        public static By buttonCloseCookies =
                By.xpath("//a[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
        public static By buttonLogIn =
                By.xpath("//i[@class='UserAccountTrigger-profileIcon-2ow']");
        public static By inputEmail =
                By.xpath("//input[@placeholder='Įveskite el. paštą']");
        public static By inputPassword =
                By.xpath("//input[@name='password']");
        public static By buttonPrisijungti =
                By.xpath("//button[@data-cy='button-sign-in-form-submit']");
        public static By paragraphMessageAlert =
                By.xpath("//p[@class='Message-message-1d9']");
    }

    public static class BookPurchingPage {
        public static By buttonCloseCookies =
                By.xpath("//a[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
        public static By mainMeniuKnygos =
                By.xpath("//*[@id='knygos/-604']");
        public static By meniuGroupKnygosNaujosKnygos =
                By.xpath("//*[@data-cy='lupa-child-category-item' and contains(text(),'Naujos')]");
        public static By bookMedineKauke =
                By.xpath("//div[@title = 'Medinė kaukė. Tikroji mano istorija']");
        public static By buttonMedineKaukeToChart =
                By.xpath("//button[@title='Įdėti į krepšelį']");
        public static By buttonCheckTheCart =
                By.xpath("(//button[contains(text(), 'Peržiūrėti krepšelį')])[2]");
        public static By medineKaukeIsInTheCart =
                By.xpath("(//*[@class='CartItemDetails-productName-b8k'])[1]");
    }

    public static class SortBooksPage {
        public static By buttonCloseCookies =
                By.xpath("//a[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
        public static By buttonKnygosVaikamsPaaugliamsIrJaunimui =
                By.xpath("(//a[text()='Knygos vaikams, paaugliams ir jaunimui'])[1]");
        public static By buttonPaaugliamsIrJaunimui =
                By.xpath("(//div[@class='lupa-child-category-item']//a[text()])[3]");
        public static By dropListPrekiuRikiavimas =
                By.xpath("(//select[@class='lupa-select-dropdown'])[4]");
        public static By selectDidziausiaNuolaida =
                By.xpath("(//*[@id='lupa-select']/select)[4]");
        public static By maxDiscountMessage =
                By.xpath("//div[text()='-80%']");
    }

    public static class GiftCardPurchingPage {
        public static By buttonCloseCookies =
                By.xpath("//a[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
        public static By buttonDovanuKuponai =
                By.xpath("//a[@target='_self' and contains(text(), 'Dovanų')]");
        public static By buttonDovanuKuponasTamsus =
                By.xpath("(//input[@class='form-check-input'])[3]");
        public static By buttonPasirinktiSuma5Eurai =
                By.xpath("(//button//span[contains(text(), '5')])[1]");
        public static By buttonIdetiKuponaIKrepseli =
                By.xpath("//button[@title='Įdėti į krepšelį']");
        public static By buttonPerziurekiteKrepseliWithGiftCard =
                By.xpath("(//button[contains(text(), 'Peržiūrėti krepšelį')])[2]");
        public static By buttonDovanuKuponasTamsusIsInTheCart =
                By.xpath("(//a[text()='El. dovanų kuponas vaikiškas (tamsus)'])[1]");
    }

    public static class BookDeletingPage {
        public static By buttonCloseCookies =
                By.xpath("//a[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
        public static By mainMeniuKnygos =
                By.xpath("//*[@id='knygos/-604']");
        public static By meniuGroupKnygosNaujosKnygos =
                By.xpath("//*[@data-cy='lupa-child-category-item' and contains(text(),'Naujos')]");
        public static By bookMedineKauke =
                By.xpath("//div[@title = 'Medinė kaukė. Tikroji mano istorija']");
        public static By buttonMedineKaukeToChart =
                By.xpath("//button[@title='Įdėti į krepšelį']");
        public static By buttonCheckTheCart =
                By.xpath("(//button[contains(text(), 'Peržiūrėti krepšelį')])[2]");
        public static By buttonDelete =
                By.xpath("(//div[@class='DesktopCartItem-desktopCartItem-3Qg'])" +
                        "[1]//button[contains(@class,'CartItemRemoveButton-remove')]");
        public static By messageTheCartIsEmpty =
                By.xpath("//*[@id='root']/div[3]/h1");
    }
}