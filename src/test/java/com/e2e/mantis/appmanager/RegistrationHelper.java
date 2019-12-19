package com.e2e.mantis.appmanager;

import org.openqa.selenium.WebDriver;

/**
 * Created by g on 2019-12-19.
 */
public class RegistrationHelper {
  private final ApplicationManager app;
  private WebDriver driver;

  public RegistrationHelper(ApplicationManager app) {
    this.app = app;
    driver = app.getDriver();
  }

  public void start(String username, String email) {
    driver.get(app.getProperty("web.baseUrl") + "/signup_page.php");
  }
}
