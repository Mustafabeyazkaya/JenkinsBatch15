package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

public class CommonMethods {
    public static WebDriver driver;
    public static void openTheBrowser(){
        ConfigReader.readProperties();
        String browserType=ConfigReader.getValueOfProperty("browserType");
        switch (browserType){
            case "Chrome":
                driver=new ChromeDriver();
                break;
            case "Firefox":
                driver=new FirefoxDriver();
            case  "IE":
                driver=new InternetExplorerDriver();
            default:
                driver=new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get(ConfigReader.getValueOfProperty("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(Constants.Wait_Time));
    }
    public static void closeBrowser(){
        driver.close();
    }

    public static void sendText(WebElement element,String text){
        element.clear();
        element.sendKeys(text);
    }
    public static void doClick(WebElement element){
        // code
        // for explicit wait
        // for the element to be clickable
        element.click();
    }
}
