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
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class Login extends CommonMethods {

    @Given("go to website")
    public void go_to_website() {
       openBrowser();
    }
    @When("Enter valid username and password")
    public void enter_valid_username_and_password() {
        //driver.findElement(By.id("txtUsername")).sendKeys(ConfigReader.getValueFromProperties("username"));//reading data from the getPropertyValue Method
        WebElement username=driver.findElement(By.id("txtUsername"));
        sendText(username,ConfigReader.getValueFromProperties("username"));
        //driver.findElement(By.id("txtPassword")).sendKeys(ConfigReader.getValueFromProperties("password"));//reading data from the getPropertyValue Method
        WebElement password=driver.findElement(By.id("txtPassword"));
        sendText(password,ConfigReader.getValueFromProperties("password"));
    }
    @Then("click on Login Button")
    public void click_on_login_button() {
        //driver.findElement(By.id("btnLogin")).click();
        WebElement Loginbtn=driver.findElement(By.id("btnLogin"));
        doClick(Loginbtn);
    }

    @Then("Hover your mouse on PIM section")
    public void hover_your_mouse_on_pim_section() {
      WebElement PIMBtn=driver.findElement(By.xpath("//a[@class='firstLevelMenu'and @id='menu_pim_viewPimModule']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(PIMBtn).perform();

    }
    @Then("Click on it")
    public void click_on_it() {
        WebElement EmployeeList=driver.findElement(By.xpath("//b[text()='PIM']//parent::a/following-sibling::ul/li/following-sibling::li/a"));
       doClick(EmployeeList);
    }
    @Then("Select all the dropdowns which contains name of Samir")
    public void select_all_the_dropdowns_which_contains_name_of_samir() {
        WebElement table=driver.findElement(By.xpath("//table[@id='resultTable']"));
        List<WebElement>rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[3]"));
        int sizeOfRows=rows.size();
        for (int i = 0; i < sizeOfRows; i++) {
            String names=rows.get(i).getText();
            if (names.contains(ConfigReader.getValueFromProperties("specificName"))){
             doClick(driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]")));
            }
        }
    }
    @Then("close the browser")
    public void close_the_browser() {
       closeTheBrowser();
    }

}
