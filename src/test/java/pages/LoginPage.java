package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

@DefaultUrl("https://practicetestautomation.com/practice-test-login/")
public class LoginPage extends PageObject {

    By username = By.id("username");
    By password = By.id("password");
    By submitBtn = By.id("submit");
   // String currenturl=getDriver().getCurrentUrl();
    public void enterUsername(String user) {
        $(username).type(user);
    }

    public void enterPassword(String pass) {
        $(password).type(pass);
    }

    public void clickLogin() {
        $(submitBtn).click();
    }
    public  void verifysuccessmsg(){
        assertThat(getDriver().getCurrentUrl()).contains("logged-in-successfully");
    }
}