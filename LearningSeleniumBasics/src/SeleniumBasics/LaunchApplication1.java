package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchApplication1 {
    public static void main(String[] args) {
        ChromeOptions chromeOptions=new ChromeOptions();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mbeya\\OneDrive\\Desktop\\demo\\LearningSeleniumBasics\\Drivers\\chromedriver.exe");
        chromeOptions.addArguments("--remote-allow-origins=*");// we use this because a point of time selenium has a bug to open browser. we may not need this in future, when you use code first write your code except this
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.get("https://translate.google.com/?sl=en&tl=tr&op=translate");
    }
}