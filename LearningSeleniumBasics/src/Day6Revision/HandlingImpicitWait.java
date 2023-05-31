package Day6Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HandlingImpicitWait {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://janbaskdemo.com/");
        driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));// this is the last updated one you should use
        driver.findElement(By.xpath("//a[text()='Login']")).click();
    }
}
