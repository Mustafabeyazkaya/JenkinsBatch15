package StepsDefinition;

import Utils.CommonMethods;
import Utils.ConfigReader;
import Utils.Constant;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.asynchttpclient.config.AsyncHttpClientConfigDefaults;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class ProjectReport extends CommonMethods {
    @When("Click on Time option")
    public void click_on_time_option() throws InterruptedException {
        //driver.findElement(By.id("menu_time_viewTimeModule")).click();
        WebElement TimeBtn=driver.findElement(By.id("menu_time_viewTimeModule"));
        doClick(TimeBtn);
        Thread.sleep(Constant.Wait_Time);
    }
    @Then("click on Reports option")
    public void click_on_reports_option() {
        //driver.findElement(By.id("menu_time_Reports")).click();
        WebElement ReportsBtn=driver.findElement(By.id("menu_time_Reports"));
        doClick(ReportsBtn);
        //driver.findElement(By.id("menu_time_displayProjectReportCriteria")).click();
        WebElement ProjectReportBtn=driver.findElement(By.id("menu_time_displayProjectReportCriteria"));
        doClick(ProjectReportBtn);
    }
    @When("enter project name")
    public void enter_project_name() {
        WebElement projectName=driver.findElement(By.id("time_project_name"));
        doClick(projectName);
        List<WebElement>elements=driver.findElements(By.xpath("//option"));
        for (WebElement element:elements) {
            String text=element.getText();
            if (text.contains("HBL")){
                //element.click();
                doClick(element);
            }
        }

    }
    @Then("add your beggining and ending date")
    public void add_your_beggining_and_ending_date() throws InterruptedException {
        WebElement begginingDate = driver.findElement(By.id("project_date_range_from_date"));
        //begginingDate.click();
        doClick(begginingDate);
        List<WebElement> months = driver.findElements(By.xpath("//select[@class='ui-datepicker-month']/option"));
        for (WebElement month : months) {
            String text = month.getText();
            if (text.contains(ConfigReader.getValueFromProperties("begginingMonth"))) {
                //month.click();
                doClick(month);
                List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
                for (WebElement day : days) {
                    String text1 = day.getText();
                    if (text1.contains(ConfigReader.getValueFromProperties("begginingDay"))) {
                        //day.click();
                        doClick(day);
                    }
                }
            }
        }
        WebElement endingDate=driver.findElement(By.id("//input[@class='calendar hasDatepicker valid' and @id='project_date_range_to_date']"));
        doClick(endingDate);
        List<WebElement>monthsEnding=driver.findElements(By.xpath("//select[@class='ui-datepicker-month']"));
        for (WebElement endingMonths:monthsEnding) {
            String text2=endingMonths.getText();
            if (text2.contains(ConfigReader.getValueFromProperties("endingMonth"))){
                endingMonths.click();
                List<WebElement>days=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
                for (WebElement day:days) {
                    String text3=day.getText();
                    if (text3.contains(ConfigReader.getValueFromProperties("endingDay"))){
                        day.click();
                    }
                }
            }
        }
    }
        @Then("click on View button")
        public void click_on_view_button () {
        WebElement ViewBtn=driver.findElement(By.id("viewbutton"));
        //ViewBtn.click();
            doClick(ViewBtn);
        }
}


