package com.e2e.mantis.tests;

import com.e2e.mantis.appmanager.HttpSession;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

/**
 * Created by m on 2019-12-19.
 */
public class LoginTests  extends TestBase {

  @Test
  public void testLogin() throws IOException {
    HttpSession session = app.newSession();
    assertTrue(session.login("administrator", "root"));
    assertTrue(session.isLoggedInAs("administrator"));
  }
}
