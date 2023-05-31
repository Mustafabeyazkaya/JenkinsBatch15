package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class addingMembership extends CommonMethods {
    @When("Admin navigates to Qualifications")
    public void admin_navigates_to_qualifications() {
        //WebElement adminButton=driver.findElement(By.id("menu_admin_viewAdminModule"));
        doClick(login.adminButton);
        //WebElement qualifications=driver.findElement(By.id("menu_admin_Qualifications"));
        doClick(login.qualifications);

    }
    @When("selects Memberships")
    public void selects_memberships() {
        //WebElement membershipButton=driver.findElement(By.id("menu_admin_membership"));
        doClick(login.membershipButton);
        //WebElement addButton=driver.findElement(By.id("btnAdd"));
        doClick(login.addButton);
    }
    @Then("Admin user can add any Memberships {string}")
    public void admin_user_can_add_any_memberships(String name) {
        //WebElement membershipName=driver.findElement(By.id("membership_name"));
        sendText(login.membershipName,name);
        //WebElement saveButton=driver.findElement(By.id("btnSave"));
        doClick(login.saveButton);
    }


    @When("Admin user add multiple memberships")
    public void admin_user_add_multiple_memberships(DataTable dataTable) {
        List<String>list=dataTable.asList();
        for (int i = 0; i < list.size(); i++) {
            String names=list.get(i);
            sendText(login.membershipName,names);
            doClick(login.saveButton);
            doClick(login.addButton);
        }
    }
}
