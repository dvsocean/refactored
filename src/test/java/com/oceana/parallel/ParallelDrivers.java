package com.oceana.parallel;

import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;

public class ParallelDrivers {

  protected String url;

  @BeforeClass
  public void getParameter(ITestContext ctx){
    url = ctx.getCurrentXmlTest().getParameter("testingURL");
  }

  protected void startChrome(Method method, String os, String version) throws MalformedURLException {
    Class clazz = this.getClass();
    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", os);
    caps.setCapability("version", version);
    caps.setCapability("name", clazz.getSimpleName() + " > " + method.getName());
    WebDriverRunner.setWebDriver(new RemoteWebDriver(new URL("http://ChangeDomain:8c8d82a8-4ebb-46c9-bb26-e1a1fd8f816b@ondemand.saucelabs.com:80/wd/hub"), caps));

    Configuration.browser = "chrome";
    Configuration.timeout = 10000;
    open(url);
  }

  protected void startFirefox(Method method, String os, String version) throws MalformedURLException {
    Class clazz = this.getClass();
    DesiredCapabilities caps = DesiredCapabilities.firefox();
    caps.setCapability("platform", os);
    caps.setCapability("version", version);
    caps.setCapability("name", clazz.getSimpleName() + " > " + method.getName());
    WebDriverRunner.setWebDriver(new RemoteWebDriver(new URL("http://ChangeDomain:8c8d82a8-4ebb-46c9-bb26-e1a1fd8f816b@ondemand.saucelabs.com:80/wd/hub"), caps));

    Configuration.browser = "chrome";
    Configuration.timeout = 10000;
    open(url);
  }

  protected void startSafari(Method method, String os, String version) throws MalformedURLException {
    Class clazz = this.getClass();
    DesiredCapabilities caps = DesiredCapabilities.safari();
    caps.setCapability("platform", os);
    caps.setCapability("version", version);
    caps.setCapability("name", clazz.getSimpleName() + " > " + method.getName());
    WebDriverRunner.setWebDriver(new RemoteWebDriver(new URL("http://ChangeDomain:8c8d82a8-4ebb-46c9-bb26-e1a1fd8f816b@ondemand.saucelabs.com:80/wd/hub"), caps));

    Configuration.browser = "chrome";
    Configuration.timeout = 10000;
    open(url);
  }

  protected void startEdge(Method method, String os, String version) throws MalformedURLException {
    Class clazz = this.getClass();
    DesiredCapabilities caps = DesiredCapabilities.edge();
    caps.setCapability("platform", os);
    caps.setCapability("version", version);
    caps.setCapability("name", clazz.getSimpleName() + " > " + method.getName());
    WebDriverRunner.setWebDriver(new RemoteWebDriver(new URL("http://ChangeDomain:8c8d82a8-4ebb-46c9-bb26-e1a1fd8f816b@ondemand.saucelabs.com:80/wd/hub"), caps));

    Configuration.browser = "chrome";
    Configuration.timeout = 10000;
    open(url);
  }

}
