package com.oceana.base;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;

public class InitDriverBase {

  public WebDriver getDriver(){
    return WebDriverRunner.getWebDriver();
  }

}
