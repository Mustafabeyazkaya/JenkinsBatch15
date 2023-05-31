package Steps;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginSteps extends CommonMethods {
    @Given("the user navigates to the url")
    public void the_user_navigates_to_the_url() {
        openTheBrowser();
    }
    @When("user enters valid email and password")
    public void user_enters_valid_email_and_password() {
        WebElement usernameTextBox=driver.findElement(By.id("txtUsername"));
        sendText(usernameTextBox, ConfigReader.getValueOfProperty("username"));
        WebElement passwordTextBox=driver.findElement(By.id("txtPassword"));
        sendText(passwordTextBox, ConfigReader.getValueOfProperty("password"));
    }
    @When("clicks on Login Button")
    public void clicks_on_login_button() {
        WebElement loginBtn=driver.findElement(By.id("btnLogin"));
        doClick(loginBtn);
    }
    @Then("the user is logged in")
    public void the_user_is_logged_in() {
        //Assertion that you are logged in
        System.out.println("logged in");
    }
    @When("user enters valid email {string} and password {string}")//different
    public void user_enters_valid_email_and_password(String username, String password) {
        WebElement usernameTextBox=driver.findElement(By.id("txtUsername"));
        sendText(usernameTextBox, username);
        WebElement passwordTextBox=driver.findElement(By.id("txtPassword"));
        sendText(passwordTextBox, password);
    }
    @When("user enters a username {string} and password {string}")//different
    public void user_enters_a_username_and_password(String username, String password) {
        WebElement usernameTextBox=driver.findElement(By.id("txtUsername"));
        sendText(usernameTextBox, username);
        WebElement passwordTextBox=driver.findElement(By.id("txtPassword"));
        sendText(passwordTextBox, password);
    }
    @Then("the user is not logged in")// different
    public void the_user_is_not_logged_in() {
        System.out.println("user did not logged in");
    }

}
