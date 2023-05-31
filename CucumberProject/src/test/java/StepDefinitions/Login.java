package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login extends CommonMethods {
    /*@Given("user go to website")
    public void user_go_to_website() {
        openBrowser();
    }*/
    @When("user enter valid username and password")
    public void user_enter_valid_username_and_password() {
        //WebElement usernameTxtBox=driver.findElement(By.id("txtUsername"));
        sendText(login.usernameTxtBox,ConfigReader.getValueOfProperties("username"));
        //usernameTxtBox.sendKeys(ConfigReader.getValueOfProperties("username"));
        //sendText(usernameTxtBox,ConfigReader.getValueOfProperties("username"));
        //WebElement password=driver.findElement(By.id("txtPassword"));
        sendText(login.password,ConfigReader.getValueOfProperties("password"));
        //password.sendKeys(ConfigReader.getValueOfProperties("password"));
        //sendText(password,ConfigReader.getValueOfProperties("password"));
    }
    @Then("user click on the Login button")
    public void user_click_on_the_login_button() {
       // WebElement loginBttun= driver.findElement(By.id("btnLogin"));
        doClick(login.loginBttun);
        //loginBttun.click();
        //doClick(loginBttun);
    }
    @Then("user logged in successfully")
    public void user_logged_in_successfully() {
       //WebElement welcomeOption=driver.findElement(By.xpath("//a[text()='Welcome Admin']"));
       String text=login.welcomeOption.getText();
       boolean isDisplayed=login.welcomeOption.isDisplayed();
       if (isDisplayed){
           System.out.println("User logged in successfully");
       }else {
           System.out.println("User got failed");
       }
    }
}
