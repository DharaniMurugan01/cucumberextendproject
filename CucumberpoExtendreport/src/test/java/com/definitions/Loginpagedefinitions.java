package com.definitions;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.actions.Homepageactions;
import com.actions.Loginpageactions;
import com.pages.Loginpagelocators;
import com.utilities.Helperclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpagedefinitions {
	Loginpageactions lpa=new Loginpageactions();
	Homepageactions hpa=new Homepageactions();
	@Given("user is on hrmloginpage {string}")
	public void Logintest(String string) {
		Helperclass.openpage(string);
	}

	@When("the user enter username and password")
	public void gotohomepage() {
		lpa.Login();
	}

	@Then("the user should able to login successfully and new page opem")
	public void Verifylogin() {
		Assert.assertTrue(hpa.gethometext().contains("Dashboard"));
	}
}
