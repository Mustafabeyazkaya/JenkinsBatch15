package Day6Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandlingWindows {
    public static void main(String[] args) {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");// we use this because a point of time selenium has a bug to open browser. we may not need this in future, when you use code first write your code except this
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.salesforce.com/au/");
        WebElement freeTrialBtn=driver.findElement(By.xpath("(//a[contains(@aria-label,'Start my free')])[1]"));
        freeTrialBtn.click();
        // after click on the button next window appears and to work on the next window we should get that window handle then switch your driver to there
        Set<String> nextWindows=driver.getWindowHandles(); //  we store them into SET because sets dont allow duplicate values
        for (String windows:nextWindows) {
            driver.switchTo().window(windows);
            if (driver.getTitle().contains("Free CRM")){
                driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Mustafa");
                driver.findElement(By.name("UserLastName")).sendKeys("Beyazkaya");

            }
        }
        // driver.close();// if you use close it will close the page which your driver working on last
        driver.quit(); // if you use quit it will close all the page at once
    }
}
