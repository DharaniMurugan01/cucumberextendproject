package com.definitions;

import com.utilities.Helperclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
  @Before
  public void setup() {
	  Helperclass.setUpdriver();
  }
  @After
  public void teardown(Scenario scenario){
	  Helperclass.teardown();
  }
}
