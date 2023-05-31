package Day6Revision;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CaptureScreenShot {
    public static void main(String[] args) throws IOException {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");// we use this because a point of time selenium has a bug to open browser. we may not need this in future, when you use code first write your code except this
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.redbus.in/");

        // take the screenshot and save to a file
        TakesScreenshot ts= (TakesScreenshot) driver; // this syntax is like this because both are interface class
        File src=ts.getScreenshotAs(OutputType.FILE);

        // Save the screenshot to a specified location
        File target=new File("C:/Users/mbeya/OneDrive/Desktop/SeleniumBatch15/src/ScreenShot/iou.png");
        FileUtils.copyFile(src,target);
    }
}
