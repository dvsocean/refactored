package com.oceana.testing;

import com.oceana.base.DriverBase;
import com.oceana.managers.User;
import com.oceana.users.Mary;
import java.lang.reflect.Method;
import org.testng.annotations.Test;

public class VerifyActionsOnHomePage extends DriverBase {

  private Mary mary = new Mary();

  @Test(dataProvider = "dataAccess")
  public void performSimpleLoginOnChrome(Method method, User user) {
    user.onTheDesktopHomePage().sendValueToSearchBar("motorcycles");
  }

}
