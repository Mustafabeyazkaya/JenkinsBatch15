package Day3_Revision;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingAlert {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");// we use this because a point of time selenium has a bug to open browser. we may not need this in future, when you use code first write your code except this
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.navigate().to(" https://the-internet.herokuapp.com/javascript_alerts");
        WebElement clickJsAlert =driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        clickJsAlert.click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }
}
