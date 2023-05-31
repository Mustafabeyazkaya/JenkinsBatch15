package Utils;

import StepsDefinition.PageInitializer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.model.WindowID;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CommonMethods extends PageInitializer {
    public static WebDriver driver;
    public static void openTheBrowser(){
        ConfigReader.readProperties();
        String browserType=ConfigReader.getValueOfProperty("browser");
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
