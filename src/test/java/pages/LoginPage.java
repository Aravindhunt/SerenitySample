package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.By;

@DefaultUrl("https://practicetestautomation.com/practice-test-login/")
public class LoginPage extends PageObject {

    By username = By.id("username");
    By password = By.id("password");
    By submitBtn = By.id("submit");
    public void enterUsername(String user) {
        $(username).type(user);
    }

    public void enterPassword(String pass) {
        $(password).type(pass);
    }

    public void clickLogin() {
        $(submitBtn).click();
    }
}