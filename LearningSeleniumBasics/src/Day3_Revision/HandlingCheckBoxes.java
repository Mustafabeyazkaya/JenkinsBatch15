package Day3_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class HandlingCheckBoxes {
    public static void main(String[] args) {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");// we use this because a point of time selenium has a bug to open browser. we may not need this in future, when you use code first write your code except this
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.navigate().to("https://itera-qa.azurewebsites.net/home/automation");
        driver.findElement(By.xpath("//input[@id='monday']")).click();
        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));
       /* for (WebElement check:checkboxes) {
            String days=check.getAttribute("id");
            check.click();// to click all of them at once
            System.out.println(days);
        }*/
        for (int i = 0; i < checkboxes.size(); i++) {
            checkboxes.get(i).click();// to click all of them at once
            String days=checkboxes.get(i).getAttribute("id");
            System.out.println(days);
        }
    }
}
