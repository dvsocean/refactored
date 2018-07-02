package com.oceana.managers;

import com.oceana.pages.HomePage;

public class ObjectManager {

  private HomePage homePage;

  public ObjectManager() {
    homePage = new HomePage();
  }

  public HomePage onTheDesktopHomePage(){
    return homePage;
  }
}
