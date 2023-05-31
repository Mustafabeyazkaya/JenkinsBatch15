package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages extends CommonMethods {
    public LoginPages(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="txtUsername")
    public WebElement usernameTextBox; // we need to make it public
    @FindBy(id = "txtPassword")
    public WebElement passwordTextBox;// we need to make it public
    @FindBy(id = "btnLogin")
    public WebElement loginBtn;// we need to make it public

}
