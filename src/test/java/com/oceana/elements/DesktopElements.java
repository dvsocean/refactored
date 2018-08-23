package com.oceana.elements;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class DesktopElements {

  protected SelenideElement DESKTOP_AADVN_INPUT = $(By.id("loginForm.loginId"));
  protected SelenideElement DESKTOP_LASTNAME_INPUT = $(By.id("loginForm.lastName"));
  protected SelenideElement DESKTOP_PASSWORD_INPUT = $(By.id("loginForm.password"));

  //google page
  protected SelenideElement SEARCH_BAR = $(By.id("lst-ib"));



}
