package lt.gintare.pegasasbaigiamasisdarbas.pom.pages;

import lt.gintare.pegasasbaigiamasisdarbas.pom.utils.Driver;

public class Common {

    public static void openUrl(String url) {
        Driver.setDriver();
        Driver.getDriver().get(url);
    }

    public static void closeDriver() {
        Driver.closeDriver();
    }
}
