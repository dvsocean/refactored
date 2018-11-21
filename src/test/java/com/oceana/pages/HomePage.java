package com.oceana.pages;

import com.codeborne.selenide.SelenideElement;
import com.oceana.elements.DesktopElements;
import com.oceana.interfaces.HomePageActions;
import com.oceana.users.Mary;
import com.oceana.users.Jane;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

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

  public HomePage login(String username, String password) {
    USERNAME.setValue(username);
    PASSWORD.setValue(password).pressEnter();
    return this;
  }

  public void collectLinks(){
    List<SelenideElement> links = $$(By.tagName("a"));
    for (SelenideElement ele: links){
      System.out.println("RES --> " + ele.getAttribute("href"));
    }
  }
}
