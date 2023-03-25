package Day4Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseHoverActions {
    public static void main(String[] args) {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");// we use this because a point of time selenium has a bug to open browser. we may not need this in future, when you use code first write your code except this
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://demo.opencart.com/");

        WebElement desktopBtn=driver.findElement(By.xpath("//a[text()='Components']"));

        Actions act=new Actions(driver);

        act.moveToElement(desktopBtn).perform();// to stay on the button to see options without clicking on it we use moveToElement method

        WebElement subMenuItem=driver.findElement(By.xpath("//a[contains(text(),'Monitor')]"));

        //subMenuItem.click();
        // or
        act.moveToElement(subMenuItem).click().perform();
    }
}
