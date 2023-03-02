package lt.gintare.pegasasbaigiamasisdarbas.pom.pages;

import lt.gintare.pegasasbaigiamasisdarbas.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Common {

    public static void openUrl(String url) {
        Driver.setDriver();
        Driver.getDriver().get(url
        );
    }

    public static void closeDriver() {
        Driver.closeDriver(
        );
    }

    public static void clickElement(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        webDriverWait
                .until(ExpectedConditions
                        .visibilityOfElementLocated(locator)
                );
        getElement(locator).click(
        );
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator
        );
    }

    public static void sendKeysToElement(By locator, String text) {
        getElement(locator).sendKeys(text
        );
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText(
        );
    }
}