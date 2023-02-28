package lt.gintare.pegasasbaigiamasisdarbas.pom.pages;

import org.openqa.selenium.By;

public class Locator {

    public static class MakeNewAccountPage {
        public static By buttonLogIn = By.xpath("//a[@class ='MainBarMobile-profileLink-_i0']");
        public static By inputEmail = By.xpath("(//input[@name='email'])[1]");
        public static By inputPassword = By.xpath("//input[@name='password']");
        public static By buttonPrisijungti = By.xpath("");
        public static By buttonConfirmPassword = By.xpath("");
        public static By paragraphMessageAlert = By.xpath("//p[@class='Message-message-1d9']");
    }

    public static class LogInWithNonExistingAccountPage {
        public static By buttonLogIn = By.xpath("//a[@class ='MainBarMobile-profileLink-_i0']");
    }

    public static class AddingProductToCartPage {
        public static By meniuGroupKnygos = By.xpath("//*[@id='root']/div[3]/nav/ul/li[1]/a");
    }
}
