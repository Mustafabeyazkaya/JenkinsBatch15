package Utils;

import StepDefinition.PageInitializer;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class CommonMethods extends PageInitializer {
    public static WebDriver driver;
    public static void openTheWebsite(){
        ConfigReader.readProperties();
        String browserType=ConfigReader.getValueOfProperties("browserType");
        switch (browserType){
            case "Chrome":
                driver=new ChromeDriver();
                break;
            case "Firefox":
                driver=new FirefoxDriver();
                break;
            case "IE":
                driver=new InternetExplorerDriver();
                break;
            default:
                driver=new EdgeDriver();
        }
        driver.get(ConfigReader.getValueOfProperties("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(Constants.wait_time));
        initializer();
        DOMConfigurator.configure("log4j.xml");
        Log.startCase("This is the beginning of my Test case");
        Log.info("My test case is executing right now");
        Log.warning("My test case might have some trivial issues");
    }
    public static void closeTheWebsite(){
        Log.info("This test case is about to get completed");
        Log.endTestCase("This test case is finished");
        driver.close();
    }
    public static void doClick(WebElement element){
        element.click();
    }
    public static void sendText(WebElement element,String text){
        element.click();
        element.sendKeys(text);
    }
    public static byte[] takeScreenshot(String imageName) {// return type should be byte array
        // this casts the webDriver instance 'driver' to take screenshot interface
        TakesScreenshot ts = (TakesScreenshot) driver;// go back and study for interfaces

        // this captures the screenshot and store it as byte array
        byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES); // screenshot are very small size that's why we choose OutputType.BYTES
        // we need array because we will have multiple screenshot

        // this captures the screenshot and stores it as a file in the sourcePath variable
        File sourcePath = ts.getScreenshotAs(OutputType.FILE);

        // this helps you to copy your screenshot that you are taken and having in sourcePath to the FILE that you want to store ss in
        try {                                         // comes from Constant class     // from the variable in method
            FileUtils.copyFile(sourcePath, new File(Constants.SCREENSHOT_FILEPATH+imageName+getTimeStamp("yyyy-MM-dd-HH-mm-ss") +".png"));
        } catch (IOException e) {                                                                     //comes from getTimeStamp the method in CommonMethods
            throw new RuntimeException(e);
        }
        return picBytes;
    }
    // this capture date and time in our system
    public static String getTimeStamp(String pattern){ //pattern=type of your date , for example  yyyy(year)-MM(month)-dd(day)-HH(hour)-mm(minutes)-ss(second)
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat(pattern);
        return dateFormat.format(date);
    }

}
