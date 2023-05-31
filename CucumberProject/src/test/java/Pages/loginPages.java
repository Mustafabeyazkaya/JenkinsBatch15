package Pages;

import StepDefinitions.PageInitializer;
import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPages extends CommonMethods {
    public  loginPages(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "txtUsername")
    public  WebElement usernameTxtBox;
    @FindBy(id = "txtPassword")
    public WebElement password;
    @FindBy(id = "btnLogin")
    public  WebElement loginBttun;
    @FindBy(xpath = "//a[text()='Welcome Admin']")
    public WebElement welcomeOption;
    @FindBy (id ="menu_admin_viewAdminModule")
    public WebElement adminButton;
    @FindBy (id ="menu_admin_Qualifications")
    public  WebElement qualifications;
    @FindBy (id ="menu_admin_membership")
    public WebElement membershipButton;
    @FindBy(id = "membership_name")
    public WebElement membershipName;
    @FindBy(id = "btnAdd")
    public WebElement addButton;
    @FindBy(id = "btnSave")
    public WebElement saveButton;

}
