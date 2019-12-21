package com.e2e.mantis.model;

/**
 * Created by m on 2019-12-20.
 */
public class MailMessage {
  public String to;
  public String text;

  public MailMessage(String to, String text) {
    this.to = to;
    this.text = text;
  }
}
