package com.e2e.mantis.tests;

import org.openqa.selenium.remote.BrowserType;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.e2e.mantis.appmanager.ApplicationManager;

import java.io.File;
import java.io.IOException;

/**
 * Created by m on 2019-10-22.
 */

public class TestBase {


  protected static final ApplicationManager app
          = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

  @BeforeSuite(alwaysRun = true)
  public void setUp() throws Exception {
    app.init();
    app.ftp().upload(new File("src/test/resources/config_inc.php"), "config_inc.php", "config_inc.php.bak");
  }

  @AfterSuite(alwaysRun = true)
  public void tearDown() throws IOException {
    app.ftp().restore("config_inc.php.bak", "config_inc.php");
    app.stop();
  }

}