package StepDefinition;

import Utils.CommonMethods;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class searchingEmployee extends CommonMethods {
    @Then("user click on the PIM option")
    public void user_click_on_the_pim_option() {
        doClick(dash.PIMoption);
    }
    @Then("user click on the Employee List")
    public void user_click_on_the_employee_list() {
     doClick(dash.EmployeeListOption);
    }
    @Then("user enter {string} and click on search button")
    public void user_enter_and_click_on_search_button(String name) throws InterruptedException {
        sendText(searchEmp.employeeNameTextBox,name);
        doClick(searchEmp.searchButton);
        Thread.sleep(3000);
    }
    @Then("select the specific employee {string}")
    public void select_the_specific_employee(String specificNames) {
        List<WebElement> names=searchEmp.namesOnTable;
        for (int i = 0; i < names.size(); i++) {
            String name=names.get(i).getText();
            if (name.equalsIgnoreCase(specificNames)){
                WebElement dropDowns= driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr["+(i+1)+"]/td[1]"));
                doClick(dropDowns);
            }
        }
       /* for (WebElement names: searchEmp.namesOnTable ) {
            String name=names.getText();
            if (name.equalsIgnoreCase(specificNames)){
               WebElement dropDowns= driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr["+(names.ge"]/td[1]"));
            }
        }*/
    }
}
