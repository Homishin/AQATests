package helpDesk.core;

import org.openqa.selenium.WebDriver;

public class BaseSelenium {
    protected static WebDriver driver;

    public static void setDriver(WebDriver driver){
        BaseSelenium.driver = driver;
    }
}
