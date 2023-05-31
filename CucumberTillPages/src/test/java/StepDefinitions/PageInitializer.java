package StepDefinitions;

import Pages.AddingProjectPage;
import Pages.LoginPage;

public class PageInitializer {
    public static AddingProjectPage addProject;
    public static LoginPage loginPage;
    public static void Initializer(){
        addProject=new AddingProjectPage();
        loginPage=new LoginPage();
    }
}
