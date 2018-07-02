package com.oceana.testing;

import com.oceana.base.DriverBase;
import com.oceana.managers.ObjectManager;
import com.oceana.parallel.ParallelDrivers;
import com.oceana.users.MaryPoints;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import javafx.beans.binding.ObjectExpression;
import org.testng.annotations.Test;

public class VerifyActionsOnHomePage extends DriverBase {

  private MaryPoints mary = new MaryPoints();

//  @Test(dataProvider = "dataAccess")
//  public void performSimpleLogin(ObjectManager manager) throws InterruptedException {
//    manager.onTheDesktopHomePage().login(mary);
//    Thread.sleep(3000);
//  }

  @Test(dataProvider = "dataAccess")
  public void loginOnFireFoxBrowser(Method method, ObjectManager manager)
      throws MalformedURLException {
    startFirefox(method, "macOS 10.13", "59.0");
    manager.onTheDesktopHomePage().login(mary);
  }

  @Test(dataProvider = "dataAccess")
  public void loginOnChromeBrowser(Method method, ObjectManager manager)
      throws MalformedURLException {
    startChrome(method, "macOS 10.13", "66.0");
    manager.onTheDesktopHomePage().login(mary);
  }

}
