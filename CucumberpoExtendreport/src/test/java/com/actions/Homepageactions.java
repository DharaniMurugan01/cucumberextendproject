package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.pages.Homepagelocators;
import com.utilities.Helperclass;

public class Homepageactions {
  Homepagelocators hpl=new Homepagelocators();
  public Homepageactions() {
	  this.hpl=new Homepagelocators();
	  PageFactory.initElements(Helperclass.getDriver(), hpl);
  }
  public String gethometext() {
	  return hpl.dash.getText();
  }
}
