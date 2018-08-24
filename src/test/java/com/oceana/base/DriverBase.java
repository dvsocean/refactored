package com.oceana.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.oceana.managers.User;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class DriverBase extends InitDriverBase {

  protected String url;

  @DataProvider
  public Object[][] dataAccess(){
    return new Object[][]{
        new Object[]{ new User() }
    };
  }

  @BeforeClass
  public void getParameter(ITestContext ctx){
    url = "";
    Configuration.baseUrl = ctx.getCurrentXmlTest().getParameter("testingURL");

    System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");
    WebDriverRunner.setWebDriver(new ChromeDriver());
    Selenide.open("/");
  }

  @AfterMethod
  public void tearDown(ITestResult result){
    String os = System.getProperty("os.name").toLowerCase();
    if (os.contains("linux")) {
      ((JavascriptExecutor) WebDriverRunner.getWebDriver()).executeScript("sauce:job-result=" + (result.isSuccess() ? "passed" : "failed"));
    }
    Selenide.close();
  }
}
