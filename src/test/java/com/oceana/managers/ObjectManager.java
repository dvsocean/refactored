package com.oceana.managers;

import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.oceana.pages.HomePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
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

  /*
      System.setProperty("http.proxyHost", "proxy.name.name.com");
      System.setProperty("http.proxyPort", "2525");
      System.setProperty("https.proxyHost", "proxy.name.name.com");
      System.setProperty("https.proxyPort", "2525");
   */

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

  public void onTheAndroidApp() throws MalformedURLException {
    // If using a local file --> File file = new File("app-1.apk");
    DesiredCapabilities cap = new DesiredCapabilities();
    //cap.setCapability("name", NativeMobileBase.class.getSimpleName() + " > See report for breakdown");
    cap.setCapability("appiumVersion", "1.6.4");
    cap.setCapability("deviceName", "Android Emulator");
    cap.setCapability("deviceOrientation", "portrait");
    cap.setCapability("browserName", "");
    cap.setCapability("platformVersion", "6.0");
    cap.setCapability("platformName", "Android");
    cap.setCapability("app", "sauce-storage:app-1.apk");
    //AndroidDriver driver = new AndroidDriver();
    AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://AccountName:468r345w2-h765-32y3-n4f4-324356q3456t@ondemand.saucelabs.com:443/wd/hub"), cap);
    WebDriverRunner.setWebDriver(driver);
  }

  public void onTheIOSApp() throws MalformedURLException {
    DesiredCapabilities caps = DesiredCapabilities.iphone();
    //caps.setCapability("name", NativeMobileBase.class.getSimpleName() + " > See report for breakdown");
    caps.setCapability("appiumVersion", "1.6.4");
    caps.setCapability("deviceName", "iPhone 7");
    caps.setCapability("deviceOrientation", "portrait");
    caps.setCapability("platformVersion", "10.3");
    caps.setCapability("platformName", "iOS");
    caps.setCapability("browserName", "Safari");
    caps.setCapability("app", "sauce-storage:myIOSapp.app");
    IOSDriver driver = new IOSDriver<>(new URL("http://AccountName:468r345w2-h765-32y3-n4f4-324356q3456t@ondemand.saucelabs.com:443/wd/hub"), caps);
    WebDriverRunner.setWebDriver(driver);
  }
}
