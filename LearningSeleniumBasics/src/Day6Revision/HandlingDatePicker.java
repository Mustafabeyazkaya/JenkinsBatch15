package Day6Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandlingDatePicker {
    public static void main(String[] args) {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");// we use this because a point of time selenium has a bug to open browser. we may not need this in future, when you use code first write your code except this
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.redbus.in/");

        // 1. Identify the date that i want to select
        String year="2023";
        String month="Aug";
        String day="19";

        // 2. Click on Calender
        WebElement calendar=driver.findElement(By.xpath("//input[@id='onward_cal']"));
        calendar.click();

        while (true){
            // 3. Capture Year and Month
            String monthAndYear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
            String [] ym=monthAndYear.split(" ");
            if (ym[0].equalsIgnoreCase(month) && ym [1].equalsIgnoreCase(year)){
                // perform some operation
                List<WebElement>dates=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tr/td"));
                for (WebElement date:dates) {
                    String text=date.getText();
                    if (text.equalsIgnoreCase(day)){
                        date.click();
                        break;
                    }
                }
            }else {
                WebElement next=driver.findElement(By.xpath("//td[@class='next']"));
                next.click();
            }
        }
        //
    }
}
