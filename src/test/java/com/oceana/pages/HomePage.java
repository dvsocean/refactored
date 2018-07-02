package com.oceana.pages;

import com.oceana.elements.DesktopElements;
import com.oceana.interfaces.HomePageActions;
import com.oceana.users.MaryCiccone;
import com.oceana.users.MaryPoints;

public class HomePage extends DesktopElements implements HomePageActions {

  private MaryCiccone maryC = new MaryCiccone();
  private MaryPoints maryP = new MaryPoints();

  @Override
  public HomePage login(Object user) {
    if(user.getClass().getSimpleName().equals("MaryCiccone")){
      DESKTOP_AADVN_INPUT.setValue(maryC.getAadvn_number());
      DESKTOP_LASTNAME_INPUT.setValue(maryC.getLast_name());
      DESKTOP_PASSWORD_INPUT.setValue(maryC.getPassword()).pressEnter();
    } else if(user.getClass().getSimpleName().equals("MaryPoints")) {
      DESKTOP_AADVN_INPUT.setValue(maryP.getAadvn_number());
      DESKTOP_LASTNAME_INPUT.setValue(maryP.getLast_name());
      DESKTOP_PASSWORD_INPUT.setValue(maryP.getPassword()).pressEnter();
    } else {
      System.out.println("Invalid user applied, cannot proceed!");
    }
    return this;
  }
}
