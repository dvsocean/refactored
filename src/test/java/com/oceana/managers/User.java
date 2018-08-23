package com.oceana.managers;

import com.oceana.pages.HomePage;

public class User {

  HomePage homePage;

  public User() {
    homePage = new HomePage();
  }

  public HomePage onTheDesktopHomePage() {
    return homePage;
  }
}
