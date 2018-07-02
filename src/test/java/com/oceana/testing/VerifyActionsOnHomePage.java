package com.oceana.testing;

import com.oceana.base.DriverBase;
import com.oceana.managers.ObjectManager;
import com.oceana.users.User;
import org.testng.annotations.Test;

public class VerifyActionsOnHomePage extends DriverBase {

  private User user = new User();

  @Test(dataProvider = "dataAccess")
  public void performSimpleLogin(ObjectManager manager) {
    manager.onTheHomePage().login(user);
  }

}
