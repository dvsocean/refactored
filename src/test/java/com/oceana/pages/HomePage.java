package com.oceana.pages;

import com.oceana.elements.DesktopElements;
import com.oceana.interfaces.HomePageActions;
import com.oceana.users.Mary;
import com.oceana.users.Jane;

public class HomePage extends DesktopElements implements HomePageActions {

  private Mary mary = new Mary();
  private Jane jane = new Jane();

  @Override
  public HomePage login(Object user) {
    if(user.getClass().getSimpleName().equals("Mary")){
      DESKTOP_ID.setValue(mary.get_id());
      DESKTOP_LASTNAME.setValue(mary.getName());
      DESKTOP_PASSWORD.setValue(mary.getPassword()).pressEnter();
    } else if(user.getClass().getSimpleName().equals("Jane")) {
      DESKTOP_ID.setValue(jane.get_id());
      DESKTOP_LASTNAME.setValue(jane.getName());
      DESKTOP_PASSWORD.setValue(jane.getPassword()).pressEnter();
    } else {
      System.out.println("Invalid user applied, cannot proceed!");
    }
    return this;
  }

  public void sendValueToSearchBar(String value){
    SEARCH_BAR.setValue(value).pressEnter();
  }
}
