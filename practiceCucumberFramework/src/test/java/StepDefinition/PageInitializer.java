package StepDefinition;

import Pages.LoginPages;
import Pages.dashBoardPage;
import Pages.searchingEmployeePage;

public class PageInitializer {
    public static LoginPages login;
    public static searchingEmployeePage searchEmp;
    public static dashBoardPage dash;
    public static void initializer(){
        login=new LoginPages();
        searchEmp=new searchingEmployeePage();
        dash=new dashBoardPage();
    }
}
