package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
    }

    @Given("user opens login page")
    public void userOpensLoginPage() {
        loginPage.open();
    }

    @When("user enters username and password")
    public void userEntersUsernameAndPassword() {
        loginPage.enterUsername("student");
        loginPage.enterPassword("Password123");

    }

    @And("click login button")
    public void clickLoginButton() {
        loginPage.clickLogin();

    }

    @Then("verify Logged in url and success message")
    public void verifyLoggedInUrlAndSuccessMessage() {
       loginPage.verifysuccessmsg();
    }
}