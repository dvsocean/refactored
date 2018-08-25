package com.oceana.testing;

import com.oceana.base.DriverBase;
import com.oceana.managers.User;
import org.testng.annotations.Test;

public class VerifyActionsOnHomePage extends DriverBase {

  @Test(dataProvider = "dataAccess")
  public void performSimpleLoginOnChrome(User user) {
    user.onTheDesktopHomePage().sendValueToSearchBar("motorcycles");
  }




}//End of class
