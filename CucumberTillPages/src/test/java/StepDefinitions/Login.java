package StepDefinitions;

import Pages.LoginPage;
import Utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

public class Login extends CommonMethods {

    @Then("user enters valid username {string} and valid password {string}")
    public void user_enters_valid_username_and_valid_password(String username, String password) {
      sendText(loginPage.usernameTextBox,username);
      sendText(loginPage.passwordTextBox,password);
    }
    @Then("user click on login button")
    public void user_click_on_login_button() {
       doClick(loginPage.loginButton);
    }
    @Then("user logged in successfully")
    public void user_logged_in_successfully() {
       loginPage.welcomeOnDashBoard.isDisplayed();
    }
    @When("user enters username and password and verifies logins")
    public void user_enters_username_and_password_and_verifies_logins(DataTable dataTable) {
        List<Map<String,String>>credentials=dataTable.asMaps();
        for (Map<String,String> creden:credentials) {
            String username=creden.get("username");
            String password=creden.get("password");
            sendText(loginPage.usernameTextBox,username);
            sendText(loginPage.passwordTextBox,password);
            doClick(loginPage.loginButton);
            doClick(loginPage.welcomeOnDashBoard);
            doClick(driver.findElement(By.xpath("//a[text()='Logout']")));
        }
    }

}
