package com.oceana.base;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class DriverBase {

  private String url;

  @DataProvider
  public Object[][] dataAccess(){
    return new Object[][]{
        new Object[]{ }
    };
  }

  @BeforeClass
  public void getXMLfileParameter(ITestContext ctx){
    url = ctx.getCurrentXmlTest().getParameter("testingURL");
  }

  @BeforeMethod
  public void setup(){
    System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");
    WebDriverRunner.setWebDriver(new ChromeDriver());
    Selenide.open(url);
  }

  @AfterMethod
  public void tearDown(){
    Selenide.close();
  }
}
