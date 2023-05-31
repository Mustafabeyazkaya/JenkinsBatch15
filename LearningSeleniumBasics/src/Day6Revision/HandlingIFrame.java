package Day6Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class HandlingIFrame {
    public static void main(String[] args) {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");// we use this because a point of time selenium has a bug to open browser. we may not need this in future, when you use code first write your code except this
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

        // 1. Switch to first frame
        driver.switchTo().frame("packageListFrame");
        // 2. Click on element in the first frame
        WebElement firstElement=driver.findElement(By.xpath("//a[text()='org.openqa.selenium.bidi'and @target='packageFrame']"));
        firstElement.click();
        // 3. Move out of first frame
        driver.switchTo().defaultContent(); // defaultContent() get you 1 page(frame) back
        // 4. Switch to second frame
        driver.switchTo().frame("packageFrame");
        // 5. Click on element in second frame
        WebElement secondElement=driver.findElement(By.xpath("//span[text()='HasBiDi']"));
        secondElement.click();
        // 6. Move out of third frame
        driver.switchTo().defaultContent();
        // 7. Switch to third frame
        driver.switchTo().frame("classFrame");
        // 8. Click on element in third frame
        WebElement thirdElement=driver.findElement(By.xpath("//a[text()='FirefoxDriver']"));
        thirdElement.click();
    }
}