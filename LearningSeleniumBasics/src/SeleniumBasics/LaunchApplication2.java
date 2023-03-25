package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchApplication2 {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions=new ChromeOptions();
       // WebDriver driver=new ChromeDriver();
        chromeOptions.addArguments("--remote-allow-origins=*");// we use this because a point of time selenium has a bug to open browser. we may not need this in future, when you use code first write your code except this
        ChromeDriver driver=new ChromeDriver(chromeOptions); // you can create the object of chrome class with this way too
        driver.get("https://www.google.com");
        String title =driver.getTitle();
        System.out.println(title);

    }
}
