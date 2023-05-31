package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommonMethods {
    @Before
    public static void pre_condition(){
        openBrowser();
    }
    @After
    public static void post_condition(){
        closeBrowser();
    }
}
