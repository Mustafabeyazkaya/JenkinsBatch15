package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashBoardPage extends CommonMethods {
    public dashBoardPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "welcome")
    public WebElement welcomeIcon;// we need to make it public
    @FindBy(id ="menu_pim_viewPimModule")
    public WebElement PIMoption;
    @FindBy(id ="menu_pim_viewEmployeeList")
    public WebElement EmployeeListOption;
}
