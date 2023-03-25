package Day4Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");// we use this because a point of time selenium has a bug to open browser. we may not need this in future, when you use code first write your code except this
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        Thread.sleep(2000);

        driver.switchTo().frame("iframeResult");// we need to switch the screen because website has iframe and the thing that you want to deal with is on the other next iframe
        WebElement copyTextBtn=driver.findElement(By.xpath("//button[text()='Copy Text']"));

        Actions act=new Actions(driver);

        act.doubleClick(copyTextBtn).perform();
    }
}
