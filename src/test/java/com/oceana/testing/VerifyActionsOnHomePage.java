package com.oceana.testing;

import com.oceana.base.DriverBase;
import com.oceana.managers.ObjectManager;
import com.oceana.users.MaryCiccone;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import org.testng.annotations.Test;

public class VerifyActionsOnHomePage extends DriverBase {

  private MaryCiccone mary = new MaryCiccone();

  @Test(dataProvider = "dataAccess")
  public void performSimpleLoginOnChrome(Method method, ObjectManager manager)
      throws MalformedURLException {
    manager.onTheDesktopHomePageInChrome(method, url).login(mary);
  }

  @Test(dataProvider = "dataAccess")
  public void validateLoginOnFireFox(Method method, ObjectManager manager)
      throws MalformedURLException {
    manager.onTheDesktopHomePageInFireFox(method, url).login(mary);
  }
}
