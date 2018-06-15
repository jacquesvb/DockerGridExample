import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MyTest {
    static DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
    static DesiredCapabilities firefoxCapabilities = DesiredCapabilities.firefox();

    public static void main(String args[]) throws MalformedURLException {
        RemoteWebDriver chrome = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeCapabilities);
        RemoteWebDriver firefox = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), firefoxCapabilities);

        // run against chrome
        chrome.get("https://www.google.com");
        System.out.println(chrome.getTitle());

        // run against firefox
        firefox.get("https://www.google.com");
        System.out.println(firefox.getTitle());

        chrome.quit();
        firefox.quit();
    }
}
