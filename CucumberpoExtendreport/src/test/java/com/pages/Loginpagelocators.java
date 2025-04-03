package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpagelocators {
 @FindBy(name="username")
 public WebElement username;
 @FindBy(name="password")
 public WebElement password;
 @FindBy(xpath="//button[@type='submit']")
 public WebElement submit;
}
