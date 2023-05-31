package StepDefinition;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends CommonMethods {
    /*@Given("user go to the url")
    public void user_go_to_the_url() {
        openTheWebsite();
    }*/
    @When("user enter the valid username and password")
    public void user_enter_the_valid_username_and_password() {
       sendText(login.usernameTextBox, ConfigReader.getValueOfProperties("username"));
       sendText(login.passwordTextBox,ConfigReader.getValueOfProperties("password"));
    }
    @Then("user click on the login button")
    public void user_click_on_the_login_button() {
        doClick(login.loginBtn);
    }
    @Then("user check that he is logged in successfully")
    public void user_check_that_he_is_logged_in_successfully() {
        boolean userloggedIn = dash.welcomeIcon.isDisplayed();
        if (userloggedIn) {
            System.out.println("User is logged in Successfully");
        }else {
            System.out.println("User got failed");
        }
    }
  /*  @Then("close the browser")
    public void close_the_browser() {
     closeTheWebsite();
    }*/
}
