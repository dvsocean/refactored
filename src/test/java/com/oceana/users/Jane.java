package com.oceana.users;

public class Jane extends User{

  private String id = "";
  private String last_name = "";
  private String first_name = "";
  private String password = "";

  public String get_id() {
    return id;
  }

  public String getName() {
    return last_name;
  }

  public String getFirst_name() {
    return first_name;
  }

  public String getPassword() {
    return password;
  }
}
