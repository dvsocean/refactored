package com.oceana.base;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.oceana.managers.ObjectManager;
import com.oceana.parallel.ParallelDrivers;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class DriverBase extends ParallelDrivers {

  @DataProvider
  public Object[][] dataAccess(){
    return new Object[][]{
        new Object[]{ new ObjectManager() }
    };
  }

//  @BeforeMethod
//  public void setup(){
//    System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");
//    WebDriverRunner.setWebDriver(new ChromeDriver());
//    Selenide.open(url);
//  }

  @AfterMethod
  public void tearDown(){
    Selenide.close();
  }
}
