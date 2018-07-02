package com.oceana.managers;

import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.oceana.pages.HomePage;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ObjectManager {

  private HomePage homePage;

  public ObjectManager() {
    homePage = new HomePage();
  }

  public HomePage onTheDesktopHomePageInChrome(Method method, String url) throws MalformedURLException {
    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "macOS 10.13");
    caps.setCapability("version", "66.0");
    caps.setCapability("name", method.getName());
    WebDriverRunner.setWebDriver(new RemoteWebDriver(new URL(""), caps));

    Configuration.browser = "chrome";
    Configuration.timeout = 10000;
    open(url);
    return homePage;
  }

  public HomePage onTheDesktopHomePageInFireFox(Method method, String url)
      throws MalformedURLException {
    DesiredCapabilities caps = DesiredCapabilities.firefox();
    caps.setCapability("platform", "macOS 10.13");
    caps.setCapability("version", "59.0");
    caps.setCapability("name", method.getName());
    WebDriverRunner.setWebDriver(new RemoteWebDriver(new URL(""), caps));

    Configuration.browser = "chrome";
    Configuration.timeout = 10000;
    open(url);
    return homePage;
  }
}
