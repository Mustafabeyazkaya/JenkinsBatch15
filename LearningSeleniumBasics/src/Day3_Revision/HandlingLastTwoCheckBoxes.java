package Day3_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class HandlingLastTwoCheckBoxes {
    public static void main(String[] args) {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");// we use this because a point of time selenium has a bug to open browser. we may not need this in future, when you use code first write your code except this
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.navigate().to("https://itera-qa.azurewebsites.net/home/automation");
        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));
        // to click on only last 2 check box, do as below code
        int size=checkboxes.size(); // know the size first then calculate starts from 0 index
        // then start your loop from there

        /*for (WebElement check:checkboxes) {
            String days=check.getAttribute("id");
           if (days.equalsIgnoreCase("Tuesday") || days.equalsIgnoreCase("Thursday") || days.equalsIgnoreCase("Saturday")){
               check.click();
            }
        }*/
        for (int i = 5; i < checkboxes.size(); i++) { // now on start your loop from 5 to click on only last two check boxes based on your size (7)
                checkboxes.get(i).click();
        }
    }
}
