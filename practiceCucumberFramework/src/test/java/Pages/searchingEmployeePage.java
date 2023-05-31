package Pages;

import StepDefinition.PageInitializer;
import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class searchingEmployeePage extends CommonMethods {
    public searchingEmployeePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='empsearch_employee_name_empName']")
    public WebElement employeeNameTextBox;
    @FindBy(xpath ="//input[@id='searchBtn']")
    public WebElement searchButton;
    @FindBy(xpath = "//table[@class='table hover']/tbody/tr/td[3]")
    public List<WebElement> namesOnTable;

}
