package StepDefinitions;

import Pages.loginPages;
import Utils.ConfigReader;

public class PageInitializer {
    public static loginPages login;
    public static void initializer(){
        login=new loginPages();
    }
}
