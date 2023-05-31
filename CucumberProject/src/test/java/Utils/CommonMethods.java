package Utils;

import StepDefinitions.PageInitializer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class CommonMethods extends PageInitializer {
    public static WebDriver driver;

    public static void openBrowser(){
        ConfigReader.readTheData();
        String browserType=ConfigReader.getValueOfProperties("browserType");
        switch (browserType){
        case "Chrome":
            driver=new ChromeDriver();
            break;
        case "IE":
            driver=new InternetExplorerDriver();
            break;
        case "Firefox":
            driver=new FirefoxDriver();
            break;
            default:
                driver=new EdgeDriver();
                break;
    }
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(Constants.wait_time));
    driver.manage().window().maximize();
    driver.get(ConfigReader.getValueOfProperties("URL"));
    initializer();
    }
    public static void closeBrowser(){
            driver.close();
    }
    public static void doClick(WebElement element){
            element.click();
    }
    public static void sendText(WebElement element,String text){
        element.clear();
        element.sendKeys(text);
    }
}
