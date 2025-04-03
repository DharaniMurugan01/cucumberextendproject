package com.actions;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.support.PageFactory;
import com.pages.Loginpagelocators;
import com.utilities.Helperclass;
public class Loginpageactions {
    Loginpagelocators lpl = null;
    String un, pw;
    public Loginpageactions() {
        this.lpl = new Loginpagelocators();
        PageFactory.initElements(Helperclass.getDriver(), lpl);
    }
    public void setun(String un) {
        lpl.username.sendKeys(un);
    }
    public void setpw(String pw) {
        lpl.password.sendKeys(pw);
    }
    public void clicklogin() {
        lpl.submit.click();
    }
    public void Login() {
        Properties prop = new Properties();
        try {
            File file = new File("C:\\Users\\ADMIN\\eclipse-TestngAssessment\\CucumberpoExtendreport\\src\\test\\resources\\testdata.properties"); 
            FileInputStream fis = new FileInputStream(file);
            prop.load(fis);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        un = prop.getProperty("username");
        pw = prop.getProperty("password");
        this.setun(un);
        this.setpw(pw);
        this.clicklogin();
    }
}
