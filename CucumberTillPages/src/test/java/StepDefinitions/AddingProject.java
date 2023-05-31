package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddingProject extends CommonMethods {
    @Then("users click on the Time option")
    public void users_click_on_the_time_option() {
        doClick(addProject.timeButton);
    }
    @Then("users click on the Project Info option")
    public void users_click_on_the_project_info_option() {
        doClick(addProject.projectInfo);
        doClick(addProject.projectOption);
    }
    @When("users enter {string} and {string}")
    public void users_enter_and(String CustomerName, String ProjectName) {
      sendText(addProject.customername,CustomerName);
      sendText(addProject.projectname,ProjectName);
    }
    @Then("users enter {string}")
    public void users_enter(String ProjectAdmin) {
      sendText(addProject.projectadmin,ProjectAdmin);
    }
    @Then("click on the Add button")
    public void click_on_the_add_button() {
        doClick(addProject.addbutton);
    }

}
