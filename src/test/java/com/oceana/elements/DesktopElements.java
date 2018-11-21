package com.oceana.elements;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class DesktopElements {

  protected SelenideElement DESKTOP_ID = $(By.id("id"));
  protected SelenideElement DESKTOP_LASTNAME = $(By.id("lastName"));
  protected SelenideElement DESKTOP_PASSWORD = $(By.id("password"));

  //google page
  protected SelenideElement SEARCH_BAR = $(By.name("q"));

  //AAU LOGIN
  protected SelenideElement USERNAME = $(By.id("user_login"));
  protected SelenideElement PASSWORD = $(By.id("user_pass"));



}
