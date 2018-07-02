package com.oceana.testing;

import com.oceana.base.DriverBase;
import com.oceana.managers.ObjectManager;
import com.oceana.users.MaryPoints;
import org.testng.annotations.Test;

public class VerifyActionsOnHomePage extends DriverBase {

  private MaryPoints mary = new MaryPoints();

  @Test(dataProvider = "dataAccess")
  public void performSimpleLogin(ObjectManager manager) throws InterruptedException {
    manager.onTheDesktopHomePage().login(mary);
    Thread.sleep(3000);
  }

}
