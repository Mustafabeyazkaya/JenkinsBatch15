package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingProjectPage extends CommonMethods {
    public AddingProjectPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy( id = "menu_time_viewTimeModule")
    public WebElement timeButton;
    @FindBy( id = "menu_admin_ProjectInfo")
    public WebElement projectInfo;
    @FindBy( id = "menu_admin_viewProjects")
    public WebElement projectOption;
    @FindBy( id = "searchProject_customer")
    public WebElement customername;
    @FindBy( id = "searchProject_project")
    public WebElement projectname;
    @FindBy( id = "searchProject_projectAdmin")
    public WebElement projectadmin;
    @FindBy( id = "btnAdd")
    public WebElement addbutton;
}
