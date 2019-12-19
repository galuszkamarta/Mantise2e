package com.e2e.mantis.tests;

import org.testng.annotations.Test;

/**
 * Created by m on 2019-12-19.
 */
public class RegistrationTests extends TestBase{

  @Test
  public void testRegistration() {
    app.registration().start("user1", "user1@localhost.localdomain");
  }
}
