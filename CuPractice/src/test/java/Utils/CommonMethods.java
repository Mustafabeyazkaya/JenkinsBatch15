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
    public static void openBrowser(){
        ConfigReader.readProperties();
        String browserType=ConfigReader.getValueFromProperties("browser");
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
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(Constant.Wait_Time));
        driver.get(ConfigReader.getValueFromProperties("url"));
    }
    public static void closeTheBrowser(){
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
