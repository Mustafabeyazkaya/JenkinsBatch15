package StepsDefinition;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class FbLogin extends CommonMethods {
   /* @Given("go to fb.com")
    public void go_to_fb_com() {
      openTheBrowser();
    }*/
    @When("enter invalid email and invalid password")
    public void enter_invalid_email_and_invalid_password() {
        //driver.findElement(By.id("email")).sendKeys(ConfigReader.getValueOfProperty("username"));
        sendText(login.usernameBox,ConfigReader.getValueOfProperty("username"));
        //driver.findElement(By.id("pass")).sendKeys(ConfigReader.getValueOfProperty("password"));
        sendText(login.passwordBox,ConfigReader.getValueOfProperty("password"));
    }
    @When("click on login button")
    public void click_on_login_button() {
        //driver.findElement(By.xpath("//button[text()='Log In']")).click();
        doClick(login.LoginBttn);
    }
    @Then("check the text")
    public void check_the_text() {
      String expectedText="The password you’ve entered is incorrect. Forgot Password?";
      //String actualText=driver.findElement(By.xpath("//div[text()='The password you’ve entered is incorrect. ']")).getText();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(login.actualText,expectedText);
    }
  /*  @Then("close the browser")
    public void close_the_browser() {
       closeBrowser();
    }*/
  @When("user enter {string} and {string}")
  public void user_enter_and(String a, String b) {
      sendText(login.usernameBox, a);
      sendText(login.passwordBox, b);
  }
    @Then("check the text {string}")
    public void check_the_text(String c) {
        Assert.assertEquals(login.actualText,c);
    }


}
