package com.oceana.pages;

import com.oceana.elements.Elements;
import com.oceana.interfaces.HomePageActions;
import com.oceana.users.User;

public class HomePage extends Elements implements HomePageActions {

  @Override
  public HomePage login(User user) {
    AADVN_INPUT_FIELD.setValue(user.getAadvn_number());
    LASTNAME_INPUT_FIELD.setValue(user.getLast_name());
    PASSWORD_INPUT_FIELD.setValue(user.getPassword()).pressEnter();
    return this;
  }
}
