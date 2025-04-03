package com.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helperclass {
  public static Helperclass help;
  public static WebDriver driver;
  public static WebDriverWait wait;
  public final static int TIMEOUT=10;
  Helperclass(){
	  driver=new ChromeDriver();
	  wait=new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
  }
  public static void openpage(String url) {
	  driver.get(url);
  }
  public static WebDriver getDriver() {
	  return driver;
  }
  public static void setUpdriver() {
	  if(help==null) {
		  help=new Helperclass();
	  }
  }
  public static void teardown() {
	  if(driver!=null) {
		  driver.close();
		  driver.quit();
	  }
	  help=null;
  }
}
