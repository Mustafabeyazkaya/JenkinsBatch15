package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserClose {
    public static void main(String[] args) {
        ChromeOptions chromeOptions=new ChromeOptions();// we use this because a point of time selenium has a bug to open browser. we may not need this in future, when you use code first write your code except this
       chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.get("https://facebook.com/");
        driver.close();
    }
}
