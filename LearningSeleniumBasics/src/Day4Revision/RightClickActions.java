package Day4Revision;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RightClickActions {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");// we use this because a point of time selenium has a bug to open browser. we may not need this in future, when you use code first write your code except this
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        WebElement rightClickBtn=driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions act=new Actions(driver);

        act.contextClick(rightClickBtn).perform();// to right-click on the element, we need to use contextClick method

        driver.findElement(By.xpath("//span[text()='Copy']")).click();
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
    }
}
