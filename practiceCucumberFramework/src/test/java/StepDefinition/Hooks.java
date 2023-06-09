package StepDefinition;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends CommonMethods {
    @Before
    public static void pre_condition(){
        openTheWebsite();
    }
    @After
    public static void post_condition(Scenario scenario){
        byte [] pic;
        if (scenario.isFailed()){
            pic=takeScreenshot("failed/"+scenario.getName());
        }else {
            pic=takeScreenshot("passed/"+scenario.getName());
        }
        scenario.attach(pic,"image/",scenario.getName());
        closeTheWebsite();

    }
}
