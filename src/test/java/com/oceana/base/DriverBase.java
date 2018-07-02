package com.oceana.base;

import com.codeborne.selenide.Selenide;
import com.oceana.managers.ObjectManager;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class DriverBase {

  protected String url;

  @BeforeClass
  public void getParameter(ITestContext ctx){
    url = ctx.getCurrentXmlTest().getParameter("testingURL");
  }

  @DataProvider
  public Object[][] dataAccess(){
    return new Object[][]{
        new Object[]{ new ObjectManager() }
    };
  }

  @AfterMethod
  public void tearDown(){
    Selenide.close();
  }
}
