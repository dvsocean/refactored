package com.oceana.elements;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class Elements {


  protected SelenideElement AADVN_INPUT_FIELD = $(By.id("loginForm.loginId"));
  protected SelenideElement LASTNAME_INPUT_FIELD = $(By.id("loginForm.lastName"));
  protected SelenideElement PASSWORD_INPUT_FIELD = $(By.id("loginForm.password"));



}
